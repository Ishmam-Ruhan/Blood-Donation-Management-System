
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ruhan
 */
public class UpdateDonarInfo extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public UpdateDonarInfo() {
        initComponents();
        this.setLocationRelativeTo(null);
        usericon();
    }
    
    public void usericon(){
        String s="";
        try{
                    String url="jdbc:mysql://localhost/diu_blood_management_db";
                    String user="root";
                     String passs="1234";
                    Connection con=DriverManager.getConnection(url,user,passs);
                    Statement st=con.createStatement();
                    ResultSet rs=st.executeQuery("select *from userselection");
           
                    
           
                    while(rs.next()){
                        String s1=rs.getString("user");
                        s=s1;
               
                       
                    }
           
                }catch(Exception e){
            
                 }
        icon.setText("  Hello, "+s+"!");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        icon = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        contacttxt = new javax.swing.JTextField();
        jSeparator12 = new javax.swing.JSeparator();
        jSeparator13 = new javax.swing.JSeparator();
        agetxt = new javax.swing.JTextField();
        nametxt = new javax.swing.JTextField();
        jSeparator14 = new javax.swing.JSeparator();
        jSeparator15 = new javax.swing.JSeparator();
        idtxt = new javax.swing.JTextField();
        addresstxt = new javax.swing.JTextField();
        jSeparator16 = new javax.swing.JSeparator();
        jButton11 = new javax.swing.JButton();
        gendertxt = new javax.swing.JTextField();
        jSeparator17 = new javax.swing.JSeparator();
        donoridtxt = new javax.swing.JTextField();
        jSeparator18 = new javax.swing.JSeparator();
        searchtxt = new javax.swing.JTextField();
        jSeparator19 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        bgtxt = new javax.swing.JTextField();
        jSeparator20 = new javax.swing.JSeparator();
        jLabel16 = new javax.swing.JLabel();
        jButton12 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1214, 712));
        setUndecorated(true);
        getContentPane().setLayout(null);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menu.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(110, 20, 60, 50);

        jButton2.setBackground(new java.awt.Color(102, 102, 102));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jButton2.setText("Home");
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(0, 110, 270, 40);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(0, 150, 270, 30);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(0, 220, 270, 30);
        getContentPane().add(jSeparator3);
        jSeparator3.setBounds(0, 290, 270, 30);
        getContentPane().add(jSeparator4);
        jSeparator4.setBounds(0, 358, 270, 30);
        getContentPane().add(jSeparator5);
        jSeparator5.setBounds(0, 430, 270, 30);
        getContentPane().add(jSeparator6);
        jSeparator6.setBounds(0, 500, 270, 30);
        getContentPane().add(jSeparator7);
        jSeparator7.setBounds(0, 570, 270, 30);
        getContentPane().add(jSeparator8);
        jSeparator8.setBounds(0, 640, 270, 30);
        getContentPane().add(jSeparator9);
        jSeparator9.setBounds(0, 710, 270, 10);

        jButton3.setBackground(new java.awt.Color(102, 102, 102));
        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jButton3.setText("Dashboard");
        jButton3.setContentAreaFilled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(0, 180, 270, 40);

        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jButton4.setText("Requests");
        jButton4.setContentAreaFilled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(0, 250, 270, 40);

        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jButton5.setText("Add Donor");
        jButton5.setContentAreaFilled(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(0, 320, 270, 40);

        jButton6.setBackground(new java.awt.Color(102, 102, 102));
        jButton6.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jButton6.setText("Donor List");
        jButton6.setContentAreaFilled(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(0, 393, 270, 40);

        jButton7.setBackground(new java.awt.Color(102, 102, 102));
        jButton7.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jButton7.setText("Update / View Donor Info");
        getContentPane().add(jButton7);
        jButton7.setBounds(0, 460, 270, 40);

        jButton8.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jButton8.setText("Request for Blood");
        jButton8.setContentAreaFilled(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8);
        jButton8.setBounds(0, 530, 270, 40);

        jButton9.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jButton9.setText("Settings");
        jButton9.setContentAreaFilled(false);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9);
        jButton9.setBounds(0, 600, 270, 40);

        jButton10.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jButton10.setText("Exit");
        jButton10.setContentAreaFilled(false);
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10);
        jButton10.setBounds(0, 670, 270, 40);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel7.setText("Donate blood and save life!");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(830, 140, 140, 13);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 27)); // NOI18N
        jLabel6.setText("Blood Donor Management System");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(560, 100, 400, 30);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("Daffodil International University");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(630, 60, 260, 40);

        icon.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        icon.setForeground(new java.awt.Color(153, 153, 0));
        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/boy (1).png"))); // NOI18N
        getContentPane().add(icon);
        icon.setBounds(1044, 134, 160, 30);

        jLabel1.setBackground(new java.awt.Color(255, 51, 51));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sidebar_background.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 460, 270, 460);

        jLabel2.setBackground(new java.awt.Color(255, 51, 51));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sidebar_background.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 270, 480);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hdr.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(270, 0, 970, 180);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Update", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Times New Roman", 1, 18))); // NOI18N
        jPanel1.setLayout(null);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setText("Name            :");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(90, 200, 120, 40);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel10.setText("Age               :");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(90, 270, 120, 40);

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel11.setText("Donor Id  :");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(90, 120, 120, 60);

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel12.setText("Gender           :");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(80, 340, 120, 60);

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel13.setText("Address         :");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(550, 270, 120, 50);

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel14.setText("Contact No.  :");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(550, 350, 130, 50);

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel15.setText("ID                 :");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(550, 200, 120, 40);

        contacttxt.setBackground(new java.awt.Color(255, 204, 204));
        contacttxt.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        contacttxt.setForeground(new java.awt.Color(0, 0, 204));
        contacttxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        contacttxt.setBorder(null);
        contacttxt.setOpaque(false);
        contacttxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contacttxtActionPerformed(evt);
            }
        });
        jPanel1.add(contacttxt);
        contacttxt.setBounds(670, 360, 230, 30);
        jPanel1.add(jSeparator12);
        jSeparator12.setBounds(670, 390, 230, 10);
        jPanel1.add(jSeparator13);
        jSeparator13.setBounds(210, 300, 230, 10);

        agetxt.setBackground(new java.awt.Color(255, 204, 204));
        agetxt.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        agetxt.setForeground(new java.awt.Color(0, 0, 204));
        agetxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        agetxt.setBorder(null);
        agetxt.setOpaque(false);
        jPanel1.add(agetxt);
        agetxt.setBounds(210, 270, 230, 30);

        nametxt.setBackground(new java.awt.Color(255, 204, 204));
        nametxt.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        nametxt.setForeground(new java.awt.Color(0, 0, 204));
        nametxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nametxt.setBorder(null);
        nametxt.setOpaque(false);
        jPanel1.add(nametxt);
        nametxt.setBounds(210, 200, 230, 30);
        jPanel1.add(jSeparator14);
        jSeparator14.setBounds(210, 230, 230, 10);
        jPanel1.add(jSeparator15);
        jSeparator15.setBounds(670, 230, 230, 10);

        idtxt.setBackground(new java.awt.Color(255, 204, 204));
        idtxt.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        idtxt.setForeground(new java.awt.Color(0, 0, 204));
        idtxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        idtxt.setBorder(null);
        idtxt.setOpaque(false);
        jPanel1.add(idtxt);
        idtxt.setBounds(670, 200, 230, 30);

        addresstxt.setBackground(new java.awt.Color(255, 204, 204));
        addresstxt.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        addresstxt.setForeground(new java.awt.Color(0, 0, 204));
        addresstxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        addresstxt.setBorder(null);
        addresstxt.setOpaque(false);
        addresstxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addresstxtActionPerformed(evt);
            }
        });
        jPanel1.add(addresstxt);
        addresstxt.setBounds(670, 280, 230, 30);
        jPanel1.add(jSeparator16);
        jSeparator16.setBounds(670, 310, 230, 10);

        jButton11.setBackground(new java.awt.Color(255, 204, 204));
        jButton11.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/refresh.png"))); // NOI18N
        jButton11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton11.setOpaque(false);
        jButton11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton11MouseClicked(evt);
            }
        });
        jPanel1.add(jButton11);
        jButton11.setBounds(260, 440, 120, 50);

        gendertxt.setEditable(false);
        gendertxt.setBackground(new java.awt.Color(255, 204, 204));
        gendertxt.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        gendertxt.setForeground(new java.awt.Color(0, 0, 204));
        gendertxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        gendertxt.setBorder(null);
        gendertxt.setOpaque(false);
        jPanel1.add(gendertxt);
        gendertxt.setBounds(210, 350, 230, 30);
        jPanel1.add(jSeparator17);
        jSeparator17.setBounds(210, 380, 230, 10);

        donoridtxt.setEditable(false);
        donoridtxt.setBackground(new java.awt.Color(255, 204, 204));
        donoridtxt.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        donoridtxt.setForeground(new java.awt.Color(0, 0, 204));
        donoridtxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        donoridtxt.setBorder(null);
        donoridtxt.setOpaque(false);
        jPanel1.add(donoridtxt);
        donoridtxt.setBounds(210, 130, 230, 30);
        jPanel1.add(jSeparator18);
        jSeparator18.setBounds(210, 160, 230, 10);

        searchtxt.setBackground(new java.awt.Color(255, 204, 204));
        searchtxt.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        searchtxt.setForeground(new java.awt.Color(0, 0, 204));
        searchtxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        searchtxt.setBorder(null);
        searchtxt.setOpaque(false);
        searchtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchtxtActionPerformed(evt);
            }
        });
        jPanel1.add(searchtxt);
        searchtxt.setBounds(580, 30, 230, 40);
        jPanel1.add(jSeparator19);
        jSeparator19.setBounds(580, 70, 230, 30);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/searcher.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(820, 20, 100, 70);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel8.setText("* Search by your Donor ID");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(770, 80, 160, 40);

        bgtxt.setEditable(false);
        bgtxt.setBackground(new java.awt.Color(255, 204, 204));
        bgtxt.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        bgtxt.setForeground(new java.awt.Color(0, 0, 204));
        bgtxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        bgtxt.setBorder(null);
        bgtxt.setOpaque(false);
        jPanel1.add(bgtxt);
        bgtxt.setBounds(670, 140, 230, 30);
        jPanel1.add(jSeparator20);
        jSeparator20.setBounds(670, 170, 230, 10);

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel16.setText("Blood group  :");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(550, 130, 120, 60);

        jButton12.setBackground(new java.awt.Color(255, 204, 204));
        jButton12.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/update.png"))); // NOI18N
        jButton12.setText("  Update");
        jButton12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton12.setOpaque(false);
        jButton12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton12MouseClicked(evt);
            }
        });
        jPanel1.add(jButton12);
        jButton12.setBounds(570, 440, 170, 50);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(280, 190, 930, 520);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        int check=JOptionPane.showConfirmDialog(null,"YES     for     Exit\nNO       for    ReLogin ","Choose one...",JOptionPane.YES_NO_OPTION);
        if(check==0){
            //code suru
            String update="UPDATE `settings` SET `sure`='1' WHERE 1";
            executeSQLQuery(update);
            
            String update2="UPDATE `userselection` SET `user`='Open' WHERE 1";
            executeSQLQuery(update2);
            
            //code sesh
            System.exit(0);
        }
        if(check==1){
            String update="UPDATE `settings` SET `sure`='1' WHERE 1";
            executeSQLQuery(update);
            
            String update2="UPDATE `userselection` SET `user`='Open' WHERE 1";
            executeSQLQuery(update2);
            
            login l=new login();
            close();
            l.setVisible(true);
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void executeSQLQuery(String query) {
       try{
           String url="jdbc:mysql://localhost/diu_blood_management_db";
           String user="root";
           String pass="1234";
           Connection con=DriverManager.getConnection(url,user,pass);
           Statement st=con.createStatement();
          
           if(st.executeUpdate(query)==1){
               //JOptionPane.showMessageDialog(null,"Registration Successful!!","Congrats..",JOptionPane.INFORMATION_MESSAGE);
               
//ys/no code hbe
           }else{
               //JOptionPane.showMessageDialog(null,"Registration Unsuccessful!!","Sorry!",JOptionPane.WARNING_MESSAGE); 
           }
           
           
       }catch(Exception e){
            
       }
    }
    
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Home h=new Home();
        close();
        h.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Dashboard d=new Dashboard();
        close();
       d.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        close();
        Requests bg=new Requests();
        bg.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        AddDonor ad=new AddDonor();
        close();
        ad.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        DonorList dl=new DonorList();
        close();
        dl.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        BloodRequest br=new BloodRequest();
        close();
        br.setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        boolean b=false;
        
        //code suru
        try{
                    String url="jdbc:mysql://localhost/diu_blood_management_db";
                    String user="root";
                     String passs="1234";
                    Connection con=DriverManager.getConnection(url,user,passs);
                    Statement st=con.createStatement();
                    ResultSet rs=st.executeQuery("select *from settings");
           
                    
           
                    while(rs.next()){
                        String s1=rs.getString("sure");
                        if(s1.equals("2")){
                            b=true;
                        }
               
                       
                    }
           
                }catch(Exception e){
            
                 }
        
        //code sesh
        
        if(b==true){
       Settings s=new Settings();
       
       s.setVisible(true);
       close(); 
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void contacttxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contacttxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contacttxtActionPerformed

    private void addresstxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addresstxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addresstxtActionPerformed

    private void jButton11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton11MouseClicked
        clear();
    }//GEN-LAST:event_jButton11MouseClicked

    private void jButton12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton12MouseClicked
        String update="UPDATE `donors` SET `DonorId`='"+donoridtxt.getText()+"',`Name`='"+nametxt.getText()+"',`Age`='"+agetxt.getText()+"',`Gender`='"+gendertxt.getText()+"',`Bg`='"+bgtxt.getText()+"',`Id`='"+idtxt.getText()+"',`Address`='"+addresstxt.getText()+"',`Contact`='"+contacttxt.getText()+"' WHERE `DonorId`='"+donoridtxt.getText()+"'";
        
        JOptionPane.showMessageDialog(null,"Successfully Updated!!","Congrats..",JOptionPane.INFORMATION_MESSAGE);
        
        executeSQLQuery(update);
        clear();
    }//GEN-LAST:event_jButton12MouseClicked

    private void searchtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchtxtActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        id();
    }//GEN-LAST:event_jButton1MouseClicked

    
    
    
    
    public void clear(){
                    donoridtxt.setText("");
                    nametxt.setText("");
                    agetxt.setText("");
                    gendertxt.setText("");
                    bgtxt.setText("");
                    idtxt.setText("");
                    addresstxt.setText("");
                    contacttxt.setText("");
                    searchtxt.setText("");
    }
    
    
    
    
    
    public void id(){
        try{
           String url="jdbc:mysql://localhost/diu_blood_management_db";
           String user="root";
           String pass="1234";
           Connection con=DriverManager.getConnection(url,user,pass);
           Statement st=con.createStatement();
           ResultSet rs=st.executeQuery("select *from donors");
           
           
           String search=searchtxt.getText();
           while(rs.next()){
               
               String s1=rs.getString("DonorId");
               
               
               
               if(search.equalsIgnoreCase(s1)){
                   
                    String s2=rs.getString("Name");
                    String s3=rs.getString("Age");
                    String s4=rs.getString("Gender");
                    String s5=rs.getString("Bg");
                    String s6=rs.getString("Id");
                    String s7=rs.getString("Address");
                    String s8=rs.getString("Contact");
                    
                    donoridtxt.setText(s1);
                    nametxt.setText(s2);
                    agetxt.setText(s3);
                    gendertxt.setText(s4);
                    bgtxt.setText(s5);
                    idtxt.setText(s6);
                    addresstxt.setText(s7);
                    contacttxt.setText(s8);
                    
               }
               
               
               
           }
           
       }catch(Exception e){
            
       }
    }
    
    
    
    
    
    public void close(){
        WindowEvent winclose=new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winclose);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateDonarInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addresstxt;
    private javax.swing.JTextField agetxt;
    private javax.swing.JTextField bgtxt;
    private javax.swing.JTextField contacttxt;
    private javax.swing.JTextField donoridtxt;
    private javax.swing.JTextField gendertxt;
    private javax.swing.JLabel icon;
    private javax.swing.JTextField idtxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator18;
    private javax.swing.JSeparator jSeparator19;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator20;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextField nametxt;
    private javax.swing.JTextField searchtxt;
    // End of variables declaration//GEN-END:variables
}
