
package visão;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import modeloBeans.BeansUsuario;
import modeloBeans.ModeloTabela;
import modeloConection.ConexaoBD;
import modeloDao.DaoUsuario;

/**
 *
 * @author patricia
 */
public class FormUsuario extends javax.swing.JFrame {

    BeansUsuario mod = new BeansUsuario();
    DaoUsuario dao = new DaoUsuario();
    ConexaoBD  conex = new ConexaoBD();
    int flag = 0;//Essa flag é para saber se o usuário está salvando ou alterando
    
    public FormUsuario()
    {
        initComponents();
        preencherTabela("select *from usuarios order by usu_nome");//Vai ordenar a tabela pelo nome do usuario
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldUsuario = new javax.swing.JTextField();
        jPasswordFieldSenha = new javax.swing.JPasswordField();
        jComboBoxTipo = new javax.swing.JComboBox<>();
        jButtonNovo = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jButtonAlterar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jTextFieldPesquisar = new javax.swing.JTextField();
        jButtonBuscar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableUsuarios = new javax.swing.JTable();
        jPasswordFieldConfSenha = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldCod = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setText("Usuário:");

        jLabel4.setText("Senha:");

        jLabel6.setText("Tipo:");

        jTextFieldUsuario.setEnabled(false);
        jTextFieldUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUsuarioActionPerformed(evt);
            }
        });

        jPasswordFieldSenha.setEnabled(false);

        jComboBoxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "usuário", "administrador", "recepcionista" }));
        jComboBoxTipo.setEnabled(false);

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

        jButtonAlterar.setText("Alterar");
        jButtonAlterar.setEnabled(false);
        jButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarActionPerformed(evt);
            }
        });

        jButtonExcluir.setText("Excluir");
        jButtonExcluir.setEnabled(false);
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.setEnabled(false);
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        jLabel7.setText("Confirma Senha:");

        jTableUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableUsuariosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableUsuarios);

        jPasswordFieldConfSenha.setEnabled(false);

        jLabel2.setText("Cod.:");

        jTextFieldCod.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                    .addComponent(jButtonSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonNovo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldCod, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPasswordFieldConfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextFieldPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonBuscar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPasswordFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNovo)
                    .addComponent(jLabel6)
                    .addComponent(jComboBoxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSalvar)
                    .addComponent(jLabel7)
                    .addComponent(jPasswordFieldConfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonCancelar)
                            .addComponent(jLabel4)
                            .addComponent(jPasswordFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonExcluir))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonBuscar))))
                .addGap(20, 20, 20)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Cadastro de Usuários");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(243, 243, 243)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(717, 461));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        flag = 1;
        jTextFieldUsuario.setEnabled(true);
        jComboBoxTipo.setEnabled(true);
        jPasswordFieldSenha.setEnabled(true);
        jPasswordFieldConfSenha.setEnabled(true);
        jButtonCancelar.setEnabled(true);
        jButtonSalvar.setEnabled(true);
        jTextFieldPesquisar.setEnabled(false);
        jButtonBuscar.setEnabled(false);
        jButtonNovo.setEnabled(false);
        jButtonCancelar.setEnabled(false);
         
        jTextFieldUsuario.setText("");
        jPasswordFieldSenha.setText("");
        jPasswordFieldConfSenha.setText("");
        jTextFieldCod.setText("");
       
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        if(jTextFieldUsuario.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Preencha o USUARIO para continuar.");
            jTextFieldUsuario.requestFocus();
        }else
        if(jPasswordFieldConfSenha.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Preencha o CONFIRMAR SENHA para continuar.");
            jPasswordFieldConfSenha.requestFocus();
        }else
        if(jPasswordFieldSenha.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Preencha a SENHA para continuar.");
            jPasswordFieldSenha.requestFocus();
        }else
        if(jPasswordFieldSenha.getText().equals(jPasswordFieldConfSenha.getText()))
        {
            if(flag == 1)
            {
                mod.setUsuNome(jTextFieldUsuario.getText());
                mod.setUsuTipo((String) jComboBoxTipo.getSelectedItem());
                mod.setUsuSenha(jPasswordFieldSenha.getText());
                dao.Salvar(mod);
                preencherTabela("select *from usuarios order by usu_nome");
                jTextFieldUsuario.setText("");
                jPasswordFieldSenha.setText("");
                jPasswordFieldConfSenha.setText("");
                jTextFieldUsuario.setEnabled(false);
                jPasswordFieldConfSenha.setEnabled(false);
                jPasswordFieldSenha.setEnabled(false);
                jButtonNovo.setEnabled(true);
                jTextFieldCod.setText("");
                jButtonCancelar.setEnabled(false);
            
            }else
            {
                mod.setUsuCod(Integer.parseInt(jTextFieldCod.getText()));
                mod.setUsuNome(jTextFieldUsuario.getText());
                mod.setUsuTipo((String) jComboBoxTipo.getSelectedItem());
                mod.setUsuSenha(jPasswordFieldSenha.getText());
                dao.Alterar(mod);
                preencherTabela("select *from usuarios order by usu_nome");
                jTextFieldUsuario.setText("");
                jPasswordFieldSenha.setText("");
                jPasswordFieldConfSenha.setText("");
                jTextFieldUsuario.setEnabled(false);
                jPasswordFieldConfSenha.setEnabled(false);
                jPasswordFieldSenha.setEnabled(false);
                jButtonNovo.setEnabled(true);
                jTextFieldCod.setText("");
                jButtonAlterar.setEnabled(false);
                jButtonCancelar.setEnabled(false);
            }
        }else
        {
            JOptionPane.showMessageDialog(rootPane, "As senhas não correspondem!");
        }
    }//GEN-LAST:event_jButtonSalvarActionPerformed
    
    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        mod.setUsuPesquisa(jTextFieldPesquisar.getText());
        BeansUsuario model = dao.buscaUsuario(mod);
        jTextFieldCod.setText(String.valueOf(model.getUsuCod()));
        jTextFieldUsuario.setText(model.getUsuNome());
        jPasswordFieldSenha.setText(model.getUsuSenha());
        jPasswordFieldConfSenha.setText(model.getUsuSenha());
        jComboBoxTipo.setSelectedItem(model.getUsuTipo());
        jButtonAlterar.setEnabled(!true);
        jButtonExcluir.setEnabled(!true);
        jButtonCancelar.setEnabled(false);
        jButtonNovo.setEnabled(true);
         preencherTabela("select *from usuarios where usu_nome like'%"+ mod.getUsuPesquisa()+ "%'");
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jTextFieldUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUsuarioActionPerformed

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
        flag = 2;
        jTextFieldUsuario.setEnabled(true);
        jComboBoxTipo.setEnabled(true);
        jPasswordFieldSenha.setEnabled(true);
        jPasswordFieldConfSenha.setEnabled(true);
        jButtonSalvar.setEnabled(true);
        jButtonExcluir.setEnabled(false);
        jButtonAlterar.setEnabled(false);
    }//GEN-LAST:event_jButtonAlterarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
         int resposta = 0;
        resposta = JOptionPane.showConfirmDialog(rootPane, "Deseja realmente excluir?");
        if( resposta == JOptionPane.YES_OPTION)
        {
            mod.setUsuCod(Integer.parseInt(jTextFieldCod.getText()));
            dao.Excluir(mod);
            preencherTabela("select *from usuarios order by usu_nome");
       
            jTextFieldUsuario.setText("");
            jPasswordFieldSenha.setText("");
            jPasswordFieldConfSenha.setText("");
            jTextFieldCod.setText("");
        
            jButtonAlterar.setEnabled(false);
            jButtonCancelar.setEnabled(false);
            jButtonNovo.setEnabled(true);
            jButtonExcluir.setEnabled(false);
        }
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
       jTextFieldUsuario.setEnabled(!true);
        jComboBoxTipo.setEnabled(!true);
        jPasswordFieldSenha.setEnabled(!true);
        jPasswordFieldConfSenha.setEnabled(!true);
        jButtonCancelar.setEnabled(!true);
        jButtonSalvar.setEnabled(!true);
        jTextFieldPesquisar.setEnabled(!false);
        jButtonBuscar.setEnabled(!false);
        jButtonNovo.setEnabled(true);
        jButtonExcluir.setEnabled(false);
        jButtonAlterar.setEnabled(false);
        jTextFieldUsuario.setText("");
        jPasswordFieldSenha.setText("");
        jPasswordFieldConfSenha.setText("");
        jTextFieldCod.setText("");
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jTableUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableUsuariosMouseClicked
        String nome_usuario = ""+jTableUsuarios.getValueAt(jTableUsuarios.getSelectedRow(), 1);
        conex.conexao();
        conex.executasql("select *from usuarios where usu_nome='"+nome_usuario+"'");
        try {
            conex.rs.first();
            jTextFieldCod.setText(String.valueOf(conex.rs.getInt("usu_codigo")));
            jTextFieldUsuario .setText(conex.rs.getString("usu_nome"));
            jComboBoxTipo.setSelectedItem(conex.rs.getString("usu_tipo"));
            jPasswordFieldSenha.setText(conex.rs.getString("usu_senha"));
            jPasswordFieldConfSenha.setText(conex.rs.getString("usu_senha"));
        } catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null,"Erro ao selecionar dados"+ ex);
        }

        conex.desconecta();
        jButtonNovo.setEnabled(false);
        jButtonAlterar.setEnabled(true);
        jButtonExcluir.setEnabled(true);
        jButtonCancelar.setEnabled(true);
        jButtonSalvar.setEnabled(false);
        jTextFieldCod.setEnabled(false);
        jTextFieldUsuario.setEnabled(false);
        jPasswordFieldSenha.setEnabled(false);
        jPasswordFieldSenha.setEnabled(false);
        jComboBoxTipo.setEnabled(false);
    }//GEN-LAST:event_jTableUsuariosMouseClicked
    
    public void preencherTabela(String Sql)
    {
        ArrayList dados = new ArrayList();
        String [] colunas = new String[]{"ID","Usuário","Senha","Tipo"};
        conex.conexao();
        conex.executasql(Sql);
        
        try{
            conex.rs.first();
            do{
                dados.add(new Object[]{conex.rs.getInt("usu_codigo"),conex.rs.getString("usu_nome"),conex.rs.getString("usu_senha"),conex.rs.getString("usu_tipo")});
               }while(conex.rs.next());
        }catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(rootPane, "Busque por outro médico para preencher tabela!");
        }
        ModeloTabela modelo = new ModeloTabela(dados,colunas);
        jTableUsuarios.setModel(modelo);
        jTableUsuarios.getColumnModel().getColumn(0).setPreferredWidth(30);//Tamanho da coluna começa em 0 e a largura da coluna é 23 para o COD
        jTableUsuarios.getColumnModel().getColumn(0).setResizable(false);//Usuário não vai poder aumentar o tamanho da coluna com o mouse
        jTableUsuarios.getColumnModel().getColumn(1).setPreferredWidth(220); //Nome medico
        jTableUsuarios.getColumnModel().getColumn(1).setResizable(false);
        jTableUsuarios.getColumnModel().getColumn(2).setPreferredWidth(130);
        jTableUsuarios.getColumnModel().getColumn(2).setResizable(false);//especialidade
        jTableUsuarios.getColumnModel().getColumn(3).setPreferredWidth(109);//crm
        jTableUsuarios.getColumnModel().getColumn(3).setResizable(false);
        jTableUsuarios.getTableHeader().setReorderingAllowed(false);
        jTableUsuarios.setAutoResizeMode(jTableUsuarios.AUTO_RESIZE_OFF);//Usuário não vai redimensionar essa tabela
        jTableUsuarios.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);//Vai selecionar só um campo da tabela por vez
        conex.desconecta();
    }
    
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox<String> jComboBoxTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordFieldConfSenha;
    private javax.swing.JPasswordField jPasswordFieldSenha;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableUsuarios;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextFieldCod;
    private javax.swing.JTextField jTextFieldPesquisar;
    private javax.swing.JTextField jTextFieldUsuario;
    // End of variables declaration//GEN-END:variables
}
