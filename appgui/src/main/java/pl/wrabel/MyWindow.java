package pl.wrabel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

/**
 * Hello world!
 *
 */
public class MyWindow extends JFrame
{
    public static void main( String[] args )
    {
//        JFrame jFrame = new JFrame();
//        jFrame.setSize(500, 300);
//        jFrame.setVisible(true);
        // ...

        new MyWindow();
    }

    public MyWindow(){
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(500,300);
        setLayout(new FlowLayout());

        final JTextField textFieldInput = new JTextField();
        textFieldInput.setPreferredSize(new Dimension(300, 100));
        add(textFieldInput);

        JButton jButton = new JButton("Translate");
        jButton.setText("Translate");
        add(jButton);

        final JTextArea textAreaOutput = new JTextArea();
        textAreaOutput.setPreferredSize(new Dimension(300, 100));
        add(textAreaOutput);


        jButton.addActionListener(new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                String text = textFieldInput.getText();

                String morseText = Morse.translate(text);

                textAreaOutput.setText(morseText);
            }
        });


    }
}
