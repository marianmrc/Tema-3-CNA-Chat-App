package gui;

import javax.swing.*;
import java.awt.*;

public class SendPanel extends JPanel {
    private JTextField textField;
    private JButton send;

    public SendPanel(JTextField textField, JButton send) {
        setTextField(textField);
        setSend(send);

        textField.setPreferredSize(new Dimension(450, 29));

        add(textField);

        for (int index = 0; index < 10; index++) {
            add(new JSeparator());
        }

        add(send);
    }

    public void setTextField(JTextField textField) {
        this.textField = textField;
    }

    public JTextField getTextField() {
        return textField;
    }

    public void setSend(JButton send) {
        this.send = send;
    }

    public JButton getButton() {
        return send;
    }
}