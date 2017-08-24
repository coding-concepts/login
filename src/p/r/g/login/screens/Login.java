/*
 * @(#)Login.java 1.0 Jun 19, 2017
 */
package p.r.g.login.screens;

import p.r.g.login.service.LoginService;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * <code>Login</code> class is  screen for login
 * <p>
 * <p>
 * <pre>
 * <strong>History</strong>    Name              Date            Description
 * <strong>History</strong>    --------------------------------------------------------------------
 * <strong>History</strong>   Pratyush Giri    6/19/17
 * </pre>
 *
 * @author Pratyush Giri
 * @since Jun 19, 2017
 */
public class Login extends JFrame{

    JButton blogin = new JButton("Login");
    JPanel panel = new JPanel();
    JTextField txuser = new JTextField(15);
    JPasswordField pass = new JPasswordField(15);
    JLabel userName = new JLabel("Login: ");
    JLabel password = new JLabel("Password: ");

    LoginService loginService = new LoginService();


    public Login() {
        super("Login Authentication");
        setSize(300,200);
        setLocation(500,280);
        panel.setLayout (null);

        userName.setBounds(20,30,50,20);
        password.setBounds(20,65,100,20);
        txuser.setBounds(100,30,150,20);
        pass.setBounds(100,65,150,20);
        blogin.setBounds(110,100,80,20);

        panel.add(blogin);
        panel.add(txuser);
        panel.add(pass);
        panel.add(userName);
        panel.add(password);

        getContentPane().add(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        actionLogin();
    }

    private void actionLogin() {
        blogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                String puname = txuser.getText();
                String ppaswd = new String(pass.getPassword());

                if(loginService.isValidUser(puname, ppaswd)) {
                    HomePage regFace =new HomePage();
                    regFace.setVisible(true);
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(null,"Wrong Password / Username");
                    txuser.setText("");
                    pass.setText("");
                    txuser.requestFocus();
                }

            }
        });
    }

}



