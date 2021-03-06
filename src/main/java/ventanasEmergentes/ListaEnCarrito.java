/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanasEmergentes;

/**
 *
 * @author gasler
 */
public class ListaEnCarrito extends javax.swing.JDialog {

    /**
     * Creates new form ListaEnCarrito
     */
    public ListaEnCarrito(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public ListaEnCarrito() {
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
        jList1 = new javax.swing.JList<>();
        campoBusqueda = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnAceptar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        campoProducto = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        campoCantidad = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        bntEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(119, 118, 124));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jList1.setBackground(new java.awt.Color(119, 118, 124));
        jList1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 206, 43)));
        jList1.setFont(new java.awt.Font("URW Bookman", 2, 12)); // NOI18N
        jList1.setForeground(new java.awt.Color(255, 206, 43));
        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jList1.setSelectionBackground(new java.awt.Color(255, 206, 43));
        jList1.setSelectionForeground(new java.awt.Color(22, 25, 52));
        jPanel1.add(jList1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 180, 200));

        campoBusqueda.setFont(new java.awt.Font("URW Bookman", 2, 12)); // NOI18N
        campoBusqueda.setForeground(new java.awt.Color(22, 25, 52));
        jPanel1.add(campoBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 240, 30));

        btnBuscar.setBackground(new java.awt.Color(255, 206, 43));
        btnBuscar.setFont(new java.awt.Font("URW Bookman", 1, 14)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(22, 25, 52));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/buscar.png"))); // NOI18N
        btnBuscar.setContentAreaFilled(false);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 50, -1, 50));

        btnCancelar.setBackground(new java.awt.Color(255, 206, 43));
        btnCancelar.setFont(new java.awt.Font("URW Bookman", 1, 14)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(22, 25, 52));
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 100, -1));

        btnAceptar.setBackground(new java.awt.Color(255, 206, 43));
        btnAceptar.setFont(new java.awt.Font("URW Bookman", 1, 14)); // NOI18N
        btnAceptar.setForeground(new java.awt.Color(22, 25, 52));
        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 240, -1, -1));

        jPanel2.setBackground(new java.awt.Color(119, 118, 124));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 206, 43)), "Detalles", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("URW Bookman", 1, 14), new java.awt.Color(255, 206, 43))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        campoProducto.setEditable(false);
        campoProducto.setFont(new java.awt.Font("URW Bookman", 2, 12)); // NOI18N
        campoProducto.setForeground(new java.awt.Color(22, 25, 52));
        jPanel2.add(campoProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 140, -1));

        jLabel2.setFont(new java.awt.Font("URW Bookman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 206, 43));
        jLabel2.setText("Cantidad:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        campoCantidad.setFont(new java.awt.Font("URW Bookman", 2, 12)); // NOI18N
        campoCantidad.setForeground(new java.awt.Color(22, 25, 52));
        campoCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCantidadActionPerformed(evt);
            }
        });
        jPanel2.add(campoCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 90, -1));

        jLabel3.setFont(new java.awt.Font("URW Bookman", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 206, 43));
        jLabel3.setText("Producto:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 280, 100));

        jLabel1.setFont(new java.awt.Font("URW Bookman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 206, 43));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("_________________");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 230, 40));

        jLabel4.setFont(new java.awt.Font("URW Bookman", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 206, 43));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Carrito");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 190, 40));

        bntEliminar.setBackground(new java.awt.Color(255, 206, 43));
        bntEliminar.setFont(new java.awt.Font("URW Bookman", 1, 14)); // NOI18N
        bntEliminar.setForeground(new java.awt.Color(22, 25, 52));
        bntEliminar.setText("Eliminar");
        bntEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(bntEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed

        this.dispose();

    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void campoCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoCantidadActionPerformed

    private void bntEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bntEliminarActionPerformed

    /**
     * @param args the command line arguments
     */
    public void run() {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ListaEnCarrito dialog = new ListaEnCarrito(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                       // System.exit(0);
                    }
                });
                dialog.setLocationRelativeTo(null);
                dialog.setResizable(false);
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntEliminar;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JTextField campoBusqueda;
    private javax.swing.JTextField campoCantidad;
    private javax.swing.JTextField campoProducto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
