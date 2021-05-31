package gui;

import javax.swing.*;
import java.awt.*;
import java.util.Vector;

public class MainFrame extends Frame {
    private final JList<String> chatList;
    private final Vector<String> messages;
    private final JList<String> connectedList;
    private final Vector<String> connected;
    private final JList<String> loggerList;
    private final Vector<String> loggers;

    public MainFrame(String username) {
        setMinimumSize(new Dimension(600, 400));

        messages = new Vector<>();
        chatList = new JList<>(messages);

        connected = new Vector<>();
        connectedList = new JList<>(connected);

        loggers = new Vector<>();
        loggerList = new JList<>(loggers);
    }

    public JList<String> getChatList() {
        return chatList;
    }

    public Vector<String> getMessages() {
        return messages;
    }

    public JList<String> getConnectedList() {
        return connectedList;
    }

    public Vector<String> getConnected() {
        return connected;
    }

    public JList<String> getLoggerList() {
        return loggerList;
    }

    public Vector<String> getLoggers() {
        return loggers;
    }
}