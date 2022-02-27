
package arreglos;

import java.util.ArrayList;


public class Actividad7 extends javax.swing.JFrame {

    ArrayList<Tabla> productos = new ArrayList<Tabla>();
    
    
    public Actividad7() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        precio = new RSMaterialComponent.RSTextFieldIconDos();
        producto = new RSMaterialComponent.RSTextFieldIconDos();
        codigo = new RSMaterialComponent.RSTextFieldIconDos();
        rSButton1 = new rojeru_san.RSButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new rojeru_san.complementos.RSTableMetro();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(126, 87, 194));

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Arreglos y Vectores");

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Carlos Tavera - 1628839A");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addContainerGap(218, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 120));

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Precio:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Producto:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Código");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        precio.setBackground(new java.awt.Color(64, 64, 64));
        precio.setForeground(new java.awt.Color(255, 255, 255));
        precio.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        precio.setBorderColor(new java.awt.Color(126, 87, 194));
        precio.setColorIcon(new java.awt.Color(255, 255, 255));
        precio.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        precio.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.ATTACH_MONEY);
        precio.setPhColor(new java.awt.Color(160, 125, 221));
        precio.setPlaceholder("Ingresar precio");
        precio.setPositionIcon(rojeru_san.efectos.ValoresEnum.POSITIONICON.RIGHT);
        precio.setSelectionColor(new java.awt.Color(189, 165, 255));
        jPanel1.add(precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, -1, -1));

        producto.setBackground(new java.awt.Color(64, 64, 64));
        producto.setForeground(new java.awt.Color(255, 255, 255));
        producto.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        producto.setBorderColor(new java.awt.Color(126, 87, 194));
        producto.setColorIcon(new java.awt.Color(255, 255, 255));
        producto.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        producto.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SHOPPING_CART);
        producto.setPhColor(new java.awt.Color(160, 125, 221));
        producto.setPlaceholder("Ingresar producto");
        producto.setPositionIcon(rojeru_san.efectos.ValoresEnum.POSITIONICON.RIGHT);
        producto.setSelectionColor(new java.awt.Color(126, 87, 194));
        jPanel1.add(producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, -1, -1));

        codigo.setBackground(new java.awt.Color(64, 64, 64));
        codigo.setForeground(new java.awt.Color(255, 255, 255));
        codigo.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        codigo.setBorderColor(new java.awt.Color(126, 87, 194));
        codigo.setColorIcon(new java.awt.Color(255, 255, 255));
        codigo.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        codigo.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SUBTITLES);
        codigo.setPhColor(new java.awt.Color(160, 125, 221));
        codigo.setPlaceholder("Ingresar código");
        codigo.setPositionIcon(rojeru_san.efectos.ValoresEnum.POSITIONICON.RIGHT);
        codigo.setSelectionColor(new java.awt.Color(126, 87, 194));
        jPanel1.add(codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, -1, -1));

        rSButton1.setBackground(new java.awt.Color(126, 87, 194));
        rSButton1.setText("Registrar");
        rSButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(rSButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 250, -1));

        tabla.setForeground(new java.awt.Color(255, 255, 255));
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Producto", "Codigo", "Precio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla.setAltoHead(60);
        tabla.setColorBackgoundHead(new java.awt.Color(126, 87, 194));
        tabla.setColorFilasBackgound1(new java.awt.Color(102, 102, 102));
        tabla.setColorFilasBackgound2(new java.awt.Color(51, 51, 51));
        tabla.setColorFilasForeground1(new java.awt.Color(255, 255, 255));
        tabla.setColorFilasForeground2(new java.awt.Color(255, 255, 255));
        tabla.setColorSelBackgound(new java.awt.Color(157, 110, 239));
        tabla.setFuenteFilas(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        tabla.setFuenteFilasSelect(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        tabla.setGridColor(new java.awt.Color(255, 255, 255));
        tabla.setRowHeight(30);
        tabla.setSelectionForeground(new java.awt.Color(102, 102, 102));
        tabla.setShowGrid(false);
        jScrollPane1.setViewportView(tabla);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 520, 270));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 544, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 677, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rSButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButton1ActionPerformed
        
        Tabla tabla = new Tabla(producto.getText(), codigo.getText(), precio.getText());
        productos.add(tabla);
        
        mostrar();
        producto.setText("");
        codigo.setText("");
        precio.setText(" ");
        
    }//GEN-LAST:event_rSButton1ActionPerformed

    public void mostrar() 
    {
        
        String matrix[][] = new String[productos.size()][3];
        
        for(int x = 0; x<productos.size(); x++)
        {
            matrix[x][0] = productos.get(x).getProducto();
            matrix[x][1] = productos.get(x).getCodigo();
            matrix[x][2] = productos.get(x).getPrecio();
        }
        
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            matrix,
                
            new String [] {
                "Producto", "Codigo", "Precio"
            }
                
        ));
        
  
    }
    
    
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
            java.util.logging.Logger.getLogger(Actividad7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Actividad7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Actividad7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Actividad7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Actividad7().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private RSMaterialComponent.RSTextFieldIconDos codigo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private RSMaterialComponent.RSTextFieldIconDos precio;
    private RSMaterialComponent.RSTextFieldIconDos producto;
    private rojeru_san.RSButton rSButton1;
    private rojeru_san.complementos.RSTableMetro tabla;
    // End of variables declaration//GEN-END:variables
}
