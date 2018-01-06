package visão;

import java.sql.SQLException;
<<<<<<< HEAD
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import modeloBeans.BeansAgenda;
import modeloBeans.ModeloTabela;
import modeloConection.ConexaoBD;
import modeloDao.DaoAgenda;
=======
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import modeloBeans.ModeloTabela;
import modeloConection.ConexaoBD;
>>>>>>> f05786631bd6697ab95aa753586218949b014b36

/**
 *
 * @author patricia
 */
public class FormAgenda extends javax.swing.JFrame {

    ConexaoBD conex = new ConexaoBD();
<<<<<<< HEAD
    BeansAgenda agenda = new BeansAgenda();
    BeansAgenda  agen = new BeansAgenda();
    DaoAgenda daoAgenda = new DaoAgenda();
    String dtHoje;
    String status;
    
    public FormAgenda() 
    {
        initComponents();
        
        
        Calendar data = Calendar.getInstance();
        Date d = data.getTime();
        SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY/MM/dd");
        dateFormat.format(d);
        
        dtHoje = dateFormat.format(d);//formatamos nossa data
        
        status = "Aberto";//Listar todos os status que estão em aberto na data de hj
        
        preencherTabela("select *from agenda inner join pacientes on agenda_codpac=paci_codigo  inner join medicos on agenda_codmedico=cod_medico where agenda_data='"+dtHoje+"' and agenda_status='"+status+"' order by agenda_turno");//Lista os agendamentos do dia de hje baseado na data de hje
    }
    
    public void preencherTabela(String Sql)
    {
        ArrayList dados = new ArrayList();
        String [] colunas = new String[]{"ID","Nome","Turno","Data","Status","Médico"};
        conex.conexao();
        conex.executasql(Sql);
        
        try{
            conex.rs.first();
            agen.setStatus("Atendimento");
            agen.setAgendaCod(conex.rs.getInt("agenda_cod"));
            do{
                dados.add(new Object[]{conex.rs.getInt("agenda_cod"),conex.rs.getString("paci_nome"),conex.rs.getString("agenda_turno"),conex.rs.getString("agenda_data"),conex.rs.getString("agenda_status"),conex.rs.getString("nome_medico")});
               }while(conex.rs.next());
        }catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(rootPane, "Não possui pacientes para serem atendidos!");
        }
        ModeloTabela modelo = new ModeloTabela(dados,colunas);
        jTableAgenda.setModel(modelo);
        jTableAgenda.getColumnModel().getColumn(0).setPreferredWidth(30);//Tamanho da coluna começa em 0 e a largura da coluna é 23 para o COD
        jTableAgenda.getColumnModel().getColumn(0).setResizable(false);//Usuário não vai poder aumentar o tamanho da coluna com o mouse
        jTableAgenda.getColumnModel().getColumn(1).setPreferredWidth(220); //Nome medico
        jTableAgenda.getColumnModel().getColumn(1).setResizable(false);
        jTableAgenda.getColumnModel().getColumn(2).setPreferredWidth(80);
        jTableAgenda.getColumnModel().getColumn(2).setResizable(false);//especialidade
        jTableAgenda.getColumnModel().getColumn(3).setPreferredWidth(80);//crm
        jTableAgenda.getColumnModel().getColumn(3).setResizable(false);
        jTableAgenda.getColumnModel().getColumn(4).setPreferredWidth(109);//crm
        jTableAgenda.getColumnModel().getColumn(4).setResizable(false);
        jTableAgenda.getColumnModel().getColumn(5).setPreferredWidth(212);//crm
        jTableAgenda.getColumnModel().getColumn(5).setResizable(false);
        jTableAgenda.getTableHeader().setReorderingAllowed(false);
        jTableAgenda.setAutoResizeMode(jTableAgenda.AUTO_RESIZE_OFF);//Usuário não vai redimensionar essa tabela
        jTableAgenda.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);//Vai selecionar só um campo da tabela por vez
        conex.desconecta();
=======
    public FormAgenda() {
        setResizable(false);
        initComponents();
        preencherMedicos();
>>>>>>> f05786631bd6697ab95aa753586218949b014b36
    }

   public void preencherMedicos()
    {
        conex.conexao();
        conex.executasql("select *from medicos order by nome_medico ");
        try {
            conex.rs.first();
            jComboBoxMedicos.removeAllItems();
            do{
                jComboBoxMedicos.addItem(conex.rs.getString("nome_medico"));
                
              }while(conex.rs.next());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao preencher medicos."+ex);
        }
        conex.desconecta();
    
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
<<<<<<< HEAD
        jTableAgenda = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jButtonAtender = new javax.swing.JButton();
=======
        jTablePacientes = new javax.swing.JTable();
        jTextFieldMotivo = new javax.swing.JTextField();
        jComboBoxMedicos = new javax.swing.JComboBox<>();
        jButtonFinalizarAgendamento = new javax.swing.JButton();
        jButtonCancelarAgendamento = new javax.swing.JButton();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
>>>>>>> f05786631bd6697ab95aa753586218949b014b36
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

<<<<<<< HEAD
        jTableAgenda.setModel(new javax.swing.table.DefaultTableModel(
=======
        jLabel2.setText("Paciente:");

        jLabel3.setText("Médico:");

        jLabel4.setText("Data:");

        jLabel5.setText("Motivo:");

        jLabel6.setText("Turno:");

        jComboBoxTurno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Matutino", "Vespertino" }));

        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        jTablePacientes.setModel(new javax.swing.table.DefaultTableModel(
>>>>>>> f05786631bd6697ab95aa753586218949b014b36
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
<<<<<<< HEAD
        jTableAgenda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableAgendaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableAgenda);
=======
        jTablePacientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablePacientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTablePacientes);

        jComboBoxMedicos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
>>>>>>> f05786631bd6697ab95aa753586218949b014b36

        jLabel2.setText("Agendamentos para hoje:");

        jButtonAtender.setText("Atender agendamento");
        jButtonAtender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtenderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
<<<<<<< HEAD
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2)
                    .addComponent(jButtonAtender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 737, Short.MAX_VALUE))
                .addContainerGap(21, Short.MAX_VALUE))
=======
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jTextFieldPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButtonBuscar))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jComboBoxTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBoxMedicos, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldMotivo)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(jButtonFinalizarAgendamento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonCancelarAgendamento)
                        .addGap(115, 115, 115))))
>>>>>>> f05786631bd6697ab95aa753586218949b014b36
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
<<<<<<< HEAD
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(5, 5, 5)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonAtender)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
=======
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBuscar)
                    .addComponent(jLabel6)
                    .addComponent(jComboBoxTurno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBoxMedicos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldMotivo, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonFinalizarAgendamento)
                    .addComponent(jButtonCancelarAgendamento))
                .addContainerGap(24, Short.MAX_VALUE))
>>>>>>> f05786631bd6697ab95aa753586218949b014b36
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Agenda");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
<<<<<<< HEAD
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(356, 356, 356)
                        .addComponent(jLabel1)))
                .addContainerGap(23, Short.MAX_VALUE))
=======
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(406, 406, 406)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
>>>>>>> f05786631bd6697ab95aa753586218949b014b36
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(11, 11, 11)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

<<<<<<< HEAD
        setSize(new java.awt.Dimension(840, 378));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTableAgendaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableAgendaMouseClicked
        // Ação ao selecionar um registro na tabela
         String agenda_cod = ""+jTableAgenda.getValueAt(jTableAgenda.getSelectedRow(), 0);
        conex.conexao();
        conex.executasql("select *from agenda where agenda_cod='"+agenda_cod+"'");
        try {
            conex.rs.first();
        } catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null,"Erro ao selecionar dados"+ ex);
        }
    }//GEN-LAST:event_jTableAgendaMouseClicked

    private void jButtonAtenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtenderActionPerformed
        daoAgenda.Alterar(agen);
        preencherTabela("select *from agenda inner join pacientes on agenda_codpac=paci_codigo  inner join medicos on agenda_codmedico=cod_medico where agenda_data='"+dtHoje+"' and agenda_status='"+status+"' order by agenda_turno");
    }//GEN-LAST:event_jButtonAtenderActionPerformed

    /**
     * @param args the command line arguments
     */
=======
        setSize(new java.awt.Dimension(952, 469));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        preencherTabela("select paci_codigo, paci_nome, paci_telefone, paci_rg, bainome from pacientes inner join bairro on paci_baicodigo=baicodigo where paci_nome like '%"+jTextFieldPaciente.getText()+"%'");
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jTablePacientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePacientesMouseClicked
        String nome_paciente = ""+jTablePacientes.getValueAt(jTablePacientes.getSelectedRow(), 1);
        conex.conexao();
        conex.executasql("select *from pacientes where paci_nome='"+nome_paciente+"'");
        try {
            conex.rs.first();
            jTextFieldPaciente.setText(conex.rs.getString("paci_nome"));
            
        }catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "Erro ao selecionar dados"+ex);
        }
        conex.desconecta();
    }//GEN-LAST:event_jTablePacientesMouseClicked
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
        jTablePacientes.getColumnModel().getColumn(4).setPreferredWidth(123);//crm
        jTablePacientes.getColumnModel().getColumn(4).setResizable(false);
        jTablePacientes.getTableHeader().setReorderingAllowed(false);
        jTablePacientes.setAutoResizeMode(jTablePacientes.AUTO_RESIZE_OFF);//Usuário não vai redimensionar essa tabela
        jTablePacientes.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);//Vai selecionar só um campo da tabela por vez
        conex.desconecta();
    }
>>>>>>> f05786631bd6697ab95aa753586218949b014b36
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
            java.util.logging.Logger.getLogger(FormAgenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormAgenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormAgenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormAgenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormAgenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAtender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
<<<<<<< HEAD
    private javax.swing.JTable jTableAgenda;
=======
    private javax.swing.JTable jTablePacientes;
    private javax.swing.JTextField jTextFieldMotivo;
    private javax.swing.JTextField jTextFieldPaciente;
>>>>>>> f05786631bd6697ab95aa753586218949b014b36
    // End of variables declaration//GEN-END:variables
}
