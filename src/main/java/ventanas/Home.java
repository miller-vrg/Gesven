
package ventanas;

import java.awt.*;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import procesos.Reloj;

/**
 *
 * @author gasler
 */
public class Home extends javax.swing.JFrame implements Runnable {

    /**
     * Creates new form Home
     */
    private Thread h1;

    public Home() {

        initComponents();
        getContentPane().setBackground(new Color(255, 206, 43));
        setLocationRelativeTo(null);
        h1 = new Thread(this);
        h1.start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpIntercambio = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        etiBienvenido = new javax.swing.JLabel();
        etiBienvenido1 = new javax.swing.JLabel();
        etiBienvenido3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jpBotones = new javax.swing.JPanel();
        btnRegsitro = new javax.swing.JButton();
        btnAlmacen = new javax.swing.JButton();
        btnCarrito = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        reloj = new javax.swing.JLabel();
        btnHome = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gasven");
        setBackground(new java.awt.Color(255, 204, 51));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpIntercambio.setBackground(new java.awt.Color(119, 118, 124));
        jpIntercambio.setMaximumSize(new java.awt.Dimension(706, 506));
        jpIntercambio.setPreferredSize(new java.awt.Dimension(706, 503));
        jpIntercambio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(119, 118, 124));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        etiBienvenido.setFont(new java.awt.Font("TSCu_Times", 1, 90)); // NOI18N
        etiBienvenido.setForeground(new java.awt.Color(255, 206, 43));
        etiBienvenido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiBienvenido.setText("Bienvenido");
        jPanel1.add(etiBienvenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 510, 100));

        etiBienvenido1.setFont(new java.awt.Font("URW Bookman", 1, 24)); // NOI18N
        etiBienvenido1.setForeground(new java.awt.Color(255, 206, 43));
        etiBienvenido1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiBienvenido1.setText("__________________________________________");
        jPanel1.add(etiBienvenido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 540, -1));

        etiBienvenido3.setFont(new java.awt.Font("URW Bookman", 2, 18)); // NOI18N
        etiBienvenido3.setForeground(new java.awt.Color(255, 206, 43));
        etiBienvenido3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiBienvenido3.setText("En que te puedo ayudar hoy");
        jPanel1.add(etiBienvenido3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 378, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/carrito-de-compras.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/vendedor.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, -1, 139));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tienda-de-comestibles.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 330, -1, 130));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/comercio-electronico.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 310, -1, 170));

        jpIntercambio.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 610, 510));

        getContentPane().add(jpIntercambio, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 0, 740, 565));

        jpBotones.setBackground(new java.awt.Color(22, 25, 52));

        btnRegsitro.setBackground(new java.awt.Color(22, 25, 52));
        btnRegsitro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/documento-registrado.png"))); // NOI18N
        btnRegsitro.setBorder(null);
        btnRegsitro.setContentAreaFilled(false);
        btnRegsitro.setOpaque(true);
        btnRegsitro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegsitroActionPerformed(evt);
            }
        });

        btnAlmacen.setBackground(new java.awt.Color(22, 25, 52));
        btnAlmacen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/almacen.png"))); // NOI18N
        btnAlmacen.setBorder(null);
        btnAlmacen.setContentAreaFilled(false);
        btnAlmacen.setOpaque(true);
        btnAlmacen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlmacenActionPerformed(evt);
            }
        });

        btnCarrito.setBackground(new java.awt.Color(22, 25, 52));
        btnCarrito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/bienes.png"))); // NOI18N
        btnCarrito.setBorder(null);
        btnCarrito.setContentAreaFilled(false);
        btnCarrito.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCarrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarritoActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 206, 43));
        jLabel1.setFont(new java.awt.Font("URW Bookman", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 206, 43));
        jLabel1.setText("Registro");

        jLabel3.setBackground(new java.awt.Color(255, 206, 43));
        jLabel3.setFont(new java.awt.Font("URW Bookman", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 206, 43));
        jLabel3.setText("Carrito");

        jLabel4.setBackground(new java.awt.Color(255, 206, 43));
        jLabel4.setFont(new java.awt.Font("URW Bookman", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 206, 43));
        jLabel4.setText("Almacen");

        reloj.setBackground(new java.awt.Color(255, 206, 43));
        reloj.setFont(new java.awt.Font("URW Bookman", 2, 18)); // NOI18N
        reloj.setForeground(new java.awt.Color(255, 206, 43));
        reloj.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        reloj.setText("Reloj");

        btnHome.setBackground(new java.awt.Color(22, 25, 52));
        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/home.png"))); // NOI18N
        btnHome.setBorder(null);
        btnHome.setContentAreaFilled(false);
        btnHome.setOpaque(true);
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(255, 206, 43));
        jLabel5.setFont(new java.awt.Font("URW Bookman", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 206, 43));
        jLabel5.setText("Inicio");

        javax.swing.GroupLayout jpBotonesLayout = new javax.swing.GroupLayout(jpBotones);
        jpBotones.setLayout(jpBotonesLayout);
        jpBotonesLayout.setHorizontalGroup(
            jpBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBotonesLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jpBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(btnHome)
                    .addGroup(jpBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnRegsitro)
                        .addComponent(btnCarrito)
                        .addGroup(jpBotonesLayout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addGroup(jpBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel3)))
                        .addComponent(btnAlmacen, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addGroup(jpBotonesLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(11, 11, 11)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jpBotonesLayout.createSequentialGroup()
                .addComponent(reloj, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 43, Short.MAX_VALUE))
        );
        jpBotonesLayout.setVerticalGroup(
            jpBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBotonesLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(reloj, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(btnCarrito)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(30, 30, 30)
                .addComponent(btnRegsitro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(btnAlmacen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(btnHome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        getContentPane().add(jpBotones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 565));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegsitroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegsitroActionPerformed

        jpIntercambio.removeAll();
        jpIntercambio.updateUI();

        jpIntercambio.setLayout(new GridLayout(1,1));
        jpIntercambio.add(new Registro().ver());
        
    }//GEN-LAST:event_btnRegsitroActionPerformed

    private void btnAlmacenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlmacenActionPerformed

        jpIntercambio.removeAll();
        jpIntercambio.updateUI();

        jpIntercambio.setLayout(new FlowLayout());
        jpIntercambio.add(new Almacen().ver());
    }//GEN-LAST:event_btnAlmacenActionPerformed

    private void btnCarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarritoActionPerformed

        jpIntercambio.removeAll();
        jpIntercambio.updateUI();
        
        jpIntercambio.setLayout(new FlowLayout());
        jpIntercambio.add(new Menu().menu());

    }//GEN-LAST:event_btnCarritoActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed

        jpIntercambio.removeAll();
        jpIntercambio.updateUI();

        jpIntercambio.setLayout(new FlowLayout());
        jpIntercambio.add(jPanel1);

    }//GEN-LAST:event_btnHomeActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new Home().setVisible(true);
               
            }
        });
    }

    private JButton btnInicio;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlmacen;
    private javax.swing.JButton btnCarrito;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnRegsitro;
    private javax.swing.JLabel etiBienvenido;
    private javax.swing.JLabel etiBienvenido1;
    private javax.swing.JLabel etiBienvenido3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jpBotones;
    private javax.swing.JPanel jpIntercambio;
    private javax.swing.JLabel reloj;
    // End of variables declaration//GEN-END:variables


    @Override
    public void run() {
         Thread ct = Thread.currentThread();
        
         while( ct == h1 ){
        reloj.setText(new Reloj().verTiempo());
        
        try{
        Thread.sleep(1000);
        }catch( Exception e ){
        JOptionPane.showMessageDialog(null,"Error al obtener hora","ERROR!",JOptionPane.ERROR_MESSAGE);
        };   
    }
}
}