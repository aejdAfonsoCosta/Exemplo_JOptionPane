package psi.exemplos_joptionpane;

import javax.swing.JOptionPane;

public class Exemplos extends javax.swing.JFrame {

    public Exemplos() {
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

        botaoDialogoInformacao = new javax.swing.JButton();
        botaoDialogoAviso = new javax.swing.JButton();
        botaoDialogoErro = new javax.swing.JButton();
        botaoConfirmarOkCancel = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        terminal = new javax.swing.JTextArea();
        botaoConfirmarYesNo = new javax.swing.JButton();
        botaoConfirmarNaoSim = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Exemplos - JOptionPane");
        setResizable(false);

        botaoDialogoInformacao.setText("Mensagem / Informação");
        botaoDialogoInformacao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoDialogoInformacaoMouseClicked(evt);
            }
        });

        botaoDialogoAviso.setText("Mensagem / Aviso");
        botaoDialogoAviso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoDialogoAvisoMouseClicked(evt);
            }
        });

        botaoDialogoErro.setText("Mensagem / Erro");
        botaoDialogoErro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoDialogoErroMouseClicked(evt);
            }
        });

        botaoConfirmarOkCancel.setText("Confirmar / Ok | Cancel");
        botaoConfirmarOkCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoConfirmarOkCancelMouseClicked(evt);
            }
        });

        terminal.setBackground(new java.awt.Color(62, 54, 54));
        terminal.setColumns(20);
        terminal.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        terminal.setForeground(new java.awt.Color(67, 255, 66));
        terminal.setRows(5);
        jScrollPane1.setViewportView(terminal);

        botaoConfirmarYesNo.setText("Confirmar / Yes | No");
        botaoConfirmarYesNo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoConfirmarYesNoMouseClicked(evt);
            }
        });

        botaoConfirmarNaoSim.setFont(new java.awt.Font("Ubuntu", 1, 13)); // NOI18N
        botaoConfirmarNaoSim.setText("Confirmar / Não | Sim");
        botaoConfirmarNaoSim.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoConfirmarNaoSimMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(botaoDialogoInformacao, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                            .addComponent(botaoDialogoAviso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botaoDialogoErro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botaoConfirmarOkCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoConfirmarYesNo, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoConfirmarNaoSim, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoDialogoInformacao, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoConfirmarOkCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoConfirmarYesNo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoDialogoAviso, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoConfirmarNaoSim, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoDialogoErro, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoDialogoInformacaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoDialogoInformacaoMouseClicked
        JOptionPane.showMessageDialog(null,
            "Mensagem de Informação.",
            "Título da Janela",
            JOptionPane.INFORMATION_MESSAGE);
        
        terminal.append("> Não devolve nada.\n");
    }//GEN-LAST:event_botaoDialogoInformacaoMouseClicked

    private void botaoDialogoAvisoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoDialogoAvisoMouseClicked
        JOptionPane.showMessageDialog(null,
            "Mensagem de Aviso.",
            "Título da Janela",
            JOptionPane.WARNING_MESSAGE);        
        
        terminal.append("> Não devolve nada.\n");
    }//GEN-LAST:event_botaoDialogoAvisoMouseClicked

    private void botaoDialogoErroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoDialogoErroMouseClicked
        JOptionPane.showMessageDialog(null,
            "Mensagem de ERRO.",
            "Título da Janela",
            JOptionPane.ERROR_MESSAGE);        

        terminal.append("> Não devolve nada.\n");
    }//GEN-LAST:event_botaoDialogoErroMouseClicked

    private void botaoConfirmarOkCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoConfirmarOkCancelMouseClicked
        int resposta = JOptionPane.showConfirmDialog(null,
            "Mensagem de Pergunta?",
            "Título da Janela",
            JOptionPane.CANCEL_OPTION);
        
        terminal.append("> Pergunta [Ok | Cancel]: "+resposta+"\n");
    }//GEN-LAST:event_botaoConfirmarOkCancelMouseClicked

    private void botaoConfirmarYesNoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoConfirmarYesNoMouseClicked
        int resposta = JOptionPane.showConfirmDialog(null,
            "Mensagem de Pergunta?",
            "Título da Janela",
            JOptionPane.YES_NO_OPTION);
        
        terminal.append("> Pergunta [Yes | No]: "+resposta+"\n");        
    }//GEN-LAST:event_botaoConfirmarYesNoMouseClicked

    private void botaoConfirmarNaoSimMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoConfirmarNaoSimMouseClicked
        // Este exemplo ilustra como ter respostas personalizadas
        // numa janela de diálogo.
        
        String opcoes[] = {"Não", "Sim"}; // As opções têm de estar armazenadas 
                                          // num array, e podem ser mais de
                                          // duas.
        int resposta = JOptionPane.showOptionDialog(null,
            "Mensagem de Pergunta.",
            "Título da Janela",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE, // define o ícone ?
            null,       // para ícone personalizado, se aplicável
            opcoes,     // opcões a apresentar
            opcoes[0]); // opção predefinida, neste caso é «Não»
            
        
        terminal.append("> Pergunta [Não | Sim]: "+resposta+"\n");        
    }//GEN-LAST:event_botaoConfirmarNaoSimMouseClicked

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
            java.util.logging.Logger.getLogger(Exemplos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Exemplos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Exemplos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Exemplos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Exemplos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoConfirmarNaoSim;
    private javax.swing.JButton botaoConfirmarOkCancel;
    private javax.swing.JButton botaoConfirmarYesNo;
    private javax.swing.JButton botaoDialogoAviso;
    private javax.swing.JButton botaoDialogoErro;
    private javax.swing.JButton botaoDialogoInformacao;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea terminal;
    // End of variables declaration//GEN-END:variables
}
