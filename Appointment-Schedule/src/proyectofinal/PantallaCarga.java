
package proyectofinal;

import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class PantallaCarga extends javax.swing.JFrame {

    
    public PantallaCarga() {
        initComponents();
        
        this.setLocationRelativeTo(null); //Centrar
        
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imagenes/Icono.png")));
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        rSButtonIconUno1 = new RSMaterialComponent.RSButtonIconUno();
        rSLabelImage3 = new rojerusan.RSLabelImage();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        texto = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        barra = new rojeru_san.rsprogress.RSProgressBar();
        rSLabelImage4 = new rojeru_san.rslabel.RSLabelImage();
        rSLabelImage1 = new rojeru_san.rslabel.RSLabelImage();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rSButtonIconUno1.setBackground(new java.awt.Color(198, 40, 40));
        rSButtonIconUno1.setBackgroundHover(new java.awt.Color(147, 40, 40));
        rSButtonIconUno1.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.CLOSE);
        rSButtonIconUno1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonIconUno1ActionPerformed(evt);
            }
        });
        jPanel1.add(rSButtonIconUno1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 0, -1, -1));

        rSLabelImage3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/unnamed.png"))); // NOI18N
        jPanel1.add(rSLabelImage3, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 320, 120, 120));

        jPanel2.setBackground(new java.awt.Color(1, 30, 49));
        jPanel2.setForeground(new java.awt.Color(0, 33, 113));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(21, 101, 192));
        jLabel2.setFont(new java.awt.Font("Roboto", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(4, 203, 245));
        jLabel2.setText("Proyecto Final");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jLabel3.setBackground(new java.awt.Color(21, 101, 192));
        jLabel3.setFont(new java.awt.Font("Roboto Condensed Light", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(4, 203, 245));
        jLabel3.setText("Grupo 303");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, -1, -1));

        jLabel4.setBackground(new java.awt.Color(21, 101, 192));
        jLabel4.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(4, 203, 245));
        jLabel4.setText("Programación de Computadoras 2");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        texto.setBackground(new java.awt.Color(21, 101, 192));
        texto.setFont(new java.awt.Font("Roboto Condensed Light", 0, 14)); // NOI18N
        texto.setForeground(new java.awt.Color(61, 165, 208));
        texto.setText("Cargando...");
        jPanel2.add(texto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        jLabel6.setBackground(new java.awt.Color(21, 101, 192));
        jLabel6.setFont(new java.awt.Font("Roboto Condensed Light", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(4, 203, 245));
        jLabel6.setText("Carlos Alberto Tavera Arteaga");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jLabel8.setBackground(new java.awt.Color(21, 101, 192));
        jLabel8.setFont(new java.awt.Font("Roboto Condensed Light", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(61, 165, 208));
        jLabel8.setText("FIE 2021");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, -1, -1));

        jLabel9.setBackground(new java.awt.Color(21, 101, 192));
        jLabel9.setFont(new java.awt.Font("Roboto Condensed Light", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(61, 165, 208));
        jLabel9.setText("organizador de citas y expedientes.");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        jLabel10.setBackground(new java.awt.Color(21, 101, 192));
        jLabel10.setFont(new java.awt.Font("Roboto Condensed Light", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(61, 165, 208));
        jLabel10.setText("Este programa está destinado a funcionar como un");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        jLabel11.setBackground(new java.awt.Color(21, 101, 192));
        jLabel11.setFont(new java.awt.Font("Roboto Condensed Light", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(61, 165, 208));
        jLabel11.setText("Con algunas modificaciones y adaptaciones puede");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, -1));

        jLabel12.setBackground(new java.awt.Color(21, 101, 192));
        jLabel12.setFont(new java.awt.Font("Roboto Condensed Light", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(61, 165, 208));
        jLabel12.setText("servir para una clinica, para una tienda o un montón");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, -1));

        jLabel13.setBackground(new java.awt.Color(21, 101, 192));
        jLabel13.setFont(new java.awt.Font("Roboto Condensed Light", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(61, 165, 208));
        jLabel13.setText("de aplicaciones diferentes.");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, -1));

        barra.setBackground(new java.awt.Color(1, 30, 49));
        barra.setForeground(new java.awt.Color(61, 165, 208));
        barra.setValue(0);
        barra.setBorderPainted(false);
        barra.setStringPainted(false);
        jPanel2.add(barra, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 280, 10));

        rSLabelImage4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo-fie-B.png"))); // NOI18N
        jPanel2.add(rSLabelImage4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 110, 80));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 440));

        rSLabelImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FIE.jpg"))); // NOI18N
        jPanel1.add(rSLabelImage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 750, 440));

        jLabel5.setText("jLabel5");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 170, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 803, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rSButtonIconUno1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonIconUno1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_rSButtonIconUno1ActionPerformed
                        
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
            java.util.logging.Logger.getLogger(PantallaCarga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaCarga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaCarga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaCarga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        PantallaCarga PC = new PantallaCarga();
        PC.setVisible(true);
        
        
        try {
            for(int i=0; i<=100; i++){
                Thread.sleep(70);              
                
                if(i==1){
                             PC.texto.setText("Inicializando...");
                        }
                        
                        if(i==10){
                             PC.texto.setText("Inicializando componentes...");
                        }
                        
                        if(i==25){
                             PC.texto.setText("Inicializando extensiones...");
                        }
                        
                        if(i==35){
                             PC.texto.setText("Cargando base de datos...");
                        }
                        
                        if(i==45){
                             PC.texto.setText("Leyendo tablas...");
                        }
                        
                        if(i==60){
                             PC.texto.setText("Cargando interfaz...");
                        }
                        
                        if(i==80){
                             PC.texto.setText("Cargando...");
                        }
                        
                        if(i==95){
                             PC.texto.setText("Entrando...");
                             
                        }
                        
                        if(i==100){
                             
                             
                             PPrincipal x = new PPrincipal();
                             x.setVisible(true);
                             
                        }
               
                        PC.barra.setValue(i);
                        
            }
            
            
        }   catch (Exception e){
            
        }
           
        PC.setVisible(false);
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new PantallaCarga().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public rojeru_san.rsprogress.RSProgressBar barra;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private RSMaterialComponent.RSButtonIconUno rSButtonIconUno1;
    private rojeru_san.rslabel.RSLabelImage rSLabelImage1;
    private rojerusan.RSLabelImage rSLabelImage3;
    private rojeru_san.rslabel.RSLabelImage rSLabelImage4;
    private javax.swing.JLabel texto;
    // End of variables declaration//GEN-END:variables
}
