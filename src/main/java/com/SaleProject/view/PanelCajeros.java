
package com.SaleProject.view;

public class PanelCajeros extends javax.swing.JPanel {

    public PanelCajeros() {
        initComponents();
        initStyle();
    }
    
    public void initStyle(){
        this.setOpaque(false);
        // Estilos para el Panel interno
        PanelBgProductos.putClientProperty("FlatLaf.style", "arc: 16; border: 1,1,1,1,#E5E7EB,1,20;");
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
        textTitleCajero = new javax.swing.JLabel();
        txtDescCajeros = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCajeros = new javax.swing.JTable();
        PanelBgProductos = new javax.swing.JPanel();
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
        txtFieldIdLocal = new javax.swing.JTextField();
        btnPrimero = new javax.swing.JToggleButton();
        btnAnterior = new javax.swing.JToggleButton();
        btnSiguiente = new javax.swing.JToggleButton();
        btnUltimo = new javax.swing.JToggleButton();

        setPreferredSize(new java.awt.Dimension(890, 680));

        PanelBackground.setBackground(new java.awt.Color(248, 250, 252));
        PanelBackground.setPreferredSize(new java.awt.Dimension(890, 680));

        textTitleCajero.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        textTitleCajero.setText("Gestión de Personal - Cajeros");

        txtDescCajeros.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtDescCajeros.setText("Registra, actualiza o elimina el personal asignado a los locales comerciales.");

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

        PanelBgProductos.setBackground(new java.awt.Color(248, 250, 252));

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
        txtUsuario.setText("Usuario");

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

        javax.swing.GroupLayout PanelBgProductosLayout = new javax.swing.GroupLayout(PanelBgProductos);
        PanelBgProductos.setLayout(PanelBgProductosLayout);
        PanelBgProductosLayout.setHorizontalGroup(
            PanelBgProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelBgProductosLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(PanelBgProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelBgProductosLayout.createSequentialGroup()
                        .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(45, 45, 45)
                        .addComponent(btnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(44, 44, 44)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(txtIdCajero, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelBgProductosLayout.createSequentialGroup()
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
                    .addGroup(PanelBgProductosLayout.createSequentialGroup()
                        .addComponent(txtFieldIdLocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(comboLocal, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(20, 20, 20))
        );
        PanelBgProductosLayout.setVerticalGroup(
            PanelBgProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBgProductosLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(PanelBgProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
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
                .addGroup(PanelBgProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(comboLocal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtFieldIdLocal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(PanelBgProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        btnPrimero.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnPrimero.setText("<<");
        btnPrimero.setPreferredSize(new java.awt.Dimension(60, 35));

        btnAnterior.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAnterior.setText("<");
        btnAnterior.setPreferredSize(new java.awt.Dimension(60, 35));
        btnAnterior.addActionListener(this::btnAnteriorActionPerformed);

        btnSiguiente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSiguiente.setText(">");
        btnSiguiente.setPreferredSize(new java.awt.Dimension(60, 35));

        btnUltimo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnUltimo.setText(">>");
        btnUltimo.setPreferredSize(new java.awt.Dimension(60, 35));
        btnUltimo.addActionListener(this::btnUltimoActionPerformed);

        javax.swing.GroupLayout PanelBackgroundLayout = new javax.swing.GroupLayout(PanelBackground);
        PanelBackground.setLayout(PanelBackgroundLayout);
        PanelBackgroundLayout.setHorizontalGroup(
            PanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBackgroundLayout.createSequentialGroup()
                .addComponent(textTitleCajero, javax.swing.GroupLayout.PREFERRED_SIZE, 894, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(txtDescCajeros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelBackgroundLayout.createSequentialGroup()
                .addComponent(PanelBgProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(PanelBackgroundLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(btnPrimero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAnterior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSiguiente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnUltimo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(70, 70, 70))))
        );
        PanelBackgroundLayout.setVerticalGroup(
            PanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBackgroundLayout.createSequentialGroup()
                .addComponent(textTitleCajero)
                .addGap(5, 5, 5)
                .addComponent(txtDescCajeros)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelBgProductos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(PanelBackgroundLayout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(20, 20, 20)
                        .addGroup(PanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnPrimero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnUltimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
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
                .addComponent(PanelBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAnteriorActionPerformed

    private void btnUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUltimoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUltimoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelBackground;
    private javax.swing.JPanel PanelBgProductos;
    private javax.swing.JToggleButton btnAgregar;
    private javax.swing.JToggleButton btnAnterior;
    private javax.swing.JToggleButton btnBuscar;
    private javax.swing.JToggleButton btnEliminar;
    private javax.swing.JToggleButton btnModificar;
    private javax.swing.JToggleButton btnPrimero;
    private javax.swing.JToggleButton btnSiguiente;
    private javax.swing.JToggleButton btnUltimo;
    private javax.swing.JComboBox<String> comboLocal;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tblCajeros;
    private javax.swing.JLabel textTitleCajero;
    private javax.swing.JLabel txtApMaterno;
    private javax.swing.JLabel txtApPaterno;
    private javax.swing.JLabel txtClave;
    private javax.swing.JLabel txtDescCajeros;
    private javax.swing.JTextField txtFieldApMaterno;
    private javax.swing.JTextField txtFieldApPaterno;
    private javax.swing.JTextField txtFieldBuscar;
    private javax.swing.JTextField txtFieldClave;
    private javax.swing.JTextField txtFieldIdCajero;
    private javax.swing.JTextField txtFieldIdLocal;
    private javax.swing.JTextField txtFieldNombre;
    private javax.swing.JTextField txtFieldUsuario;
    private javax.swing.JLabel txtIdCajero;
    private javax.swing.JLabel txtLocal;
    private javax.swing.JLabel txtNombre;
    private javax.swing.JLabel txtUsuario;
    // End of variables declaration//GEN-END:variables

}
