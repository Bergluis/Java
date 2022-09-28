/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Luis
 */
public class Disciplinas extends javax.swing.JFrame {

    int global;

    DefaultTableModel model;
    int x = 0;

    Conexao con;
    Statement st;
    
    public Disciplinas() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    public void consulta() {
        int x = 0;
        model.setNumRows(0);
        String consulta = "select * from disciplinas";

        int v1 = 0, v2 = 0, v3 = 0, v4 = 0;
       
        if (!campoCodigo.getText().equals("")) {
            v1 = 1;
        }
        if (!campoNome.getText().equals("")) {
            v2 = 1;
        }   
        if (!campoCarga.getText().equals("")) {
            v3 = 1;
        }
        
        if (v1 == 1 || v2 == 1 || v3 == 1) {
            consulta = consulta + " where ";
        }
        if (v1 == 1) {
            x++;
            consulta = consulta + "COD_DISC like '%" + campoCodigo.getText() + "%'";
        }
        if (v2 == 1) {
            if (x != 0) {
                consulta = consulta + " and ";
            }
            consulta = consulta + "nome_disc like '%" + campoNome.getText() + "%'";
            x++;
        }
        if (v3 == 1) {
            if (x != 0) {
                consulta = consulta + " and ";
            }
            consulta = consulta + "carga_hor like '%" + campoCarga.getText() + "%'";
            x++;
        }
        try {
            st.executeQuery(consulta);
            ResultSet rs = st.getResultSet();

            while (rs.next()) {
                String codigo = rs.getString("COD_DISC");
                String nome = rs.getString("nome_disc");
                String carga = rs.getString("carga_hor");
                model.addRow(new Object[]{codigo, nome, carga});

            }

        } catch (SQLException ex) {
            System.err.println("Deu pau no MYSQL!");
        }

        limpacampos();
    }

    public void mudabotoes(boolean btcadastrar, boolean bteditar, boolean btsalvar, boolean btexcluir, boolean btconsultar, boolean editis) {
        btCadastrar.setEnabled(btcadastrar);
        btEditar.setEnabled(bteditar);
        btSalvar.setEnabled(btsalvar);
        btExcluir.setEnabled(btexcluir);
        btConsultar.setEnabled(btconsultar);
        campoNome.setEnabled(true);
        campoCodigo.setEnabled(editis);
        campoCarga.setEnabled(true);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        campoCodigo = new javax.swing.JTextField();
        campoNome = new javax.swing.JTextField();
        campoCarga = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btCadastrar = new javax.swing.JButton();
        btEditar = new javax.swing.JButton();
        btSalvar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btConsultar = new javax.swing.JButton();
        cbBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Codigo:");

        jLabel2.setText("Nome:");

        jLabel3.setText("Carga Horária:");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Codigo", "Nome", "Carga Horária"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        btCadastrar.setText("Cadastrar");
        btCadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btCadastrarMouseClicked(evt);
            }
        });

        btEditar.setText("Editar");
        btEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btEditarMouseClicked(evt);
            }
        });

        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        btCancelar.setText("Cancelar");
        btCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btCancelarMouseClicked(evt);
            }
        });

        btExcluir.setText("Excluir");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        btConsultar.setText("Consultar");
        btConsultar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btConsultarMouseClicked(evt);
            }
        });

        cbBack.setText("<<");
        cbBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbBackMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(13, Short.MAX_VALUE)
                        .addComponent(btCadastrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btConsultar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campoCarga, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(cbBack))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(cbBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(campoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(campoCarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCadastrar)
                    .addComponent(btEditar)
                    .addComponent(btSalvar)
                    .addComponent(btCancelar)
                    .addComponent(btExcluir)
                    .addComponent(btConsultar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
        Conexao con;
        try {
            con = new Conexao();
            st = con.conexao.createStatement();
        } catch (SQLException ex) {
            System.out.println("Deu erro no mysql.");
        }
 
        model = (DefaultTableModel) jTable1.getModel();
        model.setNumRows(0);

        mudabotoes(true, true, false, true, true, false);
        consulta();

    }//GEN-LAST:event_formWindowOpened

    private void btConsultarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btConsultarMouseClicked
        consulta();
    }//GEN-LAST:event_btConsultarMouseClicked

    private void btCadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCadastrarMouseClicked
        mudabotoes(false, false, true, false, false, true);
        global=1;
        campoCodigo.requestFocus();
        limpacampos();
    }//GEN-LAST:event_btCadastrarMouseClicked

    private void btCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCancelarMouseClicked
        mudabotoes(true, true, false, true, true, false);
        limpacampos();
    }//GEN-LAST:event_btCancelarMouseClicked

    private void btEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btEditarMouseClicked
        mudabotoes(false, false, true, false, false, false);
        global = 2;
        jTable1.setEnabled(false);
    }//GEN-LAST:event_btEditarMouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        campoNome.setEnabled(true);

        int p = jTable1.getSelectedRow();
        campoCodigo.setText((String) jTable1.getValueAt(p, 0));
        campoNome.setText((String) jTable1.getValueAt(p, 1));
        campoCarga.setText((String) jTable1.getValueAt(p, 2));
    }//GEN-LAST:event_jTable1MouseClicked

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        int conf = 0;
        try {
            st.executeQuery("select * from historico where COD_DISC = '" + campoCodigo.getText() + "';");
            ResultSet rs = st.getResultSet();

            while (rs.next()) {
                conf = 1;
            }
        } catch (SQLException ex) {
            System.err.println("Deu pau no MYSQL!");
        }

        if (conf == 0) {
            int opcao=JOptionPane.showConfirmDialog(null, "Deseja realmente apagar " + campoNome.getText() + " ?");
            if (opcao == 0) { //if 1
                try {
                    st.executeUpdate("delete from disciplinas where COD_DISC = '" + campoCodigo.getText() + "';");
                    mudabotoes(true, true, false, true, true, false);
                    limpacampos();
                    consulta();
                } catch (SQLException ex) {
                    System.out.println("deu erro no DELETS ");
                }
            } 
        } else {
            JOptionPane.showMessageDialog(null, "Esta disciplina contem dados no histórico, logo nao pode ser apagada.");
        }
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        if (global == 1) {
            if (campoCodigo.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Digite um codigo, nao pode ser nulo");
            } else if (campoNome.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Digite um nome, nao pode ser nulo");
            } else if (campoCarga.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Digite uma carga horaria pra materia.");
            } else {
                try {
                    st.executeUpdate("insert into disciplinas (COD_DISC,nome_disc,carga_hor) values ('" + campoCodigo.getText() + "','" + campoNome.getText() + "'," + Integer.parseInt(campoCarga.getText()) + ");");
                    mudabotoes(true, true, false, true, true, false);
                    jTable1.setEnabled(true);
                } catch (SQLException ex) {
                    System.out.println("deu erro no inserte ");
                }
            }
        }else{
            if (campoCodigo.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Digite um codigo, nao pode ser nulo");
            } else if (campoNome.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Digite um nome, nao pode ser nulo");
            } else if (campoCarga.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Digite uma carga horaria pra materia.");
            } else {
                try {
                    st.executeUpdate("update disciplinas set nome_disc = '" + campoNome.getText() + "', carga_hor = '" + Integer.parseInt(campoCarga.getText()) + "' where COD_DISC like '" + campoCodigo.getText() + "';");
                    mudabotoes(true, true, false, true, true, false);
                    jTable1.setEnabled(true);
                } catch (SQLException ex) {
                    System.out.println("deu erro no Update");
                }
            }

        }
        limpacampos();
        consulta();
    }//GEN-LAST:event_btSalvarActionPerformed

    private void cbBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbBackMouseClicked
        Principal p = new Principal();
        p.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cbBackMouseClicked

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
            java.util.logging.Logger.getLogger(Disciplinas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Disciplinas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Disciplinas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Disciplinas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Disciplinas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btConsultar;
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btSalvar;
    private javax.swing.JTextField campoCarga;
    private javax.swing.JTextField campoCodigo;
    private javax.swing.JTextField campoNome;
    private javax.swing.JButton cbBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
    private void limpacampos() {
        campoCodigo.setText("");
        campoNome.setText("");
        campoCarga.setText("");
    }
}
