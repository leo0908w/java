package tw.org.iii.javatest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Will27 extends JFrame implements ActionListener {
    private JButton newFile, openFile, saveFile, savefile, saveAsFile, exit;
    private JTextArea editor;

    public Will27() {
        super("Frame Test");
        setLayout(new BorderLayout());

        newFile = new JButton("New");
        openFile = new JButton("Open");
        saveFile = new JButton("Save");
        saveAsFile = new JButton("Save As");
        exit = new JButton("Exit");
        editor = new JTextArea();

        newFile.addActionListener(new MyListener());
        newFile.addActionListener(this);
        newFile.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("C");
            }
        });

        JPanel top = new JPanel(new FlowLayout());
        top.add(newFile);
        top.add(openFile);
        top.add(saveFile);
        top.add(saveAsFile);
        top.add(exit);

        add(top, BorderLayout.NORTH);
        add(editor, BorderLayout.CENTER);

        setSize(640, 480);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
    public static void main(String[] args) {
        new Will27();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("B");
    }
}
class MyListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("A");
    }
}
