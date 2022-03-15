import javax.swing.*;
import java.awt.event.*;
class MyFrame extends JFrame implements ActionListener
{
  JLabel lblId,lblName,lblTitle,lblQualification,lblMobnum,lblEmail;
  JTextField txtId,txtName,txtTitle,txtQualification,txtMobnum,txtEmail;
  JButton btnSave,btnCancel,btnDelete;
  JPanel panel;
    public MyFrame()  {
        panel=new JPanel();
        lblId=new JLabel("Workshop id");
        lblId.setBounds(50,50,100,20);
        lblName=new JLabel("name:");
        lblName.setBounds(50,100,100,20);
        lblTitle=new JLabel("Title:");
        lblTitle.setBounds(50,150,100,20);
        lblQualification=new JLabel("Qualification:");
        lblMobnum = new JLabel("mobnum:");
        lblMobnum.setBounds(50,250,100,20); lblQualification.setBounds(50,200,100,20);
        lblEmail= new JLabel("email:");
        lblEmail.setBounds(50,300,100,20);

        txtId=new JTextField(10);
        txtId.setBounds(200,50,100,20);
        txtName=new JTextField(10);
        txtName.setBounds(200,100,100,20);
        txtQualification=new JTextField(10);
        txtQualification.setBounds(200,150,100,20);
        txtTitle=new JTextField(10);
        txtTitle.setBounds(200,200,100,20);
        txtMobnum=new JTextField(10);
        txtMobnum.setBounds(200,250,100,20);
        txtEmail=new JTextField(10);
        txtEmail.setBounds(200,300,100,20);
        
        
        
        
        btnSave=new JButton("Save");
        btnSave.setBounds(50,350,100,20);
        btnSave.addActionListener(this);
        
        btnDelete=new JButton("delete");
        btnDelete.setBounds(350,350,100,20);
        btnDelete.addActionListener(this);
        
        btnCancel=new JButton("Cancel");
        btnCancel.setBounds(200,350,100,20);
        
        
        setTitle("ajay Workshop");
        
        panel.setLayout(null);
        panel.add(lblId);
        panel.add(txtId);
        panel.add(lblName);
        panel.add(txtName);
        panel.add(lblQualification);
        panel.add(txtQualification);
        panel.add(lblTitle);
        panel.add(txtTitle);
        panel.add(lblMobnum);
        panel.add(txtMobnum);
        panel.add(lblEmail);
        panel.add(txtEmail);
        panel.add(btnSave);
        panel.add(btnCancel);
        panel.add(btnDelete);        
        add(panel);
        setSize(500,500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
          if(e.getSource()==btnSave)
          {
              Workshop obj=new Workshop();
      obj.setId(Integer.parseInt(txtId.getText()));
      obj.setName(txtName.getText());
      obj.setMobnum(txtMobnum.getText());
      obj.setQualification(txtQualification.getText());
      obj.setTitle(txtTitle.getText());
      obj.setEmail(txtEmail.getText());
      DataStore ds=new DataStore();
      int s=ds.saveWorkshop(obj);
     if(s>0)
          {
              JOptionPane.showMessageDialog(this,"data insertion success");
              System.out.println("data inserted successfully");
          }
          else
          {
              System.out.println("insertion failed");
          }        
          }
    }
    
}
// public void actionPerformed(ActionEvent e) {
//          if(e.getSource()==btnDelete)
//          {
//              Workshop obj=new Workshop();
//      obj.setId(Integer.parseInt(txtId.getText()));
//      obj.setName(txtName.getText());
//      obj.setMobnum(txtMobnum.getText());
//      obj.setQualification(txtQualification.getText());
//      obj.setTitle(txtTitle.getText());
//      obj.setEmail(txtEmail.getText());
//      DataStore ds=new DataStore();
//      int s=ds.saveWorkshop(obj);
//     if(s>0)
//          {
//              JOptionPane.showMessageDialog(this,"data insertion success");
//              System.out.println("data inserted successfully");
//          }
//          else
//          {
//              System.out.println("insertion failed");
//          }        
//          }
//    }
    

public class SunilApp {

    public static void main(String[] args) {
        MyFrame fr=new MyFrame();
      
    }
    
}
