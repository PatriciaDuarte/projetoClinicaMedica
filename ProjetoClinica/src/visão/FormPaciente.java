package visão;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import modeloBeans.BeansPaciente;
import modeloBeans.ModeloTabela;
import modeloConection.ConexaoBD;
import modeloDao.DaoPaciente;

public class FormPaciente extends javax.swing.JFrame 
{
    ConexaoBD conex = new ConexaoBD();
    BeansPaciente pac = new BeansPaciente();
    DaoPaciente dao = new DaoPaciente();
     int flag=0;
     int resposta =0;
      
    public FormPaciente() 
    {
         initComponents();
         setResizable(false);
         preencherBairros();
         preencherTabela("select paci_codigo,paci_nome, paci_telefone, paci_rg, bainome from pacientes inner join bairro on paci_baicodigo = baicodigo order by paci_nome ");
    }
    public void preencherBairros()
    {
        conex.conexao();
        conex.executasql("select *from bairro order by bainome ");
        try {
            conex.rs.first();
            jComboBoxBairro.removeAllItems();
            do{
                jComboBoxBairro.addItem(conex.rs.getString("bainome"));
                
              }while(conex.rs.next());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao preencher bairros."+ex);
        }
        conex.desconecta();
    
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jFormattedTextFieldDtNasc = new javax.swing.JFormattedTextField();
        jFormattedTextFieldRG = new javax.swing.JFormattedTextField();
        jFormattedTextFieldTelefone = new javax.swing.JFormattedTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldRua = new javax.swing.JTextField();
        jFormattedTextFieldCep = new javax.swing.JFormattedTextField();
        jTextFieldComplemento = new javax.swing.JTextField();
        jComboBoxBairro = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePacientes = new javax.swing.JTable();
        jButtonNovo = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonAlterar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldPesquisa = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jButtonAnimal = new javax.swing.JButton();
        jButtonBuscar = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jTextFieldCodPac = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setText("Nome:");

        jLabel3.setText("Data de nascimento:");

        jLabel4.setText("RG.:");

        jLabel5.setText("Telefone:");

        jTextFieldNome.setEnabled(false);

        try {
            jFormattedTextFieldDtNasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldDtNasc.setEnabled(false);

        try {
            jFormattedTextFieldRG.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("######-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldRG.setEnabled(false);

        try {
            jFormattedTextFieldTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldTelefone.setEnabled(false);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel7.setText("Rua:");

        jLabel8.setText("CEP:");

        jLabel9.setText("Complemento:");

        jLabel10.setText("Bairro:");

        jTextFieldRua.setEnabled(false);

        try {
            jFormattedTextFieldCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldCep.setEnabled(false);

        jTextFieldComplemento.setEnabled(false);

        jComboBoxBairro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxBairro.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldRua, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                    .addComponent(jTextFieldComplemento))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jFormattedTextFieldCep)
                    .addComponent(jComboBoxBairro, 0, 146, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextFieldRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jFormattedTextFieldCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jTextFieldComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jLabel6.setText("Endereço:");

        jTablePacientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTablePacientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablePacientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTablePacientes);

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

        jLabel11.setText("Pesquisa:");

        jLabel12.setText("Inserir dados dos animais:");

        jButtonAnimal.setText("<<Clique aqui>>");
        jButtonAnimal.setEnabled(false);

        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        jLabel13.setText("Cod.:");

        jTextFieldCodPac.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jFormattedTextFieldRG, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel12)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButtonAnimal))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel13))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextFieldCodPac, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jFormattedTextFieldDtNasc)
                            .addComponent(jFormattedTextFieldTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE))
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 26, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButtonExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonSalvar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonNovo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonCancelar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonAlterar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldPesquisa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonBuscar))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jTextFieldCodPac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextFieldDtNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jFormattedTextFieldRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jButtonAnimal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jTextFieldPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jButtonSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonExcluir))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Formulário de Clientes");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(272, 272, 272)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(82, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(747, 640));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
            jTextFieldComplemento.setEnabled(!true);
            jTextFieldNome.setEnabled(!true);
            jTextFieldRua.setEnabled(!true);
            jFormattedTextFieldCep.setEnabled(!true);
            jFormattedTextFieldDtNasc.setEnabled(!true);
            jFormattedTextFieldRG.setEnabled(!true);
            jFormattedTextFieldTelefone.setEnabled(!true);
            jComboBoxBairro.setEnabled(!true);
        
            jButtonCancelar.setEnabled(true);
            jButtonSalvar.setEnabled(!true);
            jButtonAnimal.setEnabled(!true);//Habilita botão que vai chamar classe animal
            jButtonNovo.setEnabled(false);
            jButtonAlterar.setEnabled(!false);
            jButtonExcluir.setEnabled(!false);
        
        
        pac.setPesquisar(jTextFieldPesquisa.getText());
        BeansPaciente pac1 = dao.buscaPaciente(pac);
        jTextFieldNome.setText(pac1.getNomePac());
        jTextFieldCodPac.setText(String.valueOf(pac1.getCodPac()));
        jFormattedTextFieldDtNasc.setText(pac1.getNasc());
        jFormattedTextFieldRG.setText(pac1.getRg());
        jFormattedTextFieldTelefone.setText(pac1.getTelefone());
        jTextFieldRua.setText(pac1.getRua());
        jFormattedTextFieldCep.setText(pac1.getCep());
        jTextFieldComplemento.setText(pac1.getComplemento());
        jComboBoxBairro.setSelectedItem(pac1.getNomeBairro());
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        if(jTextFieldNome.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Preencha o NOME para continuar.");
            jTextFieldNome.requestFocus();
        }else
        if(jFormattedTextFieldDtNasc.getText().equals("  /  /    "))
        {
            JOptionPane.showMessageDialog(null,"Preencha a data de nascimento para continuar.");
            jFormattedTextFieldDtNasc.requestFocus();
        }else
        if(jFormattedTextFieldRG.getText().equals("      - "))
        {
            JOptionPane.showMessageDialog(null,"Preencha o RG para continuar.");
            jFormattedTextFieldRG.requestFocus();
        }else
        if(jFormattedTextFieldTelefone.getText().equals("(  )     -    "))
        {
            JOptionPane.showMessageDialog(null,"Preencha o telefone para continuar.");
            jFormattedTextFieldTelefone.requestFocus();
        }else
        if(jTextFieldRua.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Preencha a rua para continuar.");
            jTextFieldRua.requestFocus();
        }else
        if(jFormattedTextFieldCep.getText().equals("     -   "))
        {
            JOptionPane.showMessageDialog(null,"Preencha o cep para continuar.");
            jFormattedTextFieldCep.requestFocus();
        }else
        if(jTextFieldComplemento.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Preencha o complemento  para continuar.");
            jTextFieldComplemento.requestFocus();
        }else
        if(flag == 1)
        {  
            pac.setNomePac(jTextFieldNome.getText());
            pac.setCep(jFormattedTextFieldCep.getText());
            pac.setComplemento(jTextFieldComplemento.getText());
            pac.setNasc(jFormattedTextFieldDtNasc.getText());
            pac.setRg(jFormattedTextFieldRG.getText());
            pac.setNomeBairro((String)jComboBoxBairro.getSelectedItem());
            pac.setTelefone(jFormattedTextFieldTelefone.getText());
            pac.setRua(jTextFieldRua.getText());
            dao.Salvar(pac);
            preencherTabela("select paci_codigo,paci_nome, paci_telefone, paci_rg, bainome from pacientes inner join bairro on paci_baicodigo = baicodigo order by paci_nome ");
            
            //Bloqueia os botoes que não serão usados e campos q não serão usados
            jTextFieldComplemento.setEnabled(!true);
            jTextFieldNome.setEnabled(!true);
            jTextFieldRua.setEnabled(!true);
            jFormattedTextFieldCep.setEnabled(!true);
            jFormattedTextFieldDtNasc.setEnabled(!true);
            jFormattedTextFieldRG.setEnabled(!true);
            jFormattedTextFieldTelefone.setEnabled(!true);
            jComboBoxBairro.setEnabled(!true);
        
            jButtonCancelar.setEnabled(!true);
            jButtonSalvar.setEnabled(!true);
            jButtonAnimal.setEnabled(!true);//Habilita botão que vai chamar classe animal
            jButtonNovo.setEnabled(!false);
            jButtonAlterar.setEnabled(false);
            jButtonExcluir.setEnabled(false);
            
            //Limpa os campos
            jTextFieldCodPac.setText("");
            jTextFieldComplemento.setText("");
            jTextFieldNome.setText("");
            jTextFieldRua.setText("");
            jFormattedTextFieldCep.setText("");
            jFormattedTextFieldDtNasc.setText("");
            jFormattedTextFieldRG.setText("");
            jFormattedTextFieldTelefone.setText("");  
        
        }else
        {
            pac.setNomePac(jTextFieldNome.getText());
            pac.setCep(jFormattedTextFieldCep.getText());
            pac.setComplemento(jTextFieldComplemento.getText());
            pac.setNasc(jFormattedTextFieldDtNasc.getText());
            pac.setRg(jFormattedTextFieldRG.getText());
            pac.setNomeBairro((String)jComboBoxBairro.getSelectedItem());
            pac.setTelefone(jFormattedTextFieldTelefone.getText());
            pac.setRua(jTextFieldRua.getText());
            pac.setCodPac(Integer.parseInt(jTextFieldCodPac.getText()));
            dao.Alterar(pac);
            preencherTabela("select paci_codigo,paci_nome, paci_telefone, paci_rg, bainome from pacientes inner join bairro on paci_baicodigo = baicodigo order by paci_nome ");
            
            //Bloqueia os botoes que não serão usados e campos q não serão usados
            jTextFieldComplemento.setEnabled(!true);
            jTextFieldNome.setEnabled(!true);
            jTextFieldRua.setEnabled(!true);
            jFormattedTextFieldCep.setEnabled(!true);
            jFormattedTextFieldDtNasc.setEnabled(!true);
            jFormattedTextFieldRG.setEnabled(!true);
            jFormattedTextFieldTelefone.setEnabled(!true);
            jComboBoxBairro.setEnabled(!true);
        
            jButtonCancelar.setEnabled(!true);
            jButtonSalvar.setEnabled(!true);
            jButtonAnimal.setEnabled(!true);//Habilita botão que vai chamar classe animal
            jButtonNovo.setEnabled(!false);
            jButtonAlterar.setEnabled(false);
            jButtonExcluir.setEnabled(false);
            
            //Limpa os campos
            jTextFieldCodPac.setText("");
            jTextFieldComplemento.setText("");
            jTextFieldNome.setText("");
            jTextFieldRua.setText("");
            jFormattedTextFieldCep.setText("");
            jFormattedTextFieldDtNasc.setText("");
            jFormattedTextFieldRG.setText("");
            jFormattedTextFieldTelefone.setText(""); 
        }
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        flag =1;
        
        
        jTextFieldComplemento.setEnabled(true);
        jTextFieldNome.setEnabled(true);
        jTextFieldRua.setEnabled(true);
        jFormattedTextFieldCep.setEnabled(true);
        jFormattedTextFieldDtNasc.setEnabled(true);
        jFormattedTextFieldRG.setEnabled(true);
        jFormattedTextFieldTelefone.setEnabled(true);
        jComboBoxBairro.setEnabled(true);
        
        jButtonCancelar.setEnabled(true);
        jButtonSalvar.setEnabled(true);
        jButtonAnimal.setEnabled(true);//Habilita botão que vai chamar classe animal
        jButtonNovo.setEnabled(false);
        jButtonAlterar.setEnabled(false);
        jButtonExcluir.setEnabled(false);
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
        flag = 2;
        
            jTextFieldComplemento.setEnabled(true);
            jTextFieldNome.setEnabled(true);
            jTextFieldRua.setEnabled(true);
            jFormattedTextFieldCep.setEnabled(true);
            jFormattedTextFieldDtNasc.setEnabled(true);
            jFormattedTextFieldRG.setEnabled(true);
            jFormattedTextFieldTelefone.setEnabled(true);
            jComboBoxBairro.setEnabled(true);
        
            jButtonCancelar.setEnabled(true);
            jButtonSalvar.setEnabled(true);
            jButtonAnimal.setEnabled(true);//Habilita botão que vai chamar classe animal
            jButtonNovo.setEnabled(false);
            jButtonAlterar.setEnabled(false);
            jButtonExcluir.setEnabled(false);
        
    }//GEN-LAST:event_jButtonAlterarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        resposta = JOptionPane.showConfirmDialog(rootPane, "Deseja realmente excluir?");
        if(resposta == JOptionPane.YES_OPTION)
        {
            pac.setCodPac(Integer.parseInt(jTextFieldCodPac.getText()));
            dao.Excluir(pac);
            preencherTabela("select paci_codigo,paci_nome, paci_telefone, paci_rg, bainome from pacientes inner join bairro on paci_baicodigo = baicodigo order by paci_nome ");
            
            //Limpar os campos 
            jTextFieldCodPac.setText("");
            jTextFieldComplemento.setText("");
            jTextFieldNome.setText("");
            jTextFieldRua.setText("");
            jFormattedTextFieldCep.setText("");
            jFormattedTextFieldDtNasc.setText("");
            jFormattedTextFieldRG.setText("");
            jFormattedTextFieldTelefone.setText("");            
            
            //Habilita e desabilita campos que serão ou não serão usados
            jTextFieldComplemento.setEnabled(true);
            jTextFieldNome.setEnabled(true);
            jTextFieldRua.setEnabled(true);
            jFormattedTextFieldCep.setEnabled(true);
            jFormattedTextFieldDtNasc.setEnabled(true);
            jFormattedTextFieldRG.setEnabled(true);
            jFormattedTextFieldTelefone.setEnabled(true);
            jComboBoxBairro.setEnabled(true);
        
            jButtonCancelar.setEnabled(true);
            jButtonSalvar.setEnabled(true);
            jButtonAnimal.setEnabled(true);//Habilita botão que vai chamar classe animal
            jButtonNovo.setEnabled(false);
            jButtonAlterar.setEnabled(false);
            jButtonExcluir.setEnabled(false);
        }          
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jTablePacientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePacientesMouseClicked
        String nome_paciente = ""+jTablePacientes.getValueAt(jTablePacientes.getSelectedRow(), 1);
        conex.conexao();
        conex.executasql("select *from pacientes where paci_nome='"+nome_paciente+"'");
        try {
            conex.rs.first();
            jTextFieldCodPac.setText(String.valueOf(conex.rs.getInt("paci_codigo")));
            jTextFieldNome.setText(conex.rs.getString("paci_nome"));
            jFormattedTextFieldDtNasc.setText(conex.rs.getString("paci_nasc"));
            jFormattedTextFieldRG.setText(conex.rs.getString("paci_rg"));
            jFormattedTextFieldTelefone.setText(conex.rs.getString("paci_telefone"));
            jTextFieldRua.setText(conex.rs.getString("paci_rua"));
            jTextFieldComplemento.setText(conex.rs.getString("paci_complemento"));
            jFormattedTextFieldCep.setText(conex.rs.getString("paci_cep"));
            ConexaoBD conexPesquisa = new ConexaoBD();
            conexPesquisa.conexao();
            conexPesquisa.executasql("select *from bairro where baicodigo="+conex.rs.getInt("paci_baicodigo"));
            conexPesquisa.rs.first();
            jComboBoxBairro.setSelectedItem(conexPesquisa.rs.getString("bainome"));
        
        } catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null,"Erro ao selecionar dados"+ ex);
        }
    }//GEN-LAST:event_jTablePacientesMouseClicked

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
            jTextFieldCodPac.setText("");
            jTextFieldComplemento.setText("");
            jTextFieldNome.setText("");
            jTextFieldRua.setText("");
            jFormattedTextFieldCep.setText("");
            jFormattedTextFieldDtNasc.setText("");
            jFormattedTextFieldRG.setText("");
            jFormattedTextFieldTelefone.setText("");  
            
            jTextFieldComplemento.setEnabled(!true);
            jTextFieldNome.setEnabled(!true);
            jTextFieldRua.setEnabled(!true);
            jFormattedTextFieldCep.setEnabled(!true);
            jFormattedTextFieldDtNasc.setEnabled(!true);
            jFormattedTextFieldRG.setEnabled(!true);
            jFormattedTextFieldTelefone.setEnabled(!true);
            jComboBoxBairro.setEnabled(!true);
        
            jButtonCancelar.setEnabled(!true);
            jButtonSalvar.setEnabled(!true);
            jButtonAnimal.setEnabled(!true);//Habilita botão que vai chamar classe animal
            jButtonNovo.setEnabled(!false);
            jButtonAlterar.setEnabled(false);
            jButtonExcluir.setEnabled(false);
        
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    public void preencherTabela(String Sql)
    {
        ArrayList dados = new ArrayList();
        String [] colunas = new String[]{"ID","Nome","Telefone","RG","Bairro"};
        conex.conexao();
        conex.executasql(Sql);
        
        try{
            conex.rs.first();
            do{
                dados.add(new Object[]{conex.rs.getInt("paci_codigo"),conex.rs.getString("paci_nome"),conex.rs.getString("paci_telefone"),conex.rs.getString("paci_rg"),conex.rs.getString("bainome")});
               }while(conex.rs.next());
        }catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(rootPane, "Busque por outro paciente para preencher tabela!");
        }
        ModeloTabela modelo = new ModeloTabela(dados,colunas);
        jTablePacientes.setModel(modelo);
        jTablePacientes.getColumnModel().getColumn(0).setPreferredWidth(30);//Tamanho da coluna começa em 0 e a largura da coluna é 23 para o COD
        jTablePacientes.getColumnModel().getColumn(0).setResizable(false);//Usuário não vai poder aumentar o tamanho da coluna com o mouse
        jTablePacientes.getColumnModel().getColumn(1).setPreferredWidth(220); //Nome medico
        jTablePacientes.getColumnModel().getColumn(1).setResizable(false);
        jTablePacientes.getColumnModel().getColumn(2).setPreferredWidth(110);
        jTablePacientes.getColumnModel().getColumn(2).setResizable(false);//especialidade
        jTablePacientes.getColumnModel().getColumn(3).setPreferredWidth(80);//crm
        jTablePacientes.getColumnModel().getColumn(3).setResizable(false);
        jTablePacientes.getColumnModel().getColumn(4).setPreferredWidth(92);//crm
        jTablePacientes.getColumnModel().getColumn(4).setResizable(false);
        jTablePacientes.getTableHeader().setReorderingAllowed(false);
        jTablePacientes.setAutoResizeMode(jTablePacientes.AUTO_RESIZE_OFF);//Usuário não vai redimensionar essa tabela
        jTablePacientes.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);//Vai selecionar só um campo da tabela por vez
        conex.desconecta();
    }

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
            java.util.logging.Logger.getLogger(FormPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPaciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonAnimal;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox<String> jComboBoxBairro;
    private javax.swing.JFormattedTextField jFormattedTextFieldCep;
    private javax.swing.JFormattedTextField jFormattedTextFieldDtNasc;
    private javax.swing.JFormattedTextField jFormattedTextFieldRG;
    private javax.swing.JFormattedTextField jFormattedTextFieldTelefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablePacientes;
    private javax.swing.JTextField jTextFieldCodPac;
    private javax.swing.JTextField jTextFieldComplemento;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldPesquisa;
    private javax.swing.JTextField jTextFieldRua;
    // End of variables declaration//GEN-END:variables
}
