/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ruhan
 */
public class Splash extends javax.swing.JFrame {

    /**
     * Creates new form Splash
     */
    public Splash() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        per = new javax.swing.JLabel();
        bar = new javax.swing.JProgressBar();
        Loading = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(780, 430));
        setMinimumSize(new java.awt.Dimension(780, 430));
        setUndecorated(true);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Monospaced", 1, 25)); // NOI18N
        jLabel1.setText("DIU Blood Donor Management System");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(160, 120, 540, 40);

        jLabel2.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        jLabel2.setText("Loading.....");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(360, 310, 90, 20);

        per.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        per.setText("0%");
        getContentPane().add(per);
        per.setBounds(600, 270, 50, 14);
        getContentPane().add(bar);
        bar.setBounds(230, 270, 350, 14);

        Loading.setIcon(new javax.swing.ImageIcon(getClass().getResource("/s006_LightBlue.jpg"))); // NOI18N
        getContentPane().add(Loading);
        Loading.setBounds(0, 0, 780, 430);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        

        Splash s=new Splash();
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                s.setVisible(true);
            }
        });
        login Login=new login();
        
        try {                                         //For Exception Handeling
            for (int i = 0; i <= 100; i++) {
                Thread.sleep(10);                    //Controlling For Loop
                s.bar.setValue(i);
                s.per.setText(Integer.toString(i)+"%");
            }
            //
            
            Login.setVisible(true);                 // Login page visible
            s.setVisible(false);                    // Splash window disable
        } catch (Exception e) {
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Loading;
    private javax.swing.JProgressBar bar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel per;
    // End of variables declaration//GEN-END:variables
}
