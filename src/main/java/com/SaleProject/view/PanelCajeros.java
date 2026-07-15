
package com.SaleProject.view;

import com.SaleProject.dao.DAOcajero;
import com.SaleProject.model.MCajero;
import com.SaleProject.model.MLocal;
import java.util.ArrayList;
import java.util.List;

public class PanelCajeros extends javax.swing.JPanel {

    public PanelCajeros() {
        initComponents();
        initStyle();
        listarCajerosEnTabla();
        cargarComboLocales();
        limpiarFormulario();
    }

    private void initStyle(){
        this.setOpaque(false);
        // Estilos para el Panel interno
        PanelBgProductos.putClientProperty("FlatLaf.style", "arc: 16; border: 1,1,1,1,#E5E7EB,1,20;");
        // Estilos para la tabla
        jScrollPane1.putClientProperty("FlatLaf.style", "arc: 20; " + "border: 1,1,1,1,#E5E7EB,1,12;");

        // Aseguramos que la tabla no pinte bordes raros por dentro
        tblCajeros.setShowHorizontalLines(true);
        tblCajeros.setShowVerticalLines(false);
        
        // Bloqueo de cursor y edicion en el campo de texto "txtFieldIdLocal"
        txtFieldIdLocal.setEditable(false);  // Bloquea la edición por teclado
        txtFieldIdLocal.setFocusable(false); // Quita la capacidad de hacer clic o foco
        // Fuerza a que el cursor conserve el puntero de flecha predeterminado
        txtFieldIdLocal.setCursor(java.awt.Cursor.getPredefinedCursor(java.awt.Cursor.DEFAULT_CURSOR));
        // Estilo de campo deshabilitado integrado con FlatLaf
        txtFieldIdLocal.putClientProperty("FlatLaf.style", "background: #F8FAFC; foreground: #94A3B8;");
    }

    private void listarCajerosEnTabla() {
        //Instanciamos el DAO de cajeros para acceder a los métodos de consulta a la base de datos
        com.SaleProject.dao.DAOcajero daoCajero = new com.SaleProject.dao.DAOcajero();
        //Ejecutamos el metodo listarCajeros() para obtener todos los registros en una lista
        ArrayList<MCajero> lista = daoCajero.listarCajeros();

        // Obtenemos el modelo por defecto del JTable 
        javax.swing.table.DefaultTableModel modelo = (javax.swing.table.DefaultTableModel) tblCajeros.getModel();
        modelo.setRowCount(0); // Limpiamos filas antiguas

        // Validamos que la lista recuperada no sea nula
        if (lista != null) { 
            for (MCajero c : lista) { //Recorre la lista de cajeros uno por uno usando for-each 
                Object[] fila = new Object[] {c.getIdCajero(), c.getNomCajero(), c.getApPat(), c.getApMat(), c.getUsuario(), c.getClave(), c.getIdLocal()};
                modelo.addRow(fila);
            }
        }
    }
    
    private void cargarComboLocales() {
        com.SaleProject.dao.DAOlocal daoLocal = new com.SaleProject.dao.DAOlocal();
        List<MLocal> listaLocales = daoLocal.ListarLocal();
        
        comboLocal.removeAllItems();
        comboLocal.addItem("Seleccione un local...");

        if (listaLocales != null) {
            for (MLocal local : listaLocales) {
                // Mostramos únicamente la dirección en el combo
                comboLocal.addItem(local.getDireccion());
            }
        }
        // Evento para capturar el cambio de selección en el Combo Box
        comboLocal.addItemListener(new java.awt.event.ItemListener() {
            @Override
            public void itemStateChanged(java.awt.event.ItemEvent e) {
                if (e.getStateChange() == java.awt.event.ItemEvent.SELECTED) {
                    String direccionSeleccionada = comboLocal.getSelectedItem().toString();

                    if (direccionSeleccionada.equals("Seleccione un local...")) {
                        txtFieldIdLocal.setText(""); // Tu campo de texto para el ID del local
                        return;
                    }

                    // Buscamos el ID que le corresponde a esa dirección
                    if (listaLocales != null) {
                        for (MLocal local : listaLocales) {
                            if (local.getDireccion().equals(direccionSeleccionada)) {
                                txtFieldIdLocal.setText(String.valueOf(local.getIdLocal()));
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
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID Cajero", "Nombre", "Ap. Paterno", "Ap. Materno", "Usuario", "Clave ", "ID Local"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCajeros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCajerosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCajeros);

        PanelBgProductos.setBackground(new java.awt.Color(248, 250, 252));

        txtFieldBuscar.addActionListener(this::txtFieldBuscarActionPerformed);

        btnBuscar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(this::btnBuscarActionPerformed);

        txtIdCajero.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtIdCajero.setText("ID Cajero");

        txtFieldIdCajero.addActionListener(this::txtFieldIdCajeroActionPerformed);

        txtNombre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtNombre.setText("Nombre");

        txtFieldNombre.addActionListener(this::txtFieldNombreActionPerformed);

        txtApPaterno.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtApPaterno.setText("Apellido Paterno");

        txtFieldApPaterno.addActionListener(this::txtFieldApPaternoActionPerformed);

        txtApMaterno.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtApMaterno.setText("Apellido Materno");

        txtFieldApMaterno.addActionListener(this::txtFieldApMaternoActionPerformed);

        txtUsuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtUsuario.setText("Usuario");

        txtFieldUsuario.addActionListener(this::txtFieldUsuarioActionPerformed);

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
        btnEliminar.addActionListener(this::btnEliminarActionPerformed);

        btnModificar.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.setPreferredSize(new java.awt.Dimension(112, 35));
        btnModificar.addActionListener(this::btnModificarActionPerformed);

        comboLocal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboLocal.setMinimumSize(new java.awt.Dimension(72, 35));
        comboLocal.setPreferredSize(new java.awt.Dimension(72, 35));
        comboLocal.addActionListener(this::comboLocalActionPerformed);

        txtFieldIdLocal.addActionListener(this::txtFieldIdLocalActionPerformed);

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
        // Intenta ejecutar el registro capturando posibles errores en la conversión de textos a números
        try {
                MCajero nuevoCajero = new MCajero();
                nuevoCajero.setIdCajero(Integer.parseInt(txtFieldIdCajero.getText().trim()));
                nuevoCajero.setNomCajero(txtFieldNombre.getText().trim());
                nuevoCajero.setApPat(txtFieldApPaterno.getText().trim());
                nuevoCajero.setApMat(txtFieldApMaterno.getText().trim());
                nuevoCajero.setUsuario(txtFieldUsuario.getText().trim());
                nuevoCajero.setClave(txtFieldClave.getText().trim());
                nuevoCajero.setIdLocal(Integer.parseInt(txtFieldIdLocal.getText().trim()));
                // Instancia el objeto de acceso a datos (DAO) para realizar operaciones sobre la base de datos
                DAOcajero dao = new DAOcajero();
                // Evalúa si la inserción en la base de datos fue exitosa para proceder a actualizar la interfaz
                if (dao.insertarCajero(nuevoCajero)) {
                    javax.swing.JOptionPane.showMessageDialog(this, "Cajero registrado exitosamente.");
                    listarCajerosEnTabla(); 
                    limpiarFormulario();    
                // Maneja el escenario donde la base de datos rechaza el registro (por ejemplo, por llave primaria duplicada)
                } else {
                    javax.swing.JOptionPane.showMessageDialog(this, "No se pudo registrar el cajero. Verifique que el ID no esté duplicado.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
                }
                // Captura el error si el usuario ingresó letras o dejó vacíos los campos numéricos como el ID o el ID del Local
            } catch (NumberFormatException e) {
                javax.swing.JOptionPane.showMessageDialog(this, "El ID del cajero debe ser un número válido.", "Error de formato", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // Valida preventivamente que el ID no esté vacío para asegurar que se ha seleccionado un registro de la tabla
        if (txtFieldIdCajero.getText().trim().isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Seleccione un cajero de la tabla para modificar.", "Advertencia", javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }
        // Intenta recopilar los datos actualizados capturando posibles fallas de conversión en los campos numéricos
        try {
            MCajero cajeroModificado = new MCajero();
            cajeroModificado.setIdCajero(Integer.parseInt(txtFieldIdCajero.getText().trim()));
            cajeroModificado.setNomCajero(txtFieldNombre.getText().trim());
            cajeroModificado.setApPat(txtFieldApPaterno.getText().trim());
            cajeroModificado.setApMat(txtFieldApMaterno.getText().trim());
            cajeroModificado.setUsuario(txtFieldUsuario.getText().trim());
            cajeroModificado.setClave(txtFieldClave.getText().trim());
            cajeroModificado.setIdLocal(Integer.parseInt(txtFieldIdLocal.getText().trim()));
            // Instancia el objeto de acceso a datos (DAO) para interactuar con la persistencia en la base de datos
            DAOcajero dao = new DAOcajero();
                // Ejecuta la actualización en la BD y evalúa el resultado para refrescar la interfaz gráfica
                if (dao.modificarCajero(cajeroModificado)) {
                    javax.swing.JOptionPane.showMessageDialog(this, "Datos del cajero actualizados correctamente.");
                    listarCajerosEnTabla();
                    limpiarFormulario();
                // Maneja el escenario donde la sentencia SQL de actualización falló en el motor de base de datos
                } else {
                    javax.swing.JOptionPane.showMessageDialog(this, "Error al actualizar el cajero.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
                }
            // Captura cualquier error de formato si el usuario ingresó caracteres no numéricos en los ID    
            } catch (NumberFormatException e) {
                javax.swing.JOptionPane.showMessageDialog(this, "Error en los datos numéricos.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void txtFieldClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldClaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldClaveActionPerformed

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
        int filaSeleccionada = tblCajeros.getSelectedRow();

            // Si no hay fila seleccionada, empezamos desde la primera
            if (filaSeleccionada == -1) {
                if (tblCajeros.getRowCount() > 0) {
                    tblCajeros.setRowSelectionInterval(0, 0);
                    tblCajerosMouseClicked(null);
                }
                return;
            }

            // Si podemos retroceder, restamos uno
            if (filaSeleccionada > 0) {
                int nuevaFila = filaSeleccionada - 1;
                tblCajeros.setRowSelectionInterval(nuevaFila, nuevaFila);
                tblCajerosMouseClicked(null);
        }
    }//GEN-LAST:event_btnAnteriorActionPerformed

    private void btnUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUltimoActionPerformed
        int totalFilas = tblCajeros.getRowCount();

            if (totalFilas > 0) {
                int ultimaFila = totalFilas - 1;
                // Seleccionamos la última posición
                tblCajeros.setRowSelectionInterval(ultimaFila, ultimaFila);

                // Sincronizamos las cajas de texto
                tblCajerosMouseClicked(null);
        }
    }//GEN-LAST:event_btnUltimoActionPerformed

    private void tblCajerosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCajerosMouseClicked
        // Obtiene el índice de la fila seleccionada por el usuario en la tabla
        int selectRow = tblCajeros.getSelectedRow();
        // Evalúa si efectivamente se ha hecho clic en una fila válida de la tabla
        if (selectRow >= 0) {
            try {
                // Autorrellenar los campos de texto del formulario
                txtFieldIdCajero.setText(tblCajeros.getValueAt(selectRow, 0).toString());
                txtFieldNombre.setText(tblCajeros.getValueAt(selectRow, 1).toString());
                txtFieldApPaterno.setText(tblCajeros.getValueAt(selectRow, 2).toString());
                txtFieldApMaterno.setText(tblCajeros.getValueAt(selectRow, 3).toString());
                txtFieldUsuario.setText(tblCajeros.getValueAt(selectRow, 4).toString());
                txtFieldClave.setText(tblCajeros.getValueAt(selectRow, 5).toString());

                // Recuperar el ID del local asignado a este cajero
                String idLocalFila = tblCajeros.getValueAt(selectRow, 6).toString();
                txtFieldIdLocal.setText(idLocalFila); // Coloca el ID en el campo de texto de al lado

                // Forzar al ComboBox a seleccionar la dirección correspondiente a ese ID
                com.SaleProject.dao.DAOlocal daoLocal = new com.SaleProject.dao.DAOlocal();
                List<MLocal> locales = daoLocal.ListarLocal();
                // Valida que la lista de locales no se encuentre vacía antes de proceder a la búsqueda por ID
                if (locales != null) {
                    for (MLocal local : locales) {
                        // Compara si el ID del local recorrido coincide con el ID de la fila seleccionada para establecer la dirección en el combo
                        if (String.valueOf(local.getIdLocal()).equals(idLocalFila)) {
                            comboLocal.setSelectedItem(local.getDireccion()); // Selecciona la dirección en el combo
                            break;
                        }
                    }
                }
            // Controla de forma preventiva cualquier excepción o inconsistencia de datos al intentar leer la tabla
            } catch (Exception e) {
                javax.swing.JOptionPane.showMessageDialog(this, "Error al seleccionar los datos: " + e.getMessage());
            }
        }
    }//GEN-LAST:event_tblCajerosMouseClicked

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // Captura el texto ingresado por el usuario en el campo de búsqueda, eliminando espacios en blanco extra
        String textoBusqueda = txtFieldBuscar.getText().trim();
        // Si el campo de búsqueda está vacío, volvemos a listar todos los cajeros de la BD
        if (textoBusqueda.isEmpty()) {
        listarCajerosEnTabla();
        return;
        }
        // Intenta realizar la consulta filtrada en la base de datos capturando cualquier posible fallo de conexión o sintaxis
        try {
            DAOcajero dao = new DAOcajero();
            ArrayList<MCajero> listaFiltrada = dao.buscarCajeros(textoBusqueda);
        
            // Obtenemos el modelo del JTable para rellenarla con los resultados del filtro
            javax.swing.table.DefaultTableModel modelo = (javax.swing.table.DefaultTableModel) tblCajeros.getModel();
            modelo.setRowCount(0); // Limpiamos la tabla antes de inyectar los resultados
            // Evalúa que la lista filtrada contenga registros antes de proceder a pintar las filas en pantalla
            if (listaFiltrada != null && !listaFiltrada.isEmpty()) {
                for (MCajero c : listaFiltrada) {
                    Object[] fila = new Object[] {
                        c.getIdCajero(),
                        c.getNomCajero(),
                        c.getApPat(),
                        c.getApMat(),
                        c.getUsuario(),
                        c.getClave(),
                        c.getIdLocal()};
                    modelo.addRow(fila);}
            } else {
                // Mensaje opcional o sutil en consola si no se encontraron resultados
                System.out.println("No se encontraron cajeros con el filtro: " + textoBusqueda);
            }
            // Atrapa de forma segura cualquier excepción inesperada ocurrida durante el proceso de consulta o renderizado
            } catch (Exception e) {
                javax.swing.JOptionPane.showMessageDialog(this, "Error al realizar la búsqueda: " + e.getMessage(), "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtFieldIdCajeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldIdCajeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldIdCajeroActionPerformed

    private void txtFieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldNombreActionPerformed

    private void txtFieldApPaternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldApPaternoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldApPaternoActionPerformed

    private void txtFieldApMaternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldApMaternoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldApMaternoActionPerformed

    private void txtFieldUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldUsuarioActionPerformed

    private void txtFieldIdLocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldIdLocalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldIdLocalActionPerformed

    private void comboLocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboLocalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboLocalActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // Valida preventivamente que se haya seleccionado un registro de la tabla verificando que el ID no esté vacío
        if (txtFieldIdCajero.getText().trim().isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Seleccione un cajero de la tabla para eliminar.", "Advertencia", javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }
        // Recupera el ID numérico y concatena el nombre y apellido para personalizar el mensaje de alerta
        int idCajero = Integer.parseInt(txtFieldIdCajero.getText().trim());
        String nombreCompleto = txtFieldNombre.getText() + " " + txtFieldApPaterno.getText();
        // Despliega un cuadro de diálogo interactivo para confirmar si el usuario realmente desea borrar el registro
        int respuesta = javax.swing.JOptionPane.showConfirmDialog(
            this, 
            "¿Está seguro de que desea eliminar al cajero '" + nombreCompleto + "'?", 
            "Confirmar Eliminación", 
            javax.swing.JOptionPane.YES_NO_OPTION, 
            javax.swing.JOptionPane.QUESTION_MESSAGE
        );
        // Si el usuario confirma la acción, se procede a instanciar el DAO y ejecutar la eliminación física en la BD
        if (respuesta == javax.swing.JOptionPane.YES_OPTION) {
            DAOcajero dao = new DAOcajero();
            if (dao.eliminarCajero(idCajero)) {
                javax.swing.JOptionPane.showMessageDialog(this, "Cajero eliminado del sistema.");
                listarCajerosEnTabla();
                limpiarFormulario();
            // Maneja el escenario donde la base de datos restringe la eliminación (por ejemplo, por integridad referencial)
            } else {
                javax.swing.JOptionPane.showMessageDialog(this, "No se pudo eliminar el cajero.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnPrimeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrimeroActionPerformed
        if (tblCajeros.getRowCount() > 0) {
                // Seleccionamos la primera fila
                tblCajeros.setRowSelectionInterval(0, 0);

                // Forzamos el autorrelleno de los campos de texto y combo
                tblCajerosMouseClicked(null);
        }
    }//GEN-LAST:event_btnPrimeroActionPerformed

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        int filaSeleccionada = tblCajeros.getSelectedRow();
        int totalFilas = tblCajeros.getRowCount();

        // Si no hay fila seleccionada, empezamos desde la primera
        if (filaSeleccionada == -1) {
            if (totalFilas > 0) {
                    tblCajeros.setRowSelectionInterval(0, 0);
                    tblCajerosMouseClicked(null);
            }
            return;
        }

        // Si podemos avanzar sin salirnos del límite de la tabla
            if (filaSeleccionada < totalFilas - 1) {
                int nuevaFila = filaSeleccionada + 1;
                tblCajeros.setRowSelectionInterval(nuevaFila, nuevaFila);
                tblCajerosMouseClicked(null);
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
    
    private void limpiarFormulario() {
        txtFieldIdCajero.setText("");
        txtFieldNombre.setText("");
        txtFieldApPaterno.setText("");
        txtFieldApMaterno.setText("");
        txtFieldUsuario.setText("");
        txtFieldClave.setText("");
        txtFieldIdLocal.setText("");
        comboLocal.setSelectedIndex(0); // Regresa a "Seleccione un local..."
        tblCajeros.clearSelection();  // Deselecciona la fila en la tabla
    }
}
