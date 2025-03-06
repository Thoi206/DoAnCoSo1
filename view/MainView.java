package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class MainView extends JFrame {
    private DefaultListModel<String> eventListModel;
    private JList<String> eventList;
    private JButton addButton, editButton, deleteButton;

    public MainView() {
        setTitle("Lịch trình cá nhân");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        eventListModel = new DefaultListModel<>();
        eventList = new JList<>(eventListModel);

        addButton = new JButton("Thêm");
        editButton = new JButton("Sửa");
        deleteButton = new JButton("Xóa");

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(addButton);
        buttonPanel.add(editButton);
        buttonPanel.add(deleteButton);

        add(new JScrollPane(eventList), BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
    }

    public void updateEventList(String[] events) {
        eventListModel.clear();
        for (String event : events) {
            eventListModel.addElement(event);
        }
    }

    public int getSelectedEventIndex() {
        return eventList.getSelectedIndex();
    }

    public void addAddListener(ActionListener listener) {
        addButton.addActionListener(listener);
    }

    public void addEditListener(ActionListener listener) {
        editButton.addActionListener(listener);
    }

    public void addDeleteListener(ActionListener listener) {
        deleteButton.addActionListener(listener);
    }
}
