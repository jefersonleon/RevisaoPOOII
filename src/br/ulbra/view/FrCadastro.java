/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ulbra.view;

import br.ulbra.model.Times;
import javax.swing.JOptionPane;

/**
 *
 * @author Jeferson
 */
public class FrCadastro extends javax.swing.JFrame {

    /**
     * Creates new form FrCadastro
     */
    public FrCadastro() {
        initComponents();
        setLocationRelativeTo(null);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtTime = new javax.swing.JTextField();
        btSalvar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtLista = new javax.swing.JTextArea();
        btListar = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 153, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CADASTRO DE TIMES DO BRASILEIRÃO");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 11, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("TIME");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 62, -1, -1));

        txtTime.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(txtTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 52, 225, 37));

        btSalvar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btSalvar.setText("SALVAR");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });
        jPanel1.add(btSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(298, 51, -1, 39));

        txtLista.setColumns(20);
        txtLista.setRows(5);
        jScrollPane1.setViewportView(txtLista);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 98, 340, 115));

        btListar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btListar.setText("Listar");
        btListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btListarActionPerformed(evt);
            }
        });
        jPanel1.add(btListar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 73, 40));

        btLimpar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });
        jPanel1.add(btLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 87, 40));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lupa.png"))); // NOI18N
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 230, 58, 38));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Pesquisar");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 185, 40));

        jButton2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton2.setText("Excluir");
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, -1, 40));

        jButton3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton3.setText("Editar");
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 300, -1, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 427, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 389, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   static Times bdTime = new Times();
    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        if (txtTime.getText().equals("") || txtTime.getText().equals(null)
                || txtTime.getText().length()<=2) {
            JOptionPane.showMessageDialog(null, "Insira um time antes de salvar!!");
        } else {
            bdTime.adicionar(txtTime.getText());
            txtLista.setText(bdTime.listarTimes());
        }
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btListarActionPerformed
        txtLista.setText(bdTime.listarTimes());
    }//GEN-LAST:event_btListarActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        txtLista.setText(null);

    }//GEN-LAST:event_btLimparActionPerformed

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
            java.util.logging.Logger.getLogger(FrCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btListar;
    private javax.swing.JButton btSalvar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextArea txtLista;
    private javax.swing.JTextField txtTime;
    // End of variables declaration//GEN-END:variables
}
