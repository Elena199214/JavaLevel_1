package HomeWork_8;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class TwiceCounterApp extends JFrame  {



        public static final java.lang.String VALIDATION_MESSAGE = "Второе число должно быть больше, или равно первому";


        private int value;
        private int value2;

    TwiceCounterApp(int initialValue) {
            setBounds(500, 300, 300, 300);
            setTitle("My simple counter");
            setDefaultCloseOperation(EXIT_ON_CLOSE);

            Font font = new Font("Arial", Font.BOLD, 45);

            //контейнер, в котором размещен менеджер GridLayout
            Panel top = new Panel();

            //Сами счетчики
            JLabel label = new JLabel();
            label.setFont(font);
            label.setHorizontalAlignment(SwingConstants.CENTER);
            value = initialValue;
            label.setText(String.valueOf(value));
           // add(label, BorderLayout.CENTER);

            JLabel label2 = new JLabel();
            label2.setFont(font);
            label2.setHorizontalAlignment(SwingConstants.CENTER);
            value2 = initialValue;
            label2.setText(String.valueOf(value));
           // add(label2, BorderLayout.CENTER);

            //Кнопка увеличения
            JButton incrementButton = new JButton(">");
            incrementButton.setFont(font);
           // add(incrementButton, BorderLayout.EAST);

            //Кнопка увеличения на 2
            JButton incrementButton2 = new JButton(">>");
            incrementButton2.setFont(font);
           // add(incrementButton2, BorderLayout.EAST);

            //Кнопка уменьшения
            JButton decrementButton = new JButton("<");
            decrementButton.setFont(font);
           // add(decrementButton, BorderLayout.WEST);

            //Кнопка уменьшения на 2
            JButton decrementButton2 = new JButton("<<");
            decrementButton2.setFont(font);
           // add(decrementButton2, BorderLayout.WEST);

            //Сообщение об ошибке
            Font errorFont = new Font("Arial", Font.BOLD, 20);
            JLabel errorLabel = new JLabel();
            errorLabel.setFont(errorFont);
            errorLabel.setHorizontalAlignment(SwingConstants.CENTER);

        //Сообщение об ошибке для второй кнопки
        Font errorFont2 = new Font("Arial", Font.BOLD, 26);
        JLabel errorLabel2 = new JLabel();
        errorLabel2.setFont(errorFont2);
        errorLabel2.setHorizontalAlignment(SwingConstants.CENTER);
            //add(errorLabel, BorderLayout.SOUTH);

            incrementButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    value++;
                    label.setText(String.valueOf(value));
                    errorLabel.setText(value2 >= value ? "" : VALIDATION_MESSAGE);
                }
            });

            incrementButton2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    value2+=2;
                    label2.setText(String.valueOf(value2));
                    errorLabel.setText(value2 >= value ? "" : VALIDATION_MESSAGE);
                }
            });

            decrementButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    value--;
                    label.setText(String.valueOf(value));
                    errorLabel.setText(value2 >= value ? "" : VALIDATION_MESSAGE);
                }
            });

             decrementButton2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    value2-=2;
                    label2.setText(String.valueOf(value2));
                    errorLabel.setText(value2 >= value ? "" : VALIDATION_MESSAGE);
                }
            });


            setLayout(new BorderLayout());
            top.setLayout(new GridLayout(2, 3));
            top.add(decrementButton);
            top.add(label);
            top.add(incrementButton);
            top.add(decrementButton2);
            top.add(label2);
            top.add(incrementButton2);
            add("North",top);
            add(errorLabel, BorderLayout.CENTER);
            setVisible(true);
        }

        public static void main(String[] args) {
            new TwiceCounterApp(1);
        }

        private void validateValue() {


        }
    }


