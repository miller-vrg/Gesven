/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JPanel;
import ventanasEmergentes.ListaEnCarrito;
import ventanasEmergentes.Listado;

/**
 *
 * @author gasler
 */
public class Menu extends javax.swing.JPanel {

    /**
     * Creates new form Menu
     */
    public Menu() {
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
        btnCarnes = new javax.swing.JButton();
        btnFruatas = new javax.swing.JButton();
        btnLacteos = new javax.swing.JButton();
        btnBebidas = new javax.swing.JButton();
        btnPollo = new javax.swing.JButton();
        btnAseo = new javax.swing.JButton();
        btnMascota1 = new javax.swing.JButton();
        btnOtros = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        bntCancelar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        bntFinalizar = new javax.swing.JButton();

        setBackground(new java.awt.Color(119, 118, 124));
        setPreferredSize(new java.awt.Dimension(706, 506));
        setVerifyInputWhenFocusTarget(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(119, 118, 124));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 206, 43)), "Categoria", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("URW Bookman", 1, 18), new java.awt.Color(255, 206, 43))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(22, 25, 52));

        btnCarnes.setBackground(new java.awt.Color(119, 118, 124));
        btnCarnes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/007-carne-de-kobe.png"))); // NOI18N
        btnCarnes.setBorder(null);
        btnCarnes.setContentAreaFilled(false);
        btnCarnes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarnesActionPerformed(evt);
            }
        });

        btnFruatas.setBackground(new java.awt.Color(255, 206, 43));
        btnFruatas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/003-verduras.png"))); // NOI18N
        btnFruatas.setBorder(null);
        btnFruatas.setContentAreaFilled(false);
        btnFruatas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFruatasActionPerformed(evt);
            }
        });

        btnLacteos.setBackground(new java.awt.Color(119, 118, 124));
        btnLacteos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/006-productos-lacteos.png"))); // NOI18N
        btnLacteos.setBorder(null);
        btnLacteos.setContentAreaFilled(false);
        btnLacteos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLacteosActionPerformed(evt);
            }
        });

        btnBebidas.setBackground(new java.awt.Color(119, 118, 124));
        btnBebidas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/012-bebida-alcoholica.png"))); // NOI18N
        btnBebidas.setBorder(null);
        btnBebidas.setContentAreaFilled(false);
        btnBebidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBebidasActionPerformed(evt);
            }
        });

        btnPollo.setBackground(new java.awt.Color(119, 118, 124));
        btnPollo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/008-pollo-asado.png"))); // NOI18N
        btnPollo.setBorder(null);
        btnPollo.setContentAreaFilled(false);
        btnPollo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPolloActionPerformed(evt);
            }
        });

        btnAseo.setBackground(new java.awt.Color(119, 118, 124));
        btnAseo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/009-articulos-de-aseo.png"))); // NOI18N
        btnAseo.setBorder(null);
        btnAseo.setContentAreaFilled(false);
        btnAseo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAseoActionPerformed(evt);
            }
        });

        btnMascota1.setBackground(new java.awt.Color(119, 118, 124));
        btnMascota1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/010-suministros-de-mascotas.png"))); // NOI18N
        btnMascota1.setBorder(null);
        btnMascota1.setContentAreaFilled(false);

        btnOtros.setBackground(new java.awt.Color(119, 118, 124));
        btnOtros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/011-bolsas-de-compra.png"))); // NOI18N
        btnOtros.setBorder(null);
        btnOtros.setContentAreaFilled(false);
        btnOtros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOtrosActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("URW Bookman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 206, 43));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Lacteos");

        jLabel1.setFont(new java.awt.Font("URW Bookman", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 206, 43));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Frutas");

        jLabel3.setFont(new java.awt.Font("URW Bookman", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 206, 43));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Pollo");

        jLabel5.setFont(new java.awt.Font("URW Bookman", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 206, 43));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Res");

        jLabel4.setFont(new java.awt.Font("URW Bookman", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 206, 43));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Bebidas");

        jLabel6.setFont(new java.awt.Font("URW Bookman", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 206, 43));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Mascotas");

        jLabel7.setFont(new java.awt.Font("URW Bookman", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 206, 43));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Aseo");

        jLabel8.setFont(new java.awt.Font("URW Bookman", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 206, 43));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Otros");

        jLabel9.setFont(new java.awt.Font("URW Bookman", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 206, 43));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Total: $");

        jLabel10.setFont(new java.awt.Font("URW Bookman", 2, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 206, 43));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("0");

        jLabel11.setFont(new java.awt.Font("URW Bookman", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 206, 43));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Articulos:");

        jLabel12.setFont(new java.awt.Font("URW Bookman", 2, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 206, 43));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnFruatas)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(109, 109, 109)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnBebidas)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(87, 87, 87)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnPollo)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnAseo)
                                        .addGap(109, 109, 109)
                                        .addComponent(btnLacteos)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(102, 102, 102)
                                        .addComponent(btnMascota1))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(91, 91, 91)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(80, 80, 80)
                                    .addComponent(btnCarnes))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnOtros)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnMascota1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnFruatas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnBebidas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnPollo)
                                    .addComponent(btnCarnes))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addComponent(btnOtros))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnLacteos)
                                    .addComponent(btnAseo))))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel6)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel2))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        bntCancelar.setBackground(new java.awt.Color(255, 206, 43));
        bntCancelar.setFont(new java.awt.Font("URW Bookman", 1, 14)); // NOI18N
        bntCancelar.setForeground(new java.awt.Color(22, 25, 52));
        bntCancelar.setText("Cancelar");
        add(bntCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, -1, -1));

        btnEditar.setBackground(new java.awt.Color(255, 206, 43));
        btnEditar.setFont(new java.awt.Font("URW Bookman", 1, 14)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(22, 25, 52));
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 450, -1, -1));

        bntFinalizar.setBackground(new java.awt.Color(255, 206, 43));
        bntFinalizar.setFont(new java.awt.Font("URW Bookman", 1, 14)); // NOI18N
        bntFinalizar.setForeground(new java.awt.Color(22, 25, 52));
        bntFinalizar.setText("Finalizar");
        bntFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntFinalizarActionPerformed(evt);
            }
        });
        add(bntFinalizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 450, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnFruatasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFruatasActionPerformed
        
        new Listado().run();

    }//GEN-LAST:event_btnFruatasActionPerformed

    private void btnLacteosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLacteosActionPerformed

         new Listado().run();
        
    }//GEN-LAST:event_btnLacteosActionPerformed

    private void btnPolloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPolloActionPerformed

         new Listado().run();
        
    }//GEN-LAST:event_btnPolloActionPerformed

    private void btnAseoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAseoActionPerformed

         new Listado().run();

    }//GEN-LAST:event_btnAseoActionPerformed

    private void btnBebidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBebidasActionPerformed

               new Listado().run();
  

    }//GEN-LAST:event_btnBebidasActionPerformed

    private void btnOtrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOtrosActionPerformed

         new Listado().run();

    }//GEN-LAST:event_btnOtrosActionPerformed

    private void btnCarnesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarnesActionPerformed
         new Listado().run();

    }//GEN-LAST:event_btnCarnesActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed

        new ListaEnCarrito().run();

    }//GEN-LAST:event_btnEditarActionPerformed

    private void bntFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntFinalizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bntFinalizarActionPerformed

    public JPanel menu(){
    
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.add(BorderLayout.CENTER,this);
        panel.setBackground(new Color(119,118,124));
        panel.setBounds(0,0,706,506);
        
    return panel;
    };

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntCancelar;
    private javax.swing.JButton bntFinalizar;
    private javax.swing.JButton btnAseo;
    private javax.swing.JButton btnBebidas;
    private javax.swing.JButton btnCarnes;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnFruatas;
    private javax.swing.JButton btnLacteos;
    private javax.swing.JButton btnMascota1;
    private javax.swing.JButton btnOtros;
    private javax.swing.JButton btnPollo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
