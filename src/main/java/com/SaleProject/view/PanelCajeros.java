
package com.SaleProject.view;

public class PanelCajeros extends javax.swing.JPanel {

    public PanelCajeros() {
        initComponents();
        initStyle();
    }
    
    public void initStyle(){
        this.setOpaque(false);
        // Estilos para el Panel interno
        jPanel1.putClientProperty("FlatLaf.style", "arc: 16; border: 1,1,1,1,#E5E7EB,1,20; focusWidth: 0;");
        // Estilos para la tabla
        jScrollPane1.putClientProperty("FlatLaf.style", "arc: 20; " + "border: 1,1,1,1,#E5E7EB,1,12;");

        // Aseguramos que la tabla no pinte bordes raros por dentro
        tblCajeros.setShowHorizontalLines(true);
        tblCajeros.setShowVerticalLines(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelBackground = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCajeros = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        txtFieldBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JToggleButton();
        txtIdCajero = new javax.swing.JLabel();
        txtFieldIdCajero = new javax.swing.JTextField();
        txtNombre = new javax.swing.JLabel();
        txtFieldNombre = new javax.swing.JTextField();
        txtApPaterno = new javax.swing.JLabel();
        txtFieldApPaterno = new javax.swing.JTextField();
        txtApMaterno = new javax.swing.JLabel();
        txtFieldApMaterno = new javax.swing.JTextField();
        txtUsuario = new javax.swing.JLabel();
        txtFieldUsuario = new javax.swing.JTextField();
        txtClave = new javax.swing.JLabel();
        txtFieldClave = new javax.swing.JTextField();
        txtLocal = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JToggleButton();
        btnEliminar = new javax.swing.JToggleButton();
        btnModificar = new javax.swing.JToggleButton();
        comboLocal = new javax.swing.JComboBox<>();
        txtFieldLocal = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(890, 680));

        PanelBackground.setBackground(new java.awt.Color(255, 255, 255));
        PanelBackground.setPreferredSize(new java.awt.Dimension(890, 680));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel1.setText("Gestión de Personal - Cajeros ");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Registra, actualiza o elimina el personal asignado a los locales comerciales.");

        tblCajeros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblCajeros);

        jPanel1.setBackground(new java.awt.Color(248, 250, 252));

        txtFieldBuscar.addActionListener(this::txtFieldBuscarActionPerformed);

        btnBuscar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBuscar.setText("Buscar");

        txtIdCajero.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtIdCajero.setText("ID Cajero");

        txtNombre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtNombre.setText("Nombre");

        txtApPaterno.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtApPaterno.setText("Apellido Paterno");

        txtApMaterno.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtApMaterno.setText("Apellido Materno");

        txtUsuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtUsuario.setText("Usuario de Acceso");

        txtClave.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtClave.setText("Clave de Seguridad");

        txtFieldClave.addActionListener(this::txtFieldClaveActionPerformed);

        txtLocal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtLocal.setText("Local Comercial");

        btnAgregar.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAgregar.setPreferredSize(new java.awt.Dimension(112, 35));
        btnAgregar.addActionListener(this::btnAgregarActionPerformed);

        btnEliminar.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setPreferredSize(new java.awt.Dimension(112, 35));

        btnModificar.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.setPreferredSize(new java.awt.Dimension(112, 35));
        btnModificar.addActionListener(this::btnModificarActionPerformed);

        comboLocal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboLocal.setMinimumSize(new java.awt.Dimension(72, 35));
        comboLocal.setPreferredSize(new java.awt.Dimension(72, 35));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(45, 45, 45)
                        .addComponent(btnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(44, 44, 44)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(txtIdCajero, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(txtFieldBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(txtFieldIdCajero, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFieldNombre, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFieldApPaterno, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFieldApMaterno, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFieldUsuario, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFieldClave, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtApPaterno, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtApMaterno, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtClave, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtLocal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtFieldLocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(comboLocal, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtFieldBuscar)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addGap(10, 10, 10)
                .addComponent(txtIdCajero)
                .addGap(5, 5, 5)
                .addComponent(txtFieldIdCajero, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(txtNombre)
                .addGap(5, 5, 5)
                .addComponent(txtFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(txtApPaterno)
                .addGap(5, 5, 5)
                .addComponent(txtFieldApPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(txtApMaterno)
                .addGap(5, 5, 5)
                .addComponent(txtFieldApMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(txtUsuario)
                .addGap(5, 5, 5)
                .addComponent(txtFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(txtClave)
                .addGap(5, 5, 5)
                .addComponent(txtFieldClave, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(txtLocal)
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(comboLocal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtFieldLocal))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PanelBackgroundLayout = new javax.swing.GroupLayout(PanelBackground);
        PanelBackground.setLayout(PanelBackgroundLayout);
        PanelBackgroundLayout.setHorizontalGroup(
            PanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBackgroundLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 894, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelBackgroundLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );
        PanelBackgroundLayout.setVerticalGroup(
            PanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBackgroundLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(5, 5, 5)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelBackground, javax.swing.GroupLayout.DEFAULT_SIZE, 894, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelBackground, javax.swing.GroupLayout.DEFAULT_SIZE, 685, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtFieldBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldBuscarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnModificarActionPerformed

    private void txtFieldClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldClaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldClaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelBackground;
    private javax.swing.JToggleButton btnAgregar;
    private javax.swing.JToggleButton btnBuscar;
    private javax.swing.JToggleButton btnEliminar;
    private javax.swing.JToggleButton btnModificar;
    private javax.swing.JComboBox<String> comboLocal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tblCajeros;
    private javax.swing.JLabel txtApMaterno;
    private javax.swing.JLabel txtApPaterno;
    private javax.swing.JLabel txtClave;
    private javax.swing.JTextField txtFieldApMaterno;
    private javax.swing.JTextField txtFieldApPaterno;
    private javax.swing.JTextField txtFieldBuscar;
    private javax.swing.JTextField txtFieldClave;
    private javax.swing.JTextField txtFieldIdCajero;
    private javax.swing.JTextField txtFieldLocal;
    private javax.swing.JTextField txtFieldNombre;
    private javax.swing.JTextField txtFieldUsuario;
    private javax.swing.JLabel txtIdCajero;
    private javax.swing.JLabel txtLocal;
    private javax.swing.JLabel txtNombre;
    private javax.swing.JLabel txtUsuario;
    // End of variables declaration//GEN-END:variables

}
