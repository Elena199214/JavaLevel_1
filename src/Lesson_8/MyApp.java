package Lesson_8;

        import java.awt.BorderLayout;
        import java.awt.FlowLayout;
        import java.awt.GridLayout;
        import java.awt.event.ActionEvent;
        import java.awt.event.ActionListener;
        import java.awt.event.WindowAdapter;
        import java.awt.event.WindowEvent;

        import javax.swing.BoxLayout;
        import javax.swing.JButton;
        import javax.swing.JFrame;
        import javax.swing.JTextField;

public class MyApp extends JFrame {

    private MyApp() {
        setTitle("Мое окошко");
        //нобходимость завершитть выполнение при закрытии формы(окна)
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        //границы
        setBounds(300, 300, 400,400);


        /* выравнивание в ряд
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        for (int i=1; i < 11; i++ ) {
            add(new JButton(String.valueOf(i)));
        }
        */

       /* в линию с переносом
        setLayout(new FlowLayout());
        for (int i=1; i < 21; i++ ) {
            add(new JButton(String.valueOf(i)));
        }*/

       /* выравнивание по сетке
       setLayout(new GridLayout(3,3));
        for (int i=1; i < 10; i++ ) {
            add(new JButton(String.valueOf(i)));
        }*/

        setLayout(null);
        JTextField textField = new JTextField();
        textField.setBounds(20,20, 200, 40);
        add(textField);
        JButton button = new JButton("Мне повезет");
        button.setBounds(20, 60, 100,40);
        add(button);


        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText("нажали кнопку");
                button.setText("Повезло");
            }
        });

        textField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText("Нажали enter");
            }
        });

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("Осторожно окно закрывается");
            }
        });


        //в самом конце
        setVisible(true);
    }

    public static void main(String[] args) {
        new MyApp();
    }

    //Jframe - окно
    //Jbutton
    //JLabel - вывод текста (надпись)
    //JTextField - текстовое поле
    //JTetArea -
    //JScrollPane - прокрутка
    //JMenuBar - строчка меню
    //JTable -
    //JRadioButton -
    //JCheckbox -



}
