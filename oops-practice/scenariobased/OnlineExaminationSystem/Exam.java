package OnlineExaminationSystem;

import java.util.ArrayList;
import java.util.List;

public class Exam {

    private String examName;
    private long endTime;
    private List<Question> questions = new ArrayList<>();
    private EvaluationStrategy evaluationStrategy;

    public Exam(String examName, int durationInSeconds, EvaluationStrategy evaluationStrategy) {
        this.examName = examName;
        this.endTime = System.currentTimeMillis() + (durationInSeconds * 1000);
        this.evaluationStrategy = evaluationStrategy;
    }

    public void addQuestion(Question question) {
        questions.add(question);
    }

    public void submitExam(Student student) throws ExamTimeExpiredException {
        if (System.currentTimeMillis() > endTime) {
            throw new ExamTimeExpiredException("Exam time is over!");
        }
        System.out.println(student.getName() + " submitted the exam.");
    }

    public void generateResult(Student student) {
        int score = evaluationStrategy.evaluate(questions, student);
        System.out.println("Result for " + student.getName() + ": " + score + "/" + questions.size());
    }
}
