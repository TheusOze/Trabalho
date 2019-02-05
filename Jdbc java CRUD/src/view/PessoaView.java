
package view;

import dao.PessoaDAO;
import javax.swing.JOptionPane;
import model.Pessoa;
import table.PessoaTabeModel;


public class PessoaView extends javax.swing.JFrame {
        Pessoa pro = new Pessoa();
        PessoaDAO prb = new PessoaDAO();
    
    public PessoaView() {
        initComponents();
        setLocationRelativeTo(null);
        tbPessoa.setModel(new PessoaTabeModel(new PessoaDAO().ListarTodos()));
        btExcluir.setEnabled(false);
        
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfID = new javax.swing.JTextField();
        tfNome = new javax.swing.JTextField();
        tfIdade = new javax.swing.JTextField();
        tfCPF = new javax.swing.JTextField();
        btSalvar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbPessoa = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        tfPesquisar = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pessoa");
        setResizable(false);

        jLabel1.setText("ID:");

        jLabel2.setText("Nome:");

        jLabel3.setText("Idade:");

        jLabel4.setText("CPF:");

        tfID.setEditable(false);
        tfID.setBackground(new java.awt.Color(255, 51, 102));

        tfNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNomeActionPerformed(evt);
            }
        });

        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        btExcluir.setText("Excluir");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        tbPessoa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tbPessoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbPessoaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbPessoa);

        jLabel5.setText("Pesquisar(Pessoa):");

        tfPesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfPesquisarKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfCPF)
                            .addComponent(tfIdade)
                            .addComponent(tfNome)
                            .addComponent(tfID)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btLimpar)
                        .addGap(18, 18, 18)
                        .addComponent(btExcluir)
                        .addGap(29, 29, 29)
                        .addComponent(btSalvar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(tfPesquisar))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSalvar)
                    .addComponent(btExcluir)
                    .addComponent(btLimpar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNomeActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        if(tfNome.getText().equals("") || tfIdade.getText().equals("") || tfCPF.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Campo em Branco!!!", "Pessoa - Aviso", JOptionPane.WARNING_MESSAGE);
        } else{
            if (tfID.getText().equals("")){
            pro.setNome(tfNome.getText()); 
            pro.setIdade(Integer.parseInt(tfIdade.getText()));
            pro.setCpf(Integer.parseInt(tfCPF.getText()));
            prb.Inserir(pro);
            } else {
            pro.setNome(tfNome.getText()); 
            pro.setIdade(Integer.parseInt(tfIdade.getText()));
            pro.setCpf(Integer.parseInt(tfCPF.getText()));
            pro.setID(Integer.parseInt(tfID.getText()));
            prb.Alterar(pro);
            }
        }
        tbPessoa.setModel(new PessoaTabeModel(new PessoaDAO().ListarTodos()));
        tfID.setText("");
        tfNome.setText("");
        tfCPF.setText("");
        tfIdade.setText("");
        tfPesquisar.setText("");
        btExcluir.setEnabled(false);
    }//GEN-LAST:event_btSalvarActionPerformed

    private void tbPessoaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbPessoaMouseClicked
        tfID.setText(tbPessoa.getValueAt(tbPessoa.getSelectedRow(), PessoaTabeModel.COL_ID).toString());
        tfNome.setText(tbPessoa.getValueAt(tbPessoa.getSelectedRow(), PessoaTabeModel.COL_Nome).toString());
        tfIdade.setText(tbPessoa.getValueAt(tbPessoa.getSelectedRow(), PessoaTabeModel.COL_Idade).toString());
        tfCPF.setText(tbPessoa.getValueAt(tbPessoa.getSelectedRow(), PessoaTabeModel.COL_cpf).toString());
        btExcluir.setEnabled(true);
    }//GEN-LAST:event_tbPessoaMouseClicked

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        tbPessoa.setModel(new PessoaTabeModel(new PessoaDAO().ListarTodos()));
        tfID.setText("");
        tfNome.setText("");
        tfCPF.setText("");
        tfIdade.setText("");
        tfPesquisar.setText("");
    }//GEN-LAST:event_btLimparActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        int escolha = JOptionPane.showConfirmDialog(null, "Quer Excluir?", "Pessoa - Excluir", JOptionPane.YES_NO_OPTION);
        if(escolha == 0){
            int ID = Integer.parseInt(tfID.getText());
            prb.Excluir(ID);
            tbPessoa.setModel(new PessoaTabeModel(new PessoaDAO().ListarTodos()));
            tfID.setText("");
            tfNome.setText("");
            tfCPF.setText("");
            tfIdade.setText("");
            tfPesquisar.setText("");   
            btExcluir.setEnabled(false);
        }
        
    }//GEN-LAST:event_btExcluirActionPerformed

    private void tfPesquisarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfPesquisarKeyPressed
        String pesquisa  = tfPesquisar.getText();
        tbPessoa.setModel(new PessoaTabeModel(new PessoaDAO().ListarTodosSelect(pesquisa)));
    }//GEN-LAST:event_tfPesquisarKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbPessoa;
    private javax.swing.JTextField tfCPF;
    private javax.swing.JTextField tfID;
    private javax.swing.JTextField tfIdade;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfPesquisar;
    // End of variables declaration//GEN-END:variables
}
