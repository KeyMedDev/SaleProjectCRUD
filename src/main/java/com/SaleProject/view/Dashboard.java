package com.SaleProject.view;

//FlatLaF Themes
import com.formdev.flatlaf.intellijthemes.FlatGrayIJTheme;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.UIManager;

public class Dashboard extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Dashboard.class.getName());

    public Dashboard() {
        initComponents();
        initStyles();
        initContent();
   }
    
    private void initContent(){
        showPanel(new PanelDashBoard());
    }
    
    private void showPanel(JPanel p){
        PanelContent.removeAll();
        PanelContent.add(p, java.awt.BorderLayout.CENTER);
        PanelContent.revalidate();
        PanelContent.repaint();
    }
    
    private void initStyles(){
        // Borde redondeado para el Jpanel con un borde gris claro
        //PanelContent.putClientProperty("FlatLaf.style", "arc: 100; border: 1,1,1,1,#E5E7EB,1,20");
        PanelContent.setBackground(new java.awt.Color(245, 247, 250)); // gris suave 

        // Edicion de tamaño y color
        //text_logo.putClientProperty("FlatLaf.style", "font: $h2.font");
        text_logo.setForeground(Color.black);
        
        //Estilos para los botones el Menu
        String estiloMenu = 
            "arc: 12; " +
            "background: #FFFFFF; " +
            "foreground: #6a6a6b; " +
            "hoverBackground: #F9FAFB; " +
            "selectedBackground: #EEF2F6; " +
            "selectedForeground: #3B82F6;" +
            "focusWidth: 0;";
        btnDashboard.putClientProperty("FlatLaf.style", estiloMenu);
        btnCajeros.putClientProperty("FlatLaf.style", estiloMenu);
        btnProducto.putClientProperty("FlatLaf.style", estiloMenu);
        btnProveedor.putClientProperty("FlatLaf.style", estiloMenu);
        btnClientes.putClientProperty("FlatLaf.style", estiloMenu);
        btnCompras.putClientProperty("FlatLaf.style", estiloMenu);
        btnSalir.putClientProperty("FlatLaf.style", estiloMenu);
        
        //Borde radius para todos los campos de textos
        UIManager.put( "TextComponent.arc", 15 );
        
        //Borde radius para todos los comboBox
        UIManager.put( "Component.arc", 15 );
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        menu = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        text_logo = new javax.swing.JLabel();
        btnDashboard = new javax.swing.JToggleButton();
        btnCajeros = new javax.swing.JToggleButton();
        btnProducto = new javax.swing.JToggleButton();
        btnProveedor = new javax.swing.JToggleButton();
        btnClientes = new javax.swing.JToggleButton();
        btnCompras = new javax.swing.JToggleButton();
        btnSalir = new javax.swing.JToggleButton();
        separator = new javax.swing.JSeparator();
        PanelContent = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1200, 720));
        setPreferredSize(new java.awt.Dimension(1360, 800));

        background.setBackground(new java.awt.Color(248, 250, 252));
        background.setMinimumSize(new java.awt.Dimension(1200, 720));

        menu.setBackground(new java.awt.Color(255, 255, 255));
        menu.setPreferredSize(new java.awt.Dimension(270, 720));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/SaleProject/resources/logo_menu-39x24.png"))); // NOI18N

        text_logo.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        text_logo.setText("Sale Project CRUD");

        btnDashboard.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnDashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-casa-30.png"))); // NOI18N
        btnDashboard.setText("DashBoard");
        btnDashboard.setBorder(null);
        btnDashboard.setBorderPainted(false);
        btnDashboard.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDashboard.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnDashboard.setIconTextGap(20);
        btnDashboard.setInheritsPopupMenu(true);
        btnDashboard.addActionListener(this::btnDashboardActionPerformed);

        btnCajeros.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnCajeros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-clientes-30.png"))); // NOI18N
        btnCajeros.setText("Cajeros");
        btnCajeros.setBorder(null);
        btnCajeros.setBorderPainted(false);
        btnCajeros.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCajeros.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnCajeros.setIconTextGap(20);
        btnCajeros.addActionListener(this::btnCajerosActionPerformed);

        btnProducto.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-producto-30.png"))); // NOI18N
        btnProducto.setText("Productos");
        btnProducto.setBorder(null);
        btnProducto.setBorderPainted(false);
        btnProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProducto.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnProducto.setIconTextGap(20);
        btnProducto.addActionListener(this::btnProductoActionPerformed);

        btnProveedor.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-proveedor-30.png"))); // NOI18N
        btnProveedor.setText("Proveedor");
        btnProveedor.setBorder(null);
        btnProveedor.setBorderPainted(false);
        btnProveedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProveedor.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnProveedor.setIconTextGap(20);
        btnProveedor.addActionListener(this::btnProveedorActionPerformed);

        btnClientes.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-grupo-de-usuarios-hombre-hombre-30.png"))); // NOI18N
        btnClientes.setText("Clientes");
        btnClientes.setBorder(null);
        btnClientes.setBorderPainted(false);
        btnClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClientes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnClientes.setIconTextGap(20);
        btnClientes.addActionListener(this::btnClientesActionPerformed);

        btnCompras.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnCompras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-carrito-de-la-compra-cargado-30.png"))); // NOI18N
        btnCompras.setText("Compras");
        btnCompras.setBorder(null);
        btnCompras.setBorderPainted(false);
        btnCompras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCompras.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnCompras.setIconTextGap(20);

        btnSalir.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-salida-30.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.setBorder(null);
        btnSalir.setBorderPainted(false);
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.setIconTextGap(20);

        javax.swing.GroupLayout menuLayout = new javax.swing.GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(menuLayout.createSequentialGroup()
                        .addComponent(logo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(text_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnCajeros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCompras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(text_logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(40, 40, 40)
                .addComponent(btnDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(btnCajeros, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(btnProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(btnProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(btnClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(btnCompras, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        separator.setBackground(new java.awt.Color(255, 255, 255));
        separator.setForeground(new java.awt.Color(229, 231, 235));
        separator.setOrientation(javax.swing.SwingConstants.VERTICAL);

        PanelContent.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(separator, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(PanelContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(separator)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(PanelContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductoActionPerformed
        // TODO add your handling code here:
        showPanel(new PanelProductos());
    }//GEN-LAST:event_btnProductoActionPerformed

    private void btnProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnProveedorActionPerformed

    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnClientesActionPerformed

    private void btnDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDashboardActionPerformed
        // TODO add your handling code here:
        showPanel(new PanelDashBoard());
    }//GEN-LAST:event_btnDashboardActionPerformed

    private void btnCajerosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCajerosActionPerformed
        // TODO add your handling code here:
        showPanel(new PanelCajeros());
    }//GEN-LAST:event_btnCajerosActionPerformed

    public static void main(String args[]) {
        FlatGrayIJTheme.setup();    
        
        //Borde radius de los todos los botones
        UIManager.put( "Button.arc", 15 );

        java.awt.EventQueue.invokeLater(() -> new Dashboard().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelContent;
    private javax.swing.JPanel background;
    private javax.swing.JToggleButton btnCajeros;
    private javax.swing.JToggleButton btnClientes;
    private javax.swing.JToggleButton btnCompras;
    private javax.swing.JToggleButton btnDashboard;
    private javax.swing.JToggleButton btnProducto;
    private javax.swing.JToggleButton btnProveedor;
    private javax.swing.JToggleButton btnSalir;
    private javax.swing.JLabel logo;
    private javax.swing.JPanel menu;
    private javax.swing.JSeparator separator;
    private javax.swing.JLabel text_logo;
    // End of variables declaration//GEN-END:variables
}
