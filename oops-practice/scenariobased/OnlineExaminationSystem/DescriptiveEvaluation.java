package OnlineExaminationSystem;

import java.util.List;

public class DescriptiveEvaluation implements EvaluationStrategy {

    @Override
    public int evaluate(List<Question> questions, Student student) {
        // Simulated manual evaluation
        return student.getAnswers().size(); // simple assumption
    }
}
