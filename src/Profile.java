
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ruhan
 */
public class Profile extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Profile() {
        initComponents();
        this.setLocationRelativeTo(null);
        usericon();
        refresh();
        request();
        notification();
        //blocking();
    }
    
    public static String song="E:\\Projects\\Java Projects\\Ict_Curnival\\dist\\filling-your-inbox.mp3";
    //MP3Player mp3=new MP3Player(new File(song));
    
    public String current;
    
    public void usericon(){
        String s="";
        try{
                    String url="jdbc:mysql://localhost/diu_blood_management_db";
                    String user="root";
                     String passs="";
                    Connection con=DriverManager.getConnection(url,user,passs);
                    Statement st=con.createStatement();
                    ResultSet rs=st.executeQuery("select *from userselection");
           
                    
           
                    while(rs.next()){
                        String s1=rs.getString("user");
                        s=s1;
                        current=s1;
                    }
           
                }catch(Exception e){
            
                 }
        icon.setText("  Hello, "+s+"!");
    }
    
    
    
    
    public void notification(){
        try{
           String url="jdbc:mysql://localhost/"+current;
           String user="root";
           String pass="";
           Connection con=DriverManager.getConnection(url,user,pass);
           Statement st=con.createStatement();
           ResultSet rs=st.executeQuery("select *from notification");
           int count=0;
           while(rs.next()){
               String s=rs.getString("View");
               if(s.equals("No")){
                   
                   count++;
               }
           }
           if(count>0){
               ic.setVisible(true);
           }else{
               ic.setVisible(false);
           }
           ntxt.setText(String.valueOf(count));
           
           
           
       }catch(Exception e){
            
       }
    }
    
    
    
    
    
    
    public void refresh(){
        try{
                    String url="jdbc:mysql://localhost/diu_blood_management_db";
                    String user="root";
                     String passs="";
                    Connection con=DriverManager.getConnection(url,user,passs);
                    Statement st=con.createStatement();
                    ResultSet rs=st.executeQuery("select *from userprofile");
           
                    
           
                    while(rs.next()){
                        String s1=rs.getString("Un");
                        if(s1.equals(current)){
                            String uid=rs.getString("ID");
                            String name=rs.getString("Name");
                            String age=rs.getString("Age");
                            String address=rs.getString("Address");
                            String contact=rs.getString("Contact");
                            String bg=rs.getString("BG");
                            String dt=rs.getString("DonatingTime");
                            String elg=rs.getString("Eligible");
                            String gender=rs.getString("Gender");
                            String occu=rs.getString("Occupation");
                            String notification=rs.getString("Notification");
                            
                            dstxt.setText(elg);
                            bgtxt.setText(bg);
                            uitxt.setText(uid);
                            ntxt.setText(notification);
                            nametxt.setText(name);
                            agetxt.setText(age);
                            addresstxt.setText(address);
                            contacttxt.setText(contact);
                            gendertxt.setText(gender);
                            occupationtxt.setText(occu);
                            tdttxt.setText(dt);
                            
                            break;
                        }
                    }
           
           }catch(Exception e){
            
           }
        
    }
    
    public void request(){
        try{
           String url="jdbc:mysql://localhost/diu_blood_management_db";
           String user="root";
           String pass="";
           Connection con=DriverManager.getConnection(url,user,pass);
           Statement st=con.createStatement();
           ResultSet rs=st.executeQuery("select *from requests");
           
           DefaultTableModel model=(DefaultTableModel) table1.getModel();
           Object rowData[]=new Object[7];
           while(rs.next()){
               String s8=rs.getString("Request by");
               
               if(s8.equals(current)){
                    String s1=rs.getString("requestId");
                    String s2=rs.getString("Name");
                    String s3=rs.getString("Bg");
                    String s4=rs.getString("Address");
                    String s5=rs.getString("Contact1");
                    String s6=rs.getString("Contact2");
                    String s7=rs.getString("Time & Date");
               
                    rowData[0]=s1;
                    rowData[1]=s2;
                    rowData[2]=s3;
                    rowData[3]=s4;
                    rowData[4]=s5;
                    rowData[5]=s6;
                    rowData[6]=s7;
                    
                    model.addRow(rowData);
               }
           }
           
       }catch(Exception e){
            
       }
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
        icon = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        dstxt = new javax.swing.JTextField();
        uitxt = new javax.swing.JTextField();
        ntxt = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        bgtxt = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        nametxt = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        contacttxt = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        tdttxt = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        addresstxt = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        gendertxt = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        occupationtxt = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        agetxt = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        ic = new javax.swing.JLabel();
        jButton18 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1214, 712));
        setUndecorated(true);
        getContentPane().setLayout(null);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menu.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(110, 20, 60, 50);

        jButton2.setBackground(new java.awt.Color(102, 102, 102));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/homex24.png"))); // NOI18N
        jButton2.setText("           Home");
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
        jSeparator6.setBounds(0, 500, 270, 20);
        getContentPane().add(jSeparator7);
        jSeparator7.setBounds(0, 570, 270, 30);
        getContentPane().add(jSeparator8);
        jSeparator8.setBounds(0, 640, 270, 30);
        getContentPane().add(jSeparator9);
        jSeparator9.setBounds(0, 710, 270, 10);

        jButton3.setBackground(new java.awt.Color(102, 102, 102));
        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dashboardx24.png"))); // NOI18N
        jButton3.setText("     Dashboard");
        jButton3.setContentAreaFilled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(0, 180, 270, 40);

        jButton4.setBackground(new java.awt.Color(102, 102, 102));
        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/profilex24.png"))); // NOI18N
        jButton4.setText("           Profile");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(0, 250, 270, 40);

        jButton5.setBackground(new java.awt.Color(102, 102, 102));
        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/requestsx24.png"))); // NOI18N
        jButton5.setText("        Requests");
        jButton5.setContentAreaFilled(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(0, 320, 270, 40);

        jButton6.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/donorlistx24.png"))); // NOI18N
        jButton6.setText("      Donor List");
        jButton6.setContentAreaFilled(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(0, 393, 270, 40);

        jButton7.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adddonorx24.png"))); // NOI18N
        jButton7.setText("     Add Donor");
        jButton7.setContentAreaFilled(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(0, 460, 270, 40);

        jButton8.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Requestforbloodgeneralx24.png"))); // NOI18N
        jButton8.setText(" Blood Request");
        jButton8.setContentAreaFilled(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8);
        jButton8.setBounds(0, 530, 270, 40);

        jButton9.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/settingsx24.png"))); // NOI18N
        jButton9.setText("        Settings");
        jButton9.setContentAreaFilled(false);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9);
        jButton9.setBounds(0, 600, 270, 40);

        jButton10.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/exitx24.png"))); // NOI18N
        jButton10.setText("        Exit");
        jButton10.setContentAreaFilled(false);
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10);
        jButton10.setBounds(0, 670, 270, 40);

        icon.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        icon.setForeground(new java.awt.Color(153, 153, 0));
        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/boy (1).png"))); // NOI18N
        getContentPane().add(icon);
        icon.setBounds(1044, 134, 160, 30);

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

        jLabel1.setBackground(new java.awt.Color(255, 51, 51));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/s006_LightBlue.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 460, 270, 460);

        jLabel2.setBackground(new java.awt.Color(255, 51, 51));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/s006_LightBlue.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 270, 480);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/s006_LightBlue.jpg"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(270, 0, 950, 180);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "My Profile", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Times New Roman", 1, 18))); // NOI18N
        jPanel1.setLayout(null);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("Donor Status   :");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(20, 40, 100, 20);

        dstxt.setEditable(false);
        dstxt.setBackground(new java.awt.Color(204, 255, 255));
        dstxt.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        dstxt.setForeground(new java.awt.Color(255, 0, 0));
        dstxt.setBorder(null);
        dstxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dstxtActionPerformed(evt);
            }
        });
        jPanel1.add(dstxt);
        dstxt.setBounds(130, 40, 80, 20);

        uitxt.setEditable(false);
        uitxt.setBackground(new java.awt.Color(204, 255, 255));
        uitxt.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        uitxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        uitxt.setBorder(null);
        uitxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uitxtActionPerformed(evt);
            }
        });
        jPanel1.add(uitxt);
        uitxt.setBounds(580, 40, 110, 20);

        ntxt.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        ntxt.setForeground(new java.awt.Color(255, 0, 51));
        ntxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(ntxt);
        ntxt.setBounds(790, 40, 80, 20);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setText("Total Donating Time :");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(40, 240, 150, 40);

        bgtxt.setEditable(false);
        bgtxt.setBackground(new java.awt.Color(204, 255, 255));
        bgtxt.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        bgtxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        bgtxt.setBorder(null);
        bgtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bgtxtActionPerformed(evt);
            }
        });
        jPanel1.add(bgtxt);
        bgtxt.setBounds(340, 40, 90, 20);

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel11.setText("My requests :");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(60, 290, 100, 20);

        nametxt.setEditable(false);
        nametxt.setBackground(new java.awt.Color(204, 255, 255));
        nametxt.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        nametxt.setBorder(null);
        nametxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nametxtActionPerformed(evt);
            }
        });
        jPanel1.add(nametxt);
        nametxt.setBounds(160, 110, 210, 20);

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel12.setText("Contact     :");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(50, 150, 100, 20);

        contacttxt.setEditable(false);
        contacttxt.setBackground(new java.awt.Color(204, 255, 255));
        contacttxt.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        contacttxt.setBorder(null);
        contacttxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contacttxtActionPerformed(evt);
            }
        });
        jPanel1.add(contacttxt);
        contacttxt.setBounds(160, 150, 210, 20);

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel13.setText("Age           :");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(50, 190, 100, 20);

        tdttxt.setEditable(false);
        tdttxt.setBackground(new java.awt.Color(204, 255, 255));
        tdttxt.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        tdttxt.setForeground(new java.awt.Color(255, 0, 0));
        tdttxt.setBorder(null);
        tdttxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tdttxtActionPerformed(evt);
            }
        });
        jPanel1.add(tdttxt);
        tdttxt.setBounds(220, 250, 110, 20);

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel14.setText("Address      :");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(510, 110, 100, 20);

        addresstxt.setEditable(false);
        addresstxt.setBackground(new java.awt.Color(204, 255, 255));
        addresstxt.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        addresstxt.setBorder(null);
        addresstxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addresstxtActionPerformed(evt);
            }
        });
        jPanel1.add(addresstxt);
        addresstxt.setBounds(620, 110, 210, 20);

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel15.setText("Gender       :");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(510, 150, 100, 20);

        gendertxt.setEditable(false);
        gendertxt.setBackground(new java.awt.Color(204, 255, 255));
        gendertxt.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        gendertxt.setBorder(null);
        gendertxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gendertxtActionPerformed(evt);
            }
        });
        jPanel1.add(gendertxt);
        gendertxt.setBounds(620, 150, 210, 20);

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel16.setText("Occupation :");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(510, 190, 100, 20);

        occupationtxt.setEditable(false);
        occupationtxt.setBackground(new java.awt.Color(204, 255, 255));
        occupationtxt.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        occupationtxt.setBorder(null);
        occupationtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                occupationtxtActionPerformed(evt);
            }
        });
        jPanel1.add(occupationtxt);
        occupationtxt.setBounds(620, 190, 210, 20);

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel17.setText("User ID   :");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(510, 40, 80, 20);

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel18.setText("Notifications :");
        jPanel1.add(jLabel18);
        jLabel18.setBounds(700, 40, 90, 20);

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        jButton1.setText("View");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(790, 60, 80, 20);

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel19.setText("Blood Group   :");
        jPanel1.add(jLabel19);
        jLabel19.setBounds(250, 40, 100, 20);

        agetxt.setEditable(false);
        agetxt.setBackground(new java.awt.Color(204, 255, 255));
        agetxt.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        agetxt.setBorder(null);
        agetxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agetxtActionPerformed(evt);
            }
        });
        jPanel1.add(agetxt);
        agetxt.setBounds(160, 190, 210, 20);

        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel20.setText("Name        :");
        jPanel1.add(jLabel20);
        jLabel20.setBounds(50, 110, 100, 20);

        table1.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Request ID", "Name", "Blood Group", "Address", "Contact 1", "Contact 2", "Time & Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table1.setSelectionBackground(new java.awt.Color(255, 204, 204));
        jScrollPane1.setViewportView(table1);
        if (table1.getColumnModel().getColumnCount() > 0) {
            table1.getColumnModel().getColumn(0).setResizable(false);
            table1.getColumnModel().getColumn(1).setResizable(false);
            table1.getColumnModel().getColumn(2).setResizable(false);
            table1.getColumnModel().getColumn(3).setResizable(false);
            table1.getColumnModel().getColumn(4).setResizable(false);
            table1.getColumnModel().getColumn(5).setResizable(false);
            table1.getColumnModel().getColumn(6).setResizable(false);
        }

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(60, 320, 830, 130);

        jButton11.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jButton11.setText("Delete Selected Request");
        jButton11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton11.setContentAreaFilled(false);
        jButton11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton11MouseClicked(evt);
            }
        });
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton11);
        jButton11.setBounds(390, 470, 150, 30);

        jButton12.setBackground(new java.awt.Color(255, 51, 51));
        jButton12.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton12.setText("Delete Profile");
        jButton12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton12);
        jButton12.setBounds(770, 470, 110, 30);

        jButton13.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jButton13.setText("Update Profile");
        jButton13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton13.setContentAreaFilled(false);
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton13);
        jButton13.setBounds(230, 470, 110, 30);

        jButton14.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jButton14.setText("Make Request");
        jButton14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton14.setContentAreaFilled(false);
        jButton14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton14MouseClicked(evt);
            }
        });
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton14);
        jButton14.setBounds(590, 470, 110, 30);

        jButton15.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/messenger.png"))); // NOI18N
        jButton15.setText("Quick Messenger");
        jButton15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton15.setContentAreaFilled(false);
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton15);
        jButton15.setBounds(730, 260, 160, 30);

        jButton16.setBackground(new java.awt.Color(102, 102, 255));
        jButton16.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton16.setText("Mark As A DONOR");
        jButton16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton16.setContentAreaFilled(false);
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton16);
        jButton16.setBounds(410, 260, 140, 30);

        jButton17.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton17.setText("Remove As A DONOR");
        jButton17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton17.setContentAreaFilled(false);
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton17);
        jButton17.setBounds(560, 260, 150, 30);

        ic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/new.png"))); // NOI18N
        jPanel1.add(ic);
        ic.setBounds(880, 34, 30, 30);

        jButton18.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jButton18.setText("Donate");
        jButton18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton18.setContentAreaFilled(false);
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton18);
        jButton18.setBounds(70, 470, 110, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(280, 190, 930, 520);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/s006_LightBlue.jpg"))); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(1060, 0, 160, 180);

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
           String pass="";
           Connection con=DriverManager.getConnection(url,user,pass);
           Statement st=con.createStatement();
          
           if(st.executeUpdate(query)==1){
               
           }else{
               //JOptionPane.showMessageDialog(null,"There is a problem.","Sorry!",JOptionPane.WARNING_MESSAGE); 
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
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        DonorList dl=new DonorList();
        close();
        dl.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        boolean b=false;
        
        //code suru
        try{
                    String url="jdbc:mysql://localhost/diu_blood_management_db";
                    String user="root";
                     String passs="";
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
            AddDonor ad=new AddDonor();
             ad.setVisible(true);
             close();
        }else{
            JOptionPane.showMessageDialog(this,"This Option is Admin Property!");
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        boolean b=false;
        
        //code suru
        try{
                    String url="jdbc:mysql://localhost/diu_blood_management_db";
                    String user="root";
                     String passs="";
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
            BloodRequest br=new BloodRequest();
        
            br.setVisible(true);
            close();
        }else{
            JOptionPane.showMessageDialog(this,"This Option is Admin Property!\nPlease go to : Profile -> Make Request");
        }

    }//GEN-LAST:event_jButton8ActionPerformed

     //block list checking
    
    public void blocking(){
        LocalDate dateToday=LocalDate.now();
        SimpleDateFormat d=new SimpleDateFormat("dd/MM/yyyy");
        String s=dateToday.toString();
        String[] f=s.split("-");
        String ss=f[2]+"/"+f[1]+"/"+f[0];
        
        Date d1=new Date();
        Date d2;
        
        try {
            d1=d.parse(ss);
        } catch (Exception ex) {
            
        }
        
        try{
            String url="jdbc:mysql://localhost/diu_blood_management_db";
            String user="root";
            String passs="";
            Connection con=DriverManager.getConnection(url,user,passs);
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select *from block");
            
            
            
            
            while(rs.next()){
                String us=rs.getString("User");
                String dt=rs.getString("Date");
                try {
                    d2=d.parse(dt);
                    
                    long diff =Math.abs(d1.getTime()-d2.getTime())    ;
                    long diffDays = diff / (24 * 60 * 60 * 1000);
                    
                    if(diffDays>=120){
                        String del="DELETE FROM `block` WHERE `User`=\""+us+"\"";
                        executeSQLQuery(del);
                    }
                    
                } catch (Exception e) {
                }
            }
                    
           
        }catch(Exception e){
            
        }
    }
    
    
    
    //end
    
    
    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        boolean b=false;
        
        //code suru
        try{
                    String url="jdbc:mysql://localhost/diu_blood_management_db";
                    String user="root";
                     String passs="";
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

    private void dstxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dstxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dstxtActionPerformed

    private void uitxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uitxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uitxtActionPerformed

    private void bgtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bgtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bgtxtActionPerformed

    private void nametxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nametxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nametxtActionPerformed

    private void contacttxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contacttxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contacttxtActionPerformed

    private void tdttxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tdttxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tdttxtActionPerformed

    private void addresstxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addresstxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addresstxtActionPerformed

    private void gendertxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gendertxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gendertxtActionPerformed

    private void occupationtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_occupationtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_occupationtxtActionPerformed

    private void agetxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agetxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_agetxtActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
//        System.out.println(current);
//        

        int s=JOptionPane.showConfirmDialog(null,"You Will Lost All Your Data Such as: Requests, Donating History etc.\n    Are You Sure?","Alert",JOptionPane.YES_NO_OPTION);

        if(s==0){
            String d=current;
        
            String delete1="DELETE FROM `donors` WHERE Added by=\""+d+"\"";
            executeSQLQuery(delete1);
        
            String delete2="DELETE FROM `requests` WHERE Request by=\""+d+"\"";
            executeSQLQuery(delete2);
        
            String delete3="DELETE FROM `user` WHERE Username=\""+d+"\"";
             executeSQLQuery(delete3);
        
            String delete="DELETE FROM `userprofile` WHERE Un=\""+d+"\"";
        
            executeSQLQuery(delete);
            
            String db="DROP DATABASE "+current;
            
            
            try{
                String url="jdbc:mysql://localhost/";
                String user="root";
                String pass="";
                Connection con=DriverManager.getConnection(url,user,pass);
                Statement st=con.createStatement();
           
                st.executeUpdate(db);
           
            }catch(Exception e){
            
            }
            
            String up="UPDATE `userselection` SET `user`='"+String.valueOf("Open")+"' WHERE 1";
            executeSQLQuery(up,"ww");
        
            login l=new login();
            close();
            l.setVisible(true);
        }else{
            Profile p=new Profile();
            close();
            p.setVisible(true);
        }
        
        
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        Updateprofile up=new Updateprofile();
        up.getUser(current);
        close();
        up.setVisible(true);
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
       
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton11MouseClicked
        int i=table1.getSelectedRow();
        
        TableModel model=table1.getModel();
        
        String s=model.getValueAt(i, 0).toString();
        
        String delete="DELETE FROM `requests` WHERE requestId= "+s;
        executeSQLQuery(delete);
        
        DefaultTableModel m=(DefaultTableModel) table1.getModel();
        m.setRowCount(0);
        request();
    }//GEN-LAST:event_jButton11MouseClicked
      private String llp;
    private void jButton14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton14MouseClicked
        UserBR pbr=new UserBR();
        llp=contacttxt.getText();
        //System.out.println(llp);
        
        close();
        pbr.setVisible(true);
    }//GEN-LAST:event_jButton14MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Requests r=new Requests();
        r.setVisible(true);
        close();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        blocking();
        boolean check= false;
        try{
           String url="jdbc:mysql://localhost/diu_blood_management_db";
           String user="root";
           String pass="";
           Connection con=DriverManager.getConnection(url,user,pass);
           Statement st=con.createStatement();
           ResultSet rs=st.executeQuery("select *from donors");
           
           while(rs.next()){
               String s=rs.getString("Added by");
               if(s.equals(current)){
                   check=true;
                   break;
               }
           }
           
           
       }catch(Exception e){
            
       }
        
        if(check){
            String update="UPDATE `userprofile` SET `Eligible`='"+String.valueOf("No")+"' WHERE `Un`=\""+current+"\"";
            executeSQLQuery(update);
            
            String del="DELETE FROM `donors` WHERE `Added by`=\""+current+"\"";
            executeSQLQuery(del);
            
            JOptionPane.showMessageDialog(null,"You are not a DONOR now!");
            
            refresh();
            notification();
        }else{
            JOptionPane.showMessageDialog(null,"You are not a DONOR now!");
        }
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        
       
        
        
        Notification n=new Notification();
        close();
        n.setVisible(true);
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        blocking();
        boolean check= false;
        try{
           String url="jdbc:mysql://localhost/diu_blood_management_db";
           String user="root";
           String pass="";
           Connection con=DriverManager.getConnection(url,user,pass);
           Statement st=con.createStatement();
           ResultSet rs=st.executeQuery("select *from block");
           
           while(rs.next()){
               String s=rs.getString("User");
               if(s.equals(current)){
                   check=true;
                   break;
               }
           }
           
           
       }catch(Exception e){
            
       }
        
        
        if(check){
            JOptionPane.showMessageDialog(null,"Sorry!! Not Possible right now.");
        }else{
            String id=uitxt.getText();
            String name=nametxt.getText();
            String age=agetxt.getText();
            String gender=gendertxt.getText();
            String bg=bgtxt.getText();
            String uid;
            String address=addresstxt.getText();
            String contact=contacttxt.getText();
            String ab=current;
            
            boolean c=false;
            try{
           String url="jdbc:mysql://localhost/diu_blood_management_db";
           String user="root";
           String pass="";
           Connection con=DriverManager.getConnection(url,user,pass);
           Statement st=con.createStatement();
           ResultSet rs=st.executeQuery("select *from donors");
           
           while(rs.next()){
               String s=rs.getString("Added by");
               if(s.equals(current)){
                   c=true;
                   break;
               }
           }
           
           
       }catch(Exception e){
            
       }
            
            
            if(c){
                JOptionPane.showMessageDialog(null,"You name is already in the donor list!\nThanks!");
            }else{
                String insert="INSERT INTO `donors`(`DonorId`, `Name`, `Age`, `Gender`, `Bg`, `Id`, `Address`, `Contact`, `Added by`) VALUES ('"+id+"','"+nametxt.getText()+"','"+agetxt.getText()+"','"+gender+"','"+bg+"','"+String.valueOf("")+"','"+addresstxt.getText()+"','"+contacttxt.getText()+"','"+current+"')";
                executeSQLQuery(insert);
                String update="UPDATE `userprofile` SET `Eligible`='"+String.valueOf("Yes")+"' WHERE `Un`=\""+current+"\"";
                executeSQLQuery(update);
                JOptionPane.showMessageDialog(null,"Done!!!!!!");
            
                refresh();
                notification();
            }
            
            
            
            
        }
        
        
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        blocking();
        tool t=new tool();
        t.setVisible(true);
    }//GEN-LAST:event_jButton18ActionPerformed

    
    
    
   
    
    
    private void executeSQLQuery(String query,String message) {
       try{
           String url="jdbc:mysql://localhost/diu_blood_management_db";
           String user="root";
           String pass="";
           Connection con=DriverManager.getConnection(url,user,pass);
           Statement st=con.createStatement();
          
           if(st.executeUpdate(query)==1){
               //JOptionPane.showConfirmDialog(null,"Your Profile "+message+"Successfully",""+message,JOptionPane.INFORMATION_MESSAGE);
               
//ys/no code hbe
           }else{
               //JOptionPane.showMessageDialog(null,"Data not inserted\n\nPlease check and retry.","Alert",JOptionPane.WARNING_MESSAGE); 
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
                new Profile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addresstxt;
    private javax.swing.JTextField agetxt;
    private javax.swing.JTextField bgtxt;
    private javax.swing.JTextField contacttxt;
    private javax.swing.JTextField dstxt;
    private javax.swing.JTextField gendertxt;
    private javax.swing.JLabel ic;
    private javax.swing.JLabel icon;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
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
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextField nametxt;
    private javax.swing.JLabel ntxt;
    private javax.swing.JTextField occupationtxt;
    private javax.swing.JTable table1;
    private javax.swing.JTextField tdttxt;
    private javax.swing.JTextField uitxt;
    // End of variables declaration//GEN-END:variables

    
}
