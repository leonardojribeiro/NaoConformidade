/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view.naoconformidade;

import controller.NaoConformidadeController;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import model.NaoConformidade;

/**
 *
 * @author Ricardo
 */
public class cadatroNaoCoformidade extends javax.swing.JDialog {
    NaoConformidadeController NCController = new controller.NaoConformidadeController();

    /** Creates new form cadatroNaoCoformidade */
    public cadatroNaoCoformidade(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        dataRegistro = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        Codigo = new javax.swing.JTextField();
        Descricao = new javax.swing.JTextField();
        Abrangencia = new javax.swing.JTextField();
        Origem = new javax.swing.JTextField();
        Responsavel = new javax.swing.JComboBox<>();
        AcaoCorrecao = new javax.swing.JTextField();
        btnImg = new javax.swing.JButton();
        Reincidencia = new javax.swing.JCheckBox();
        visualizaImg = new javax.swing.JLabel();
        dateChooserCombo1 = new datechooser.beans.DateChooserCombo();
        dataAcontecimento = new datechooser.beans.DateChooserCombo();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastro de Não Conformidade", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 14))); // NOI18N
        jPanel1.setName("jPanel1"); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Código");
        jLabel1.setName("jLabel1"); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Descrição");
        jLabel2.setName("jLabel2"); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        dataRegistro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        dataRegistro.setText("Data de Registro");
        dataRegistro.setName("dataRegistro"); // NOI18N
        dataRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dataRegistroMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Data do Acontecimento");
        jLabel4.setName("jLabel4"); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Abrangência");
        jLabel6.setName("jLabel6"); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Origem");
        jLabel7.setName("jLabel7"); // NOI18N
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Responsável de Qualidade");
        jLabel8.setName("jLabel8"); // NOI18N
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Ação de Correção");
        jLabel9.setName("jLabel9"); // NOI18N
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Imagem");
        jLabel10.setName("jLabel10"); // NOI18N
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        btnSalvar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.setName("btnSalvar"); // NOI18N
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        Codigo.setEditable(false);
        Codigo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Codigo.setName("Codigo"); // NOI18N

        Descricao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Descricao.setName("Descricao"); // NOI18N
        Descricao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                DescricaoKeyPressed(evt);
            }
        });

        Abrangencia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Abrangencia.setName("Abrangencia"); // NOI18N
        Abrangencia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                AbrangenciaKeyPressed(evt);
            }
        });

        Origem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Origem.setName("Origem"); // NOI18N
        Origem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                OrigemKeyPressed(evt);
            }
        });

        Responsavel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Responsavel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione...", "teste", "talvez" }));
        Responsavel.setName("Responsavel"); // NOI18N
        Responsavel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ResponsavelKeyPressed(evt);
            }
        });

        AcaoCorrecao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        AcaoCorrecao.setName("AcaoCorrecao"); // NOI18N
        AcaoCorrecao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                AcaoCorrecaoKeyPressed(evt);
            }
        });

        btnImg.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnImg.setText("Selecione um arquivo");
        btnImg.setName("btnImg"); // NOI18N
        btnImg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImgActionPerformed(evt);
            }
        });
        btnImg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnImgKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                btnImgKeyReleased(evt);
            }
        });

        Reincidencia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Reincidencia.setText("Reincidência");
        Reincidencia.setName("Reincidencia"); // NOI18N
        Reincidencia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ReincidenciaKeyPressed(evt);
            }
        });

        visualizaImg.setName("visualizaImg"); // NOI18N

        dateChooserCombo1.setFieldFont(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 14));

        dataAcontecimento.setFieldFont(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 14));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel7)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(dataRegistro)
                        .addGap(59, 59, 59)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dataAcontecimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addComponent(jLabel2)
                    .addComponent(dateChooserCombo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel1)
                    .addComponent(AcaoCorrecao, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Reincidencia)
                    .addComponent(jLabel6)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(Origem, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                        .addComponent(Abrangencia, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Descricao, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Codigo, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(Responsavel, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                        .addComponent(jLabel10)
                        .addGap(205, 205, 205))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(btnImg)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(visualizaImg, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(38, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(296, 296, 296)
                .addComponent(btnSalvar)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnImg, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addGap(4, 4, 4)
                        .addComponent(Descricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dataRegistro)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dataAcontecimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dateChooserCombo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Abrangencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Origem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Responsavel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addGap(3, 3, 3)
                        .addComponent(AcaoCorrecao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(visualizaImg, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Reincidencia)
                .addGap(77, 77, 77)
                .addComponent(btnSalvar))
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

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked

    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        Descricao.requestFocusInWindow();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void dataRegistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dataRegistroMouseClicked
        dataRegistro.requestFocusInWindow();
    }//GEN-LAST:event_dataRegistroMouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        dataAcontecimento.requestFocusInWindow();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        Abrangencia.requestFocusInWindow();
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        Origem.requestFocusInWindow();
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        Responsavel.requestFocusInWindow();
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        AcaoCorrecao.requestFocusInWindow();
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        btnImg.requestFocusInWindow();
    }//GEN-LAST:event_jLabel10MouseClicked

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        System.out.println(Descricao.getText());
        System.out.println(Abrangencia.getText());
        System.out.println(Origem.getText());
        System.out.println(AcaoCorrecao.getText());
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void DescricaoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DescricaoKeyPressed
        if(evt.getKeyCode()== KeyEvent.VK_ENTER){
            if(!NCController.validarTexto(Descricao.getText())){

                NCController.obrigatorio(this);;
            }
            else{
                System.out.println(Descricao.getText());
                Abrangencia.requestFocusInWindow();
            }
        }
    }//GEN-LAST:event_DescricaoKeyPressed

    private void AbrangenciaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AbrangenciaKeyPressed
        if(evt.getKeyCode()== KeyEvent.VK_ENTER){
            if(NCController.validarTexto(Abrangencia.getText())){
                NCController.obrigatorio(this);;
            }
            else{
                Origem.requestFocusInWindow();
            }
        }
    }//GEN-LAST:event_AbrangenciaKeyPressed

    private void OrigemKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_OrigemKeyPressed
        if(evt.getKeyCode()== KeyEvent.VK_ENTER){
            if(NCController.validarTexto(Origem.getText())){
                NCController.obrigatorio(this);;
            }
            else{
                Responsavel.requestFocusInWindow();
            }
        }
    }//GEN-LAST:event_OrigemKeyPressed

    private void ResponsavelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ResponsavelKeyPressed
        if(evt.getKeyCode()== KeyEvent.VK_ENTER){
            Reincidencia.requestFocusInWindow();
        }
    }//GEN-LAST:event_ResponsavelKeyPressed

    private void AcaoCorrecaoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AcaoCorrecaoKeyPressed
        if(evt.getKeyCode()== KeyEvent.VK_ENTER){
            btnImg.requestFocusInWindow();
        }
    }//GEN-LAST:event_AcaoCorrecaoKeyPressed

    private void btnImgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImgActionPerformed
        JFileChooser file = new JFileChooser();
        file.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int i= file.showOpenDialog(null);
        if (i==1){
            System.out.println("Nada pegado!");
            visualizaImg.setIcon(null);
        } else {
            File arquivo = file.getSelectedFile();
            System.out.println((arquivo.getPath()));
            BufferedImage imagem = null;
            try {
                imagem = ImageIO.read(arquivo);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, ex);
            }

            float larguraAux = imagem.getWidth() / 300;
            float alturaAux = imagem.getHeight() / 300;
            int largura = 300;
            int altura = 300;
            int larguraFinal;
            int alturaFinal;

            BufferedImage new_img = new BufferedImage(300, 300, BufferedImage.TYPE_INT_RGB);
            Graphics2D g = new_img.createGraphics();
            g.setColor(Color.WHITE);
            g.fillRect(0, 0, 300, 300);

            //primeira divisão
            if(imagem.getWidth() > imagem.getHeight()){ // se a largura é maior que a altura, usa a constante de calculo da largura
                larguraFinal = (int)(imagem.getWidth()/larguraAux);
                alturaFinal = (int) (imagem.getHeight()/larguraAux);
            }
            else { //se não, usa a constante de cálculo da altura
                larguraFinal = (int)(imagem.getWidth()/alturaAux);
                alturaFinal = (int) (imagem.getHeight()/alturaAux);
            }

            g.drawImage(imagem, (largura - larguraFinal)/2 ,(altura - alturaFinal)/2, larguraFinal, alturaFinal, null);
            ImageIcon icon = new ImageIcon(new_img);
            visualizaImg.setIcon(icon);

            /*try {
                String aux= "D:\\Desktop\\teste.png";
                ImageIO.write(new_img, "png", new File(aux));
                ImageIcon icon = new ImageIcon(new_img);
                visualizaImg.setIcon(icon);
                visualizaImg.setText("");

            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, ex);
            }*/
        }

    }//GEN-LAST:event_btnImgActionPerformed

    private void btnImgKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnImgKeyPressed
        if(evt.getKeyCode()== KeyEvent.VK_ENTER){
            btnSalvar.requestFocusInWindow();
        }
    }//GEN-LAST:event_btnImgKeyPressed

    private void btnImgKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnImgKeyReleased

    }//GEN-LAST:event_btnImgKeyReleased

    private void ReincidenciaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ReincidenciaKeyPressed
        if(evt.getKeyCode()== KeyEvent.VK_ENTER){
            AcaoCorrecao.requestFocusInWindow();
        }
    }//GEN-LAST:event_ReincidenciaKeyPressed

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
            java.util.logging.Logger.getLogger(cadatroNaoCoformidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cadatroNaoCoformidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cadatroNaoCoformidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cadatroNaoCoformidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                cadatroNaoCoformidade dialog = new cadatroNaoCoformidade(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Abrangencia;
    private javax.swing.JTextField AcaoCorrecao;
    private javax.swing.JTextField Codigo;
    private javax.swing.JTextField Descricao;
    private javax.swing.JTextField Origem;
    private javax.swing.JCheckBox Reincidencia;
    private javax.swing.JComboBox<String> Responsavel;
    private javax.swing.JButton btnImg;
    private javax.swing.JButton btnSalvar;
    private datechooser.beans.DateChooserCombo dataAcontecimento;
    private javax.swing.JLabel dataRegistro;
    private datechooser.beans.DateChooserCombo dateChooserCombo1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel visualizaImg;
    // End of variables declaration//GEN-END:variables

}
