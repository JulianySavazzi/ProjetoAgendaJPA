/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa.view;

import java.util.List;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import jpa.data.TarefasData;
import jpa.data.TarefasJpaController;
import jpa.model.Tarefas;

/**
 *
 * @author julianysavazzi
 */
public class JFTarefas extends javax.swing.JFrame {

    private int acao;
    private Tarefas obj;
    private TarefasData DAO;
    private TarefasJpaController DAOcontroller;
    EntityManagerFactory objFactory = Persistence.createEntityManagerFactory("ProjetoAgendaJPAPU");
    TarefasJpaController control = new TarefasJpaController(objFactory);
    List<Tarefas> listaTarefas = control.findTarefasEntities();

    /**
     * Creates new form JFTarefas
     */
    public JFTarefas() {
        initComponents();
        obj = new Tarefas();
        try {
            DAO = new TarefasData();
            DAOcontroller = new TarefasJpaController();
            acao = 0;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Erro: " + ex.getMessage(), "Inicialização", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbNovo = new javax.swing.JButton();
        jbSalvar = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();
        jbEditar = new javax.swing.JButton();
        jbExcluir = new javax.swing.JButton();
        jlTitulo = new javax.swing.JLabel();
        jlId = new javax.swing.JLabel();
        jlDesc = new javax.swing.JLabel();
        jlIdtext = new javax.swing.JLabel();
        jtDesc = new javax.swing.JTextField();
        jlPesquisa = new javax.swing.JLabel();
        jtPesquisa = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbPesquisa = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jbNovo.setText("Novo");
        jbNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNovoActionPerformed(evt);
            }
        });

        jbSalvar.setText("Salvar");
        jbSalvar.setEnabled(false);
        jbSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarActionPerformed(evt);
            }
        });

        jbCancelar.setText("Cancelar");
        jbCancelar.setEnabled(false);
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

        jbEditar.setText("Editar");
        jbEditar.setEnabled(false);
        jbEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEditarActionPerformed(evt);
            }
        });

        jbExcluir.setText("Excluir");
        jbExcluir.setEnabled(false);
        jbExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExcluirActionPerformed(evt);
            }
        });

        jlTitulo.setText("Tarefas");

        jlId.setText("Id");

        jlDesc.setText("Descrição");

        jlIdtext.setText("0");
        jlIdtext.setEnabled(false);

        jtDesc.setEnabled(false);

        jlPesquisa.setText("Pesquisar");

        jtPesquisa.setToolTipText("");
        jtPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtPesquisaActionPerformed(evt);
            }
        });
        jtPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtPesquisaKeyReleased(evt);
            }
        });

        jtbPesquisa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Descricao"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtbPesquisa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtbPesquisaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtbPesquisa);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlTitulo)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlDesc)
                                    .addComponent(jlId)
                                    .addComponent(jlPesquisa))
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtDesc, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
                                    .addComponent(jlIdtext)
                                    .addComponent(jtPesquisa)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jbNovo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbExcluir)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlTitulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlId)
                    .addComponent(jlIdtext))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlDesc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlPesquisa)
                    .addComponent(jtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbNovo)
                    .addComponent(jbSalvar)
                    .addComponent(jbCancelar)
                    .addComponent(jbEditar)
                    .addComponent(jbExcluir))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNovoActionPerformed
        // TODO add your handling code here:
        Extras.Validacao.limparCampos(this);
        Extras.Validacao.tratarCampos(this, true);
        jbNovo.setEnabled(false);
        jbSalvar.setEnabled(true);
        jbCancelar.setEnabled(true);
        jbEditar.setEnabled(false);
        jbExcluir.setEnabled(false);
        acao = 1;
    }//GEN-LAST:event_jbNovoActionPerformed

    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed
        // TODO add your handling code here:
        try {
            if (Extras.Validacao.validarCampos(this)) {
                if (preencherObjeto()) {
                    DAO.persist(obj);
                    if (acao == 1) {
                        control.create(obj);
                        for (Tarefas t : listaTarefas) {
                            t.setId(Integer.parseInt(jlIdtext.getText()));
                            t.setDescricao(jtDesc.getText());
                        }
//                        if (control.create(obj)) {
                        JOptionPane.showMessageDialog(this, "Salvo com sucesso!");
                        jbCancelarActionPerformed(evt);
//                        }
                    }
                    if (acao == 2) {
                        control.edit(obj);
                        for (Tarefas t : listaTarefas) {
                            t.setId(Integer.parseInt(jlIdtext.getText()));
                            t.setDescricao(jtDesc.getText());
                        }
//                        if (DAOcontroller.edit(obj)) {
                        JOptionPane.showMessageDialog(this, "Atualizado com sucesso!");
                        jbCancelarActionPerformed(evt);
//                        }
                    }
                }
                //JOptionPane.showMessageDialog(this, "Campos ok!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro:" + e.getMessage(), "Salvar", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbSalvarActionPerformed

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        // TODO add your handling code here:
        Extras.Validacao.limparCampos(this);
        Extras.Validacao.tratarCampos(this, false);
        jbNovo.setEnabled(true);
        jbSalvar.setEnabled(false);
        jbCancelar.setEnabled(false);
        jbEditar.setEnabled(false);
        jbExcluir.setEnabled(false);
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void jbEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEditarActionPerformed
        // TODO add your handling code here:
        acao = 2;
        jtDesc.setEnabled(true);
        jbSalvar.setEnabled(true);
        jbCancelar.setEnabled(true);
        jbNovo.setEnabled(false);
        jbEditar.setEnabled(false);
        jbExcluir.setEnabled(false);
    }//GEN-LAST:event_jbEditarActionPerformed

    private void jbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirActionPerformed
        // TODO add your handling code here:
        try {
            DAO.persist(obj);
            control.destroy(Integer.parseInt(jlIdtext.getText()));
//            if (DAOcontroller.destroy(Integer.parseInt(jlIdtext.getText()))) {
            JOptionPane.showMessageDialog(this, "Excluído.");
            jbCancelarActionPerformed(evt);
//            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao excluir: " + e.getMessage());
        }
    }//GEN-LAST:event_jbExcluirActionPerformed

    private void jtPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtPesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtPesquisaActionPerformed

    private void jtPesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtPesquisaKeyReleased
        // TODO add your handling code here:
        try {
            DefaultTableModel mp = (DefaultTableModel) jtbPesquisa.getModel();
            mp.setNumRows(0);
            DAO.persist(obj);
            control.findTarefas(Integer.parseInt(jlIdtext.getText()));
            for (Tarefas t : listaTarefas) {
                mp.addRow(new String[]{String.valueOf(t.getId()), t.getDescricao()});
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao pesquisar: " + e.getMessage());
        }
    }//GEN-LAST:event_jtPesquisaKeyReleased

    private void jtbPesquisaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbPesquisaMouseClicked
        // TODO add your handling code here:
        try {
            int linha = jtbPesquisa.getSelectedRow(); //não tinha antes
            if (linha > -1) { //não tinha antes
                jlIdtext.setText("" + listaTarefas.get(jtbPesquisa.getSelectedRow()).getId());
                jtDesc.setText(listaTarefas.get(jtbPesquisa.getSelectedRow()).getDescricao());

                jbEditar.setEnabled(true);
                jbExcluir.setEnabled(true);
                jbSalvar.setEnabled(false);

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao selecionar: " + e.getMessage());
        }
    }//GEN-LAST:event_jtbPesquisaMouseClicked

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFTarefas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new JFTarefas().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbEditar;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JButton jbNovo;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JLabel jlDesc;
    private javax.swing.JLabel jlId;
    private javax.swing.JLabel jlIdtext;
    private javax.swing.JLabel jlPesquisa;
    private javax.swing.JLabel jlTitulo;
    private javax.swing.JTextField jtDesc;
    private javax.swing.JTextField jtPesquisa;
    private javax.swing.JTable jtbPesquisa;
    // End of variables declaration//GEN-END:variables

    private boolean preencherObjeto() throws Exception {
        obj.setId(Integer.parseInt(jlIdtext.getText()));
        obj.setDescricao(jlDesc.getText());
        return true;
    }

}
