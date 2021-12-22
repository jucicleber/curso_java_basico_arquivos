/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursojava;

/**
 *
 * @author jucic
 */
public class telaTriangulo extends javax.swing.JFrame {

    /**
     * Creates new form telaTriangulo
     */
    public telaTriangulo() {
        initComponents();
        painelRes.setVisible(false);
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
        jLabel3 = new javax.swing.JLabel();
        segA = new javax.swing.JSlider();
        segB = new javax.swing.JSlider();
        segC = new javax.swing.JSlider();
        vlrA = new javax.swing.JLabel();
        vlrC = new javax.swing.JLabel();
        vlrB = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnVer = new javax.swing.JButton();
        painelRes = new javax.swing.JPanel();
        formTri = new javax.swing.JLabel();
        result = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Segmento A:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Segmento B:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Segmento c:");

        segA.setMaximum(20);
        segA.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                segAStateChanged(evt);
            }
        });

        segB.setMaximum(20);
        segB.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                segBStateChanged(evt);
            }
        });

        segC.setMaximum(20);
        segC.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                segCStateChanged(evt);
            }
        });

        vlrA.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        vlrA.setText("0");

        vlrC.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        vlrC.setText("0");

        vlrB.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        vlrB.setText("0");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/triangulo.png"))); // NOI18N
        jLabel7.setText("jLabel7");
        jLabel7.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        btnVer.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnVer.setText("Verificar");
        btnVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerActionPerformed(evt);
            }
        });

        formTri.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        formTri.setForeground(new java.awt.Color(255, 51, 51));
        formTri.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        formTri.setText("Forma ou não?");

        result.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        result.setForeground(new java.awt.Color(255, 0, 51));
        result.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        result.setText("Resultado!!!");

        javax.swing.GroupLayout painelResLayout = new javax.swing.GroupLayout(painelRes);
        painelRes.setLayout(painelResLayout);
        painelResLayout.setHorizontalGroup(
            painelResLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelResLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelResLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(formTri, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)
                    .addComponent(result, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        painelResLayout.setVerticalGroup(
            painelResLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelResLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(formTri)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(result)
                .addGap(52, 52, 52))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(segC, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(segB, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(vlrB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(vlrC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(segA, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(vlrA, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(221, 221, 221)
                        .addComponent(btnVer)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(painelRes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(segA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(vlrA, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(56, 56, 56)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(segB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(vlrB))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(segC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(vlrC))))))
                .addGap(63, 63, 63)
                .addComponent(btnVer)
                .addGap(18, 18, 18)
                .addComponent(painelRes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerActionPerformed
        // TODO add your handling code here:
        int a = segA.getValue();
        int b = segB.getValue();
        int c = segC.getValue();
        if (a < b + c && b < a + c && c < a + b) {
            formTri.setText("Formam um trinagulo!!!");
            if (a == b && b == c) {
                result.setText("Equilatero!!!");
            } else if (a != b && b != c && a != c) {
                result.setText("Escaleno!!!");
            } else {
                result.setText("Isosceles!!!");
            }
        } else {
            formTri.setText("Não formamum triangulo!!!");
            result.setText("Não tem tipo");
        }
        painelRes.setVisible(true);
    }//GEN-LAST:event_btnVerActionPerformed
    
    private void segAStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_segAStateChanged
        // TODO add your handling code here:
        vlrA.setText(Integer.toString(segA.getValue()));
        
    }//GEN-LAST:event_segAStateChanged
    
    private void segBStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_segBStateChanged
        // TODO add your handling code here:
        vlrB.setText(Integer.toString(segB.getValue()));
    }//GEN-LAST:event_segBStateChanged
    
    private void segCStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_segCStateChanged
        // TODO add your handling code here:
        vlrC.setText(Integer.toString(segC.getValue()));
    }//GEN-LAST:event_segCStateChanged

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
            java.util.logging.Logger.getLogger(telaTriangulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaTriangulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaTriangulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaTriangulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaTriangulo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVer;
    private javax.swing.JLabel formTri;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel painelRes;
    private javax.swing.JLabel result;
    private javax.swing.JSlider segA;
    private javax.swing.JSlider segB;
    private javax.swing.JSlider segC;
    private javax.swing.JLabel vlrA;
    private javax.swing.JLabel vlrB;
    private javax.swing.JLabel vlrC;
    // End of variables declaration//GEN-END:variables
}
