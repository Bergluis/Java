/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeirainterfacegrafica;

import javax.swing.JOptionPane;
import jdk.nashorn.internal.scripts.JO;

/**
 *
 * @author aluno
 */
public class ExemploCheckRadio extends javax.swing.JFrame {

    /**
     * Creates new form ExemploCheckRadio
     */
    public ExemploCheckRadio() {
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

        BGOpcoes = new javax.swing.ButtonGroup();
        jLtituloCheck = new javax.swing.JLabel();
        jCBOpcao1 = new javax.swing.JCheckBox();
        jCBOpcao2 = new javax.swing.JCheckBox();
        jCBOpcao3 = new javax.swing.JCheckBox();
        jBVerificarCheck = new javax.swing.JButton();
        jBReiniciarCheck = new javax.swing.JButton();
        jLTituloRadio = new javax.swing.JLabel();
        jRBopcao1 = new javax.swing.JRadioButton();
        jRBOpcao2 = new javax.swing.JRadioButton();
        jRBOpcao3 = new javax.swing.JRadioButton();
        jBVerificarRadio = new javax.swing.JButton();
        jBReiniciarRadio = new javax.swing.JButton();
        jPFSenha = new javax.swing.JPasswordField();
        jLSenha = new javax.swing.JLabel();
        jBVerificarSenha = new javax.swing.JButton();
        jLUsuario = new javax.swing.JLabel();
        jTFUsuario = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLtituloCheck.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLtituloCheck.setText("DESEJA:");

        jCBOpcao1.setText("Opção 1");

        jCBOpcao2.setText("Opção 2");

        jCBOpcao3.setText("Opção 3");

        jBVerificarCheck.setText("Verificar Check");
        jBVerificarCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVerificarCheckActionPerformed(evt);
            }
        });

        jBReiniciarCheck.setText("Reiniciar Chek");
        jBReiniciarCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBReiniciarCheckActionPerformed(evt);
            }
        });

        jLTituloRadio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLTituloRadio.setText("Escolhe qual opção:");

        BGOpcoes.add(jRBopcao1);
        jRBopcao1.setText("Opção 1");

        BGOpcoes.add(jRBOpcao2);
        jRBOpcao2.setText("Opção 2");

        BGOpcoes.add(jRBOpcao3);
        jRBOpcao3.setText("Opção 3");

        jBVerificarRadio.setText("Verificar Radio");
        jBVerificarRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVerificarRadioActionPerformed(evt);
            }
        });

        jBReiniciarRadio.setText("Reiniciar Radio");
        jBReiniciarRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBReiniciarRadioActionPerformed(evt);
            }
        });

        jLSenha.setText("Senha:");

        jBVerificarSenha.setText("Verificar Senha");
        jBVerificarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVerificarSenhaActionPerformed(evt);
            }
        });

        jLUsuario.setText("Usuário");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(jLTituloRadio))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRBopcao1)
                                    .addComponent(jRBOpcao3)
                                    .addComponent(jRBOpcao2))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBVerificarRadio)
                        .addGap(53, 53, 53)
                        .addComponent(jBReiniciarRadio, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBVerificarCheck)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBReiniciarCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jCBOpcao1)
                                .addComponent(jCBOpcao2)
                                .addComponent(jCBOpcao3))
                            .addComponent(jLtituloCheck)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLUsuario)
                                .addGap(18, 18, 18)
                                .addComponent(jTFUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLSenha)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jBVerificarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jPFSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLtituloCheck)
                .addGap(18, 18, 18)
                .addComponent(jCBOpcao1)
                .addGap(4, 4, 4)
                .addComponent(jCBOpcao2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCBOpcao3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBVerificarCheck)
                    .addComponent(jBReiniciarCheck))
                .addGap(18, 18, 18)
                .addComponent(jLTituloRadio)
                .addGap(18, 18, 18)
                .addComponent(jRBopcao1)
                .addGap(18, 18, 18)
                .addComponent(jRBOpcao2)
                .addGap(18, 18, 18)
                .addComponent(jRBOpcao3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBVerificarRadio)
                    .addComponent(jBReiniciarRadio))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLUsuario)
                    .addComponent(jTFUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPFSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLSenha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBVerificarSenha)
                .addContainerGap(113, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBVerificarCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVerificarCheckActionPerformed
        // TODO add your handling code here:
        if (jCBOpcao1.isSelected()){
            JOptionPane.showMessageDialog(rootPane, "Opção 1 selecionada!");
        }
        if (jCBOpcao2.isSelected()){
            JOptionPane.showMessageDialog(rootPane, "Opção 2 selecionada!");
        }
        if (jCBOpcao3.isSelected()){
            JOptionPane.showMessageDialog(rootPane, "Opção 3 selecionada!");
        }
    }//GEN-LAST:event_jBVerificarCheckActionPerformed

    private void jBReiniciarCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBReiniciarCheckActionPerformed
        // TODO add your handling code here:
        jCBOpcao1.setSelected(false);
        jCBOpcao2.setSelected(false);
        jCBOpcao3.setSelected(false);

    }//GEN-LAST:event_jBReiniciarCheckActionPerformed

    private void jBVerificarRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVerificarRadioActionPerformed
        // TODO add your handling code here:
        if(jRBopcao1.isSelected()){
            JOptionPane.showMessageDialog(rootPane, "Opção 1 selecionada!");
        } else if (jRBOpcao2.isSelected()){
            JOptionPane.showMessageDialog(rootPane, "Opção 2 selecionada!");
        } else if (jRBOpcao3.isSelected()){
            JOptionPane.showMessageDialog(rootPane, "Opção 3 selecionada!");
        }
    }//GEN-LAST:event_jBVerificarRadioActionPerformed

    private void jBReiniciarRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBReiniciarRadioActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jBReiniciarRadioActionPerformed

    private void jBVerificarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVerificarSenhaActionPerformed
        // TODO add your handling code here:
        String usuario = jTFUsuario.getText();
        String senha = new String(jPFSenha.getPassword());
        if(usuario.equals("dayane") && senha.equals("123456")){
            JOptionPane.showMessageDialog(rootPane, "Parabéns! Você se superou!");
        } else{
              JOptionPane.showMessageDialog(rootPane, "Você errou, é um tapado");
        }
    }//GEN-LAST:event_jBVerificarSenhaActionPerformed

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
            java.util.logging.Logger.getLogger(ExemploCheckRadio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExemploCheckRadio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExemploCheckRadio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExemploCheckRadio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExemploCheckRadio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup BGOpcoes;
    private javax.swing.JButton jBReiniciarCheck;
    private javax.swing.JButton jBReiniciarRadio;
    private javax.swing.JButton jBVerificarCheck;
    private javax.swing.JButton jBVerificarRadio;
    private javax.swing.JButton jBVerificarSenha;
    private javax.swing.JCheckBox jCBOpcao1;
    private javax.swing.JCheckBox jCBOpcao2;
    private javax.swing.JCheckBox jCBOpcao3;
    private javax.swing.JLabel jLSenha;
    private javax.swing.JLabel jLTituloRadio;
    private javax.swing.JLabel jLUsuario;
    private javax.swing.JLabel jLtituloCheck;
    private javax.swing.JPasswordField jPFSenha;
    private javax.swing.JRadioButton jRBOpcao2;
    private javax.swing.JRadioButton jRBOpcao3;
    private javax.swing.JRadioButton jRBopcao1;
    private javax.swing.JTextField jTFUsuario;
    // End of variables declaration//GEN-END:variables
}
