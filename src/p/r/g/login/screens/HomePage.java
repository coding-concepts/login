/*
 * @(#)HomePage.java 1.0 Jun 19, 2017
 */
package p.r.g.login.screens;

import javax.swing.*;

/**
 * <code>HomePage</code> class is
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
public class HomePage extends JFrame {
    JLabel welcome = new JLabel("Welcome to a New Frame");
    JPanel panel = new JPanel();

    HomePage(){
        super("Welcome");
        setSize(300,200);
        setLocation(500,280);
        panel.setLayout (null);

        welcome.setBounds(70,50,150,60);

        panel.add(welcome);

        getContentPane().add(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}



