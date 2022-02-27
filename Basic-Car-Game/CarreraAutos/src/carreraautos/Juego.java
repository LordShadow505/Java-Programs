
package carreraautos;

import javax.swing.JLabel;


public class Juego extends javax.swing.JFrame {

  
    public Juego() {
        initComponents();
    }
    
    //Variables
    public JLabel getAutoAzul(){
        
        return AutoAzul;
    }
    public JLabel getAutoRojo(){
        
        return AutoRojo;
    }
    public JLabel getMeta(){
        
        return Meta;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BStart = new rojeru_san.RSButton();
        rSLabelImage1 = new rojerusan.RSLabelImage();
        Meta = new rojerusan.RSLabelImage();
        AutoAzul = new rojeru_san.rslabel.RSLabelImage();
        AutoRojo = new rojeru_san.rslabel.RSLabelImage();
        rSLabelImage3 = new rojerusan.RSLabelImage();
        rSLabelImage4 = new rojerusan.RSLabelImage();
        rSLabelImage7 = new rojerusan.RSLabelImage();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Minecraft Ten", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 85, 134));
        jLabel1.setText("Computación - Grupo 303");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, -1, -1));

        jLabel2.setFont(new java.awt.Font("Minecraft Ten", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 85, 134));
        jLabel2.setText("Carlos Tavera - 1628839A");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, -1, -1));

        BStart.setBackground(new java.awt.Color(205, 38, 38));
        BStart.setText("Start");
        BStart.setColorHover(new java.awt.Color(206, 23, 23));
        BStart.setFont(new java.awt.Font("Minecraft Five", 0, 18)); // NOI18N
        BStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BStartActionPerformed(evt);
            }
        });
        jPanel1.add(BStart, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, -1, -1));

        rSLabelImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carreraautos/sprites/titulo_1.png"))); // NOI18N
        jPanel1.add(rSLabelImage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, -80, 470, 360));

        Meta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carreraautos/sprites/Meta.png"))); // NOI18N
        jPanel1.add(Meta, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 80, 40, 380));

        AutoAzul.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carreraautos/sprites/AutoA1.png"))); // NOI18N
        jPanel1.add(AutoAzul, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 260, 130));

        AutoRojo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carreraautos/sprites/AutoB1.png"))); // NOI18N
        jPanel1.add(AutoRojo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 260, 120));

        rSLabelImage3.setForeground(new java.awt.Color(51, 51, 51));
        rSLabelImage3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carreraautos/sprites/Autopista.png"))); // NOI18N
        jPanel1.add(rSLabelImage3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 300, 560, 160));

        rSLabelImage4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carreraautos/sprites/Meta2.png"))); // NOI18N
        jPanel1.add(rSLabelImage4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 300, 550, 160));

        rSLabelImage7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carreraautos/sprites/869.jpg"))); // NOI18N
        jPanel1.add(rSLabelImage7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 850, 460));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 851, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BStartActionPerformed
        AutoAzul.setLocation(0, AutoAzul.getLocation().y);
        AutoRojo.setLocation(0, AutoRojo.getLocation().y);
        Carrera hilo1 = new Carrera(AutoAzul, this);
        Carrera hilo2 = new Carrera(AutoRojo, this);
        hilo1.start();
        hilo2.start();
    }//GEN-LAST:event_BStartActionPerformed

    
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
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Juego().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.rslabel.RSLabelImage AutoAzul;
    private rojeru_san.rslabel.RSLabelImage AutoRojo;
    private rojeru_san.RSButton BStart;
    private rojerusan.RSLabelImage Meta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private rojerusan.RSLabelImage rSLabelImage1;
    private rojerusan.RSLabelImage rSLabelImage3;
    private rojerusan.RSLabelImage rSLabelImage4;
    private rojerusan.RSLabelImage rSLabelImage7;
    // End of variables declaration//GEN-END:variables
}
