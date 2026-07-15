
package com.SaleProject.view;

import com.SaleProject.model.MCategoria;
import com.SaleProject.model.MProducto;
import java.util.ArrayList;
import java.util.List;

public class PanelProductos extends javax.swing.JPanel {

    public PanelProductos() {
        initComponents();
        initStyle();
        listarProductosEnTabla();
        cargarComboCategoria();
        limpiarFormulario();
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
        
        // Bloqueo de cursor y edicion en el campo de texto "txtFieldIdLocal"
        txtFieldCategoria.setEditable(false);           // Bloquea la edición por teclado
        txtFieldCategoria.setFocusable(false);    // Quita la capacidad de hacer clic o foco
        // Fuerza a que el cursor conserve el puntero de flecha predeterminado
        txtFieldCategoria.setCursor(java.awt.Cursor.getPredefinedCursor(java.awt.Cursor.DEFAULT_CURSOR));
        // Estilo de campo deshabilitado integrado con FlatLaf
        txtFieldCategoria.putClientProperty("FlatLaf.style", "background: #F8FAFC; foreground: #94A3B8;");
    }
    
    private void listarProductosEnTabla() {
        // Instancia el DAO de productos para interactuar con la base de datos
        com.SaleProject.dao.DAOproducto daoProducto = new com.SaleProject.dao.DAOproducto();
        // Obtiene la lista completa de productos llamando al metodo del DAO
        ArrayList<MProducto> lista = daoProducto.listarProductos();
        // Obtiene el modelo de la tabla para manipular sus filas dinamicamente
        javax.swing.table.DefaultTableModel modelo = (javax.swing.table.DefaultTableModel) tblProductos.getModel();
        modelo.setRowCount(0); // Limpieza preventiva

        if (lista != null) {    //Valida que la lista de productos obtenida no sea nula
            for (MProducto p : lista) {     // Recorre cada producto de la lista mediante un ciclo for-each
                Object[] fila = new Object[] {  // Crea un arreglo de objetos mapeando las propiedades del producto
                    p.getIdProducto(),
                    p.getDescProducto(),
                    p.getUnidad(),
                    p.getPrecioVenta(),
                    p.getStock(),
                    p.getMinStock(),
                    p.getIdCategoria()
                };
                // Agrega el arreglo como una nueva fila en el modelo de la tabla
                modelo.addRow(fila);
            }
        }
    }
    
    private void cargarComboCategoria(){
        // Instancia el DAO de categorias para interactuar con la base de datos
        com.SaleProject.dao.DAOcategoria daoCategoria = new com.SaleProject.dao.DAOcategoria();
        // Obtiene la lista completa de categorias desde la base de datos
        List<MCategoria> listaCategorias = daoCategoria.ListarCategoria();
        // Limpia todos los elementos previos del combobox para evitar duplicados
        comboCategoria.removeAllItems();
        comboCategoria.addItem("Seleccione una categoria..."); // Agrega una opcion por defecto para guiar al usuario en la interfaz

        if (listaCategorias != null) {
            for (MCategoria categoria : listaCategorias) {
                // Mostramos únicamente la descripción en el combo
                comboCategoria.addItem(categoria.getDescCategoria());   
            }
        }
        // Define el escuchador de eventos para detectar cuando el usuario cambia de opcion
        comboCategoria.addItemListener(new java.awt.event.ItemListener() {
            @Override
            public void itemStateChanged(java.awt.event.ItemEvent e) {
                // Evalua si el evento corresponde a una seleccion confirmada
                if (e.getStateChange() == java.awt.event.ItemEvent.SELECTED) {
                    // Convierte a texto la opcion seleccionada por el usuario
                    String descSeleccionada = comboCategoria.getSelectedItem().toString();
                    // Controla si se volvio a seleccionar la opcion por defecto
                    if (descSeleccionada.equals("Seleccione una categoria...")) {
                        txtFieldCategoria.setText(""); // Tu campo de texto para el ID de la categoría
                        return;     // Termina el proceso para la seleccion
                    }
                    // Buscamos el ID que le corresponde a esa descripción
                    if (listaCategorias != null) {
                        // Recorre la lista para encontrar el objeto que coincide con el texto
                        for (MCategoria categoria : listaCategorias) {
                            if (categoria.getDescCategoria().equals(descSeleccionada)) {
                                // Pinta el ID correspondiente en el campo de texto asignado
                                txtFieldCategoria.setText(String.valueOf(categoria.getIdCategoria()));
                                break;
                            }
                        }
                    }
                }
            }
        });
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
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProductosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblProductos);

        PanelBgProductos.setBackground(new java.awt.Color(248, 250, 252));

        txtFieldBuscar.addActionListener(this::txtFieldBuscarActionPerformed);

        btnBuscar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(this::btnBuscarActionPerformed);

        txtIdProducto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtIdProducto.setText("ID Producto");

        txtFieldIdProducto.addActionListener(this::txtFieldIdProductoActionPerformed);

        txtDescProd.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtDescProd.setText("Descripción de Producto");

        txtFieldDescProd.addActionListener(this::txtFieldDescProdActionPerformed);

        txtUnidad.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtUnidad.setText("Unidad");

        txtFieldUnidad.addActionListener(this::txtFieldUnidadActionPerformed);

        txtPrecVenta.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtPrecVenta.setText("Precio de Venta");

        txtFieldPrecVenta.addActionListener(this::txtFieldPrecVentaActionPerformed);

        txtStock.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtStock.setText("Stock");

        txtFieldStock.addActionListener(this::txtFieldStockActionPerformed);

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
        btnEliminar.addActionListener(this::btnEliminarActionPerformed);

        btnModificar.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.setPreferredSize(new java.awt.Dimension(112, 35));
        btnModificar.addActionListener(this::btnModificarActionPerformed);

        comboCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboCategoria.setMinimumSize(new java.awt.Dimension(72, 35));
        comboCategoria.setPreferredSize(new java.awt.Dimension(72, 35));
        comboCategoria.addActionListener(this::comboCategoriaActionPerformed);

        txtFieldCategoria.addActionListener(this::txtFieldCategoriaActionPerformed);

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
        btnPrimero.addActionListener(this::btnPrimeroActionPerformed);

        btnAnterior.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAnterior.setText("<");
        btnAnterior.setPreferredSize(new java.awt.Dimension(60, 35));
        btnAnterior.addActionListener(this::btnAnteriorActionPerformed);

        btnSiguiente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSiguiente.setText(">");
        btnSiguiente.setPreferredSize(new java.awt.Dimension(60, 35));
        btnSiguiente.addActionListener(this::btnSiguienteActionPerformed);

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
        try {
            // Instancia un nuevo objeto de tipo MProducto para almacenar los datos del formulario
            com.SaleProject.model.MProducto nuevoProducto = new com.SaleProject.model.MProducto();
            // Recupera y convierte los datos ingresados en la interfaz para asignarlos al modelo
            nuevoProducto.setIdProducto(Integer.parseInt(txtFieldIdProducto.getText().trim()));
            nuevoProducto.setDescProducto(txtFieldDescProd.getText().trim());
            nuevoProducto.setUnidad(txtFieldUnidad.getText().trim());
            nuevoProducto.setPrecioVenta(Double.parseDouble(txtFieldPrecVenta.getText().trim())); 
            nuevoProducto.setStock(Integer.parseInt(txtFieldStock.getText().trim()));            
            nuevoProducto.setMinStock(Integer.parseInt(txtFieldMinStock.getText().trim()));      
            nuevoProducto.setIdCategoria(Integer.parseInt(txtFieldCategoria.getText().trim()));
            // Instancia la clase de acceso a datos para proceder con la insercion
            com.SaleProject.dao.DAOproducto dao = new com.SaleProject.dao.DAOproducto();
            // Evalua si la insercion en la base de datos se realizo correctamente
            if (dao.insertarProducto(nuevoProducto)) {
                javax.swing.JOptionPane.showMessageDialog(this, "Producto registrado exitosamente.");
                listarProductosEnTabla(); // Refresca la tabla visual con el nuevo registro
                limpiarFormulario();    // Restablece los campos de texto del formulario
            } else {
                // Notifica al usuario en caso de que la clave primaria este duplicada o falle la BD
                javax.swing.JOptionPane.showMessageDialog(this, "No se pudo registrar el producto. Verifique que el ID no esté duplicado.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException e) {
            // Controla errores si el usuario ingresa texto en campos estrictamente numericos
            javax.swing.JOptionPane.showMessageDialog(this, "Asegúrese de ingresar números válidos en ID, Precio, Stock, Stock Mínimo y Categoría.", "Error de formato", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // Valida preventivamente que se haya seleccionado un producto de la tabla verificando que el ID no este vacio
        if (txtFieldIdProducto.getText().trim().isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Seleccione un producto de la tabla para modificar.", "Advertencia", javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }
        try {
            // Instancia un nuevo objeto MProducto para almacenar los datos actualizados del formulario
            com.SaleProject.model.MProducto productoModificado = new com.SaleProject.model.MProducto();
            // Recupera y convierte los valores modificados en la interfaz para asignarlos al modelo
            productoModificado.setIdProducto(Integer.parseInt(txtFieldIdProducto.getText().trim()));
            productoModificado.setDescProducto(txtFieldDescProd.getText().trim());
            productoModificado.setUnidad(txtFieldUnidad.getText().trim());
            productoModificado.setPrecioVenta(Double.parseDouble(txtFieldPrecVenta.getText().trim()));
            productoModificado.setStock(Integer.parseInt(txtFieldStock.getText().trim()));
            productoModificado.setMinStock(Integer.parseInt(txtFieldMinStock.getText().trim()));
            productoModificado.setIdCategoria(Integer.parseInt(txtFieldCategoria.getText().trim()));
            // Instancia la clase de acceso a datos para proceder con la actualizacion
            com.SaleProject.dao.DAOproducto dao = new com.SaleProject.dao.DAOproducto();
            if (dao.modificarProducto(productoModificado)) {
                javax.swing.JOptionPane.showMessageDialog(this, "Datos del producto actualizados correctamente.");
                listarProductosEnTabla();
                limpiarFormulario();
            } else {
                // Notifica al usuario en caso de que ocurra un error interno en la base de datos
                javax.swing.JOptionPane.showMessageDialog(this, "Error al actualizar el producto.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException e) {
            // Controla errores si el usuario ingresa caracteres no validos en los campos numericos
            javax.swing.JOptionPane.showMessageDialog(this, "Error en los datos numéricos.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void txtFieldMinStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldMinStockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldMinStockActionPerformed

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
        int filaSeleccionada = tblProductos.getSelectedRow();
            // Si no hay fila seleccionada, empezamos desde la primera
            if (filaSeleccionada == -1) {
                if (tblProductos.getRowCount() > 0) {
                    tblProductos.setRowSelectionInterval(0, 0);
                    tblProductosMouseClicked(null);
                }
                return;
            }
            // Si podemos retroceder, restamos uno
            if (filaSeleccionada > 0) {
                int nuevaFila = filaSeleccionada - 1;
                tblProductos.setRowSelectionInterval(nuevaFila, nuevaFila);
                tblProductosMouseClicked(null);
        }
    }//GEN-LAST:event_btnAnteriorActionPerformed

    private void btnUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUltimoActionPerformed
        int totalFilas = tblProductos.getRowCount();
            if (totalFilas > 0) {
                int ultimaFila = totalFilas - 1;
                // Seleccionamos la última posición
                tblProductos.setRowSelectionInterval(ultimaFila, ultimaFila);
                // Sincronizamos las cajas de texto
                tblProductosMouseClicked(null);
        }
    }//GEN-LAST:event_btnUltimoActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // Valida preventivamente que se haya seleccionado un producto verificando que el ID no este vacio
        if (txtFieldIdProducto.getText().trim().isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Seleccione un producto de la tabla para eliminar.", "Advertencia", javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }
        // Recupera el ID numerico del producto y su descripcion para personalizar el mensaje
        int idProducto = Integer.parseInt(txtFieldIdProducto.getText().trim());
        String descripcionProducto = txtFieldDescProd.getText().trim();
        // Despliega un cuadro de dialogo interactivo para confirmar si el usuario realmente desea proceder
        int respuesta = javax.swing.JOptionPane.showConfirmDialog(
            this, 
            "¿Está seguro de que desea eliminar el producto '" + descripcionProducto + "'?", 
            "Confirmar Eliminación", 
            javax.swing.JOptionPane.YES_NO_OPTION, 
            javax.swing.JOptionPane.QUESTION_MESSAGE
        );
        // Si el usuario confirma con YES, se procede con la eliminacion fisica en la base de datos
        if (respuesta == javax.swing.JOptionPane.YES_OPTION) {
            com.SaleProject.dao.DAOproducto dao = new com.SaleProject.dao.DAOproducto();
            // Ejecuta el metodo de eliminacion en el DAO y evalua el resultado
            if (dao.eliminarProducto(idProducto)) {
                javax.swing.JOptionPane.showMessageDialog(this, "Producto eliminado del sistema.");
                listarProductosEnTabla();
                limpiarFormulario();
            } else {
                javax.swing.JOptionPane.showMessageDialog(this, "No se pudo eliminar el producto.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // Obtiene el texto de busqueda ingresado eliminando espacios vacios en los extremos
        String textoBusqueda = txtFieldBuscar.getText().trim();
        // Si el campo de búsqueda está vacío, volvemos a listar todos los productos de la BD
        if (textoBusqueda.isEmpty()) {
            listarProductosEnTabla(); // Metodo para cargar todos los productos sin filtros
            return;
        }
        try {
            // Instancia el objeto de acceso a datos de productos
            com.SaleProject.dao.DAOproducto dao = new com.SaleProject.dao.DAOproducto();
            // Convertimos la lista devuelta por el DAO a List 
            java.util.List<com.SaleProject.model.MProducto> listaFiltrada = dao.buscarProductos(textoBusqueda);
            // Obtenemos el modelo de tu JTable para rellenarla con los resultados del filtro
            javax.swing.table.DefaultTableModel modelo = (javax.swing.table.DefaultTableModel) tblProductos.getModel();
            modelo.setRowCount(0); // Limpiamos la tabla antes de inyectar los resultados
            // Verifica que la lista filtrada no sea nula ni se encuentre vacia
            if (listaFiltrada != null && !listaFiltrada.isEmpty()) {
                // Recorre la lista de productos que coinciden con el filtro ingresado
                for (com.SaleProject.model.MProducto p : listaFiltrada) {
                    Object[] fila = new Object[] { // Crea una fila con los valores de los atributos del producto
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
            } else {
                // Mensaje opcional si no se encontraron resultados
                System.out.println("No se encontraron productos con el filtro: " + textoBusqueda);
            }
        } catch (Exception e) {
            // Captura cualquier error inesperado y muestra un mensaje emergente
            javax.swing.JOptionPane.showMessageDialog(this, "Error al realizar la búsqueda: " + e.getMessage(), "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtFieldIdProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldIdProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldIdProductoActionPerformed

    private void txtFieldDescProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldDescProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldDescProdActionPerformed

    private void txtFieldUnidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldUnidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldUnidadActionPerformed

    private void txtFieldPrecVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldPrecVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldPrecVentaActionPerformed

    private void txtFieldStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldStockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldStockActionPerformed

    private void txtFieldCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldCategoriaActionPerformed

    private void comboCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboCategoriaActionPerformed

    private void tblProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProductosMouseClicked
        // Obtiene el indice de la fila seleccionada por el usuario en la tabla
        int selectRow = tblProductos.getSelectedRow();
        // Evalua si realmente se selecciono una fila valida
        if (selectRow >= 0) {
            try {
                // Autorrellenar los campos de texto del formulario de Productos
                txtFieldIdProducto.setText(tblProductos.getValueAt(selectRow, 0).toString());
                txtFieldDescProd.setText(tblProductos.getValueAt(selectRow, 1).toString());
                txtFieldUnidad.setText(tblProductos.getValueAt(selectRow, 2).toString());
                txtFieldPrecVenta.setText(tblProductos.getValueAt(selectRow, 3).toString());
                txtFieldStock.setText(tblProductos.getValueAt(selectRow, 4).toString());
                txtFieldMinStock.setText(tblProductos.getValueAt(selectRow, 5).toString());
                
                // Recuperar el ID de la categoría asignada a este producto
                String idCategoriaFila = tblProductos.getValueAt(selectRow, 6).toString();
                txtFieldCategoria.setText(idCategoriaFila); // Coloca el ID en el campo de texto de al lado
                
                // Forzar al ComboBox a seleccionar la descripción de la categoría correspondiente a ese ID
                com.SaleProject.dao.DAOcategoria daoCategoria = new com.SaleProject.dao.DAOcategoria();
                List<MCategoria> categorias = daoCategoria.ListarCategoria();

                if (categorias != null) {
                    // Recorre la lista para encontrar la coincidencia del ID
                    for (MCategoria categoria : categorias) {
                        // Compara el ID de la iteracion con el ID de la fila seleccionada
                        if (String.valueOf(categoria.getIdCategoria()).equals(idCategoriaFila)) {
                            comboCategoria.setSelectedItem(categoria.getDescCategoria()); // Selecciona la descripción en el combo
                            break;
                        }
                    }
                }
            } catch (Exception e) {
                javax.swing.JOptionPane.showMessageDialog(this, "Error al seleccionar los datos: " + e.getMessage());
            }
        }
    }//GEN-LAST:event_tblProductosMouseClicked

    private void btnPrimeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrimeroActionPerformed
        if (tblProductos.getRowCount() > 0) {
                // Seleccionamos la primera fila
                tblProductos.setRowSelectionInterval(0, 0);
                // Forzamos el autorrelleno de los campos de texto y combo
                tblProductosMouseClicked(null);
        }
    }//GEN-LAST:event_btnPrimeroActionPerformed

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        int filaSeleccionada = tblProductos.getSelectedRow();
        int totalFilas = tblProductos.getRowCount();
        // Si no hay fila seleccionada, empezamos desde la primera
        if (filaSeleccionada == -1) {
            if (totalFilas > 0) {
                    tblProductos.setRowSelectionInterval(0, 0);
                    tblProductosMouseClicked(null);
            }
            return;
        }
        // Si podemos avanzar sin salirnos del límite de la tabla
            if (filaSeleccionada < totalFilas - 1) {
                int nuevaFila = filaSeleccionada + 1;
                tblProductos.setRowSelectionInterval(nuevaFila, nuevaFila);
                tblProductosMouseClicked(null);
        }
    }//GEN-LAST:event_btnSiguienteActionPerformed


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

        private void limpiarFormulario() {
        txtFieldIdProducto.setText("");
        txtFieldDescProd.setText("");
        txtFieldUnidad.setText("");
        txtFieldPrecVenta.setText("");
        txtFieldStock.setText("");
        txtFieldMinStock.setText("");
        txtFieldCategoria.setText("");
        comboCategoria.setSelectedIndex(0); // Regresa a "Seleccione un local..."
        tblProductos.clearSelection();  // Deselecciona la fila en la tabla
    }
}
