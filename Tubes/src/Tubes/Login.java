/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tubes;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
        
public class Login extends JFrame implements ActionListener{
    private JTextField f_user;
    private JPasswordField f_pass;
    private JButton login,batal;
    
    public Login(){
        setSize(350, 200);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        userInterface();
        setVisible(true);
    }
    
    private void userInterface(){
        JLabel judul = new JLabel("Form Login Ga-PayTera");
        judul.setHorizontalAlignment(JLabel.CENTER);
        judul.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 17));
        getContentPane().add(judul, "North");
        
        JPanel panComp = new JPanel();
        panComp.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        
        JLabel user = new JLabel("ID Karyawan:");
        user.setPreferredSize(new Dimension(110, 25));
        user.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 14));
        panComp.add(user);
        
        f_user = new JTextField();
        f_user.setPreferredSize(new Dimension(210, 25));
        panComp.add(f_user);
        
        JLabel pass = new JLabel("Password");
        pass.setPreferredSize(new Dimension(110, 25));
        pass.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 14));
        panComp.add(pass);
        
        f_pass = new JPasswordField();
        f_pass.setPreferredSize(new Dimension(210, 25));
        panComp.add(f_pass);
        
        getContentPane().add(panComp);
        
        JPanel panButton = new JPanel();
        panButton.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));

        login = new JButton("Login");
        login.addActionListener(this);
        panButton.add(login);
        
        batal = new JButton("Batal");
        batal.addActionListener(this);
        panButton.add(batal);
        
        getContentPane().add(panButton, "South");
    }
    
    public static void main(String[] args){
        Login form = new Login();
    }

    public Object getValue(String key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void putValue(String key, Object value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==login){
            String pass = String.valueOf(f_pass.getPassword());
            if(f_user.getText().equals("admin") && pass.equals("admin")){
                JOptionPane.showMessageDialog(null, "Berhasil Login");
            }else{
                JOptionPane.showMessageDialog(null, "Gagal Login");
            }
        }else if(e.getSource()==batal){
            System.exit(0);
        }
    }
}
