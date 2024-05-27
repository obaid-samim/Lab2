package lab2Ex1;

import java.util.Random;
import java.lang.ArithmeticException;
import javax.swing.JOptionPane;

public class QuestionsBank {
    //Here is fields
    private int correctAnswer;
    private int incorrectAnswer;
    private int score;
    private int noOfQuestions=5;

    //Here is constructor
    public QuestionsBank(int correctAnswer, int incorrectAnswer, int score, int noOfQuestions){
        //Here is initializing
        this.correctAnswer = correctAnswer;
        this.incorrectAnswer = incorrectAnswer;
        this.score = score;
        this.noOfQuestions = noOfQuestions;
    }

    // Here is Methods for displaying questions from bank
    public String[] simulateQuestion(int questionNumber) {
        //Result B
        String[] question1 ={ String.format("1. Which of these packages contain all the collection classes?%n"
                +"A. java.lang%nB. java.util%nC. java.net%nD. java.awt"),"B"};
        //Result D
        String[] question2 ={ String.format("2. Which of these classes is not part of Java’s collection framework?%n"
                + "A. Maps%nB. Array%nC. Stack%nD. Queue"),"D"};
        //Result A
        String[] question3 ={ String.format("3. What is Collection in Java?%n"
                +"A. A group of objects%nB. A group of classes%nC. A group of interfaces%nD. None of the mentioned"),"A"};
        //Result A+
        String[] question4 ={ String.format("4. Which of these methods deletes all the elements from invoking collection?%n"
                +"A. clear()%nB. reset()%nC. delete()%nD. refresh()"),"A"};
        //Result A green
        String[] question5 ={ String.format("5. Which of these interface handle sequences?%n"
                +"A. Set%nB. List%nC. Comparator%nD. Collection"),"B"};

        String[][] questions = { question1, question2, question3, question4, question5 };

        return questions[questionNumber];
    }

    //Mehthod for checking if answer are correct or not
    public boolean checkAnswer (String question, String submittedAnswer) {
        boolean ansIsCorrect = false;
        if (question.equals(submittedAnswer.toUpperCase())) {
            ansIsCorrect = true;
            correctAnswer++;
        } else {
            incorrectAnswer++;
        }
        return ansIsCorrect;
    }

    //Mehtod for generate message dialogbox
    public void generateMessage(boolean ansIsCorrect) {
        // creating random object
        Random random = new Random();

        if (ansIsCorrect) {
            switch (random.nextInt(4)) {
                case 0:
                    JOptionPane.showMessageDialog(null, "Excellent!");
                    break;
                case 1:
                    JOptionPane.showMessageDialog(null, "Good!");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Keep up the good work!");
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Nice work!");
                    break;
            }
        } else {
            switch (random.nextInt(4)) {
                case 0:
                    JOptionPane.showMessageDialog(null, "No. Please try again");
                    break;
                case 1:
                    JOptionPane.showMessageDialog(null, "Wrong. Try once more");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Don't give up!");
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "No. Keep trying..");
                    break;
            }
        }

    }
    // Looping methods for questions
    public void inputAnswer() {
        for (int counter = 0; counter < 5; counter++) {
            String[] question = simulateQuestion(counter);
            String answer = JOptionPane.showInputDialog(question[0]);
            boolean ansIsCorrect = checkAnswer(question[1],answer);
            generateMessage(ansIsCorrect);
        }
        // calculating score and displaying result
        score = correctAnswer / 5 * 100 ;
        String result = String.format(" You have answered %d correct and %d incorrect answers.Your percentage is %d.",correctAnswer,incorrectAnswer,score);
        JOptionPane.showMessageDialog(null, result,"Test Score",JOptionPane.INFORMATION_MESSAGE);
    }
}

