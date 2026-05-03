import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class contact implements ActionListener {

    JFrame frame = new JFrame();
    Container c1 = frame.getContentPane();
    JLabel l1 = new JLabel();
    JLabel N = new JLabel();
    JTextField Nt = new JTextField(20);
    JLabel P = new JLabel();
    JTextField pt = new JTextField(20);
    JLabel C = new JLabel();
    String[] Cities = { "FaisalAbad", "Lahore", "IslamAbad", "Samundri" };
    JComboBox ct = new JComboBox(Cities);
    ButtonGroup b = new ButtonGroup();
    JTextArea a = new JTextArea();
    JLabel T = new JLabel();
    JScrollPane scroll = new JScrollPane(a);
    JButton bs = new JButton();
    JButton br = new JButton();
    JButton bc = new JButton();
    JLabel G = new JLabel();
    JRadioButton F = new JRadioButton("Female");
    JRadioButton M = new JRadioButton("Male");

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == bs) {
            String name = Nt.getText();
            String phone = pt.getText();
            String city = ct.getSelectedItem().toString();
            String gender = "";
            String message = a.getText();

            if (M.isSelected()) {
                gender = "Male";
            } else if (F.isSelected()) {
                gender = "Female";
            }

            if (!name.matches("[A-Z].*")) {
                JOptionPane.showMessageDialog(null, "Name must start with a capital letter", "message",
                        JOptionPane.ERROR_MESSAGE);
            } else if (!phone.matches("[0-9]+")) {
                JOptionPane.showMessageDialog(null, "phone  must contain only numbers", "message",
                        JOptionPane.ERROR_MESSAGE);
            }

            else if (gender.equals("")) {
                JOptionPane.showMessageDialog(null, "select the gender", "message", JOptionPane.ERROR_MESSAGE);
            } 
            else if (!(city.equals("FaisalAbad") ||
                    city.equals("Lahore") ||
                    city.equals("IslamAbad") ||
                    city.equals("Samundri"))) {

                JOptionPane.showMessageDialog(null, "plz select the city", "message", JOptionPane.ERROR_MESSAGE);
            }

         else {
            JOptionPane.showMessageDialog(null, "Form Submitted Successfully!");
            System.out.println(name);
            System.out.println(phone);
            System.out.println(city);
            System.out.println(gender);
            System.out.println(message);
            

         }
        }
    }
    contact() {

        SpringLayout s1 = new SpringLayout();

        frame.setSize(700, 700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

        // ..........Lable 1(title) ......//

        l1.setText("Contact  list");
        l1.setFont(new Font("Ariel Black", Font.BOLD, 30));
        l1.setBackground(Color.BLACK);

        s1.putConstraint(SpringLayout.NORTH, l1, 20, SpringLayout.NORTH, c1);
        s1.putConstraint(SpringLayout.WEST, l1, 270, SpringLayout.WEST, c1);

        // ..........Lable 2(Name) ......//
        N.setText("Name: ");
        N.setFont(new Font("Ariel Black", Font.BOLD, 20));
        N.setBackground(Color.BLACK);

        s1.putConstraint(SpringLayout.NORTH, N, 90, SpringLayout.NORTH, c1);
        s1.putConstraint(SpringLayout.WEST, N, 80, SpringLayout.WEST, c1);

        // ......Text field 1 //
        Nt.setFont(new Font("Open Sans", Font.PLAIN, 15));
        s1.putConstraint(SpringLayout.NORTH, Nt, 80, SpringLayout.NORTH, l1);
        s1.putConstraint(SpringLayout.WEST, Nt, 170, SpringLayout.WEST, N);

        // ..........Lable 3(Phone) ......//
        P.setText("Phone no: ");
        P.setFont(new Font("Ariel Black", Font.BOLD, 20));
        P.setBackground(Color.BLACK);

        s1.putConstraint(SpringLayout.WEST, P, 76, SpringLayout.WEST, c1);
        s1.putConstraint(SpringLayout.NORTH, P, 90, SpringLayout.NORTH, N);

        // ......Text field 2 //
        pt.setFont(new Font("Open Sans", Font.PLAIN, 15));
        s1.putConstraint(SpringLayout.NORTH, pt, 87, SpringLayout.NORTH, Nt);
        s1.putConstraint(SpringLayout.WEST, pt, 170, SpringLayout.WEST, P);

        // .......Label 4(city).....//

        C.setText("City: ");
        C.setFont(new Font("Ariel Black", Font.BOLD, 20));
        C.setBackground(Color.BLACK);

        s1.putConstraint(SpringLayout.WEST, C, 76, SpringLayout.WEST, c1);
        s1.putConstraint(SpringLayout.NORTH, C, 90, SpringLayout.NORTH, P);

        // ......Text field 3 //
        ct.setEditable(true);
        ct.setFont(new Font("Open Sans", Font.PLAIN, 15));
        s1.putConstraint(SpringLayout.NORTH, ct, 87, SpringLayout.NORTH, pt);
        s1.putConstraint(SpringLayout.WEST, ct, 170, SpringLayout.WEST, C);

        // .......Label5(Gender).....//

        G.setText("Gender : ");
        G.setFont(new Font("Ariel Black", Font.BOLD, 20));
        G.setBackground(Color.BLACK);

        s1.putConstraint(SpringLayout.WEST, G, 76, SpringLayout.WEST, c1);
        s1.putConstraint(SpringLayout.NORTH, G, 90, SpringLayout.NORTH, C);

        // ......RdioButton......//

        s1.putConstraint(SpringLayout.NORTH, F, 87, SpringLayout.NORTH, ct);
        s1.putConstraint(SpringLayout.WEST, F, 170, SpringLayout.WEST, G);
        s1.putConstraint(SpringLayout.NORTH, M, 87, SpringLayout.NORTH, ct);
        s1.putConstraint(SpringLayout.WEST, M, 300, SpringLayout.WEST, G);
        b.add(M);
        b.add(F);

        // .........Textarea....//

        T.setText("Message : ");
        T.setFont(new Font("Ariel Black", Font.BOLD, 20));
        T.setBackground(Color.BLACK);
        s1.putConstraint(SpringLayout.WEST, T, 76, SpringLayout.WEST, c1);
        s1.putConstraint(SpringLayout.NORTH, T, 90, SpringLayout.NORTH, G);
        s1.putConstraint(SpringLayout.NORTH, scroll, 87, SpringLayout.NORTH, M);
        s1.putConstraint(SpringLayout.WEST, scroll, 170, SpringLayout.WEST, T);

        scroll.setFont(new Font("Ariel Black", Font.BOLD, 15));
        a.setLineWrap(true);
        a.setWrapStyleWord(true);
        scroll.setPreferredSize(new Dimension(200, 100));

        // ......buttons...//

        bs.setText("Submit");
        bs.setFocusable(false);
        bs.addActionListener(this);
        s1.putConstraint(SpringLayout.WEST, bs, 350, SpringLayout.WEST, c1);
        s1.putConstraint(SpringLayout.SOUTH, bs, -30, SpringLayout.SOUTH, c1);

        br.setText("Reset");
        br.setFocusable(false);
        s1.putConstraint(SpringLayout.WEST, br, 450, SpringLayout.WEST, c1);
        s1.putConstraint(SpringLayout.SOUTH, br, -30, SpringLayout.SOUTH, c1);
        br.addActionListener(e -> {

            Nt.setText("");
            pt.setText("");
            ct.setSelectedIndex(0);
            b.clearSelection();
            a.setText("");

            System.out.println("Reset info");

        });

        bc.setText("Cancel");
        bc.setFocusable(false);
        s1.putConstraint(SpringLayout.WEST, bc, 550, SpringLayout.WEST, c1);
        s1.putConstraint(SpringLayout.SOUTH, bc, -30, SpringLayout.SOUTH, c1);
        bc.addActionListener(e -> {
    frame.dispose(); 
});

        c1.setLayout(s1);
        c1.add(l1);

        c1.add(N);
        c1.add(Nt);
        c1.add(P);
        c1.add(pt);
        c1.add(C);
        c1.add(ct);
        c1.add(G);
        c1.add(F);
        c1.add(M);
        c1.add(T);
        c1.add(scroll);
        c1.add(bs);
        c1.add(br);
        c1.add(bc);

        frame.setVisible(true);

    }

    public static void main(String[] args) {

        new contact();
    }

}

