/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import javax.swing.JOptionPane;
import modelos.NNatural;
import javax.swing.table.DefaultTableModel;


public class TelaPrincipal extends javax.swing.JFrame {

    
    public TelaPrincipal() {
        initComponents();
}

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldPrimeiroNNatural = new javax.swing.JTextField();
        jTextFieldSegundoNNatural = new javax.swing.JTextField();
        jButtonExecutar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableNumeros = new javax.swing.JTable();
        jButtonReset = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SISTEMA DE NUMEROS NATURAIS");
        setBackground(new java.awt.Color(102, 102, 102));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        setForeground(new java.awt.Color(102, 102, 102));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        jLabel1.setText("PRIMEIRO NÚMERO");

        jLabel2.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        jLabel2.setText("SEGUNDO NÚMERO");

        jTextFieldPrimeiroNNatural.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPrimeiroNNaturalActionPerformed(evt);
            }
        });

        jTextFieldSegundoNNatural.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSegundoNNaturalActionPerformed(evt);
            }
        });

        jButtonExecutar.setBackground(new java.awt.Color(0, 0, 0));
        jButtonExecutar.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        jButtonExecutar.setForeground(new java.awt.Color(204, 204, 204));
        jButtonExecutar.setText("EXECUTAR");
        jButtonExecutar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonExecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExecutarActionPerformed(evt);
            }
        });

        jTableNumeros.setBackground(new java.awt.Color(51, 51, 51));
        jTableNumeros.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 255, 255), new java.awt.Color(153, 153, 153)));
        jTableNumeros.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        jTableNumeros.setForeground(new java.awt.Color(204, 204, 204));
        jTableNumeros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ITENS", "PRIMEIRO NÚMERO", "SEGUNDO NÚMERO"
            }
        ));
        jTableNumeros.setAlignmentY(1.0F);
        jTableNumeros.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTableNumeros.setGridColor(new java.awt.Color(51, 51, 51));
        jScrollPane1.setViewportView(jTableNumeros);

        jButtonReset.setBackground(new java.awt.Color(0, 0, 0));
        jButtonReset.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        jButtonReset.setForeground(new java.awt.Color(204, 204, 204));
        jButtonReset.setText("RESET");
        jButtonReset.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResetActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Cooper Black", 0, 24)); // NOI18N
        jLabel3.setText("NÚMEROS NATURAIS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextFieldPrimeiroNNatural, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextFieldSegundoNNatural, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonReset))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(333, 333, 333)
                        .addComponent(jButtonExecutar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 599, Short.MAX_VALUE)
                    .addComponent(jSeparator1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jSeparator2))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldPrimeiroNNatural, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldSegundoNNatural, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonExecutar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jButtonReset, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonExecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExecutarActionPerformed
        try {
            
            NNatural primeiroNumero = new NNatural();
            primeiroNumero.setNumero(Long.parseLong(jTextFieldPrimeiroNNatural.getText()));
            
            NNatural segundoNumero = new NNatural(Long.parseLong(jTextFieldSegundoNNatural.getText()));
            
            DefaultTableModel model = (DefaultTableModel) jTableNumeros.getModel();
            
            String[] vetString = new String [3];
            
            
            vetString[0] = "QUADRADO PERFEITO";
            if(primeiroNumero.eQuadradoPerfeito()==true) vetString[1] = "SIM";
            else vetString [1] = "NÃO";
            if(segundoNumero.eQuadradoPerfeito()==true) vetString[2] = "SIM";
            else vetString [2] = "NÃO";
            model.addRow(vetString);
            
            vetString[0] = "PRIMO";
            if(primeiroNumero.ePrimo()==true) vetString[1] = "SIM";
            else vetString [1] = "NÃO";
            if(segundoNumero.ePrimo()==true) vetString[2] = "SIM";
            else vetString [2] = "NÃO";
            model.addRow(vetString);
            
            vetString[0] = "CAPICUA";
            if(primeiroNumero.eCapicua()==true) vetString[1] = "SIM";
            else vetString [1] = "NÃO";
            if(segundoNumero.eCapicua()==true) vetString[2] = "SIM";
            else vetString [2] = "NÃO";
            model.addRow(vetString);
            
            vetString[0] = "PERFEITO";
            if(primeiroNumero.ePerfeito()==true) vetString[1] = "SIM";
            else vetString [1] = "NÃO";
            if(segundoNumero.ePerfeito()==true) vetString[2] = "SIM";
            else vetString [2] = "NÃO";
            model.addRow(vetString);
            
            vetString[0] = "PRIMOS ENTRE SI";
            
            if(primeiroNumero.ePrimoEntreSi(segundoNumero)==true) vetString[1] = "SIM";
            else vetString [1] = "NÃO";
            if(primeiroNumero.ePrimoEntreSi(segundoNumero)==true) vetString[2] = "SIM";
            else vetString [2] = "NÃO";
            model.addRow(vetString);
            
            vetString[0] = "FATORIAL";
            if(primeiroNumero.getNumero()>=21) vetString[1] = "Out of range!";
            else
            vetString[1] = primeiroNumero.calcularFatorial().getNumero()+"";
            if(segundoNumero.getNumero()>=21) vetString[2] = "Out of range!";
            else
            vetString[2] = segundoNumero.calcularFatorial().getNumero()+"";
            model.addRow(vetString);
            
            vetString[0] = "MDC";
            vetString[1] = primeiroNumero.mDC(segundoNumero).getNumero() + "";
            vetString[2] = primeiroNumero.mDC(segundoNumero).getNumero() + "";
            model.addRow(vetString);
            
            vetString [0] = "MMC";
            vetString [1]= primeiroNumero.mMC(segundoNumero).getNumero()+ "";
            vetString [2]= primeiroNumero.mMC(segundoNumero).getNumero()+ "";
            model.addRow(vetString);
            
            vetString[0] = "Base 2";
            vetString[1] = primeiroNumero.base(2);
            vetString[2] = segundoNumero.base(2);
            model.addRow(vetString);
            
            vetString[0] = "Base 8";
            vetString[1] = primeiroNumero.base(8);
            vetString[2] = segundoNumero.base(8);
            model.addRow(vetString);
            
            vetString[0] = "Base 16";
            vetString[1] = primeiroNumero.base(16);
            vetString[2] = segundoNumero.base(16);
            model.addRow(vetString);
            
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, erro.getMessage());
        }
    }//GEN-LAST:event_jButtonExecutarActionPerformed

    private void jButtonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResetActionPerformed
        
        jTextFieldPrimeiroNNatural.setText("");
        jTextFieldSegundoNNatural.setText("");
        DefaultTableModel model = (DefaultTableModel) jTableNumeros.getModel();
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();
        
    }//GEN-LAST:event_jButtonResetActionPerformed

    private void jTextFieldPrimeiroNNaturalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPrimeiroNNaturalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPrimeiroNNaturalActionPerformed

    private void jTextFieldSegundoNNaturalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSegundoNNaturalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSegundoNNaturalActionPerformed

  
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
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
    private javax.swing.JButton jButtonExecutar;
    private javax.swing.JButton jButtonReset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTableNumeros;
    private javax.swing.JTextField jTextFieldPrimeiroNNatural;
    private javax.swing.JTextField jTextFieldSegundoNNatural;
    // End of variables declaration//GEN-END:variables
}
