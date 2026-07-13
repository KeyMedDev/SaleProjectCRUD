
package com.SaleProject.view;

public class PanelDashBoard extends javax.swing.JPanel {

    public PanelDashBoard() {
        initComponents();
        initStyle();
        initTimeLine();
    }
    
    private void initStyle(){
        this.setOpaque(false);
        // Estilos para el Panel interno
        PanelBg01.putClientProperty("FlatLaf.style", "arc: 16; border: 1,1,1,1,#E5E7EB,1,20;");
        PanelBg02.putClientProperty("FlatLaf.style", "arc: 16; border: 1,1,1,1,#E5E7EB,1,20;");
        PanelInventario.putClientProperty("FlatLaf.style", "arc: 16; border: 1,1,1,1,#E5E7EB,1,20;");
        PanelClientes.putClientProperty("FlatLaf.style", "arc: 16; border: 1,1,1,1,#E5E7EB,1,20;");
        PanelPersonal.putClientProperty("FlatLaf.style", "arc: 16; border: 1,1,1,1,#E5E7EB,1,20;");
        ScrollEventos.putClientProperty("FlatLaf.style", "arc: 16; border: 1,1,1,1,#E5E7EB,1,20;");
        TablaClientes.putClientProperty("FlatLaf.style", "arc: 20; " + "border: 1,1,1,1,#E5E7EB,1,12;");
        txtTimeLine.setContentType("text/html");
    }
    
    private void initTimeLine() {
        // Construimos el feed usando HTML y CSS básico compatible con Swing
        StringBuilder html = new StringBuilder();

        html.append("<html><body style='font-family: sans-serif; font-size: 11px; padding: 10px; color: #1E293B;'>");

        // 1. Evento: Producto Agregado
        html.append("<p style='margin: 0;'><b>📦 Producto agregado</b></p>");
        html.append("<p style='margin: 2px 0 0 0; color: #475569;'>Laptop Lenovo IdeaPad</p>");
        html.append("<p style='margin: 2px 0 0 0; color: #94A3B8; font-size: 9px;'>Hace 2 min</p>");
        html.append("<hr style='border: 0; border-top: 1px dashed #E2E8F0; margin: 10px 0;'>");

        // 2. Evento: Producto Modificado
        html.append("<p style='margin: 0;'><b>✏️ Producto modificado</b></p>");
        html.append("<p style='margin: 2px 0 0 0; color: #475569;'>Mouse Logitech G203<br>");
        html.append("<span style='color: #EF4444;'>Precio: S/.85</span> → <span style='color: #22C55E;'>S/.79</span></p>");
        html.append("<p style='margin: 2px 0 0 0; color: #94A3B8; font-size: 9px;'>Hace 8 min</p>");
        html.append("<hr style='border: 0; border-top: 1px dashed #E2E8F0; margin: 10px 0;'>");

        // 3. Evento: Cliente Eliminado
        html.append("<p style='margin: 0;'><b>🗑️ Cliente eliminado</b></p>");
        html.append("<p style='margin: 2px 0 0 0; color: #475569;'>Juan Perez</p>");
        html.append("<p style='margin: 2px 0 0 0; color: #94A3B8; font-size: 9px;'>Hace 12 min</p>");
        html.append("<hr style='border: 0; border-top: 1px dashed #E2E8F0; margin: 10px 0;'>");

        // 4. Evento: Usuario Agregado
        html.append("<p style='margin: 0;'><b>👤 Usuario agregado</b></p>");
        html.append("<p style='margin: 2px 0 0 0; color: #475569;'>Carlos Medina <br><small style='color: #3B82F6;'>Administrador</small></p>");
        html.append("<p style='margin: 2px 0 0 0; color: #94A3B8; font-size: 9px;'>Hace 18 min</p>");
        html.append("<hr style='border: 0; border-top: 1px dashed #E2E8F0; margin: 10px 0;'>");

        // 5. Evento: Compra Registrada
        html.append("<p style='margin: 0;'><b>🛒 Compra registrada</b></p>");
        html.append("<p style='margin: 2px 0 0 0; color: #475569;'>Proveedor: Dell Perú</p>");
        html.append("<p style='margin: 2px 0 0 0; color: #94A3B8; font-size: 9px;'>Hace 25 min</p>");

        html.append("</body></html>");

        // Seteamos el texto formateado al JTextPane
        txtTimeLine.setText(html.toString());

        // Forzamos a que el scroll inicie desde arriba
        txtTimeLine.setCaretPosition(0);
}
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelBackground = new javax.swing.JPanel();
        PanelBg02 = new javax.swing.JPanel();
        TablaClientes = new javax.swing.JScrollPane();
        TblClientes = new javax.swing.JTable();
        ScrollEventos = new javax.swing.JScrollPane();
        txtTimeLine = new javax.swing.JTextPane();
        PanelBg01 = new javax.swing.JPanel();
        PanelInventario = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        PanelClientes = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        PanelPersonal = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(890, 680));

        PanelBackground.setBackground(new java.awt.Color(248, 250, 252));
        PanelBackground.setPreferredSize(new java.awt.Dimension(890, 680));

        PanelBg02.setBackground(new java.awt.Color(248, 250, 252));

        TblClientes.setModel(new javax.swing.table.DefaultTableModel(
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
        TablaClientes.setViewportView(TblClientes);

        ScrollEventos.setPreferredSize(new java.awt.Dimension(432, 465));

        txtTimeLine.setEditable(false);
        ScrollEventos.setViewportView(txtTimeLine);

        javax.swing.GroupLayout PanelBg02Layout = new javax.swing.GroupLayout(PanelBg02);
        PanelBg02.setLayout(PanelBg02Layout);
        PanelBg02Layout.setHorizontalGroup(
            PanelBg02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBg02Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(TablaClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(ScrollEventos, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        PanelBg02Layout.setVerticalGroup(
            PanelBg02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelBg02Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(PanelBg02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ScrollEventos, javax.swing.GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE)
                    .addComponent(TablaClientes))
                .addGap(20, 20, 20))
        );

        PanelBg01.setBackground(new java.awt.Color(248, 250, 252));

        PanelInventario.setBackground(new java.awt.Color(255, 232, 224));
        PanelInventario.setPreferredSize(new java.awt.Dimension(270, 152));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Alerta de Inventario");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 3, 48)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("5");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Productos con stock bajo el mínimo");

        javax.swing.GroupLayout PanelInventarioLayout = new javax.swing.GroupLayout(PanelInventario);
        PanelInventario.setLayout(PanelInventarioLayout);
        PanelInventarioLayout.setHorizontalGroup(
            PanelInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelInventarioLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(PanelInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE))
                .addGap(15, 15, 15))
        );
        PanelInventarioLayout.setVerticalGroup(
            PanelInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelInventarioLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        PanelClientes.setBackground(new java.awt.Color(250, 242, 227));
        PanelClientes.setPreferredSize(new java.awt.Dimension(270, 152));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Clientes Totales");
        jLabel2.setPreferredSize(new java.awt.Dimension(240, 25));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 48)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("15");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Clientes registrados en tienda");

        javax.swing.GroupLayout PanelClientesLayout = new javax.swing.GroupLayout(PanelClientes);
        PanelClientes.setLayout(PanelClientesLayout);
        PanelClientesLayout.setHorizontalGroup(
            PanelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelClientesLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(PanelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15))
        );
        PanelClientesLayout.setVerticalGroup(
            PanelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelClientesLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PanelPersonal.setBackground(new java.awt.Color(218, 242, 225));
        PanelPersonal.setPreferredSize(new java.awt.Dimension(270, 152));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Personal Activo");
        jLabel3.setPreferredSize(new java.awt.Dimension(240, 25));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 48)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("12");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Registrados en el sistema comercial");

        javax.swing.GroupLayout PanelPersonalLayout = new javax.swing.GroupLayout(PanelPersonal);
        PanelPersonal.setLayout(PanelPersonalLayout);
        PanelPersonalLayout.setHorizontalGroup(
            PanelPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPersonalLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(PanelPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15))
        );
        PanelPersonalLayout.setVerticalGroup(
            PanelPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPersonalLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PanelBg01Layout = new javax.swing.GroupLayout(PanelBg01);
        PanelBg01.setLayout(PanelBg01Layout);
        PanelBg01Layout.setHorizontalGroup(
            PanelBg01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBg01Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(PanelInventario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20)
                .addComponent(PanelClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20)
                .addComponent(PanelPersonal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );
        PanelBg01Layout.setVerticalGroup(
            PanelBg01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBg01Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(PanelBg01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelInventario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelPersonal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout PanelBackgroundLayout = new javax.swing.GroupLayout(PanelBackground);
        PanelBackground.setLayout(PanelBackgroundLayout);
        PanelBackgroundLayout.setHorizontalGroup(
            PanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelBg01, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(PanelBg02, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelBackgroundLayout.setVerticalGroup(
            PanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelBackgroundLayout.createSequentialGroup()
                .addComponent(PanelBg01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(PanelBg02, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelBackground;
    private javax.swing.JPanel PanelBg01;
    private javax.swing.JPanel PanelBg02;
    private javax.swing.JPanel PanelClientes;
    private javax.swing.JPanel PanelInventario;
    private javax.swing.JPanel PanelPersonal;
    private javax.swing.JScrollPane ScrollEventos;
    private javax.swing.JScrollPane TablaClientes;
    private javax.swing.JTable TblClientes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextPane txtTimeLine;
    // End of variables declaration//GEN-END:variables

}
