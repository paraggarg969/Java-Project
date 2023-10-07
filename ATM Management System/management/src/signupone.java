import java.util.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import com.toedter.calendar.JDateChooser;
public class signupone extends JFrame implements ActionListener{
    
    long random;
    JTextField nametextfield, fnametextfield, dobtextfield, emailtextfield, addresstextfield,pincodetextfield,citytextfield,statetextfield;
    JRadioButton male, female, married, unmarried, other;
    JButton next;
    JDateChooser datechooser;

    signupone(){

    setLayout(null);

    Random ran = new Random();
    random = Math.abs((ran.nextLong()%9000L)+1000L);

    JLabel formno = new JLabel("APPLICATION FORM NO. "+random);
    formno.setFont(new Font("Raleway",Font.BOLD,35));
    formno.setBounds(140, 8, 600, 35);
    add(formno);

    JLabel personalDetails = new JLabel("Page 1: Personal Details");
    personalDetails.setFont(new Font("Raleway", Font.BOLD,22));
    personalDetails.setBounds(290, 50, 400, 30);
    add(personalDetails);

    JLabel name = new JLabel("Name: ");
    name.setFont(new Font("Raleway", Font.BOLD,20));
    name.setBounds(100, 110, 200, 30);
    add(name);

    nametextfield = new JTextField();
    nametextfield.setFont(new Font("Raleway",Font.BOLD,14));
    nametextfield.setBounds(300, 110, 400, 30);
    add(nametextfield);

    JLabel fname = new JLabel("Father's Name: ");
    fname.setFont(new Font("Raleway", Font.BOLD,20));
    fname.setBounds(100, 160, 200, 30);
    add(fname);

    fnametextfield = new JTextField();
    fnametextfield.setFont(new Font("Raleway",Font.BOLD,14));
    fnametextfield.setBounds(300, 160, 400, 30);
    add(fnametextfield);

    JLabel dob = new JLabel("Date of Birth: ");
    dob.setFont(new Font("Raleway", Font.BOLD,20));
    dob.setBounds(100, 210, 200, 30);
    add(dob);

    datechooser = new JDateChooser();
    datechooser.setBounds(300, 210, 400, 30);
    datechooser.setForeground(new Color(105,105,105));
    add(datechooser);

    JLabel gender = new JLabel("Gender: ");
    gender.setFont(new Font("Raleway", Font.BOLD,20));
    gender.setBounds(100, 260, 200, 30);
    add(gender);

    male = new JRadioButton("Male");
    male.setBounds(300, 260, 60, 30);
    male.setBackground(Color.white);
    add(male);

    female = new JRadioButton("Female");
    female.setBounds(450, 260, 120, 30);
    female.setBackground(Color.white);
    add(female);

    ButtonGroup gendergroup = new ButtonGroup();
    gendergroup.add(male);
    gendergroup.add(female);

    JLabel email = new JLabel("Email Address: ");
    email.setFont(new Font("Raleway", Font.BOLD,20));
    email.setBounds(100, 310, 200, 30);
    add(email);

    emailtextfield = new JTextField();
    emailtextfield.setFont(new Font("Raleway",Font.BOLD,14));
    emailtextfield.setBounds(300, 310, 400, 30);
    add(emailtextfield);

    JLabel marital = new JLabel("Marital Status: ");
    marital.setFont(new Font("Raleway", Font.BOLD,20));
    marital.setBounds(100, 360, 200, 30);
    add(marital);

    married = new JRadioButton("Married");
    married.setBounds(300, 360, 100, 30);
    married.setBackground(Color.white);
    add(married);

    unmarried = new JRadioButton("UnMarried");
    unmarried.setBounds(450, 360, 100, 30);
    unmarried.setBackground(Color.white);
    add(unmarried);

    other = new JRadioButton("other");
    other.setBounds(650, 360, 100, 30);
    other.setBackground(Color.white);
    add(other);

    ButtonGroup maritalgroup = new ButtonGroup();
    maritalgroup.add(married);
    maritalgroup.add(unmarried);
    maritalgroup.add(other);

    JLabel address = new JLabel("Address: ");
    address.setFont(new Font("Raleway", Font.BOLD,20));
    address.setBounds(100, 410, 200, 30);
    add(address);

    addresstextfield = new JTextField();
    addresstextfield.setFont(new Font("Raleway",Font.BOLD,14));
    addresstextfield.setBounds(300, 410, 400, 30);
    add(addresstextfield);


    JLabel city = new JLabel("City: ");
    city.setFont(new Font("Raleway", Font.BOLD,20));
    city.setBounds(100, 460, 200, 30);
    add(city);

    citytextfield = new JTextField();
    citytextfield.setFont(new Font("Raleway",Font.BOLD,14));
    citytextfield.setBounds(300, 460, 400, 30);
    add(citytextfield);

    JLabel state = new JLabel("State: ");
    state.setFont(new Font("Raleway", Font.BOLD,20));
    state.setBounds(100, 510, 200, 30);
    add(state);

    statetextfield = new JTextField();
    statetextfield.setFont(new Font("Raleway",Font.BOLD,14));
    statetextfield.setBounds(300, 510, 400, 30);
    add(statetextfield);

    JLabel pincode = new JLabel("Pincode: ");
    pincode.setFont(new Font("Raleway", Font.BOLD,20));
    pincode.setBounds(100, 560, 200, 30);
    add(pincode);

    pincodetextfield = new JTextField();
    pincodetextfield.setFont(new Font("Raleway",Font.BOLD,14));
    pincodetextfield.setBounds(300, 560, 400, 30);
    add(pincodetextfield);

    next = new JButton("Next");
    next.setBackground(Color.black);
    next.setForeground(Color.WHITE);
    next.setFont(new Font("Raleway", Font.BOLD, 14));
    next.setBounds(620, 600, 80, 30);
    next.addActionListener(this);
    add(next);

    getContentPane().setBackground(Color.WHITE);

    setSize(850, 670);
    setLocation(350, 10);
    setVisible(true);

}

public void actionPerformed(ActionEvent ae){
    String formno = ""+ random;
    String name = nametextfield.getText();
    String fname = fnametextfield.getText();
    String dob = ((JTextField) datechooser.getDateEditor().getUiComponent()).getText();

    String gender = null;
    if(male.isSelected()){
        gender = "Male";
    }
    else if(female.isSelected()){
        gender = "Female";
    }
    String email = emailtextfield.getText();
    String marital = null;
    if(married.isSelected()){
        marital = "Married";
    }
    else if(unmarried.isSelected()){
        marital = "Unmarried";
    }
    else if(other.isSelected()){
        marital = "Other";
    }
    String address = addresstextfield.getText();
    String city = citytextfield.getText();
    String state = statetextfield.getText();
    String pincode = pincodetextfield.getText();

    try{
        if(name.equals("")){
            JOptionPane.showMessageDialog(null,"Name is Required");
        }
        else if(fname.equals("")){
             JOptionPane.showMessageDialog(null,"Father's Name is Required");
        }
        else if(address.equals("")){
             JOptionPane.showMessageDialog(null,"Address is Required");
        }
        else if(city.equals("")){
             JOptionPane.showMessageDialog(null,"City is Required");
        }
        else if(state.equals("")){
             JOptionPane.showMessageDialog(null,"State is Required");
        }
        else if (pincode.equals("")){
             JOptionPane.showMessageDialog(null,"Pincode is Required");
        }
        else if(!male.isSelected() && !female.isSelected()){
            JOptionPane.showMessageDialog(null,"Please select an Gender option");
        }
        else if(!married.isSelected() && !unmarried.isSelected() && !other.isSelected()){
            JOptionPane.showMessageDialog(null,"Please select an Marital option");
        }
        else{
            conn c = new conn();
            String query = "insert into signup values('"+formno+"', '"+name+"', '"+fname+"','"+dob+"','"+gender+"', '"+email+"', '"+marital+"', '"+address+"', '"+city+"', '"+state+"', '"+pincode+"')";
            c.s.executeUpdate(query);

            setVisible(false);
            new signuptwo(formno).setVisible(true);
        }
    }
    catch(Exception e){
        System.out.println(e);
    }

}
    public static void main(String args[]){
        new signupone();
    }
}
