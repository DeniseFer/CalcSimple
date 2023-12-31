
package br.edu.login.view;
import br.edu.TelaEscolha.TelaEscolha;
import java.text.DecimalFormat;

/**
 * 
 * Tela da calculadora de IMC (Índice de massa corporal).
 */
public class calcIMC extends javax.swing.JFrame {

    /**
     * Creates new form calcIMC
     */
    public calcIMC() {
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

        jPanel1 = new javax.swing.JPanel();
        Peso = new javax.swing.JTextField();
        ResultIMC = new javax.swing.JTextField();
        Altura = new javax.swing.JTextField();
        btnRetornar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        MenuBar = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Peso.setBackground(new java.awt.Color(192, 228, 255));
        Peso.setBorder(null);
        Peso.setOpaque(false);
        Peso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PesoActionPerformed(evt);
            }
        });
        jPanel1.add(Peso, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 240, 50));

        ResultIMC.setEditable(false);
        ResultIMC.setBackground(new java.awt.Color(192, 228, 255));
        ResultIMC.setBorder(null);
        ResultIMC.setOpaque(false);
        ResultIMC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResultIMCActionPerformed(evt);
            }
        });
        jPanel1.add(ResultIMC, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 520, 240, 50));

        Altura.setBackground(new java.awt.Color(192, 228, 255));
        Altura.setBorder(null);
        Altura.setOpaque(false);
        jPanel1.add(Altura, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 240, 50));

        btnRetornar.setBorder(null);
        btnRetornar.setContentAreaFilled(false);
        btnRetornar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRetornarMouseClicked(evt);
            }
        });
        btnRetornar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetornarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRetornar, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 10, 80, 80));

        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, 190, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/login/images/5.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        setJMenuBar(MenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void PesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PesoActionPerformed
      
    }//GEN-LAST:event_PesoActionPerformed
    /**
     * 
     * Botão que, pressionado, mostra o resultado do cálculo IMC
     */
    private void ResultIMCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResultIMCActionPerformed
    DecimalFormat decimalFormat = new DecimalFormat("#.##");
        String resultadoFormatado = decimalFormat.format(ResultIMC);

        ResultIMC.setText(resultadoFormatado);
        
 
    }//GEN-LAST:event_ResultIMCActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
             double pegarAlt = Double.parseDouble(Altura.getText().replace(",", "."));
             double pegarPeso = Double.parseDouble(Peso.getText().replace(",", "."));
             double resultado = pegarPeso/(pegarAlt*pegarAlt);
             String Transformar = String.valueOf(resultado);
             ResultIMC.setText(Transformar);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnRetornarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetornarActionPerformed
       TelaEscolha calc = new TelaEscolha();
       this.dispose();
       calc.setVisible(true);
    }//GEN-LAST:event_btnRetornarActionPerformed

    private void btnRetornarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRetornarMouseClicked
        TelaEscolha calc = new TelaEscolha();
        this.dispose();
        calc.setVisible(true);
    }//GEN-LAST:event_btnRetornarMouseClicked

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
            java.util.logging.Logger.getLogger(calcIMC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calcIMC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calcIMC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calcIMC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calcIMC().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Altura;
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JTextField Peso;
    private javax.swing.JTextField ResultIMC;
    private javax.swing.JButton btnRetornar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
