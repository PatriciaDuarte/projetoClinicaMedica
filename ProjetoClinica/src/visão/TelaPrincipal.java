package visão;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modeloConection.ConexaoBD;//Está em pacote diferente, por isso faz a importação.

/**
 *
 * @author patricia
 */
public class TelaPrincipal extends javax.swing.JFrame {

   ConexaoBD conecta = new ConexaoBD();
   FormMedico tela = new FormMedico();
   FormUsuario telaUsu = new FormUsuario();
   FormPaciente telaPac = new FormPaciente();
    public TelaPrincipal(String usuario)
    {
        setResizable(false);//Trava a tela
        initComponents();
        jLabelUsuario.setText(usuario);
        conecta.conexao();
    }

    private TelaPrincipal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    

     @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrameBemVindo = new javax.swing.JInternalFrame();
        jPanelInternal = new javax.swing.JPanel();
        jButtonAgenda = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButtonCadMed = new javax.swing.JButton();
        jButtonCadEnfermeiros = new javax.swing.JButton();
        jButtonCadPacientes = new javax.swing.JButton();
        jLabelPainelFundo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButtonFecharBemVindo = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabelUsuario = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabelFundoTelaPrincipal = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuCadastro = new javax.swing.JMenu();
        jMenuItemCadMedicos = new javax.swing.JMenuItem();
        jMenuItemCadPacientes = new javax.swing.JMenuItem();
        jMenuItemCadEnfermeiros = new javax.swing.JMenuItem();
        jMenuItemCadUsuarios = new javax.swing.JMenuItem();
        jMenuRelatorios = new javax.swing.JMenu();
        jMenuFerramentas = new javax.swing.JMenu();
        jMenuItemTelaBemVindo = new javax.swing.JMenuItem();
        jMenuSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jInternalFrameBemVindo.setTitle("                                                                                           Bem-vindos");
        jInternalFrameBemVindo.setVisible(true);
        jInternalFrameBemVindo.getContentPane().setLayout(null);

        jPanelInternal.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelInternal.setLayout(null);

        jButtonAgenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Agenda.png"))); // NOI18N
        jButtonAgenda.setToolTipText("Agendamentos");
        jPanelInternal.add(jButtonAgenda);
        jButtonAgenda.setBounds(0, 190, 120, 100);

        jLabel2.setText("Cadastros-");
        jPanelInternal.add(jLabel2);
        jLabel2.setBounds(0, 20, 80, 20);

        jLabel3.setText("Agenda-");
        jPanelInternal.add(jLabel3);
        jLabel3.setBounds(0, 170, 60, 20);

        jButtonCadMed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/CadMedicos.png"))); // NOI18N
        jButtonCadMed.setToolTipText("Médicos");
        jButtonCadMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadMedActionPerformed(evt);
            }
        });
        jPanelInternal.add(jButtonCadMed);
        jButtonCadMed.setBounds(0, 40, 120, 120);

        jButtonCadEnfermeiros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon-infermeira.png"))); // NOI18N
        jButtonCadEnfermeiros.setToolTipText("Enfermeiros");
        jPanelInternal.add(jButtonCadEnfermeiros);
        jButtonCadEnfermeiros.setBounds(120, 40, 120, 120);

        jButtonCadPacientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cadPacientes.png"))); // NOI18N
        jButtonCadPacientes.setToolTipText("Pacientes");
        jButtonCadPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadPacientesActionPerformed(evt);
            }
        });
        jPanelInternal.add(jButtonCadPacientes);
        jButtonCadPacientes.setBounds(240, 40, 120, 120);

        jLabelPainelFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/internalframe.png"))); // NOI18N
        jPanelInternal.add(jLabelPainelFundo);
        jLabelPainelFundo.setBounds(-20, -20, 710, 290);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Sistema de Gerenciamento de:");
        jPanelInternal.add(jLabel1);
        jLabel1.setBounds(10, 10, 240, 22);

        jInternalFrameBemVindo.getContentPane().add(jPanelInternal);
        jPanelInternal.setBounds(10, 50, 700, 300);

        jButtonFecharBemVindo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/exit.png"))); // NOI18N
        jButtonFecharBemVindo.setToolTipText("Fechar Tela Bem-Vindo");
        jButtonFecharBemVindo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFecharBemVindoActionPerformed(evt);
            }
        });
        jInternalFrameBemVindo.getContentPane().add(jButtonFecharBemVindo);
        jButtonFecharBemVindo.setBounds(660, 0, 40, 40);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Sistema de Gerenciamento de:");
        jInternalFrameBemVindo.getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 20, 280, 22);

        getContentPane().add(jInternalFrameBemVindo);
        jInternalFrameBemVindo.setBounds(0, 60, 730, 380);
        getContentPane().add(jLabelUsuario);
        jLabelUsuario.setBounds(70, 440, 140, 20);

        jLabel5.setText("Usuário:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 440, 60, 20);

        jLabelFundoTelaPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundo_telaprincipal.jpg"))); // NOI18N
        getContentPane().add(jLabelFundoTelaPrincipal);
        jLabelFundoTelaPrincipal.setBounds(0, -60, 750, 460);

        jMenuCadastro.setText("Cadastros");

        jMenuItemCadMedicos.setText("Médicos");
        jMenuItemCadMedicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadMedicosActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemCadMedicos);

        jMenuItemCadPacientes.setText("Pacientes");
        jMenuItemCadPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadPacientesActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemCadPacientes);

        jMenuItemCadEnfermeiros.setText("Enfermeiros");
        jMenuCadastro.add(jMenuItemCadEnfermeiros);

        jMenuItemCadUsuarios.setText("Usuarios");
        jMenuItemCadUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadUsuariosActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemCadUsuarios);

        jMenuBar1.add(jMenuCadastro);

        jMenuRelatorios.setText("Relatorios");
        jMenuBar1.add(jMenuRelatorios);

        jMenuFerramentas.setText("Ferramentas");

        jMenuItemTelaBemVindo.setText("Tela Bem-Vindos");
        jMenuItemTelaBemVindo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemTelaBemVindoActionPerformed(evt);
            }
        });
        jMenuFerramentas.add(jMenuItemTelaBemVindo);

        jMenuBar1.add(jMenuFerramentas);

        jMenuSair.setText("Sair");
        jMenuSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuSairMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuSair);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(733, 519));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemCadPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadPacientesActionPerformed
       try {
           conecta.executasql("select *from usuarios where usu_nome='"+jLabelUsuario.getText()+"'");
           conecta.rs.first();
           if((conecta.rs.getString("usu_tipo").equals("recepcionista"))||(conecta.rs.getString("usu_tipo").equals("administrador")))
           {
               if(telaPac == null)
               {
                   telaPac = new FormPaciente();
                   telaPac.setVisible(true);
                   telaPac.setResizable(false);//Não deixa redimensionar a tela
               }else
               {
                   telaPac.setVisible(true);
                   telaPac.setResizable(false);
               }
              
           }else
           {
               JOptionPane.showMessageDialog(rootPane, "Você não tem permissão para essa funcionalidade!\n Contate a recepcionista da clínica.");
           }
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(rootPane, "Você não tem permissão para essa funcionalidade!\n Contate a recepcionista da clínica."+ex);
       }
    }//GEN-LAST:event_jMenuItemCadPacientesActionPerformed

    private void jButtonFecharBemVindoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFecharBemVindoActionPerformed
            jInternalFrameBemVindo.dispose();
    }//GEN-LAST:event_jButtonFecharBemVindoActionPerformed

    private void jMenuItemTelaBemVindoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemTelaBemVindoActionPerformed
        jInternalFrameBemVindo.setVisible(true);
    }//GEN-LAST:event_jMenuItemTelaBemVindoActionPerformed

    private void jMenuItemCadMedicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadMedicosActionPerformed
       try {
           conecta.executasql("select *from usuarios where usu_nome='"+jLabelUsuario.getText()+"'");
           conecta.rs.first();
           if(conecta.rs.getString("usu_tipo").equals("administrador"))
           {
               if(tela == null)
               {
                   tela = new FormMedico();
                   tela.setVisible(true);
                   tela.setResizable(false);//Não deixa redimensionar a tela
               }else
               {
                   tela.setVisible(true);
                   tela.setResizable(false);
               }
              // FormMedico tela = new FormMedico();
              // tela.setVisible(true);
           }else
           {
               JOptionPane.showMessageDialog(rootPane, "Você não tem permissão para essa funcionalidade!\n Contate o administrador do sistema.");
           }
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(rootPane, "Você não tem permissão para essa funcionalidade!\n Contate o administrador do sistema."+ex);
       }
        
    }//GEN-LAST:event_jMenuItemCadMedicosActionPerformed

    private void jButtonCadMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadMedActionPerformed
      
        try {
           conecta.executasql("select *from usuarios where usu_nome='"+jLabelUsuario.getText()+"'");
           conecta.rs.first();
           if(conecta.rs.getString("usu_tipo").equals("administrador"))
           {
                if(tela == null)
               {
                   tela = new FormMedico();
                   tela.setVisible(true);
                   tela.setResizable(false);//Não deixa redimensionar a tela
               }else
               {
                   tela.setVisible(true);
                   tela.setResizable(false);
               }
               //FormMedico tela = new FormMedico();
               //tela.setVisible(true);
           }else
           {
               JOptionPane.showMessageDialog(rootPane, "Você não tem permissão para essa funcionalidade!\n Contate o administrador do sistema.");
           }
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(rootPane, "Você não tem permissão para essa funcionalidade!\n Contate o administrador do sistema."+ex);
       }
    }//GEN-LAST:event_jButtonCadMedActionPerformed

    private void jMenuSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuSairMouseClicked
       System.exit(0);
    }//GEN-LAST:event_jMenuSairMouseClicked

    private void jMenuItemCadUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadUsuariosActionPerformed
       
       
        try {
           conecta.executasql("select *from usuarios where usu_nome='"+jLabelUsuario.getText()+"'");
           conecta.rs.first();
           if(conecta.rs.getString("usu_tipo").equals("administrador"))
           {
                if(telaUsu == null)
               {
                   telaUsu = new FormUsuario();
                   telaUsu.setVisible(true);
                   telaUsu.setResizable(false);//Não deixa redimensionar a tela
               }else
               {
                   telaUsu.setVisible(true);
                   telaUsu.setResizable(false);
               }
              // FormUsuario tela = new FormUsuario();
              // tela.setVisible(true);
           }else
           {
               JOptionPane.showMessageDialog(rootPane, "Você não tem permissão para essa funcionalidade!\n Contate o administrador do sistema.");
           }
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(rootPane, "Você não tem permissão para essa funcionalidade!\n Contate o administrador do sistema."+ex);
       }
    }//GEN-LAST:event_jMenuItemCadUsuariosActionPerformed

    private void jButtonCadPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadPacientesActionPerformed
        try {
           conecta.executasql("select *from usuarios where usu_nome='"+jLabelUsuario.getText()+"'");
           conecta.rs.first();
           if((conecta.rs.getString("usu_tipo").equals("recepcionista"))||(conecta.rs.getString("usu_tipo").equals("administrador")))
           {
               if(telaPac == null)
               {
                   telaPac = new FormPaciente();
                   telaPac.setVisible(true);
                   telaPac.setResizable(false);//Não deixa redimensionar a tela
               }else
               {
                   telaPac.setVisible(true);
                   telaPac.setResizable(false);
               }
              
           }else
           {
               JOptionPane.showMessageDialog(rootPane, "Você não tem permissão para essa funcionalidade!\n Contate a recepcionista da clínica.");
           }
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(rootPane, "Você não tem permissão para essa funcionalidade!\n Contate a recepcionista da clínica."+ex);
       }
    }//GEN-LAST:event_jButtonCadPacientesActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAgenda;
    private javax.swing.JButton jButtonCadEnfermeiros;
    private javax.swing.JButton jButtonCadMed;
    private javax.swing.JButton jButtonCadPacientes;
    private javax.swing.JButton jButtonFecharBemVindo;
    private javax.swing.JInternalFrame jInternalFrameBemVindo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelFundoTelaPrincipal;
    private javax.swing.JLabel jLabelPainelFundo;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCadastro;
    private javax.swing.JMenu jMenuFerramentas;
    private javax.swing.JMenuItem jMenuItemCadEnfermeiros;
    private javax.swing.JMenuItem jMenuItemCadMedicos;
    private javax.swing.JMenuItem jMenuItemCadPacientes;
    private javax.swing.JMenuItem jMenuItemCadUsuarios;
    private javax.swing.JMenuItem jMenuItemTelaBemVindo;
    private javax.swing.JMenu jMenuRelatorios;
    private javax.swing.JMenu jMenuSair;
    private javax.swing.JPanel jPanelInternal;
    // End of variables declaration//GEN-END:variables
}
