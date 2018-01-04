//Autora: Patrícia Duarte da Silva
package visão;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modeloConection.ConexaoBD;

public class TelaLogin extends javax.swing.JFrame {

    ConexaoBD con = new ConexaoBD();
    
    public TelaLogin() 
    {
        initComponents();
        setResizable(false);
        con.conexao();
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButtonAcessar = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        jLabelSenha = new javax.swing.JLabel();
        jLabelUsuario = new javax.swing.JLabel();
        jTextFieldUsuario = new javax.swing.JTextField();
        jPasswordFieldSenha = new javax.swing.JPasswordField();
        jLabelLogoCanal = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        LabelFundoLogin = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jButtonAcessar.setText("Acessar");
        jButtonAcessar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAcessarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAcessar);
        jButtonAcessar.setBounds(300, 120, 90, 30);

        jButtonSair.setText("Sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSair);
        jButtonSair.setBounds(400, 120, 60, 30);

        jLabelSenha.setText("Senha:");
        getContentPane().add(jLabelSenha);
        jLabelSenha.setBounds(250, 90, 50, 14);

        jLabelUsuario.setText("Usuário:");
        getContentPane().add(jLabelUsuario);
        jLabelUsuario.setBounds(250, 50, 50, 14);

        jTextFieldUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldUsuario);
        jTextFieldUsuario.setBounds(300, 40, 160, 30);
        getContentPane().add(jPasswordFieldSenha);
        jPasswordFieldSenha.setBounds(300, 80, 160, 30);

        jLabelLogoCanal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logoClinica.jpg"))); // NOI18N
        getContentPane().add(jLabelLogoCanal);
        jLabelLogoCanal.setBounds(-10, -40, 240, 260);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jLabel1.setText("MW5 SOFTWARE");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(200, 200, 100, 30);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jPanel2);
        jPanel2.setBounds(240, 30, 230, 130);

        LabelFundoLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundo_1.png"))); // NOI18N
        LabelFundoLogin.setText("MW5 SOFTWARE");
        getContentPane().add(LabelFundoLogin);
        LabelFundoLogin.setBounds(0, 0, 500, 240);

        setSize(new java.awt.Dimension(513, 272));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUsuarioActionPerformed
      
    }//GEN-LAST:event_jTextFieldUsuarioActionPerformed

    private void jButtonAcessarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAcessarActionPerformed
        //VERIFICA SE O USUÁRIO ESTÁ CADASTRADO NO BANCO DE DADOS
        try
        {
            con.executasql("select *from usuarios where usu_nome='"+jTextFieldUsuario.getText()+"'");
            con.rs.first();
            if(con.rs.getString("usu_senha").equals(jPasswordFieldSenha.getText()))
            {
                TelaPrincipal tela = new TelaPrincipal(jTextFieldUsuario.getText());
                tela.setVisible(true);
                dispose();//Abre a tela principal e fecha a tela login
            }else
            {
                JOptionPane.showMessageDialog(rootPane,"Senha ou usuários inválidos!");
            }
        } catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(rootPane,"Senha ou usuários inválidos!");
        }
    }//GEN-LAST:event_jButtonAcessarActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
       System.exit(0);//Fecha o sistema por completo
    }//GEN-LAST:event_jButtonSairActionPerformed

   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelFundoLogin;
    private javax.swing.JButton jButtonAcessar;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelLogoCanal;
    private javax.swing.JLabel jLabelSenha;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordFieldSenha;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextFieldUsuario;
    // End of variables declaration//GEN-END:variables
}
