import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class signuptwo extends JFrame implements ActionListener{
    
    JTextField pan, aadhar;
    JRadioButton syes, sno, eyes, eno;
    JButton next;
    JComboBox religion, category, income, education, occupation;
    String formno;

    signuptwo(String formno){
        this.formno = formno;

    setLayout(null);

    setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");

    JLabel additionalDetails = new JLabel("Page 2: Additional Details");
    additionalDetails.setFont(new Font("Raleway", Font.BOLD,22));
    additionalDetails.setBounds(290, 50, 400, 30);
    add(additionalDetails);

    JLabel rel = new JLabel("Religion: ");
    rel.setFont(new Font("Raleway", Font.BOLD,20));
    rel.setBounds(100, 110, 200, 30);
    add(rel);

    String valreligion[] = {"Select","Hindu","Muslim","Sikh","Christian","Other"};
    religion = new JComboBox(valreligion);
    religion.setBounds(300, 110, 400, 30);
    religion.setBackground(Color.white);
    add(religion);

    JLabel cname = new JLabel("Category: ");
    cname.setFont(new Font("Raleway", Font.BOLD,20));
    cname.setBounds(100, 160, 200, 30);
    add(cname);

    String valcategory[] = {"Select","General","OBC","SC","ST","Other"};
    category = new JComboBox(valcategory);
    category.setBounds(300, 160, 400, 30);
    category.setBackground(Color.white);
    add(category);

    JLabel in = new JLabel("Income: ");
    in.setFont(new Font("Raleway", Font.BOLD,20));
    in.setBounds(100, 210, 200, 30);
    add(in);

    String incomecategory[] = {"Select","Null","< 1,50,000","< 2,50,000","< 5,00,000","Upto 10,00,000"};
    income = new JComboBox(incomecategory);
    income.setBounds(300, 210, 400, 30);
    income.setBackground(Color.white);
    add(income);

    JLabel ed = new JLabel("Educational ");
    ed.setFont(new Font("Raleway", Font.BOLD,20));
    ed.setBounds(100, 260, 200, 30);
    add(ed);

    JLabel ql = new JLabel("Qualification: ");
    ql.setFont(new Font("Raleway", Font.BOLD,20));
    ql.setBounds(100, 282, 200, 30);
    add(ql);

    String educationalvalue[] = {"Select","Non-Graduation","Graduation","Post-Graduation","Doctrate","Other"};
    education = new JComboBox(educationalvalue);
    education.setBounds(300, 270, 400, 30);
    education.setBackground(Color.white);
    add(education);

    JLabel occ = new JLabel("Occupation: ");
    occ.setFont(new Font("Raleway", Font.BOLD,20));
    occ.setBounds(100, 330, 200, 30);
    add(occ);

    String occupationvalue[] = {"Select","Salaried","Self-Employed","Bussiness","Student","Retired","Other"};
    occupation = new JComboBox(occupationvalue);
    occupation.setBounds(300, 330,400, 30);
    occupation.setBackground(Color.white);
    add(occupation);

    JLabel p = new JLabel("PAN Number: ");
    p.setFont(new Font("Raleway", Font.BOLD,20));
    p.setBounds(100, 380, 200, 30);
    add(p);

    pan = new JTextField();
    pan.setFont(new Font("Raleway",Font.BOLD,14));
    pan.setBounds(300, 380, 400, 30);
    add(pan);


    JLabel ad = new JLabel("Aadhar Number: ");
    ad.setFont(new Font("Raleway", Font.BOLD,20));
    ad.setBounds(100, 430, 200, 30);
    add(ad);

    aadhar = new JTextField();
    aadhar.setFont(new Font("Raleway",Font.BOLD,14));
    aadhar.setBounds(300, 430, 400, 30);
    add(aadhar);

    JLabel cs = new JLabel("Senior Citizen: ");
    cs.setFont(new Font("Raleway", Font.BOLD,20));
    cs.setBounds(100, 480, 200, 30);
    add(cs);

    syes = new JRadioButton("Yes");
    syes.setBounds(300, 480, 100, 30);
    syes.setBackground(Color.white);
    add(syes);

    sno = new JRadioButton("No");
    sno.setBounds(450, 480, 100, 30);
    sno.setBackground(Color.white);
    add(sno);

    ButtonGroup csg = new ButtonGroup();
    csg.add(syes);
    csg.add(sno);

    JLabel ea = new JLabel("Existing Account: ");
    ea.setFont(new Font("Raleway", Font.BOLD,20));
    ea.setBounds(100, 530, 200, 30);
    add(ea);

    eyes = new JRadioButton("Yes");
    eyes.setBounds(300, 530, 100, 30);
    eyes.setBackground(Color.white);
    add(eyes);

    eno = new JRadioButton("No");
    eno.setBounds(450, 530, 100, 30);
    eno.setBackground(Color.white);
    add(eno);

    ButtonGroup eag = new ButtonGroup();
    eag.add(eyes);
    eag.add(eno);

    next = new JButton("Next");
    next.setBackground(Color.black);
    next.setForeground(Color.WHITE);
    next.setFont(new Font("Raleway", Font.BOLD, 14));
    next.setBounds(620, 570, 80, 30);
    next.addActionListener(this);
    add(next);

    getContentPane().setBackground(Color.WHITE);

    setSize(830, 650);
    setLocation(250, 10);
    setVisible(true);

}

public void actionPerformed(ActionEvent ae){
    String sreligion = (String) religion.getSelectedItem();
    String scategory = (String) category.getSelectedItem();
    String sincome = (String) income.getSelectedItem();
    String seducation = (String) education.getSelectedItem();
    String soccupation = (String) occupation.getSelectedItem();
    String optionToCheck = "Select";

    String seniorcitizen = null;
    if(syes.isSelected()){
        seniorcitizen = "Yes";
    }
    else if(sno.isSelected()){
        seniorcitizen = "No";
    }

    String existingaccount = null;
    if(eyes.isSelected()){
        existingaccount = "Yes";
    }
    else if(eno.isSelected()){
        existingaccount = "No";
    }
    
    String span = pan.getText();
    String saadhar = aadhar.getText();

    try{
        if(sreligion.equals(optionToCheck)){
            JOptionPane.showMessageDialog(null,"Religion is Required");
        }
        else if(scategory.equals(optionToCheck)){
             JOptionPane.showMessageDialog(null,"category is Required");
        }
        else if(sincome.equals(optionToCheck)){
             JOptionPane.showMessageDialog(null,"Income is Required");
        }
        else if(seducation.equals(optionToCheck)){
             JOptionPane.showMessageDialog(null,"Education Qualification is Required");
        }
        else if(soccupation.equals(optionToCheck)){
             JOptionPane.showMessageDialog(null,"Occupation is Required");
        }
        else if(saadhar.equals("")){
             JOptionPane.showMessageDialog(null,"Aadhar Number is Required");
        }
        else if (span.equals("")){
             JOptionPane.showMessageDialog(null,"Pan Number is Required");
        }
        else if(!syes.isSelected() && !sno.isSelected()){
            JOptionPane.showMessageDialog(null,"Please select an Senior Citizen option");
        }
        else if(!eyes.isSelected() && !eno.isSelected()){
            JOptionPane.showMessageDialog(null,"Please select an Existing Account option");
        }
        else{
            conn c = new conn();
            String query = "insert into signuptwo values('"+formno+"', '"+sreligion+"', '"+scategory+"','"+sincome+"','"+seducation+"', '"+soccupation+"', '"+span+"', '"+saadhar+"', '"+seniorcitizen+"', '"+existingaccount+"')";
            c.s.executeUpdate(query);

            setVisible(false);
            new signupthree(formno).setVisible(true);

        }
    }
    catch(Exception e){
        System.out.println(e);
    }

}
    public static void main(String args[]){
        new signuptwo("");
    }
}

