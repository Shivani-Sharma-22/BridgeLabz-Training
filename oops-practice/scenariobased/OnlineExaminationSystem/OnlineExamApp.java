package OnlineExaminationSystem;

public class OnlineExamApp {

    public static void main(String[] args) {

        // Choose evaluation strategy (polymorphism)
        EvaluationStrategy strategy = new ObjectiveEvaluation();

        // Create exam
        Exam exam = new Exam("Java Test", 60, strategy);

        // Add questions
        exam.addQuestion(new Question(1, "What is JVM?", "Java Virtual Machine"));
        exam.addQuestion(new Question(2, "What is OOPS?", "Object Oriented Programming"));

        // Create student
        Student student = new Student(101, "Shivani");

        // Student submits answers
        student.submitAnswer(1, "Java Virtual Machine");
        student.submitAnswer(2, "Object Oriented Programming");

        // Submit exam
        try {
            exam.submitExam(student);
            exam.generateResult(student);
        } catch (ExamTimeExpiredException e) {
            System.out.println(e.getMessage());
        }
    }
}
