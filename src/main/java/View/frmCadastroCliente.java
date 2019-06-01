package View;

import Dao.ClienteDao;
import Model.Cliente;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author uemerson
 */
public class frmCadastroCliente extends javax.swing.JFrame {

    public frmCadastroCliente() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnNovo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cbEstado = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnProcurar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        btnNovo.setText("NOVO");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnEditar.setText("EDITAR");
        btnEditar.setEnabled(false);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnExcluir.setText("EXCLUIR");
        btnExcluir.setEnabled(false);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnCancelar.setText("CANCELAR");
        btnCancelar.setEnabled(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnSalvar.setText("SALVAR");
        btnSalvar.setEnabled(false);
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("ID");

        txtId.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtId.setEnabled(false);

        jLabel2.setText("Nome*");

        txtNome.setEnabled(false);

        jLabel3.setText("Estado");

        cbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
        cbEstado.setSelectedIndex(-1);
        cbEstado.setEnabled(false);

        jLabel4.setText("Cidade");

        txtCidade.setEnabled(false);

        jLabel5.setText("Endereço");

        txtEndereco.setEnabled(false);

        jLabel6.setText("Campos com * devem ser preenchidos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNome)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(cbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(87, 87, 87)
                                .addComponent(jLabel3)))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtCidade)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtEndereco)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel6)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnProcurar.setText("PROCURAR");
        btnProcurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcurarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnProcurar, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                            .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnProcurar)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditar)
                    .addComponent(btnExcluir)
                    .addComponent(btnSalvar)
                    .addComponent(btnCancelar)
                    .addComponent(btnNovo))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnProcurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcurarActionPerformed
        frmProcurarCliente dialog = new frmProcurarCliente(null, true);
        dialog.setVisible(true);

        if (dialog.getClienteSelecionado() != null) {
            preencheInformacoesCliente(dialog.getClienteSelecionado());
        }
    }//GEN-LAST:event_btnProcurarActionPerformed

    private void preencheInformacoesCliente(Cliente cliente) {

        try {
            txtId.setText(Integer.toString(cliente.getId_cliente()));

            ClienteDao clienteDao = new ClienteDao();
            Cliente clienteConsulta = clienteDao.buscar(cliente);

            txtCidade.setText(clienteConsulta.getCidade());
            txtEndereco.setText(clienteConsulta.getEndereco());
            txtNome.setText(clienteConsulta.getNome());
            cbEstado.setSelectedItem(clienteConsulta.getEstado());

            bloqueiaBotoes();

            btnNovo.setEnabled(true);
            btnProcurar.setEnabled(true);
            btnEditar.setEnabled(true);
            btnExcluir.setEnabled(true);

        } catch (SQLException ex) {
            Logger.getLogger(frmCadastroCliente.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed

        limpaCampos();
        bloqueiaBotoes();
        liberaCampos();

        txtId.setText("NOVO");

        btnCancelar.setEnabled(true);
        btnSalvar.setEnabled(true);

        txtId.setEnabled(false);
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if (txtNome.getText().isEmpty()) {
            JOptionPane.showMessageDialog(
                    null,
                    "O campo Nome tem que ser preenchido!",
                    "Sistema - Cadastro de cliente",
                    JOptionPane.ERROR_MESSAGE);
            txtNome.requestFocusInWindow();
        } else {
            ClienteDao clienteDao = new ClienteDao();
            Cliente cliente = new Cliente();

            cliente.setNome(txtNome.getText().isEmpty() ? null : txtNome.getText());
            cliente.setCidade(txtCidade.getText().isEmpty() ? null : txtCidade.getText());
            cliente.setEndereco(txtEndereco.getText().isEmpty() ? null : txtEndereco.getText());
            cliente.setEstado(cbEstado.getSelectedItem() == null ? null : cbEstado.getSelectedItem().toString());

            if (txtId.getText().equals("NOVO")) {

                try {

                    clienteDao.inserir(cliente);

                    limpaCampos();
                    bloqueiaBotoes();
                    bloqueiaCampos();

                    btnNovo.setEnabled(true);
                    btnProcurar.setEnabled(true);

                    JOptionPane.showMessageDialog(
                            null,
                            "Cliente inserido com sucesso!",
                            "Sistema - Cadastro de cliente",
                            JOptionPane.INFORMATION_MESSAGE);

                } catch (SQLException ex) {
                    Logger.getLogger(frmCadastroCliente.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog(
                            null,
                            "Aconteceu um erro ao inserir o cadastro de cliente",
                            "Sistema - Cadastro de cliente",
                            JOptionPane.ERROR_MESSAGE);
                }
            }else {
                try {
                    
                    cliente.setId_cliente(Integer.parseInt(txtId.getText()));
                    clienteDao.atualizar(cliente);

                    bloqueiaBotoes();
                    bloqueiaCampos();

                    btnNovo.setEnabled(true);
                    btnProcurar.setEnabled(true);
                    btnEditar.setEnabled(true);
                    btnExcluir.setEnabled(true);

                    JOptionPane.showMessageDialog(
                            null,
                            "Cliente atualizado com sucesso!",
                            "Sistema - Cadastro de cliente",
                            JOptionPane.INFORMATION_MESSAGE);

                } catch (SQLException ex) {
                    Logger.getLogger(frmCadastroCliente.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog(
                            null,
                            "Aconteceu um erro ao atualizar o cadastro de cliente",
                            "Sistema - Cadastro de cliente",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        bloqueiaBotoes();
        limpaCampos();
        bloqueiaCampos();

        btnNovo.setEnabled(true);
        btnProcurar.setEnabled(true);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if (JOptionPane.showConfirmDialog(
                null,
                "Deseja realmente excluir o cadastro?",
                "Sistema - Cadastro de cliente",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            ClienteDao clienteDao = new ClienteDao();
            Cliente cliente = new Cliente();

            cliente.setId_cliente(Integer.parseInt(txtId.getText()));

            try {
                clienteDao.excluir(cliente);

                bloqueiaBotoes();
                limpaCampos();
                bloqueiaCampos();

                btnNovo.setEnabled(true);
                btnProcurar.setEnabled(true);
            } catch (SQLException ex) {
                Logger.getLogger(frmCadastroCliente.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(
                        null,
                        "Aconteceu um erro ao excluir o cadastro de cliente",
                        "Sistema - Cadastro de cliente",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        bloqueiaBotoes();
        liberaCampos();

        btnCancelar.setEnabled(true);
        btnSalvar.setEnabled(true);

        txtId.setEnabled(false);
    }//GEN-LAST:event_btnEditarActionPerformed

    private void limpaCampos() {
        txtId.setText(null);
        cbEstado.setSelectedItem(null);
        txtCidade.setText(null);
        txtNome.setText(null);
        txtEndereco.setText(null);
    }

    private void bloqueiaBotoes() {
        btnNovo.setEnabled(false);
        btnEditar.setEnabled(false);
        btnExcluir.setEnabled(false);
        btnProcurar.setEnabled(false);
        btnCancelar.setEnabled(false);
        btnSalvar.setEnabled(false);
    }

    private void bloqueiaCampos() {
        txtId.setEnabled(false);
        txtCidade.setEnabled(false);
        txtNome.setEnabled(false);
        txtEndereco.setEnabled(false);
        cbEstado.setEnabled(false);
    }

    private void liberaCampos() {
        txtId.setEnabled(true);
        txtCidade.setEnabled(true);
        txtEndereco.setEnabled(true);
        txtNome.setEnabled(true);
        cbEstado.setEnabled(true);
    }

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCadastroCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnProcurar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> cbEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
