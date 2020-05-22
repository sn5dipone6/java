package winlogin;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class WinLogin extends JFrame {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private JLabel Lname;
    private JLabel Lpassword;
    private JTextField Tname;
    private JPasswordField Tpassword;
    private JPanel Pname, Pword, Pbutton;
    private JButton Bsure, Bcancel;

    public WinLogin() {
        setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        setTitle("登录界面");
        setSize(300, 300);
        setDefaultCloseOperation(3);
        setResizable(false);
        setVisible(true);

        Pname = new JPanel(new FlowLayout(FlowLayout.CENTER,10,10));
        Lname = new JLabel("学号:");
        Tname = new JTextField();
        Tname.setPreferredSize(new Dimension(100,20));
        Pname.add(Lname);
        Pname.add(Tname);
        Pname.setPreferredSize(new Dimension(300, 50));
        add(Pname);

        Pword = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        Lpassword = new JLabel("密码:");
        Tpassword = new JPasswordField();
        Tpassword.setPreferredSize(new Dimension(100,20));
        Pword.add(Lpassword);
        Pword.add(Tpassword);
        Pword.setPreferredSize(new Dimension(300, 50));
        add(Pword);


        Pbutton = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        Bsure = new JButton("确定");
        Bcancel = new JButton("取消");
        // Bsure.setPreferredSize(new Dimension(50, 20));
        // Bcancel.setPreferredSize(new Dimension(50, 20));
        Pbutton.add(Bsure);
        Pbutton.add(Bcancel);
        Pbutton.setPreferredSize(new Dimension(300, 200));
        add(Pbutton);
    }

    public static void main(String[] args) {
        WinLogin login = new WinLogin();
    }
}
