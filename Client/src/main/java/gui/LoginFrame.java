package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class LoginFrame extends Frame {

    public LoginFrame() {
        JTextField username = new JTextField("Username");
        JButton login = new JButton("Login");

        setMinimumSize(new Dimension(600, 100));

        login.addActionListener(e -> {
            setEnabled(false);
            MainFrame main = new MainFrame(username.getText());
            main.show();
        });

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        add(username, BorderLayout.CENTER);
        add(login, BorderLayout.SOUTH);
    }
}