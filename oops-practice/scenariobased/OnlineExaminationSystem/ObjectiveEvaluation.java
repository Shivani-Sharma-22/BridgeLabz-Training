package OnlineExaminationSystem;

import java.util.List;

public class ObjectiveEvaluation implements EvaluationStrategy {

    @Override
    public int evaluate(List<Question> questions, Student student) {
        int score = 0;

        for (Question q : questions) {
            String submitted = student.getAnswers().get(q.getQuestionId());
            if (q.getCorrectAnswer().equalsIgnoreCase(submitted)) {
                score++;
            }
        }
        return score;
    }
}
