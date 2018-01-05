package visão;

import modeloBeans.BeansAuxiliar;
import modeloDao.DaoAuxiliar;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import modeloConection.ConexaoBD;
import modeloBeans.ModeloTabela;

/**
 *
 * @author patricia
 */
public class FormAuxiliar extends javax.swing.JFrame {

    BeansAuxiliar mod = new BeansAuxiliar();
    DaoAuxiliar control = new DaoAuxiliar();
    ConexaoBD conex = new ConexaoBD();
    int flag = 0;
  
    public FormAuxiliar()
    {
        setResizable(false);
        initComponents();
        preencherTabela("select *from auxiliares order by nome_auxiliar");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldId = new javax.swing.JTextField();
        jTextFieldNome = new javax.swing.JTextField();
        jTextFieldIdade = new javax.swing.JTextField();
        jComboBoxCnh = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAuxiliares = new javax.swing.JTable();
        jButtonPesquisar = new javax.swing.JButton();
        jTextFieldPesquisa = new javax.swing.JTextField();
        jButtonSalvar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonNovo = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setText("Id.:");

        jLabel3.setText("Nome:");

        jLabel4.setText("Idade:");

        jLabel5.setText("CNH:");

        jTextFieldId.setEnabled(false);

        jTextFieldNome.setEnabled(false);

        jTextFieldIdade.setEnabled(false);

        jComboBoxCnh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sim", "Não" }));
        jComboBoxCnh.setEnabled(false);

        jTableAuxiliares.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableAuxiliares.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableAuxiliaresMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableAuxiliares);

        jButtonPesquisar.setText("Pesquisar");
        jButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarActionPerformed(evt);
            }
        });

        jButtonSalvar.setText("Salvar");
        jButtonSalvar.setEnabled(false);
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.setEnabled(false);
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jButtonNovo.setText("Novo");
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });

        jButtonEditar.setText("Editar");
        jButtonEditar.setEnabled(false);
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });

        jButtonExcluir.setText("Excluir");
        jButtonExcluir.setEnabled(false);
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButtonCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonNovo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldNome)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextFieldIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBoxCnh, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldId, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(48, 48, 48))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextFieldPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(36, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonSalvar, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jButtonNovo)
                                .addGap(38, 38, 38)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonExcluir))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextFieldIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jComboBoxCnh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonPesquisar)
                    .addComponent(jTextFieldPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Cadastro de Auxiliar Veterinário");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(601, 556));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        if(jTextFieldNome.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Preencha o NOME para continuar.");
            jTextFieldNome.requestFocus();
        }else
        if(jTextFieldIdade.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Preencha a idade para continuar.");
            jTextFieldIdade.requestFocus();
        }else
        if(flag == 1)
        {
            mod.setNome(jTextFieldNome.getText());
            mod.setCnh((String) jComboBoxCnh.getSelectedItem());
            mod.setIdade(Integer.parseInt(jTextFieldIdade.getText()));
            control.Salvar(mod);
            jTextFieldNome.setText("");
            jTextFieldIdade.setText("");
            jTextFieldNome.setEnabled(false);
            jTextFieldIdade.setEnabled(false);
            jComboBoxCnh.setEnabled(false);
            jButtonSalvar.setEnabled(false);
            jButtonCancelar.setEnabled(false);
            preencherTabela("select *from auxiliares order by nome_auxiliar");
        
        }else
        {
            mod.setCodigo(Integer.parseInt(jTextFieldId.getText()));
            mod.setNome(jTextFieldNome.getText());
            mod.setCnh((String)jComboBoxCnh.getSelectedItem());
            mod.setIdade(Integer.parseInt(jTextFieldIdade.getText()));
            control.Editar(mod);
            jTextFieldId.setText("");
            jTextFieldNome.setText("");
            jTextFieldIdade.setText("");
            jTextFieldNome.setEnabled(false);
            jTextFieldIdade.setEnabled(false);
            jComboBoxCnh.setEnabled(false);
            jButtonSalvar.setEnabled(false);
            jButtonNovo.setEnabled(true);
            jButtonCancelar.setEnabled(false);
            preencherTabela("select *from auxiliares order by nome_auxiliar");
       }
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarActionPerformed
        mod.setPesquisa(jTextFieldPesquisa.getText());
        BeansAuxiliar model = control.buscaAuxiliar(mod);
        jTextFieldNome.setText(model.getNome());
        jTextFieldId.setText(String.valueOf(model.getCodigo()));
        jTextFieldIdade.setText(String.valueOf(model.getIdade()));
        jComboBoxCnh.setSelectedItem(model.getCnh());
        preencherTabela("select *from auxiliares where nome_auxiliar like'%"+ mod.getPesquisa() + "%'");
    }//GEN-LAST:event_jButtonPesquisarActionPerformed

    private void jTableAuxiliaresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableAuxiliaresMouseClicked
         String nome_auxiliar = ""+jTableAuxiliares.getValueAt(jTableAuxiliares.getSelectedRow(), 1);
        conex.conexao();
        conex.executasql("select *from auxiliares where nome_auxiliar='"+nome_auxiliar+"'");
        try {
            conex.rs.first();
            jTextFieldId.setText(String.valueOf(conex.rs.getInt("cod_auxiliar")));
            jTextFieldNome.setText(conex.rs.getString("nome_auxiliar"));
            jComboBoxCnh.setSelectedItem(conex.rs.getString("cnh_auxiliar"));
            jTextFieldIdade.setText(conex.rs.getString("idade_auxiliar"));
        } catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null,"Erro ao selecionar dados"+ ex);
        }

        conex.desconecta();
        jButtonEditar.setEnabled(true);
        jButtonCancelar.setEnabled(true);
        jButtonExcluir.setEnabled(true);
        jButtonNovo.setEnabled(false);
    }//GEN-LAST:event_jTableAuxiliaresMouseClicked

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
       int resposta = 0;
        resposta = JOptionPane.showConfirmDialog(rootPane, "Deseja realmente excluir?");
        if( resposta == JOptionPane.YES_OPTION)
        {
            mod.setCodigo(Integer.parseInt(jTextFieldId.getText()));
            control.Excluir(mod);
            jTextFieldId.setText("");
            jTextFieldNome.setText("");
            jTextFieldIdade.setText("");
            jTextFieldNome.setEnabled(false);
            jTextFieldIdade.setEnabled(false);
            jComboBoxCnh.setEnabled(false);
            jButtonSalvar.setEnabled(false);
            jButtonNovo.setEnabled(true);
            jButtonCancelar.setEnabled(false);
            jButtonEditar.setEnabled(false);
            jButtonExcluir.setEnabled(false);
            preencherTabela("select *from auxiliares order by nome_auxiliar");

        }
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        flag = 2;
        jTextFieldNome.setEnabled(true);
        jTextFieldIdade.setEnabled(true);
        jComboBoxCnh.setEnabled(true);
        jButtonSalvar.setEnabled(true);
        jButtonCancelar.setEnabled(true);
        jButtonEditar.setEnabled(false);
        jButtonNovo.setEnabled(false);
        jButtonExcluir.setEnabled(false);
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        jTextFieldNome.setEnabled(!true);
        jTextFieldIdade.setEnabled(!true);
        jComboBoxCnh.setEnabled(!true);
        jButtonSalvar.setEnabled(!true);
        jButtonCancelar.setEnabled(!true);
        jButtonNovo.setEnabled(true);
        jButtonEditar.setEnabled(false);
        jButtonExcluir.setEnabled(false);
        jTextFieldPesquisa.setEnabled(true);
        jButtonPesquisar.setEnabled(true);
        jTextFieldId.setText("");
        jTextFieldNome.setText("");
        jTextFieldIdade.setText("");
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        flag =1;
        jTextFieldNome.setEnabled(true);
        jTextFieldIdade.setEnabled(true);
        jComboBoxCnh.setEnabled(true);
        jButtonSalvar.setEnabled(true);
        jButtonCancelar.setEnabled(true);
        jTextFieldNome.setText("");
        jTextFieldIdade.setText("");
        jTextFieldPesquisa.setText("");
        jTextFieldId.setText("");
        jButtonEditar.setEnabled(false);
        jButtonExcluir.setEnabled(false);
        jTextFieldPesquisa.setEnabled(false);
        jButtonPesquisar.setEnabled(false);
    }//GEN-LAST:event_jButtonNovoActionPerformed
 public void preencherTabela(String Sql)
    {
        ArrayList dados = new ArrayList();
        String [] colunas = new String[]{"ID","Nome","Idade","Cnh"};
        conex.conexao();
        conex.executasql(Sql);
        
        try{
            conex.rs.first();
            do{
                dados.add(new Object[]{conex.rs.getInt("cod_auxiliar"),conex.rs.getString("nome_auxiliar"),conex.rs.getInt("idade_auxiliar"),conex.rs.getString("cnh_auxiliar")});
               }while(conex.rs.next());
        }catch(SQLException ex)
        {
           // JOptionPane.showMessageDialog(rootPane, "Busque por outro auxiliar para preencher tabela!");
        }
        ModeloTabela modelo = new ModeloTabela(dados,colunas);
        jTableAuxiliares.setModel(modelo);
        jTableAuxiliares.getColumnModel().getColumn(0).setPreferredWidth(30);//Tamanho da coluna começa em 0 e a largura da coluna é 23 para o COD
        jTableAuxiliares.getColumnModel().getColumn(0).setResizable(false);//Usuário não vai poder aumentar o tamanho da coluna com o mouse
        jTableAuxiliares.getColumnModel().getColumn(1).setPreferredWidth(220); //Nome medico
        jTableAuxiliares.getColumnModel().getColumn(1).setResizable(false);
        jTableAuxiliares.getColumnModel().getColumn(2).setPreferredWidth(130);
        jTableAuxiliares.getColumnModel().getColumn(2).setResizable(false);//especialidade
        jTableAuxiliares.getColumnModel().getColumn(3).setPreferredWidth(102);//crm
        jTableAuxiliares.getColumnModel().getColumn(3).setResizable(false);
        jTableAuxiliares.getTableHeader().setReorderingAllowed(false);
        jTableAuxiliares.setAutoResizeMode(jTableAuxiliares.AUTO_RESIZE_OFF);//Usuário não vai redimensionar essa tabela
        jTableAuxiliares.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);//Vai selecionar só um campo da tabela por vez
        conex.desconecta();
    }
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
            java.util.logging.Logger.getLogger(FormAuxiliar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormAuxiliar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormAuxiliar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormAuxiliar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormAuxiliar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox<String> jComboBoxCnh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableAuxiliares;
    private javax.swing.JTextField jTextFieldId;
    private javax.swing.JTextField jTextFieldIdade;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldPesquisa;
    // End of variables declaration//GEN-END:variables
}
