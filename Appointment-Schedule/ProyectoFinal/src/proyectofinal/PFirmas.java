
package proyectofinal;

import java.util.ArrayList;

public class PFirmas extends javax.swing.JPanel {

     ArrayList<TFirmas> tablafirmas = new ArrayList<TFirmas>();
    
    public PFirmas() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Titulo = new RSMaterialComponent.RSLabelTextIcon();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        notas = new RSMaterialComponent.RSTextFieldIconDos();
        fecha = new RSMaterialComponent.RSTextFieldIconDos();
        jLabel1 = new javax.swing.JLabel();
        Banco = new javax.swing.JLabel();
        cliente = new RSMaterialComponent.RSTextFieldIconDos();
        Añadir = new RSMaterialComponent.RSButtonMaterialIconDos();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new rojeru_san.complementos.RSTableMetro();
        notaria = new RSMaterialComponent.RSTextFieldIconDos();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Titulo.setForeground(new java.awt.Color(122, 202, 170));
        Titulo.setText(" Firmas");
        Titulo.setColorIcon(new java.awt.Color(122, 202, 170));
        Titulo.setFont(new java.awt.Font("Roboto", 0, 48)); // NOI18N
        Titulo.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.BORDER_COLOR);
        jPanel1.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 369, 68));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(26, 99, 92));
        jLabel4.setText("Notas");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(647, 86, -1, -1));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(26, 99, 92));
        jLabel3.setText("Fecha de Firma");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(487, 86, -1, -1));

        notas.setForeground(new java.awt.Color(0, 0, 0));
        notas.setBorderColor(new java.awt.Color(122, 202, 170));
        notas.setColorIcon(new java.awt.Color(122, 202, 170));
        notas.setFont(new java.awt.Font("Roboto Condensed Light", 1, 18)); // NOI18N
        notas.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.ASSIGNMENT);
        notas.setPhColor(new java.awt.Color(79, 183, 145));
        notas.setPlaceholder("Notas");
        notas.setPositionIcon(rojeru_san.efectos.ValoresEnum.POSITIONICON.RIGHT);
        notas.setSelectionColor(new java.awt.Color(79, 183, 145));
        notas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notasActionPerformed(evt);
            }
        });
        jPanel1.add(notas, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 110, 227, -1));

        fecha.setForeground(new java.awt.Color(0, 0, 0));
        fecha.setBorderColor(new java.awt.Color(122, 202, 170));
        fecha.setColorIcon(new java.awt.Color(122, 202, 170));
        fecha.setFont(new java.awt.Font("Roboto Condensed Light", 1, 18)); // NOI18N
        fecha.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.RATE_REVIEW);
        fecha.setPhColor(new java.awt.Color(79, 183, 145));
        fecha.setPlaceholder("Fecha de firma");
        fecha.setPositionIcon(rojeru_san.efectos.ValoresEnum.POSITIONICON.RIGHT);
        fecha.setSelectionColor(new java.awt.Color(79, 183, 145));
        jPanel1.add(fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(482, 109, 147, -1));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(26, 99, 92));
        jLabel1.setText("Nombre del cliente");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 86, -1, -1));

        Banco.setBackground(new java.awt.Color(0, 0, 0));
        Banco.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        Banco.setForeground(new java.awt.Color(26, 99, 92));
        Banco.setText("Notaria");
        jPanel1.add(Banco, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 86, -1, -1));

        cliente.setForeground(new java.awt.Color(0, 0, 0));
        cliente.setBorderColor(new java.awt.Color(122, 202, 170));
        cliente.setColorIcon(new java.awt.Color(122, 202, 170));
        cliente.setFont(new java.awt.Font("Roboto Condensed Light", 1, 18)); // NOI18N
        cliente.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.PERSON);
        cliente.setPhColor(new java.awt.Color(79, 183, 145));
        cliente.setPlaceholder("Nombre Cliente");
        cliente.setPositionIcon(rojeru_san.efectos.ValoresEnum.POSITIONICON.RIGHT);
        cliente.setSelectionColor(new java.awt.Color(79, 183, 145));
        jPanel1.add(cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 109, -1, -1));

        Añadir.setText(" Añadir");
        Añadir.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.ADD);
        Añadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AñadirActionPerformed(evt);
            }
        });
        jPanel1.add(Añadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(733, 163, 128, -1));

        tabla.setBackground(new java.awt.Color(255, 255, 255));
        tabla.setForeground(new java.awt.Color(255, 255, 255));
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Cliente", "Notaria", "Fecha Firma", "Notas"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla.setAltoHead(60);
        tabla.setColorBackgoundHead(new java.awt.Color(122, 202, 170));
        tabla.setColorFilasBackgound1(new java.awt.Color(207, 226, 219));
        tabla.setColorFilasBackgound2(new java.awt.Color(177, 212, 199));
        tabla.setColorFilasForeground1(new java.awt.Color(0, 0, 0));
        tabla.setColorFilasForeground2(new java.awt.Color(0, 0, 0));
        tabla.setColorSelBackgound(new java.awt.Color(68, 124, 102));
        tabla.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        tabla.setFuenteFilas(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        tabla.setFuenteFilasSelect(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        tabla.setFuenteHead(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        tabla.setGridColor(new java.awt.Color(0, 0, 0));
        tabla.setRowHeight(30);
        tabla.setSelectionForeground(new java.awt.Color(102, 102, 102));
        tabla.setShowGrid(false);
        jScrollPane1.setViewportView(tabla);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 820, 220));

        notaria.setForeground(new java.awt.Color(0, 0, 0));
        notaria.setBorderColor(new java.awt.Color(122, 202, 170));
        notaria.setColorIcon(new java.awt.Color(122, 202, 170));
        notaria.setFont(new java.awt.Font("Roboto Condensed Light", 1, 18)); // NOI18N
        notaria.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.PLACE);
        notaria.setPhColor(new java.awt.Color(79, 183, 145));
        notaria.setPlaceholder("Notaria");
        notaria.setPositionIcon(rojeru_san.efectos.ValoresEnum.POSITIONICON.RIGHT);
        notaria.setSelectionColor(new java.awt.Color(79, 183, 145));
        jPanel1.add(notaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 109, 186, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 760, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void notasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_notasActionPerformed

    private void AñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AñadirActionPerformed

        //if (calendario.getDatoFecha() != null) {
            //String format = "dd/MM/yyyy";
            //Date fecha = calendario.getDatoFecha();
            //SimpleDateFormat dateFormat = new SimpleDateFormat(format);
            //}

        TFirmas tabla = new TFirmas(cliente.getText(), notaria.getText(), fecha.getText(), notas.getText());
        tablafirmas.add(tabla);

        mostrar();

        cliente.setText(" ");
        cliente.setPlaceholder("Nombre Cliente");

        notaria.setText(" ");
        notaria.setPlaceholder("Notaria");

        fecha.setText(" ");
        fecha.setPlaceholder("Fecha");

       
        notas.setText(" ");
        notas.setPlaceholder("Notas");
    }//GEN-LAST:event_AñadirActionPerformed

    public void mostrar() 
    {
        
        String matrix[][] = new String[tablafirmas.size()][4];
        
        for(int x = 0; x<tablafirmas.size(); x++)
        {
            matrix[x][0] = tablafirmas.get(x).getClientes();
            matrix[x][1] = tablafirmas.get(x).getNotaria();
            matrix[x][2] = tablafirmas.get(x).getFecha();
            matrix[x][3] = tablafirmas.get(x).getNotas();
        }
        
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            matrix,
                
            new String [] {
                "Clientes", "Notaria", "Fecha", "Notas"
            }
                
        ));
        
  
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private RSMaterialComponent.RSButtonMaterialIconDos Añadir;
    private javax.swing.JLabel Banco;
    public RSMaterialComponent.RSLabelTextIcon Titulo;
    public RSMaterialComponent.RSTextFieldIconDos cliente;
    public RSMaterialComponent.RSTextFieldIconDos fecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    public javax.swing.JPanel jPanel1;
    public javax.swing.JScrollPane jScrollPane1;
    public RSMaterialComponent.RSTextFieldIconDos notaria;
    public RSMaterialComponent.RSTextFieldIconDos notas;
    public rojeru_san.complementos.RSTableMetro tabla;
    // End of variables declaration//GEN-END:variables

    static class RSPanelsSlider {

        static Object DIRECT;

        public RSPanelsSlider() {
        }
    }
}
