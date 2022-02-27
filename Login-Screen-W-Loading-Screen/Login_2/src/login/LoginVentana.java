
package login;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class LoginVentana extends javax.swing.JFrame {

    
    public LoginVentana() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        rSButtonIconUno1 = new RSMaterialComponent.RSButtonIconUno();
        rSPanelCircleImage1 = new rojerusan.RSPanelCircleImage();
        usuario = new RSMaterialComponent.RSTextFieldMaterialIcon();
        contra = new RSMaterialComponent.RSPasswordMaterialIcon();
        login = new rojeru_san.rsbutton.RSButtonRoundRipple();
        barra = new rojerusan.componentes.RSProgressBar();
        text = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(2, 119, 189));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Roboto", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Login ");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Carlos Tavera - 1628839A");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        rSButtonIconUno1.setBackground(new java.awt.Color(198, 40, 40));
        rSButtonIconUno1.setBackgroundHover(new java.awt.Color(147, 40, 40));
        rSButtonIconUno1.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.CLOSE);
        rSButtonIconUno1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonIconUno1ActionPerformed(evt);
            }
        });
        jPanel2.add(rSButtonIconUno1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 0, -1, -1));

        rSPanelCircleImage1.setColorBorde(new java.awt.Color(1, 89, 142));
        rSPanelCircleImage1.setColorFondo(new java.awt.Color(2, 119, 189));
        rSPanelCircleImage1.setImagen(new javax.swing.ImageIcon(getClass().getResource("/login/img/5fb30135-ba45-40b7-af3e-d32590a5822d.jpg"))); // NOI18N

        javax.swing.GroupLayout rSPanelCircleImage1Layout = new javax.swing.GroupLayout(rSPanelCircleImage1);
        rSPanelCircleImage1.setLayout(rSPanelCircleImage1Layout);
        rSPanelCircleImage1Layout.setHorizontalGroup(
            rSPanelCircleImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );
        rSPanelCircleImage1Layout.setVerticalGroup(
            rSPanelCircleImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );

        jPanel2.add(rSPanelCircleImage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, 140, 140));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 120));

        usuario.setBackground(new java.awt.Color(228, 228, 228));
        usuario.setForeground(new java.awt.Color(0, 0, 0));
        usuario.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        usuario.setColorIcon(new java.awt.Color(2, 119, 189));
        usuario.setColorMaterial(new java.awt.Color(2, 119, 189));
        usuario.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        usuario.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.ACCOUNT_CIRCLE);
        usuario.setPhColor(new java.awt.Color(2, 119, 189));
        usuario.setPlaceholder("                Usuario");
        usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioActionPerformed(evt);
            }
        });
        jPanel1.add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, -1, -1));

        contra.setBackground(new java.awt.Color(228, 228, 228));
        contra.setForeground(new java.awt.Color(0, 0, 0));
        contra.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        contra.setColorIcon(new java.awt.Color(2, 119, 189));
        contra.setColorMaterial(new java.awt.Color(2, 119, 189));
        contra.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        contra.setPhColor(new java.awt.Color(2, 119, 189));
        contra.setPlaceholder("        Contraseña");
        jPanel1.add(contra, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 300, -1, -1));

        login.setBackground(new java.awt.Color(2, 119, 189));
        login.setText("Login");
        login.setColorHover(new java.awt.Color(2, 98, 155));
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        jPanel1.add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 370, 250, -1));

        barra.setBorder(null);
        barra.setValue(0);
        barra.setStringPainted(false);
        jPanel1.add(barra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 820, 20));

        text.setBackground(new java.awt.Color(0, 84, 140));
        text.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        text.setForeground(new java.awt.Color(2, 119, 189));
        text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(text, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 770, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        String Usuario = usuario.getText();
        String Contra = contra.getText();
        
        if(Usuario.isEmpty() || Contra.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Ingresa el Usuario/Contraseña");
        }
        else
        {
            if(Usuario.equals("admin") && (Contra.equals("admin")))
            {
                JOptionPane.showMessageDialog(null, "Contraseña Correcta"); 
                
                Thread hilo=new Thread()
        {
           
      
         @Override
         public void run()
         {
               for(int i=0; i<=100; i++)
               {
                        
                   try {
                       sleep(60);
                       barra.setValue(i);
                   } 
                   
                   catch (InterruptedException ex)              
                   {
                       Logger.getLogger(BarraProgreso.class.getName()).log(Level.SEVERE, null, ex);
                   }
                       barra.setValue(i);
                        
                        if(i==1){
                            text.setText("Cargando Programas...");
                        }
                        
                        if(i==10){
                            text.setText("Estableciendo conexión con la NASA...");
                        }
                        
                        if(i==25){
                            text.setText("Ordeñando Vacas...");
                        }
                        
                        if(i==35){
                            text.setText("Buscando el Arca Perdida...");
                        }
                        
                        if(i==45){
                            text.setText("Borrando System32...");
                        }
                        
                        if(i==60){
                            text.setText("Fingiendo que esta barra en verdad funciona...");
                        }
                        
                        if(i==80){
                            text.setText("Conectándose con la poderosísima FIE...");
                        }
                        
                        if(i==95){
                            text.setText("Entrando...");
                        }
                       
                        if(i==100){
                        PPrincipal x = new PPrincipal();
                        x.setVisible(true);
                        
                        }
                   
               }
           }
       };
       hilo.start();
                
    }  
                
                
            
            
            else
            {
                JOptionPane.showMessageDialog(null, "Contraseña Incorrecta"); 
            }
        }
    }//GEN-LAST:event_loginActionPerformed

    private void rSButtonIconUno1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonIconUno1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_rSButtonIconUno1ActionPerformed

    private void usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usuarioActionPerformed

    
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
            java.util.logging.Logger.getLogger(LoginVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
       
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginVentana().setVisible(true);
            }
        });
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginVentana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.componentes.RSProgressBar barra;
    private RSMaterialComponent.RSPasswordMaterialIcon contra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private rojeru_san.rsbutton.RSButtonRoundRipple login;
    private RSMaterialComponent.RSButtonIconUno rSButtonIconUno1;
    private rojerusan.RSPanelCircleImage rSPanelCircleImage1;
    private javax.swing.JLabel text;
    private RSMaterialComponent.RSTextFieldMaterialIcon usuario;
    // End of variables declaration//GEN-END:variables
}
