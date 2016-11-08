package tw.org.iii.javatest;

import javafx.embed.swing.JFXPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class Will27 extends JFrame implements ActionListener {
    private JButton newFile, openFile, saveFile, saveAsFile, exit;
    private JTextArea editor;
    private File editFile;

    public Will27() {
        super("Frame Test");
        setLayout(new BorderLayout());

        newFile = new JButton("New");
        openFile = new JButton("Open");
        saveFile = new JButton("Save");
        saveAsFile = new JButton("Save As");
        exit = new JButton("Exit");
        editor = new JTextArea();

//        newFile.addActionListener(new MyListener());
//        newFile.addActionListener(this);
        newFile.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                newFile();
            }
        });

        openFile.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openFile();
            }
        });

        saveFile.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saveFile();
            }
        });

        saveAsFile.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saveAsFile();
            }
        });
        JPanel top = new JPanel(new FlowLayout());
        top.add(newFile);
        top.add(openFile);
        top.add(saveFile);
        top.add(saveAsFile);
        top.add(exit);

        add(top, BorderLayout.NORTH);
        JScrollPane jsp = new JScrollPane(editor);      // 捲軸
        add(jsp, BorderLayout.CENTER);

        setSize(640, 480);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
    public static void main(String[] args) {
        new Will27();
    }

    // 產生新檔
    private void newFile() {
        editFile = null;
        editor.setText("");
    }

    // 打開檔案
    private void openFile() {
        JFileChooser jfc = new JFileChooser();
        if (jfc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            editFile = jfc.getSelectedFile();
            System.out.println(editFile.getAbsolutePath());
            loadFile();
        }
    }

    // 讀取檔案
    private void loadFile() {
        try {
            StringBuffer sb = new StringBuffer();
            BufferedReader br = new BufferedReader(new FileReader(editFile));
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line + "\n");
            }
            br.close();
            editor.setText(sb.toString());
        } catch (Exception e) {}
    }

    // 存取檔案
    private void saveFile() {
        if (editFile != null) {
            try {
                BufferedWriter bw = new BufferedWriter(new FileWriter(editFile));
                bw.write(editor.getText());
                bw.flush();
                bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void saveAsFile() {
        JFileChooser jfc = new JFileChooser();
        if (jfc.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
            editFile = jfc.getSelectedFile();
            try {
                BufferedWriter bw = new BufferedWriter(new FileWriter(editFile));
                bw.write(editor.getText());
                bw.flush();
                bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
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
