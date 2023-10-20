import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.*;

public class withdrawl extends JFrame implements ActionListener{
    JTextField amount;
    JButton withdrawl, back;
    String pinnumber;

    withdrawl(String pinnumber){

        this.pinnumber = pinnumber;
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900,850,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,900,850);
        add(image); 

        JLabel text = new JLabel("Enter the amount you want to withdrawl");
        text.setBounds(190, 300, 700, 35);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System",Font.BOLD,16));
        image.add(text);

        amount = new JTextField();
        amount.setFont(new Font("Raleway",Font.BOLD,22));
        amount.setBounds(170,350,320,25);
        image.add(amount);

        withdrawl = new JButton("withdrawl");
        withdrawl.setBounds(355,458,150,30);
        withdrawl.addActionListener(this);
        image.add(withdrawl);

        back = new JButton("Back");
        back.setBounds(355,490,150,30);
        back.addActionListener(this);
        image.add(back);

        setSize(900,850);
        setLocation(300,0);
        setUndecorated(true);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        // if(ae.getSource() == withdrawl){
        //     String number = amount.getText();
        //     String date = new SimpleDateFormat("yyy-MM-dd hh:mm:ss").format(Calendar.getInstance().getTime());
        //     try{
        //         if(number.equals("")){
        //             JOptionPane.showMessageDialog(null,"Please enter the amount you want to withdrawl");
        //         }
        //         else{
        //             conn c = new conn();
        //             String query = "insert into bank values('"+pinnumber+"','"+date+"','withdrawl','"+number+"')";
        //             c.s.executeUpdate(query);
        //             JOptionPane.showMessageDialog(null,"Rs "+number+" withdrawl Successfully");
        //             setVisible(false);
        //             new Transaction(pinnumber).setVisible(true);
        //         }
        //     }
        //     catch(Exception e){
        //         System.out.println(e);
        //     }
        // }
        // else if(ae.getSource() == back){
        //     setVisible(false);
        //     new Transaction(pinnumber).setVisible(true);
        // }


        if(ae.getSource()==back){
            setVisible(false);
            new Transaction(pinnumber).setVisible(true);
        }
        else{
           String am = amount.getText();
           conn c = new conn();
           try{
            ResultSet rs = c.s.executeQuery("Select * from bank where pin = '"+pinnumber+"'");
            int balance = 0;
            while(rs.next()){
                if(rs.getString("type").equals("Deposit")){
                    balance += Integer.parseInt(rs.getString("amount"));
                }
                else{
                    balance -= Integer.parseInt(rs.getString("amount"));
                }
            }
            if((ae.getSource() != back) && (balance < Integer.parseInt(am))){
                JOptionPane.showMessageDialog(null,"Insufficient Balance");
                return;
            }
            String date = new SimpleDateFormat("yyy-MM-dd hh:mm:ss").format(Calendar.getInstance().getTime());
            String query = "insert into bank values('"+pinnumber+"','"+date+"','withdrawl','"+am+"')";
            c.s.executeUpdate(query);
            JOptionPane.showMessageDialog(null,"Rs "+am+" withdrawl Successfully");

            setVisible(false);
            new Transaction(pinnumber).setVisible(true);
           }
           catch(Exception e){
            System.out.println(e);
           }
        }
    }
    public static void main(String args[]){
        new withdrawl("");
    }
}
