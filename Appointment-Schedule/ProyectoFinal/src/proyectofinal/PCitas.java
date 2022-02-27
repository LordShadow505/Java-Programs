
package proyectofinal;



import java.util.ArrayList;

public class PCitas extends javax.swing.JPanel {
    
    ArrayList<TCitas> tablacitas = new ArrayList<TCitas>();

    public PCitas() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Titulo = new RSMaterialComponent.RSLabelTextIcon();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new rojeru_san.complementos.RSTableMetro();
        cliente = new RSMaterialComponent.RSTextFieldIconDos();
        notas = new RSMaterialComponent.RSTextFieldIconDos();
        Añadir = new RSMaterialComponent.RSButtonMaterialIconDos();
        fecha = new RSMaterialComponent.RSTextFieldIconDos();
        lugar = new RSMaterialComponent.RSTextFieldIconDos();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Titulo.setForeground(new java.awt.Color(122, 202, 170));
        Titulo.setText(" Citas");
        Titulo.setColorIcon(new java.awt.Color(122, 202, 170));
        Titulo.setFont(new java.awt.Font("Roboto", 0, 48)); // NOI18N
        jPanel1.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 232, 68));

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
                "Cliente", "Lugar", "Fecha", "Notas"
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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 817, 221));

        cliente.setForeground(new java.awt.Color(0, 0, 0));
        cliente.setBorderColor(new java.awt.Color(122, 202, 170));
        cliente.setColorIcon(new java.awt.Color(122, 202, 170));
        cliente.setFont(new java.awt.Font("Roboto Condensed Light", 1, 18)); // NOI18N
        cliente.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.PERSON);
        cliente.setPhColor(new java.awt.Color(79, 183, 145));
        cliente.setPlaceholder("Nombre Cliente");
        cliente.setPositionIcon(rojeru_san.efectos.ValoresEnum.POSITIONICON.RIGHT);
        cliente.setSelectionColor(new java.awt.Color(79, 183, 145));
        jPanel1.add(cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        notas.setForeground(new java.awt.Color(0, 0, 0));
        notas.setBorderColor(new java.awt.Color(122, 202, 170));
        notas.setColorIcon(new java.awt.Color(122, 202, 170));
        notas.setFont(new java.awt.Font("Roboto Condensed Light", 1, 18)); // NOI18N
        notas.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.ASSIGNMENT);
        notas.setPhColor(new java.awt.Color(79, 183, 145));
        notas.setPlaceholder("Notas");
        notas.setPositionIcon(rojeru_san.efectos.ValoresEnum.POSITIONICON.RIGHT);
        notas.setSelectionColor(new java.awt.Color(79, 183, 145));
        jPanel1.add(notas, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 110, 227, -1));

        Añadir.setText(" Añadir");
        Añadir.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.ADD);
        Añadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AñadirActionPerformed(evt);
            }
        });
        jPanel1.add(Añadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 160, 128, -1));

        fecha.setForeground(new java.awt.Color(0, 0, 0));
        fecha.setBorderColor(new java.awt.Color(122, 202, 170));
        fecha.setColorIcon(new java.awt.Color(122, 202, 170));
        fecha.setFont(new java.awt.Font("Roboto Condensed Light", 1, 18)); // NOI18N
        fecha.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.DATE_RANGE);
        fecha.setPhColor(new java.awt.Color(79, 183, 145));
        fecha.setPlaceholder("Fecha");
        fecha.setPositionIcon(rojeru_san.efectos.ValoresEnum.POSITIONICON.RIGHT);
        fecha.setSelectionColor(new java.awt.Color(79, 183, 145));
        jPanel1.add(fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 110, 142, -1));

        lugar.setForeground(new java.awt.Color(0, 0, 0));
        lugar.setBorderColor(new java.awt.Color(122, 202, 170));
        lugar.setColorIcon(new java.awt.Color(122, 202, 170));
        lugar.setFont(new java.awt.Font("Roboto Condensed Light", 1, 18)); // NOI18N
        lugar.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.PLACE);
        lugar.setPhColor(new java.awt.Color(79, 183, 145));
        lugar.setPlaceholder("Lugar");
        lugar.setPositionIcon(rojeru_san.efectos.ValoresEnum.POSITIONICON.RIGHT);
        lugar.setSelectionColor(new java.awt.Color(79, 183, 145));
        jPanel1.add(lugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, 186, -1));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(26, 99, 92));
        jLabel1.setText("Nombre del cliente");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(26, 99, 92));
        jLabel2.setText("Lugar");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, -1, -1));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(26, 99, 92));
        jLabel3.setText("Fecha");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 90, -1, -1));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(26, 99, 92));
        jLabel4.setText("Notas");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 90, -1, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 760));
    }// </editor-fold>//GEN-END:initComponents

    private void AñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AñadirActionPerformed
        
       //if (calendario.getDatoFecha() != null) {
       //String format = "dd/MM/yyyy";
       //Date fecha = calendario.getDatoFecha();
       //SimpleDateFormat dateFormat = new SimpleDateFormat(format);                
       //}
        
        
        
      
        TCitas tabla = new TCitas(cliente.getText(), lugar.getText(), fecha.getText(), notas.getText());
        tablacitas.add(tabla);

        mostrar();
        
        cliente.setText(" ");
        cliente.setPlaceholder("Nombre Cliente");
        
        lugar.setText(" ");
        lugar.setPlaceholder("Lugar");
        
        fecha.setText(" ");
        fecha.setPlaceholder("Fecha");
        
        notas.setPlaceholder("Notas");
        notas.setText(" ");
        notas.setPlaceholder("Notas");
    }//GEN-LAST:event_AñadirActionPerformed
   
    
    public void mostrar() 
    {
        
        String matrix[][] = new String[tablacitas.size()][4];
        
        for(int x = 0; x<tablacitas.size(); x++)
        {
            matrix[x][0] = tablacitas.get(x).getClientes();
            matrix[x][1] = tablacitas.get(x).getLugar();
            matrix[x][2] = tablacitas.get(x).getFecha();
            matrix[x][3] = tablacitas.get(x).getNotas();
        }
        
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            matrix,
                
            new String [] {
                "Clientes", "Lugar", "Fecha", "Notas"
            }
                
        ));
        
  
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private RSMaterialComponent.RSButtonMaterialIconDos Añadir;
    public RSMaterialComponent.RSLabelTextIcon Titulo;
    public RSMaterialComponent.RSTextFieldIconDos cliente;
    public RSMaterialComponent.RSTextFieldIconDos fecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    public javax.swing.JPanel jPanel1;
    public javax.swing.JScrollPane jScrollPane1;
    public RSMaterialComponent.RSTextFieldIconDos lugar;
    public RSMaterialComponent.RSTextFieldIconDos notas;
    public rojeru_san.complementos.RSTableMetro tabla;
    // End of variables declaration//GEN-END:variables

    static class RSPanelsSlider {

        static Object DIRECT;

        public RSPanelsSlider() {
        }
    }
}
