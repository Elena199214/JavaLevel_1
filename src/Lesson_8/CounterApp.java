package Lesson_8;

/* import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class CounterApp extends JFrame {

    public static final java.lang.String VALIDATION_MESSAGE = "Число должно быть в пределах от -10 до 10";

    private int value;

    CounterApp(int initialValue) {
        setBounds(300, 300, 300, 150);
        setTitle("My simple counter");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Font font = new Font("Arial", Font.BOLD, 45);

        //Сам счетчик
        JLabel label = new JLabel();
        label.setFont(font);
        label.setHorizontalAlignment(SwingConstants.CENTER);
        value = initialValue;
        label.setText(String.valueOf(value));
        add(label, BorderLayout.CENTER);

        //Кнопка увеличения
        JButton incrementButton = new JButton(">>");
        incrementButton.setFont(font);
        add(incrementButton, BorderLayout.EAST);

        //Кнопка уменьшения
        JButton decrementButton = new JButton("<");
        decrementButton.setFont(font);
        add(decrementButton, BorderLayout.WEST);

        //Сообщение об ошибке
        Font errorFont = new Font("Arial", Font.BOLD, 26);
        JLabel errorLabel = new JLabel();
        errorLabel.setFont(errorFont);
        errorLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(errorLabel, BorderLayout.SOUTH);

        incrementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value++;
                label.setText(String.valueOf(value));
                errorLabel.setText(value < 11 ? "" : VALIDATION_MESSAGE);
            }
        });

        decrementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value--;
                label.setText(String.valueOf(value));
                errorLabel.setText(value > -11 ? "" : VALIDATION_MESSAGE);
            }
        });



        setVisible(true);
    }

    public static void main(String[] args) {
        new CounterApp(1);
    }

    private void validateValue() {


    }
}*/