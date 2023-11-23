/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.Turma753Senac.View;
import com.mycompany.Turma753Senac.Model.PessoaFisica;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author joelmir
 */
public class Cliente extends javax.swing.JFrame {

    /**
     * Creates new form Cliente
     */
    public Cliente() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup_FisicoxJuridico = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel_nome = new javax.swing.JLabel();
        jTextField_nome = new javax.swing.JTextField();
        jLabel_nascimento = new javax.swing.JLabel();
        jTextField_nascimento = new javax.swing.JTextField();
        jLabel_Cpf = new javax.swing.JLabel();
        jLabel_Titulo = new javax.swing.JLabel();
        jTextField_Cpf = new javax.swing.JTextField();
        jLabel_genero = new javax.swing.JLabel();
        jComboBox_genero = new javax.swing.JComboBox<>();
        jLabel_email = new javax.swing.JLabel();
        jTextField_email = new javax.swing.JTextField();
        jLabel_endereco = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_endereco = new javax.swing.JTextArea();
        jLabel_telefone = new javax.swing.JLabel();
        jTextField_telefone = new javax.swing.JTextField();
        jLabel_nomeLogin = new javax.swing.JLabel();
        jTextField_nomeUsuario = new javax.swing.JTextField();
        jLabel_senha = new javax.swing.JLabel();
        jPasswordField_senha = new javax.swing.JPasswordField();
        jLabel_confirmeSenha = new javax.swing.JLabel();
        jPasswordField_confirmeSenha = new javax.swing.JPasswordField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel_profissao = new javax.swing.JLabel();
        jTextField_profissao = new javax.swing.JTextField();
        jButton_mostrar = new javax.swing.JButton();
        jButton_cadatrar = new javax.swing.JButton();
        jButton_sair = new javax.swing.JButton();
        jButton_limpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro");
        setResizable(false);

        jLabel_nome.setText("Nome:");

        jLabel_nascimento.setText("Nasc:");

        jLabel_Cpf.setText("CPF:");

        jLabel_Titulo.setText("CADASTRO CLIENTE:");

        jLabel_genero.setText("Genero");

        jComboBox_genero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino", "Nao Declarado" }));

        jLabel_email.setText("e-mail");

        jLabel_endereco.setText("Endereço");

        jTextArea_endereco.setColumns(20);
        jTextArea_endereco.setRows(3);
        jScrollPane1.setViewportView(jTextArea_endereco);

        jLabel_telefone.setText("Telefone");

        jLabel_nomeLogin.setText("Nome Login");

        jLabel_senha.setText("Senha");

        jLabel_confirmeSenha.setText("Confirme Senha");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Solteiro", "Casado", "Uniao Instavel" }));

        jLabel1.setText("Est. Civil");

        jLabel_profissao.setText("Profissão");

        jButton_mostrar.setText("Mostrar");
        jButton_mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_mostrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel_Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_endereco)
                            .addComponent(jLabel_Cpf)
                            .addComponent(jLabel_email)
                            .addComponent(jLabel_nome))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel_nomeLogin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextField_Cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel_genero)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jComboBox_genero, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextField_email, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel_telefone)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jTextField_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jTextField_nomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(234, 234, 234)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel_nascimento)
                                    .addComponent(jLabel_profissao))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField_nascimento, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                                    .addComponent(jTextField_profissao))))
                        .addGap(82, 209, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_confirmeSenha)
                            .addComponent(jLabel_senha))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPasswordField_senha, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPasswordField_confirmeSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(140, 140, 140)
                        .addComponent(jButton_mostrar)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel_Titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_nomeLogin)
                    .addComponent(jTextField_nomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_profissao)
                    .addComponent(jTextField_profissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_nome)
                            .addComponent(jTextField_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_nascimento)
                            .addComponent(jTextField_nascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_Cpf)
                            .addComponent(jTextField_Cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_genero)
                            .addComponent(jComboBox_genero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_email)
                            .addComponent(jTextField_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_telefone)
                            .addComponent(jTextField_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(jLabel_endereco))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_senha)
                            .addComponent(jPasswordField_senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_confirmeSenha)
                            .addComponent(jPasswordField_confirmeSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton_mostrar)
                        .addGap(33, 33, 33))))
        );

        jButton_cadatrar.setText("Cadastrar");
        jButton_cadatrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_cadatrarActionPerformed(evt);
            }
        });

        jButton_sair.setText("Sair");
        jButton_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_sairActionPerformed(evt);
            }
        });

        jButton_limpar.setText("Limpar");
        jButton_limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_limparActionPerformed(evt);
            }
        });

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
                        .addGap(131, 131, 131)
                        .addComponent(jButton_cadatrar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79)
                        .addComponent(jButton_limpar)
                        .addGap(62, 62, 62)
                        .addComponent(jButton_sair)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_sair, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_cadatrar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_limpar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_sairActionPerformed
        boolean isClosed = false;
        // TODO add your handling code here:
        setVisible(isClosed);
    }//GEN-LAST:event_jButton_sairActionPerformed

    private void jButton_limparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_limparActionPerformed
        // TODO add your handling code here:
        jTextField_nomeUsuario.setText("");
        jTextField_nome.setText("");
        jTextField_Cpf.setText("");
        jTextField_nascimento.setText("");
        jTextField_email.setText("");
        jTextField_telefone.setText("");
        jTextArea_endereco.setText("");
        jPasswordField_senha.setText("");
        jPasswordField_confirmeSenha.setText("");
        jTextField_profissao.setText("");
    }//GEN-LAST:event_jButton_limparActionPerformed

    private void jButton_cadatrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_cadatrarActionPerformed
        // TODO add your  handling code here:
        com.mycompany.Turma753Senac.Model.PessoaFisica c = new com.mycompany.Turma753Senac.Model.PessoaFisica();
        ArrayList<PessoaFisica> listaC = new ArrayList<>();
        
        c.setNomeUsuario(jTextField_nomeUsuario.getText());
        c.setNome(jTextField_nome.getText());
        c.setCpf(jTextField_Cpf.getText());
        c.setDataNascimento(jTextField_nascimento.getText());
        c.setEmail(jTextField_email.getText());
        c.setTelefone(jTextField_telefone.getText());
        c.setEndereco(jTextArea_endereco.getText());
        c.setProfissao(jTextField_profissao.getText());
        c.setSenha(jPasswordField_senha.getPassword());
        c.setConfirmaSenha(jPasswordField_confirmeSenha.getPassword());
        //c.setGenero(jComboBox_genero);
        
        listaC.add(c);
        
        
        
    }//GEN-LAST:event_jButton_cadatrarActionPerformed

    private void jButton_mostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_mostrarActionPerformed
        // TODO add your handling code here:
        com.mycompany.Turma753Senac.Model.PessoaFisica c = this.MostarPessoa();
        
        JOptionPane.showMessageDialog(null,"Usuario: "+c.getNomeUsuario()+"\nNome: "+c.getNome()+
                "\nCPF: "+c.getCpf()+"\nNascimento: "+c.getDataNascimento()+"\nEmail: "+c.getEmail()+"\nTelefone: "+
                c.getTelefone()+"\nEndereço: "+c.getEndereco()+"\nProfissao: "+c.getProfissao()+"\n\nSenha: "+c.getSenha()+
                "\nConfirma senha: "+c.getConfirmaSenha());
    }//GEN-LAST:event_jButton_mostrarActionPerformed

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
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cliente().setVisible(true);
            }
        });
    }
    public PessoaFisica MostarPessoa(){
        com.mycompany.Turma753Senac.Model.PessoaFisica cc = new com.mycompany.Turma753Senac.Model.PessoaFisica();
        
        cc.setNomeUsuario(jTextField_nomeUsuario.getText());
        cc.setNome(jTextField_nome.getText());
        cc.setCpf(jTextField_Cpf.getText());
        cc.setDataNascimento(jTextField_nascimento.getText());
        cc.setEmail(jTextField_email.getText());
        cc.setTelefone(jTextField_telefone.getText());
        cc.setEndereco(jTextArea_endereco.getText());
        cc.setProfissao(jTextField_profissao.getText());
        cc.setSenha(jPasswordField_senha.getPassword());
        cc.setConfirmaSenha(jPasswordField_confirmeSenha.getPassword());
        return cc;
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup_FisicoxJuridico;
    private javax.swing.JButton jButton_cadatrar;
    private javax.swing.JButton jButton_limpar;
    private javax.swing.JButton jButton_mostrar;
    private javax.swing.JButton jButton_sair;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox_genero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_Cpf;
    private javax.swing.JLabel jLabel_Titulo;
    private javax.swing.JLabel jLabel_confirmeSenha;
    private javax.swing.JLabel jLabel_email;
    private javax.swing.JLabel jLabel_endereco;
    private javax.swing.JLabel jLabel_genero;
    private javax.swing.JLabel jLabel_nascimento;
    private javax.swing.JLabel jLabel_nome;
    private javax.swing.JLabel jLabel_nomeLogin;
    private javax.swing.JLabel jLabel_profissao;
    private javax.swing.JLabel jLabel_senha;
    private javax.swing.JLabel jLabel_telefone;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField_confirmeSenha;
    private javax.swing.JPasswordField jPasswordField_senha;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea_endereco;
    private javax.swing.JTextField jTextField_Cpf;
    private javax.swing.JTextField jTextField_email;
    private javax.swing.JTextField jTextField_nascimento;
    private javax.swing.JTextField jTextField_nome;
    private javax.swing.JTextField jTextField_nomeUsuario;
    private javax.swing.JTextField jTextField_profissao;
    private javax.swing.JTextField jTextField_telefone;
    // End of variables declaration//GEN-END:variables

   
}
