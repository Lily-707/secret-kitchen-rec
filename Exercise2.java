/*
Setup
First Name: 
Last Name: 
Email: 
Cell phone: 
 */
 import java.awt.*;
import java.awt.event.*;

public class Excercise2 {
    public static void main(String[] args) {
        Frame frm = new Frame("DataEntry frame");
        Label lbl = new Label();
        frm.add(lbl);
        frm.setSize(350, 200);
        frm.setVisible(true);
        frm.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        Panel p = new Panel();
        Panel p1 = new Panel();
        Label jFirstName = new Label("First Name");
        TextField lFirstName = new TextField(20);
        Label jLastName = new Label("Last Name");
        TextField lLastName = new TextField(20);
        Label jEmail = new Label("Email");
        TextField lEmail = new TextField(20);
        Label jCellPhone = new Label("Cell Phone");
        TextField lCellPhone = new TextField(20);
        p.setLayout(new GridLayout(5, 6));
        p.add(jFirstName);
        p.add(lFirstName);
        p.add(jLastName);
        p.add(lLastName);
        p.add(jEmail);
        p.add(lEmail);
        p.add(jCellPhone);
        p.add(lCellPhone);
        Button Submit = new Button("Submit");
        p.add(Submit);
        p1.add(p);
        frm.add(p1, BorderLayout.NORTH);
    }
}
