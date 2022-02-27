
package proyectofinal;

import java.util.ArrayList;

public class PExpedientes extends javax.swing.JPanel {

    ArrayList<TExpedientes> tablaexpedientes = new ArrayList<TExpedientes>();

    
    public PExpedientes() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Titulo = new RSMaterialComponent.RSLabelTextIcon();
        cliente = new RSMaterialComponent.RSTextFieldIconDos();
        notas = new RSMaterialComponent.RSTextFieldIconDos();
        banco = new RSMaterialComponent.RSTextFieldIconDos();
        estado = new RSMaterialComponent.RSTextFieldIconDos();
        jLabel1 = new javax.swing.JLabel();
        Banco = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Añadir = new RSMaterialComponent.RSButtonMaterialIconDos();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new rojeru_san.complementos.RSTableMetro();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Titulo.setForeground(new java.awt.Color(122, 202, 170));
        Titulo.setText(" Expedientes");
        Titulo.setColorIcon(new java.awt.Color(122, 202, 170));
        Titulo.setFont(new java.awt.Font("Roboto", 0, 48)); // NOI18N
        Titulo.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.ASSIGNMENT);
        jPanel1.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 6, 369, 68));

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

        banco.setForeground(new java.awt.Color(0, 0, 0));
        banco.setBorderColor(new java.awt.Color(122, 202, 170));
        banco.setColorIcon(new java.awt.Color(122, 202, 170));
        banco.setFont(new java.awt.Font("Roboto Condensed Light", 1, 18)); // NOI18N
        banco.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.LOCAL_ATM);
        banco.setPhColor(new java.awt.Color(79, 183, 145));
        banco.setPlaceholder("Banco");
        banco.setPositionIcon(rojeru_san.efectos.ValoresEnum.POSITIONICON.RIGHT);
        banco.setSelectionColor(new java.awt.Color(79, 183, 145));
        jPanel1.add(banco, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 109, 186, -1));

        estado.setForeground(new java.awt.Color(0, 0, 0));
        estado.setBorderColor(new java.awt.Color(122, 202, 170));
        estado.setColorIcon(new java.awt.Color(122, 202, 170));
        estado.setFont(new java.awt.Font("Roboto Condensed Light", 1, 18)); // NOI18N
        estado.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.WARNING);
        estado.setPhColor(new java.awt.Color(79, 183, 145));
        estado.setPlaceholder("Estado");
        estado.setPositionIcon(rojeru_san.efectos.ValoresEnum.POSITIONICON.RIGHT);
        estado.setSelectionColor(new java.awt.Color(79, 183, 145));
        jPanel1.add(estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(482, 109, 147, -1));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(26, 99, 92));
        jLabel1.setText("Nombre del cliente");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 86, -1, -1));

        Banco.setBackground(new java.awt.Color(0, 0, 0));
        Banco.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        Banco.setForeground(new java.awt.Color(26, 99, 92));
        Banco.setText("Banco");
        jPanel1.add(Banco, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 86, -1, -1));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(26, 99, 92));
        jLabel3.setText("Estado");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(487, 86, -1, -1));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(26, 99, 92));
        jLabel4.setText("Notas");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(647, 86, -1, -1));

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
                "Cliente", "Banco", "Estado", "Notas"
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

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 760));
    }// </editor-fold>//GEN-END:initComponents

    private void AñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AñadirActionPerformed

        //if (calendario.getDatoFecha() != null) {
            //String format = "dd/MM/yyyy";
            //Date fecha = calendario.getDatoFecha();
            //SimpleDateFormat dateFormat = new SimpleDateFormat(format);
            //}

        TExpedientes tabla = new TExpedientes(cliente.getText(), banco.getText(), estado.getText(), notas.getText());
        tablaexpedientes.add(tabla);

        mostrar();

        cliente.setText(" ");
        cliente.setPlaceholder("Nombre Cliente");

        banco.setText(" ");
        banco.setPlaceholder("Banco");

        estado.setText(" ");
        estado.setPlaceholder("Estado");

        notas.setPlaceholder("Notas");
        notas.setText(" ");
        notas.setPlaceholder("Notas");
    }//GEN-LAST:event_AñadirActionPerformed

    private void notasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_notasActionPerformed

                                        
    public void mostrar() 
    {
        
        String matrix[][] = new String[tablaexpedientes.size()][4];
        
        for(int x = 0; x<tablaexpedientes.size(); x++)
        {
            matrix[x][0] = tablaexpedientes.get(x).getClientes();
            matrix[x][1] = tablaexpedientes.get(x).getBanco();
            matrix[x][2] = tablaexpedientes.get(x).getEstado();
            matrix[x][3] = tablaexpedientes.get(x).getNotas();
        }
        
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            matrix,
                
            new String [] {
                "Clientes", "Banco", "Estado", "Notas"
            }
                
        ));
        
  
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private RSMaterialComponent.RSButtonMaterialIconDos Añadir;
    public javax.swing.JLabel Banco;
    public RSMaterialComponent.RSLabelTextIcon Titulo;
    public RSMaterialComponent.RSTextFieldIconDos banco;
    public RSMaterialComponent.RSTextFieldIconDos cliente;
    public RSMaterialComponent.RSTextFieldIconDos estado;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel4;
    public javax.swing.JPanel jPanel1;
    public javax.swing.JScrollPane jScrollPane1;
    public RSMaterialComponent.RSTextFieldIconDos notas;
    public rojeru_san.complementos.RSTableMetro tabla;
    // End of variables declaration//GEN-END:variables
}
