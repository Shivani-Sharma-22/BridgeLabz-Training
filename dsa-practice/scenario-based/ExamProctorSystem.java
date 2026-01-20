import java.util.*;
class ExamPoctor{
	// Stack to track question navigation
    Stack<Integer> navigation = new Stack<>();

    // Map to store answers: questionId -> answer
    HashMap<Integer, String> answers = new HashMap<>();
    
    //visit question
    void visitQuestion(int quesID) {
    	navigation.push(quesID);
    	System.out.println("Visited Question: " + quesID);
    }
    // Add answer 
    void addAnswer(int id,String answer) {
    	 answers.put(id, answer);
    	 System.out.println("Answer addes successfully.");
    }
    void lastVisit() {
    	if(!navigation.isEmpty()) {
    		System.out.println("Last visited question: " + navigation.peek());
    	}
    	else {
    		System.out.println("No question visited yet");
    	}
    }
    //calculate score
    int calculateScore(HashMap<Integer, String> correctAnswers) {
    	int score =0;
    	for(int quesID:answers.keySet()) {
    		if(answers.get(quesID).equals(correctAnswers.get(quesID))) {
    			score= score + 2;
    		}
    	}
    	return score;
    }
    
}

public class ExamProctorSystem {
	public static void main(String[] args) {
		ExamPoctor exam = new ExamPoctor();
		
		HashMap<Integer, String> correctAnswers = new HashMap<>();
		correctAnswers.put(1,"A");
		correctAnswers.put(2,"B");
		correctAnswers.put(3,"A");
		correctAnswers.put(4,"C");
		
		exam.visitQuestion(1);
		exam.addAnswer(1,"A");
		exam.visitQuestion(2);
		exam.addAnswer(2, "E");
		exam.visitQuestion(3);
		exam.addAnswer(3, "A");
		
		exam.lastVisit();
		// Submit exam and calculate score
        int score = exam.calculateScore(correctAnswers);
        System.out.println("Final Score: " + score);
	}
}
