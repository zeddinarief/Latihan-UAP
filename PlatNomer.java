package LatihanPraktikum;

import java.awt.Color;

/**
 *
 * @author User
 */
public class PlatNomer extends javax.swing.JFrame {

    /**
     * Creates new form PlatNomer
     */
    String park[] = new String[8];
    int i;
    public PlatNomer() {
        initComponents();
        this.getContentPane().setBackground(Color.PINK);
        btnKeluar1.setVisible(false);
        btnKeluar2.setVisible(false);
        btnKeluar3.setVisible(false);
        btnKeluar4.setVisible(false);
        btnKeluar5.setVisible(false);
        btnKeluar6.setVisible(false);
        btnKeluar7.setVisible(false);
        btnKeluar8.setVisible(false);
        park[0] = "Parkir 1 kosong";
        park[1] = "Parkir 2 kosong";
        park[2] = "Parkir 3 kosong";
        park[3] = "Parkir 4 kosong";
        park[4] = "Parkir 5 kosong";
        park[5] = "Parkir 6 kosong";
        park[6] = "Parkir 7 kosong";
        park[7] = "Parkir 8 kosong";
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Platno = new javax.swing.JTextField();
        tampil = new javax.swing.JButton();
        btnMasuk1 = new javax.swing.JButton();
        btnMasuk2 = new javax.swing.JButton();
        btnKeluar1 = new javax.swing.JButton();
        btnKeluar2 = new javax.swing.JButton();
        btnMasuk3 = new javax.swing.JButton();
        btnMasuk4 = new javax.swing.JButton();
        btnKeluar3 = new javax.swing.JButton();
        btnKeluar4 = new javax.swing.JButton();
        btnMasuk5 = new javax.swing.JButton();
        btnMasuk6 = new javax.swing.JButton();
        btnMasuk7 = new javax.swing.JButton();
        btnMasuk8 = new javax.swing.JButton();
        btnKeluar5 = new javax.swing.JButton();
        btnKeluar6 = new javax.swing.JButton();
        btnKeluar7 = new javax.swing.JButton();
        btnKeluar8 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Sistem Parkir");

        jLabel2.setText("Nomor Plat :");

        Platno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlatnoActionPerformed(evt);
            }
        });

        tampil.setText("Tampilkan data");
        tampil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tampilActionPerformed(evt);
            }
        });

        btnMasuk1.setText("Masuk");
        btnMasuk1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMasuk1ActionPerformed(evt);
            }
        });

        btnMasuk2.setText("Masuk");
        btnMasuk2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMasuk2ActionPerformed(evt);
            }
        });

        btnKeluar1.setText("Keluar");
        btnKeluar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluar1ActionPerformed(evt);
            }
        });

        btnKeluar2.setText("Keluar");
        btnKeluar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluar2ActionPerformed(evt);
            }
        });

        btnMasuk3.setText("Masuk");
        btnMasuk3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMasuk3ActionPerformed(evt);
            }
        });

        btnMasuk4.setText("Masuk");
        btnMasuk4.setAlignmentX(10.0F);
        btnMasuk4.setAlignmentY(5.0F);
        btnMasuk4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMasuk4ActionPerformed(evt);
            }
        });

        btnKeluar3.setText("Keluar");
        btnKeluar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluar3ActionPerformed(evt);
            }
        });

        btnKeluar4.setText("Keluar");
        btnKeluar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluar4ActionPerformed(evt);
            }
        });

        btnMasuk5.setText("Masuk");
        btnMasuk5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMasuk5ActionPerformed(evt);
            }
        });

        btnMasuk6.setText("Masuk");
        btnMasuk6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMasuk6ActionPerformed(evt);
            }
        });

        btnMasuk7.setText("Masuk");
        btnMasuk7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMasuk7ActionPerformed(evt);
            }
        });

        btnMasuk8.setText("Masuk");
        btnMasuk8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMasuk8ActionPerformed(evt);
            }
        });

        btnKeluar5.setText("Keluar");
        btnKeluar5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluar5ActionPerformed(evt);
            }
        });

        btnKeluar6.setText("Keluar");
        btnKeluar6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluar6ActionPerformed(evt);
            }
        });

        btnKeluar7.setText("Keluar");
        btnKeluar7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluar7ActionPerformed(evt);
            }
        });

        btnKeluar8.setText("Keluar");
        btnKeluar8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluar8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tampil)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(114, 114, 114)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnKeluar6, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                                    .addComponent(btnMasuk2, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                                    .addComponent(btnKeluar2, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                                    .addComponent(btnMasuk6, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE))
                                .addGap(71, 71, 71)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnKeluar3, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                                    .addComponent(btnMasuk3, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                                    .addComponent(btnMasuk7, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                                    .addComponent(btnKeluar7, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnKeluar8, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                                    .addComponent(btnMasuk4, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                                    .addComponent(btnKeluar4, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                                    .addComponent(btnMasuk8, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btnMasuk1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                                        .addComponent(btnMasuk5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                                        .addComponent(btnKeluar1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                                        .addComponent(btnKeluar5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Platno, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(162, 162, 162)))
                        .addGap(34, 34, 34))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(236, 236, 236))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Platno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tampil))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnMasuk4, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnMasuk3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnMasuk2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMasuk1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnKeluar4, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnKeluar3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnKeluar2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnKeluar1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnMasuk8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnMasuk7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnMasuk6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMasuk5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnKeluar8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnKeluar7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnKeluar6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnKeluar5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PlatnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlatnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PlatnoActionPerformed

    private void btnMasuk1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMasuk1ActionPerformed
        park[0] = "Parkir 1 terisi kendaraan bernomor plat "+Platno.getText();
        btnMasuk1.setVisible(false);
        btnKeluar1.setVisible(true);
        Platno.setText("");
    }//GEN-LAST:event_btnMasuk1ActionPerformed

    private void btnKeluar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluar1ActionPerformed
        park[0] = "Parkir 1 kosong";
        btnKeluar1.setVisible(false);
        btnMasuk1.setVisible(true);
    }//GEN-LAST:event_btnKeluar1ActionPerformed

    private void btnMasuk2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMasuk2ActionPerformed
        park[1] = "Parkir 2 terisi kendaraan bernomor plat "+Platno.getText();
        btnMasuk2.setVisible(false);
        btnKeluar2.setVisible(true);
        Platno.setText("");
    }//GEN-LAST:event_btnMasuk2ActionPerformed

    private void btnKeluar6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluar6ActionPerformed
        park[5] = "Parkir 6 kosong";
        btnKeluar6.setVisible(false);
        btnMasuk6.setVisible(true);
    }//GEN-LAST:event_btnKeluar6ActionPerformed

    private void btnKeluar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluar2ActionPerformed
        park[1] = "Parkir 2 kosong";
        btnKeluar2.setVisible(false);
        btnMasuk2.setVisible(true);
    }//GEN-LAST:event_btnKeluar2ActionPerformed

    private void btnMasuk4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMasuk4ActionPerformed
        park[3] = "Parkir 4 terisi kendaraan bernomor plat "+Platno.getText();
        btnMasuk4.setVisible(false);
        btnKeluar4.setVisible(true);
        Platno.setText("");
    }//GEN-LAST:event_btnMasuk4ActionPerformed

    private void btnMasuk3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMasuk3ActionPerformed
        park[2] = "Parkir 3 terisi kendaraan bernomor plat "+Platno.getText();
        btnMasuk3.setVisible(false);
        btnKeluar3.setVisible(true);
        Platno.setText("");
    }//GEN-LAST:event_btnMasuk3ActionPerformed

    private void btnKeluar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluar3ActionPerformed
        park[2] = "Parkir 3 kosong";
        btnKeluar3.setVisible(false);
        btnMasuk3.setVisible(true);
    }//GEN-LAST:event_btnKeluar3ActionPerformed

    private void btnKeluar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluar4ActionPerformed
        park[3] = "Parkir 4 kosong";
        btnKeluar4.setVisible(false);
        btnMasuk4.setVisible(true);
    }//GEN-LAST:event_btnKeluar4ActionPerformed

    private void btnMasuk5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMasuk5ActionPerformed
        park[4] = "Parkir 5 terisi kendaraan bernomor plat "+Platno.getText();
        btnMasuk5.setVisible(false);
        btnKeluar5.setVisible(true);
        Platno.setText("");
    }//GEN-LAST:event_btnMasuk5ActionPerformed

    private void btnKeluar5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluar5ActionPerformed
        park[4] = "Parkir 5 kosong";
        btnKeluar5.setVisible(false);
        btnMasuk5.setVisible(true);
    }//GEN-LAST:event_btnKeluar5ActionPerformed

    private void btnMasuk6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMasuk6ActionPerformed
        park[5] = "Parkir 6 terisi kendaraan bernomor plat "+Platno.getText();
        btnMasuk6.setVisible(false);
        btnKeluar6.setVisible(true);
        Platno.setText("");
    }//GEN-LAST:event_btnMasuk6ActionPerformed

    private void btnMasuk7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMasuk7ActionPerformed
        park[6] = "Parkir 7 terisi kendaraan bernomor plat "+Platno.getText();
        btnMasuk7.setVisible(false);
        btnKeluar7.setVisible(true);
        Platno.setText("");
    }//GEN-LAST:event_btnMasuk7ActionPerformed

    private void btnKeluar7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluar7ActionPerformed
        park[6] = "Parkir 7 kosong";
        btnKeluar7.setVisible(false);
        btnMasuk7.setVisible(true);
    }//GEN-LAST:event_btnKeluar7ActionPerformed

    private void btnMasuk8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMasuk8ActionPerformed
        park[7] = "Parkir 8 terisi kendaraan bernomor plat "+Platno.getText();
        btnMasuk8.setVisible(false);
        btnKeluar8.setVisible(true);
        Platno.setText("");
    }//GEN-LAST:event_btnMasuk8ActionPerformed

    private void btnKeluar8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluar8ActionPerformed
        park[7] = "Parkir 8 kosong";
        btnKeluar8.setVisible(false);
        btnMasuk8.setVisible(true);
    }//GEN-LAST:event_btnKeluar8ActionPerformed

    private void tampilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tampilActionPerformed
        TampilParkir tp = new TampilParkir();
        TampilParkir.Tampilparkir.setText("Lahan parkir\n"+park[0]+"\n"+park[1]+"\n"+park[2]+"\n"+park[3]+"\n"+park[4]+"\n"+park[5]+"\n"+park[6]+"\n"+park[7]);
        tp.show();
    }//GEN-LAST:event_tampilActionPerformed

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
            java.util.logging.Logger.getLogger(PlatNomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlatNomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlatNomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlatNomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PlatNomer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Platno;
    private javax.swing.JButton btnKeluar1;
    private javax.swing.JButton btnKeluar2;
    private javax.swing.JButton btnKeluar3;
    private javax.swing.JButton btnKeluar4;
    private javax.swing.JButton btnKeluar5;
    private javax.swing.JButton btnKeluar6;
    private javax.swing.JButton btnKeluar7;
    private javax.swing.JButton btnKeluar8;
    private javax.swing.JButton btnMasuk1;
    private javax.swing.JButton btnMasuk2;
    private javax.swing.JButton btnMasuk3;
    private javax.swing.JButton btnMasuk4;
    private javax.swing.JButton btnMasuk5;
    private javax.swing.JButton btnMasuk6;
    private javax.swing.JButton btnMasuk7;
    private javax.swing.JButton btnMasuk8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton tampil;
    // End of variables declaration//GEN-END:variables
}
