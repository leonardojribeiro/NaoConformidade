/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.setor;

import resources.Resources;
import java.lang.String;
import controller.SetorController;
import dao.ResponsavelDao;
import dao.SetorDao;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.function.Consumer;
import javax.swing.JComponent;
import javax.swing.JRootPane;
import javax.swing.KeyStroke;
import model.Responsavel;
import model.Setor;
import view.Mensagens;

/**
 *
 * @author Eduardo
 */
public class FormCadastrar extends javax.swing.JDialog {
    private SetorController setorController;
    private ArrayList<Integer> listaIdResponsavel;
    /**
     * Creates new form CadastroSetores
     */
    public FormCadastrar(java.awt.Frame parent, boolean modal, SetorController setorController) {
        super(parent, modal);
        initComponents();
        this.setorController = setorController;
        listaIdResponsavel = new ArrayList<>();
        txtCodigo.setText(String.format("%010d", setorController.getLastId()+1));
        listarResponsaveis();
    }
    
    @Override
    protected JRootPane createRootPane() {
        // Definindo o ActionListener
        ActionListener actionListener = (ActionEvent e) -> {
            setVisible(false);
        };
        // Definindo o KeyStroke
        KeyStroke stroke = KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0);
        // Criando uma instancia de JRootPane
        JRootPane rootPane = new JRootPane();
        // Registrando o KeyStroke enquanto o JDialog estiver em foco
        rootPane.registerKeyboardAction(
        actionListener, stroke, JComponent.WHEN_IN_FOCUSED_WINDOW);
        // Retornando o novo e modificado JRootPane
        return rootPane;
    }
    
    private void listarResponsaveis(){
        cbBoxResponsavel.removeAllItems();
        setorController.listarResponsaveis(this::popularComboBox);
    }
    
    private void popularComboBox(Responsavel responsavel){
        listaIdResponsavel.add(responsavel.getId());
        cbBoxResponsavel.addItem(responsavel.getNome());
    }
    
    private void salvar(){
        if(setorController.adicionar(
                new Setor(
                        0,
                        txtNome.getText(), 
                        new Responsavel(
                                listaIdResponsavel.get(cbBoxResponsavel.getSelectedIndex())
                        )
                ))){
            Mensagens.mensagem(this, "Setor salvo com sucesso!", "Sucesso ao salvar", Resources.SUCESSO);
                dispose();
            }
            else{
                Mensagens.mensagem(this, "Setor não salvo!", "Erro ao salvar", Resources.ERRO);
            }
       }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        txtNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cbBoxResponsavel = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        txtCodigo = new javax.swing.JTextField();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastro de Setor", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        txtNome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Nome do Setor");

        cbBoxResponsavel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbBoxResponsavel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbBoxResponsavelActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Responsável pelo Setor");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Código");

        btnSalvar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        txtCodigo.setEditable(false);
        txtCodigo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSalvar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(txtNome, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
                            .addComponent(jLabel4)
                            .addComponent(cbBoxResponsavel, 0, 267, Short.MAX_VALUE)
                            .addComponent(txtCodigo))
                        .addGap(0, 56, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbBoxResponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnSalvar)
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbBoxResponsavelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbBoxResponsavelActionPerformed
        
    }//GEN-LAST:event_cbBoxResponsavelActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        salvar();
    }//GEN-LAST:event_btnSalvarActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> cbBoxResponsavel;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
