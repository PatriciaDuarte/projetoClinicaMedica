package visão;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import modeloConection.ConexaoBD;
import modeloDao.DaoMedico;
import modeloBeans.BeansMedico;
import modeloBeans.ModeloTabela;

public class FormMedico extends javax.swing.JFrame
{

    BeansMedico mod = new BeansMedico();
    DaoMedico control = new DaoMedico();
    ConexaoBD conex = new ConexaoBD();
    int flag = 0;
    
    public FormMedico()
    {
        setResizable(false);
        initComponents();
        preencherTabela("select *from medicos order by nome_medico");
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jFormattedTextFieldCrm = new javax.swing.JFormattedTextField();
        jTextFieldNome = new javax.swing.JTextField();
        jButtonNovo = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableMedicos = new javax.swing.JTable();
        jTextFieldPesquisa = new javax.swing.JTextField();
        jButtonPesquisar = new javax.swing.JButton();
        jComboBoxEspecialista = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jtCOD = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setText("Nome:");

        jLabel3.setText("CRM:");

        jLabel4.setText("Especialista:");

        jFormattedTextFieldCrm.setEnabled(false);

        jTextFieldNome.setEnabled(false);

        jButtonNovo.setText("Novo");
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
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

        jTableMedicos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableMedicos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMedicosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableMedicos);

        jTextFieldPesquisa.setToolTipText("");
        jTextFieldPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPesquisaActionPerformed(evt);
            }
        });

        jButtonPesquisar.setText("Pesquisar");
        jButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarActionPerformed(evt);
            }
        });

        jComboBoxEspecialista.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cirurgião", "Ginecologista", "Clínico Geral", "Cardiologista", "Urologista", "Neurologista", "Dermatologista", "Nutricionista", "Nutrologista", "Otorrinolaringologista" }));
        jComboBoxEspecialista.setEnabled(false);
        jComboBoxEspecialista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxEspecialistaActionPerformed(evt);
            }
        });

        jLabel5.setText("Id:");

        jtCOD.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)))
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextFieldPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonPesquisar))
                            .addComponent(jFormattedTextFieldCrm, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxEspecialista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jtCOD, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNovo)
                    .addComponent(jLabel5)
                    .addComponent(jtCOD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonCancelar)
                        .addGap(4, 4, 4)
                        .addComponent(jButtonEditar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jComboBoxEspecialista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jFormattedTextFieldCrm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonPesquisar))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonExcluir)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Cadastro de Médicos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(281, 281, 281)
                        .addComponent(jLabel1)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(139, 139, 139))
        );

        setSize(new java.awt.Dimension(716, 381));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxEspecialistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxEspecialistaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxEspecialistaActionPerformed

    private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarActionPerformed
        mod.setPesquisa(jTextFieldPesquisa.getText());
        BeansMedico model = control.buscaMedico(mod);
        jTextFieldNome.setText(model.getNome());
        jtCOD.setText(String.valueOf(model.getCodigo()));
        jFormattedTextFieldCrm.setText(String.valueOf(model.getCrm()));
        jComboBoxEspecialista.setSelectedItem(model.getEspecialidade());
        preencherTabela("select *from medicos where nome_medico like'%"+ mod.getPesquisa() + "%'");
    }//GEN-LAST:event_jButtonPesquisarActionPerformed

    private void jTextFieldPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPesquisaActionPerformed

    }//GEN-LAST:event_jTextFieldPesquisaActionPerformed

    private void jTableMedicosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMedicosMouseClicked
        String nome_medico = ""+jTableMedicos.getValueAt(jTableMedicos.getSelectedRow(), 1);
        conex.conexao();
        conex.executasql("select *from medicos where nome_medico='"+nome_medico+"'");
        try {
            conex.rs.first();
            jtCOD.setText(String.valueOf(conex.rs.getInt("cod_medico")));
            jTextFieldNome.setText(conex.rs.getString("nome_medico"));
            jComboBoxEspecialista.setSelectedItem(conex.rs.getString("especialidade_medico"));
            jFormattedTextFieldCrm.setText(conex.rs.getString("crm_medico"));
        } catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null,"Erro ao selecionar dados"+ ex);
        }

        conex.desconecta();
        jButtonEditar.setEnabled(true);
        jButtonExcluir.setEnabled(true);
    }//GEN-LAST:event_jTableMedicosMouseClicked

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        int resposta = 0;
        resposta = JOptionPane.showConfirmDialog(rootPane, "Deseja realmente excluir?");
        if( resposta == JOptionPane.YES_OPTION)
        {
            mod.setCodigo(Integer.parseInt(jtCOD.getText()));
            control.Excluir(mod);
            jtCOD.setText("");
            jTextFieldNome.setText("");
            jFormattedTextFieldCrm.setText("");
            jTextFieldNome.setEnabled(false);
            jFormattedTextFieldCrm.setEnabled(false);
            jComboBoxEspecialista.setEnabled(false);
            jButtonSalvar.setEnabled(false);
            jButtonNovo.setEnabled(true);
            jButtonCancelar.setEnabled(false);
            jButtonEditar.setEnabled(false);
            jButtonExcluir.setEnabled(false);
            preencherTabela("select *from medicos order by nome_medico");

        }
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        flag = 2;
        jTextFieldNome.setEnabled(true);
        jFormattedTextFieldCrm.setEnabled(true);
        jComboBoxEspecialista.setEnabled(true);
        jButtonSalvar.setEnabled(true);
        jButtonCancelar.setEnabled(true);
        jButtonEditar.setEnabled(false);
        jButtonNovo.setEnabled(false);
        jButtonExcluir.setEnabled(false);
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        jTextFieldNome.setEnabled(!true);
        jFormattedTextFieldCrm.setEnabled(!true);
        jComboBoxEspecialista.setEnabled(!true);
        jButtonSalvar.setEnabled(!true);
        jButtonCancelar.setEnabled(!true);
        jButtonNovo.setEnabled(true);
        jButtonEditar.setEnabled(false);
        jButtonExcluir.setEnabled(false);
        jTextFieldPesquisa.setEnabled(true);
        jButtonPesquisar.setEnabled(true);
        jtCOD.setText("");
        jTextFieldNome.setText("");
        jFormattedTextFieldCrm.setText("");

    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        if(jTextFieldNome.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Preencha o NOME para continuar.");
            jTextFieldNome.requestFocus();
        }else
        if(jFormattedTextFieldCrm.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Preencha o CRM para continuar.");
            jFormattedTextFieldCrm.requestFocus();
        }else
        if(flag == 1)
        {
            mod.setNome(jTextFieldNome.getText());
            mod.setEspecialidade((String) jComboBoxEspecialista.getSelectedItem());
            mod.setCrm(Integer.parseInt(jFormattedTextFieldCrm.getText()));
            control.Salvar(mod);
            jTextFieldNome.setText("");
            jFormattedTextFieldCrm.setText("");
            jTextFieldNome.setEnabled(false);
            jFormattedTextFieldCrm.setEnabled(false);
            jComboBoxEspecialista.setEnabled(false);
            jButtonSalvar.setEnabled(false);
            jButtonCancelar.setEnabled(false);
            preencherTabela("select *from medicos order by nome_medico");
        
        }else
        {
            mod.setCodigo(Integer.parseInt(jtCOD.getText()));
            mod.setNome(jTextFieldNome.getText());
            mod.setEspecialidade((String)jComboBoxEspecialista.getSelectedItem());
            mod.setCrm(Integer.parseInt(jFormattedTextFieldCrm.getText()));
            control.Editar(mod);
            jtCOD.setText("");
            jTextFieldNome.setText("");
            jFormattedTextFieldCrm.setText("");
            jTextFieldNome.setEnabled(false);
            jFormattedTextFieldCrm.setEnabled(false);
            jComboBoxEspecialista.setEnabled(false);
            jButtonSalvar.setEnabled(false);
            jButtonNovo.setEnabled(true);
            jButtonCancelar.setEnabled(false);
            preencherTabela("select *from medicos order by nome_medico");
       }
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        flag =1;
        jTextFieldNome.setEnabled(true);
        jFormattedTextFieldCrm.setEnabled(true);
        jComboBoxEspecialista.setEnabled(true);
        jButtonSalvar.setEnabled(true);
        jButtonCancelar.setEnabled(true);
        jTextFieldNome.setText("");
        jFormattedTextFieldCrm.setText("");
        jTextFieldPesquisa.setText("");
        jtCOD.setText("");
        jButtonEditar.setEnabled(false);
        jButtonExcluir.setEnabled(false);
        jTextFieldPesquisa.setEnabled(false);
        jButtonPesquisar.setEnabled(false);

    }//GEN-LAST:event_jButtonNovoActionPerformed
    
    public void preencherTabela(String Sql)
    {
        ArrayList dados = new ArrayList();
        String [] colunas = new String[]{"ID","Nome","Especialidade","Crm"};
        conex.conexao();
        conex.executasql(Sql);
        
        try{
            conex.rs.first();
            do{
                dados.add(new Object[]{conex.rs.getInt("cod_medico"),conex.rs.getString("nome_medico"),conex.rs.getString("especialidade_medico"),conex.rs.getInt("crm_medico")});
               }while(conex.rs.next());
        }catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(rootPane, "Busque por outro médico para preencher tabela!");
        }
        ModeloTabela modelo = new ModeloTabela(dados,colunas);
        jTableMedicos.setModel(modelo);
        jTableMedicos.getColumnModel().getColumn(0).setPreferredWidth(30);//Tamanho da coluna começa em 0 e a largura da coluna é 23 para o COD
        jTableMedicos.getColumnModel().getColumn(0).setResizable(false);//Usuário não vai poder aumentar o tamanho da coluna com o mouse
        jTableMedicos.getColumnModel().getColumn(1).setPreferredWidth(220); //Nome medico
        jTableMedicos.getColumnModel().getColumn(1).setResizable(false);
        jTableMedicos.getColumnModel().getColumn(2).setPreferredWidth(130);
        jTableMedicos.getColumnModel().getColumn(2).setResizable(false);//especialidade
        jTableMedicos.getColumnModel().getColumn(3).setPreferredWidth(109);//crm
        jTableMedicos.getColumnModel().getColumn(3).setResizable(false);
        jTableMedicos.getTableHeader().setReorderingAllowed(false);
        jTableMedicos.setAutoResizeMode(jTableMedicos.AUTO_RESIZE_OFF);//Usuário não vai redimensionar essa tabela
        jTableMedicos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);//Vai selecionar só um campo da tabela por vez
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
            java.util.logging.Logger.getLogger(FormMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormMedico().setVisible(true);
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
    private javax.swing.JComboBox<String> jComboBoxEspecialista;
    private javax.swing.JFormattedTextField jFormattedTextFieldCrm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableMedicos;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldPesquisa;
    private javax.swing.JTextField jtCOD;
    // End of variables declaration//GEN-END:variables
}
