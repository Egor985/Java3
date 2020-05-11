package src.Lesson4.homework;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.EventListenerList;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class chatWindow extends JFrame {
    private JTextField field;
    private JTextArea jta;
    private JButton button;
//    private ChangeEvent changeEvent;
//    private EventListenerList listenerList;

    public chatWindow(){
        setTitle("chat");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(550,300, 800, 500);
        setMinimumSize(new Dimension(500, 300));

        JPanel jpanel = new JPanel();
        jpanel.setLayout(new BorderLayout());

        jta = new JTextArea();
        jta.setLineWrap(true);
        jta.setEnabled(false);
        jta.setDisabledTextColor(Color.black);
        JScrollPane scrollpane = new JScrollPane(jta);
        jpanel.add(scrollpane, BorderLayout.CENTER);

        JPanel bottomJp = new JPanel();
        bottomJp.setLayout(new BorderLayout());

        addTextField();
        bottomJp.add(field, BorderLayout.CENTER);
        addButton();
        bottomJp.add(button, BorderLayout.SOUTH);
        jpanel.add(bottomJp, BorderLayout.SOUTH);
        add(jpanel);

        setVisible(true);
        field.grabFocus();
    }

    private void sendMessage(){
        if(!field.getText().isEmpty()){
            jta.append(field.getText() + "\n");
            field.setText("name: ");
            field.grabFocus();
        }
    }

//    protected void fireStateChanged() {
//        Object[] listeners = listenerList.getListenerList();
//        for (int i = listeners.length-2; i>=0; i-=2) {
//            if (listeners[i]== ChangeListener.class) {
//                if (changeEvent == null)
//                    changeEvent = new ChangeEvent(this);
//                ((ChangeListener)listeners[i+1]).stateChanged(changeEvent);
//            }
//        }
//    }

    private void addTextField(){
        field = new JTextField();
        field.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sendMessage();
            }
        });
    }

    private void addButton(){
        button = new JButton("Отправить");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sendMessage();
            }
        });
    }

}
