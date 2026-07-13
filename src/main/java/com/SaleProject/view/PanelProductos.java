
package com.SaleProject.view;

import com.SaleProject.model.MProducto;
import java.util.ArrayList;

public class PanelProductos extends javax.swing.JPanel {

    public PanelProductos() {
        initComponents();
        initStyle();
        listarProductosEnTabla();
    }
    
    public void initStyle(){
        this.setOpaque(false);
        // Estilos para el Panel interno
        PanelBgProductos.putClientProperty("FlatLaf.style", "arc: 16; border: 1,1,1,1,#E5E7EB,1,20;");
        // Estilos para la tabla
        jScrollPane1.putClientProperty("FlatLaf.style", "arc: 20; " + "border: 1,1,1,1,#E5E7EB,1,12;");

        // Aseguramos que la tabla no pinte bordes raros por dentro
        tblProductos.setShowHorizontalLines(true);
        tblProductos.setShowVerticalLines(false);
    }
    
    private void listarProductosEnTabla() {
        com.SaleProject.dao.DAOproducto daoProducto = new com.SaleProject.dao.DAOproducto();
        ArrayList<MProducto> lista = daoProducto.listarProductos();

        javax.swing.table.DefaultTableModel modelo = (javax.swing.table.DefaultTableModel) tblProductos.getModel();
        modelo.setRowCount(0); // Limpieza preventiva

        if (lista != null) {
            for (MProducto p : lista) {
                Object[] fila = new Object[] {
                    p.getIdProducto(),
                    p.getDescProducto(),
                    p.getUnidad(),
                    p.getPrecioVenta(),
                    p.getStock(),
                    p.getMinStock(),
                    p.getIdCategoria()
                };
                modelo.addRow(fila);
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelBackground = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProductos = new javax.swing.JTable();
        PanelBgProductos = new javax.swing.JPanel();
        txtFieldBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JToggleButton();
        txtIdProducto = new javax.swing.JLabel();
        txtFieldIdProducto = new javax.swing.JTextField();
        txtDescProd = new javax.swing.JLabel();
        txtFieldDescProd = new javax.swing.JTextField();
        txtUnidad = new javax.swing.JLabel();
        txtFieldUnidad = new javax.swing.JTextField();
        txtPrecVenta = new javax.swing.JLabel();
        txtFieldPrecVenta = new javax.swing.JTextField();
        txtStock = new javax.swing.JLabel();
        txtFieldStock = new javax.swing.JTextField();
        txtMinStock = new javax.swing.JLabel();
        txtFieldMinStock = new javax.swing.JTextField();
        txtCategoria = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JToggleButton();
        btnEliminar = new javax.swing.JToggleButton();
        btnModificar = new javax.swing.JToggleButton();
        comboCategoria = new javax.swing.JComboBox<>();
        txtFieldCategoria = new javax.swing.JTextField();
        btnPrimero = new javax.swing.JToggleButton();
        btnAnterior = new javax.swing.JToggleButton();
        btnSiguiente = new javax.swing.JToggleButton();
        btnUltimo = new javax.swing.JToggleButton();

        setPreferredSize(new java.awt.Dimension(890, 680));

        PanelBackground.setBackground(new java.awt.Color(248, 250, 252));
        PanelBackground.setPreferredSize(new java.awt.Dimension(890, 680));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel1.setText("Gestión de Productos");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Registra, actualiza o elimina el producto asignado a las categorias del mismo.");

        tblProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID Productos", "Desc Producto", "Unidad", "Prec Venta", "Stock", "Min. Stock", "ID Categoria"
            }
        ));
        jScrollPane1.setViewportView(tblProductos);

        PanelBgProductos.setBackground(new java.awt.Color(248, 250, 252));

        txtFieldBuscar.addActionListener(this::txtFieldBuscarActionPerformed);

        btnBuscar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBuscar.setText("Buscar");

        txtIdProducto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtIdProducto.setText("ID Producto");

        txtDescProd.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtDescProd.setText("Descripción de Producto");

        txtUnidad.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtUnidad.setText("Unidad");

        txtPrecVenta.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtPrecVenta.setText("Precio de Venta");

        txtStock.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtStock.setText("Stock");

        txtMinStock.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtMinStock.setText("Stock Minimo");

        txtFieldMinStock.addActionListener(this::txtFieldMinStockActionPerformed);

        txtCategoria.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtCategoria.setText("Categoria");

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

        comboCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboCategoria.setMinimumSize(new java.awt.Dimension(72, 35));
        comboCategoria.setPreferredSize(new java.awt.Dimension(72, 35));

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
                    .addComponent(txtIdProducto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelBgProductosLayout.createSequentialGroup()
                        .addComponent(txtFieldBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(txtFieldIdProducto, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFieldDescProd, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFieldUnidad, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFieldPrecVenta, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFieldStock, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFieldMinStock, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDescProd, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtUnidad, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtPrecVenta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtStock, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtMinStock, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtCategoria, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(PanelBgProductosLayout.createSequentialGroup()
                        .addComponent(txtFieldCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(comboCategoria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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
                .addComponent(txtIdProducto)
                .addGap(5, 5, 5)
                .addComponent(txtFieldIdProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(txtDescProd)
                .addGap(5, 5, 5)
                .addComponent(txtFieldDescProd, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(txtUnidad)
                .addGap(5, 5, 5)
                .addComponent(txtFieldUnidad, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(txtPrecVenta)
                .addGap(5, 5, 5)
                .addComponent(txtFieldPrecVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(txtStock)
                .addGap(5, 5, 5)
                .addComponent(txtFieldStock, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(txtMinStock)
                .addGap(5, 5, 5)
                .addComponent(txtFieldMinStock, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(txtCategoria)
                .addGap(5, 5, 5)
                .addGroup(PanelBgProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(comboCategoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtFieldCategoria))
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
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 894, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addComponent(jLabel1)
                .addGap(5, 5, 5)
                .addComponent(jLabel2)
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

    private void txtFieldMinStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldMinStockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldMinStockActionPerformed

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
    private javax.swing.JComboBox<String> comboCategoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tblProductos;
    private javax.swing.JLabel txtCategoria;
    private javax.swing.JLabel txtDescProd;
    private javax.swing.JTextField txtFieldBuscar;
    private javax.swing.JTextField txtFieldCategoria;
    private javax.swing.JTextField txtFieldDescProd;
    private javax.swing.JTextField txtFieldIdProducto;
    private javax.swing.JTextField txtFieldMinStock;
    private javax.swing.JTextField txtFieldPrecVenta;
    private javax.swing.JTextField txtFieldStock;
    private javax.swing.JTextField txtFieldUnidad;
    private javax.swing.JLabel txtIdProducto;
    private javax.swing.JLabel txtMinStock;
    private javax.swing.JLabel txtPrecVenta;
    private javax.swing.JLabel txtStock;
    private javax.swing.JLabel txtUnidad;
    // End of variables declaration//GEN-END:variables

}
