package visão;

import modeloConection.ConexaoBD;//Está em pacote diferente, por isso faz a importação.

/**
 *
 * @author patricia
 */
public class TelaPrincipal extends javax.swing.JFrame {

   ConexaoBD conecta = new ConexaoBD();
   
    public TelaPrincipal()
    {
        setResizable(false);//Trava a tela
        initComponents();
        conecta.conexao();
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

        jInternalFrameBemVindo.setTitle("Bem-vindos");
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
        jPanelInternal.add(jButtonCadPacientes);
        jButtonCadPacientes.setBounds(240, 40, 120, 120);

        jLabelPainelFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/internalframe.png"))); // NOI18N
        jPanelInternal.add(jLabelPainelFundo);
        jLabelPainelFundo.setBounds(-10, 0, 710, 300);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Sistema de Gerenciamento de:");
        jPanelInternal.add(jLabel1);
        jLabel1.setBounds(10, 10, 240, 22);

        jInternalFrameBemVindo.getContentPane().add(jPanelInternal);
        jPanelInternal.setBounds(10, 50, 700, 290);

        jButtonFecharBemVindo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/exit.png"))); // NOI18N
        jButtonFecharBemVindo.setToolTipText("Fechar Tela Bem-Vindo");
        jButtonFecharBemVindo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFecharBemVindoActionPerformed(evt);
            }
        });
        jInternalFrameBemVindo.getContentPane().add(jButtonFecharBemVindo);
        jButtonFecharBemVindo.setBounds(660, 0, 40, 40);

        getContentPane().add(jInternalFrameBemVindo);
        jInternalFrameBemVindo.setBounds(0, 50, 730, 390);

        jLabelFundoTelaPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundo_telaprincipal.jpg"))); // NOI18N
        getContentPane().add(jLabelFundoTelaPrincipal);
        jLabelFundoTelaPrincipal.setBounds(0, 0, 730, 470);

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

        setSize(new java.awt.Dimension(741, 477));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemCadPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadPacientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemCadPacientesActionPerformed

    private void jButtonFecharBemVindoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFecharBemVindoActionPerformed
            jInternalFrameBemVindo.dispose();
    }//GEN-LAST:event_jButtonFecharBemVindoActionPerformed

    private void jMenuItemTelaBemVindoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemTelaBemVindoActionPerformed
        jInternalFrameBemVindo.setVisible(true);
    }//GEN-LAST:event_jMenuItemTelaBemVindoActionPerformed

    private void jMenuItemCadMedicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadMedicosActionPerformed
     FormMedico tela = new FormMedico();
     tela.setVisible(true);
    }//GEN-LAST:event_jMenuItemCadMedicosActionPerformed

    private void jButtonCadMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadMedActionPerformed
       FormMedico tela = new FormMedico();
       tela.setVisible(true);
    }//GEN-LAST:event_jButtonCadMedActionPerformed

    private void jMenuSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuSairMouseClicked
       System.exit(0);
    }//GEN-LAST:event_jMenuSairMouseClicked

    private void jMenuItemCadUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadUsuariosActionPerformed
       FormUsuario tela = new FormUsuario();
       tela.setVisible(true);
    }//GEN-LAST:event_jMenuItemCadUsuariosActionPerformed

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
    private javax.swing.JLabel jLabelFundoTelaPrincipal;
    private javax.swing.JLabel jLabelPainelFundo;
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
