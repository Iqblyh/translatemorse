package translatejawamorse;

import AppPackage.AnimationClass;
import java.awt.Dimension;
import java.awt.Toolkit;

public class WelcomeFrame extends javax.swing.JFrame {

    
    
    public WelcomeFrame() {
        initComponents();
        this.setSize(960, 540);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2 - this.getSize().width / 2, dim.height/2 - this.getSize().height/2);
       
       AnimationClass anim = new AnimationClass();
        
       anim.jLabelYUp(green.getY(), -20000, 3, 2, green);
       
       anim.jLabelXLeft(red.getX(), -20000, 3, 2, red);
       
       anim.jLabelYDown(blue.getY(), 20000, 3, 2, blue);
       
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        red = new javax.swing.JLabel();
        green = new javax.swing.JLabel();
        blue = new javax.swing.JLabel();
        welcome = new javax.swing.JLabel();
        arrow = new javax.swing.JButton();
        BG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        red.setIcon(new javax.swing.ImageIcon(getClass().getResource("/translatejawamorse/Images/Path 1.png"))); // NOI18N
        red.setLabelFor(red);
        getContentPane().add(red, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        green.setIcon(new javax.swing.ImageIcon(getClass().getResource("/translatejawamorse/Images/Path 2.png"))); // NOI18N
        getContentPane().add(green, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, -1, -1));

        blue.setIcon(new javax.swing.ImageIcon(getClass().getResource("/translatejawamorse/Images/Path 3.png"))); // NOI18N
        getContentPane().add(blue, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, -1, -1));

        welcome.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        welcome.setForeground(new java.awt.Color(255, 255, 255));
        welcome.setText("WELCOME");
        getContentPane().add(welcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(365, 185, 210, 50));
        welcome.getAccessibleContext().setAccessibleName("WELCOME");

        arrow.setBackground(new java.awt.Color(255, 255, 255));
        arrow.setText("Mulai");
        arrow.setToolTipText("");
        arrow.setBorder(null);
        arrow.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        arrow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arrowActionPerformed(evt);
            }
        });
        getContentPane().add(arrow, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 270, 70, 30));

        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/translatejawamorse/Images/bgbg.png"))); // NOI18N
        getContentPane().add(BG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void arrowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arrowActionPerformed
        WelcomeFrame wf = new WelcomeFrame();
        wf.dispose();
        MainFrame mf = new MainFrame();
        mf.setVisible(true);
    }//GEN-LAST:event_arrowActionPerformed

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
            java.util.logging.Logger.getLogger(WelcomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WelcomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WelcomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WelcomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WelcomeFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG;
    private javax.swing.JButton arrow;
    private javax.swing.JLabel blue;
    private javax.swing.JLabel green;
    private javax.swing.JLabel red;
    private javax.swing.JLabel welcome;
    // End of variables declaration//GEN-END:variables
}
