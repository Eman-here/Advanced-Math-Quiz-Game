import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.io.*;

// ================= ABSTRACT CLASS (ABSTRACTION) =================
abstract class Question {
    protected int num1;
    protected int num2;

    public abstract String getQuestion();
    public abstract int getAnswer();
}

// ================= ADDITION CLASS (INHERITANCE + POLYMORPHISM) =================
class AdditionQuestion extends Question {
    public AdditionQuestion() {
        Random rand = new Random();
        num1 = rand.nextInt(10);
        num2 = rand.nextInt(10);
    }

    @Override
    public String getQuestion() {
        return num1 + " + " + num2 + " = ?";
    }

    @Override
    public int getAnswer() {
        return num1 + num2;
    }
}

// ================= SUBTRACTION CLASS =================
class SubtractionQuestion extends Question {
    public SubtractionQuestion() {
        Random rand = new Random();
        num1 = rand.nextInt(10);
        num2 = rand.nextInt(10);
    }

    @Override
    public String getQuestion() {
        return num1 + " - " + num2 + " = ?";
    }

    @Override
    public int getAnswer() {
        return num1 - num2;
    }
}

// ================= MAIN CLASS =================
public class AdvancedMathQuiz extends JFrame implements ActionListener {

    private JLabel questionLabel, resultLabel, scoreLabel;
    private JTextField answerField;
    private JButton submitButton;

    private ArrayList<Question> questions;
    private int currentIndex = 0;
    private int score = 0;

    // ================= CONSTRUCTOR =================
    public AdvancedMathQuiz() {
        setTitle("Advanced Math Quiz");
        setSize(400, 250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        questionLabel = new JLabel();
        questionLabel.setBounds(50, 20, 300, 30);

        answerField = new JTextField();
        answerField.setBounds(50, 60, 150, 30);

        submitButton = new JButton("Submit");
        submitButton.setBounds(50, 100, 100, 30);
        submitButton.addActionListener(this);

        resultLabel = new JLabel();
        resultLabel.setBounds(50, 140, 300, 30);

        scoreLabel = new JLabel("Score: 0");
        scoreLabel.setBounds(50, 170, 200, 30);

        add(questionLabel);
        add(answerField);
        add(submitButton);
        add(resultLabel);
        add(scoreLabel);

        loadQuestions();
        showQuestion();

        setVisible(true);
    }

    // ================= COLLECTION (ARRAYLIST) =================
    private void loadQuestions() {
        questions = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            questions.add(new AdditionQuestion());
            questions.add(new SubtractionQuestion());
        }

        Collections.shuffle(questions);
    }

    // ================= DISPLAY QUESTION =================
    private void showQuestion() {
        if (currentIndex < questions.size()) {
            questionLabel.setText(questions.get(currentIndex).getQuestion());
        } else {
            saveScore();
            JOptionPane.showMessageDialog(this, "Quiz Finished! Final Score: " + score);
            System.exit(0);
        }
    }

    // ================= EVENT HANDLING =================
    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            int userAnswer = Integer.parseInt(answerField.getText());

            if (userAnswer == questions.get(currentIndex).getAnswer()) {
                resultLabel.setText("Correct!");
                score++;
            } else {
                resultLabel.setText("Wrong! Answer: " +
                        questions.get(currentIndex).getAnswer());
            }

            scoreLabel.setText("Score: " + score);
            currentIndex++;
            answerField.setText("");
            showQuestion();

        } catch (Exception ex) {
            resultLabel.setText("Enter a valid number!");
        }
    }

    // ================= FILE HANDLING =================
    private void saveScore() {
        try {
            FileWriter fw = new FileWriter("score.txt", true);
            fw.write("Score: " + score + "\n");
            fw.close();
        } catch (IOException e) {
            System.out.println("Error saving score.");
        }
    }

    // ================= MAIN METHOD =================
    public static void main(String[] args) {
        new AdvancedMathQuiz();
    }
}