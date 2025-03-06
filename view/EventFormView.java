package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class EventFormView extends JFrame {
    private JTextField titleField, dateField, timeField, reminderField;
    private JTextArea descriptionArea;
    private JButton saveButton;

    public EventFormView() {
        setTitle("Sự kiện");
        setSize(300, 300);
        setLayout(new GridLayout(6, 2));

        titleField = new JTextField();
        dateField = new JTextField();
        timeField = new JTextField();
        descriptionArea = new JTextArea();
        reminderField = new JTextField();
        saveButton = new JButton("Lưu");

        add(new JLabel("Tiêu đề:"));
        add(titleField);
        add(new JLabel("Ngày (yyyy-MM-dd):"));
        add(dateField);
        add(new JLabel("Giờ (HH:mm):"));
        add(timeField);
        add(new JLabel("Mô tả:"));
        add(descriptionArea);
        add(new JLabel("Nhắc nhở (phút):"));
        add(reminderField);
        add(saveButton);
    }

    public String getTitleText() {
        return titleField.getText();
    }

    public String getDateText() {
        return dateField.getText();
    }

    public String getTimeText() {
        return timeField.getText();
    }

    public String getDescriptionText() {
        return descriptionArea.getText();
    }

    public int getReminderText() {
        return Integer.parseInt(reminderField.getText());
    }

    public void setEventData(String title, String date, String time, String description, int reminder) {
        titleField.setText(title);
        dateField.setText(date);
        timeField.setText(time);
        descriptionArea.setText(description);
        reminderField.setText(String.valueOf(reminder));
    }

    public void addSaveListener(ActionListener listener) {
        saveButton.addActionListener(listener);
    }
}
