/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import clase.Cuenta;
import javax.swing.JOptionPane;

/**
 *
 * @author Payares
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
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
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtNumCuenta = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtIdCliente = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtSaldoActual = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtIntAnual = new javax.swing.JTextField();
        cmdGuardar = new javax.swing.JButton();
        cmdRealizarOperacion = new javax.swing.JButton();
        cmdLimpiar = new javax.swing.JButton();
        cmbOperacion = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        cmdSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setText("Datos de cuenta");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 150, -1));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos basicos:\n", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText(" Cuenta:");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        txtNumCuenta.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        txtNumCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumCuentaActionPerformed(evt);
            }
        });
        txtNumCuenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumCuentaKeyTyped(evt);
            }
        });
        jPanel4.add(txtNumCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 170, 30));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setText("ID :");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, -1, -1));

        txtIdCliente.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        txtIdCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdClienteActionPerformed(evt);
            }
        });
        txtIdCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdClienteKeyTyped(evt);
            }
        });
        jPanel4.add(txtIdCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 170, 30));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setText("Saldo Actual:");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        txtSaldoActual.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        txtSaldoActual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSaldoActualActionPerformed(evt);
            }
        });
        txtSaldoActual.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSaldoActualKeyTyped(evt);
            }
        });
        jPanel4.add(txtSaldoActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 170, 30));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel5.setText("Interes Anual :");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        txtIntAnual.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        txtIntAnual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIntAnualActionPerformed(evt);
            }
        });
        txtIntAnual.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIntAnualKeyTyped(evt);
            }
        });
        jPanel4.add(txtIntAnual, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 170, 30));

        cmdGuardar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cmdGuardar.setText("Guardar");
        cmdGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdGuardarActionPerformed(evt);
            }
        });
        jPanel4.add(cmdGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 80, -1));

        cmdRealizarOperacion.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cmdRealizarOperacion.setText("Operar");
        cmdRealizarOperacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdRealizarOperacionActionPerformed(evt);
            }
        });
        jPanel4.add(cmdRealizarOperacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 80, -1));

        cmdLimpiar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cmdLimpiar.setText("Limpiar");
        cmdLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLimpiarActionPerformed(evt);
            }
        });
        jPanel4.add(cmdLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, -1, -1));

        cmbOperacion.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cmbOperacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escoja...", "Actualizar", "Ingresar", "Retirar", "Mostrar" }));
        jPanel4.add(cmbOperacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, 80, -1));

        jLabel6.setText("%");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, -1, -1));

        cmdSalir.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cmdSalir.setText("Salir");
        cmdSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdSalirActionPerformed(evt);
            }
        });
        jPanel4.add(cmdSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 240, -1, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 380, 280));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNumCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumCuentaActionPerformed

    }//GEN-LAST:event_txtNumCuentaActionPerformed

    private void txtNumCuentaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumCuentaKeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();

        }
    }//GEN-LAST:event_txtNumCuentaKeyTyped

    private void txtIdClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdClienteActionPerformed

    }//GEN-LAST:event_txtIdClienteActionPerformed

    private void txtIdClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdClienteKeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();

        }
    }//GEN-LAST:event_txtIdClienteKeyTyped

    private void txtSaldoActualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSaldoActualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSaldoActualActionPerformed

    private void txtSaldoActualKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSaldoActualKeyTyped
        char c = evt.getKeyChar();

        if ((!Character.isDigit(c)) && (evt.getKeyChar() != '.')) {
            getToolkit().beep();
            evt.consume();

        }
        if (evt.getKeyChar() == '.' && txtSaldoActual.getText().contains(".")) {
            getToolkit().beep();
            evt.consume();

        }
    }//GEN-LAST:event_txtSaldoActualKeyTyped

    private void txtIntAnualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIntAnualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIntAnualActionPerformed

    private void txtIntAnualKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIntAnualKeyTyped
        char c = evt.getKeyChar();

        if ((!Character.isDigit(c)) && (evt.getKeyChar() != '.')) {
            getToolkit().beep();
            evt.consume();

        }
        if (evt.getKeyChar() == '.' && txtIntAnual.getText().contains(".")) {
            getToolkit().beep();
            evt.consume();

        }
    }//GEN-LAST:event_txtIntAnualKeyTyped

    private void cmdGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdGuardarActionPerformed
        if (txtNumCuenta.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Digite Número de cuenta", "error", JOptionPane.ERROR_MESSAGE);
            txtNumCuenta.requestFocusInWindow();
        } else if (Integer.parseInt(txtNumCuenta.getText().trim()) == 0) {
            JOptionPane.showMessageDialog(this, "El número de cuenta no puede ser 0", "error", JOptionPane.ERROR_MESSAGE);
            txtNumCuenta.requestFocusInWindow();
            txtNumCuenta.selectAll();
        } else if (txtIdCliente.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Digite Número de identificación del cliente", "error", JOptionPane.ERROR_MESSAGE);
            txtIdCliente.requestFocusInWindow();
        } else if (Integer.parseInt(txtIdCliente.getText().trim()) == 0) {
            JOptionPane.showMessageDialog(this, "El número de Identificación del cliente no puede ser cero", "error", JOptionPane.ERROR_MESSAGE);
            txtIdCliente.requestFocusInWindow();
            txtIdCliente.selectAll();
        } else if (txtSaldoActual.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Digite Saldo Actual de la cuenta", "error", JOptionPane.ERROR_MESSAGE);
            txtSaldoActual.requestFocusInWindow();
        } else if (Integer.parseInt(txtSaldoActual.getText().trim()) == 0) {
            JOptionPane.showMessageDialog(this, "el saldo actual no puede ser cero", "error", JOptionPane.ERROR_MESSAGE);
            txtSaldoActual.requestFocusInWindow();
            txtSaldoActual.selectAll();
        } else if (txtIntAnual.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Digite Interes Anual", "error", JOptionPane.ERROR_MESSAGE);
            txtIntAnual.requestFocusInWindow();
        } else if (Integer.parseInt(txtIntAnual.getText().trim()) == 0) {
            JOptionPane.showMessageDialog(this, "El interes anual no puede ser 0", "error", JOptionPane.ERROR_MESSAGE);
            txtIntAnual.requestFocusInWindow();
            txtIntAnual.selectAll();
        } else {
            JOptionPane.showMessageDialog(this, "Cuenta guardada exitosamente");
            txtNumCuenta.setEditable(false);
            txtIdCliente.setEditable(false);
            txtSaldoActual.setEditable(false);
            txtIntAnual.setEditable(false);
            cmdGuardar.setEnabled(false);
            cmbOperacion.setEnabled(true);
            cmdRealizarOperacion.setEnabled(true);
            cmdLimpiar.setEnabled(true);
        }
    }//GEN-LAST:event_cmdGuardarActionPerformed

    private void cmdRealizarOperacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdRealizarOperacionActionPerformed
      
        Cuenta c, info;
        int num_cuenta, id_cliente, op;
        String datos, ret;
        double saldo_actual, interes, ingreso = 0, act = 0, retiro;
        num_cuenta = Integer.parseInt(txtNumCuenta.getText());
        id_cliente = Integer.parseInt(txtIdCliente.getText());
        saldo_actual = Double.parseDouble(txtSaldoActual.getText());
        interes = Double.parseDouble(txtIntAnual.getText());
        op = cmbOperacion.getSelectedIndex();
        c = new Cuenta(num_cuenta, id_cliente, saldo_actual, interes);
        switch (op) {
            case 0:
            JOptionPane.showMessageDialog(this, "Seleccione operacion a realizar", "Error", JOptionPane.ERROR_MESSAGE);
            cmbOperacion.requestFocusInWindow();
            break;
            case 1:
            act = c.actualizar_saldo();
            txtSaldoActual.setText("" + act);
            JOptionPane.showMessageDialog(this, "Saldo actualizado correctamente");
            break;
            case 2:
            int sw = 1;
            do {
                try {
                    ingreso = Double.parseDouble(JOptionPane.showInputDialog(this, "Dinero a ingresar en la cuenta"));
                    act = c.ingresar(ingreso);
                    if (act == 0) {
                        JOptionPane.showMessageDialog(this, "El valor a ingresar no puede ser negativo", "Error", JOptionPane.ERROR_MESSAGE);
                        sw = 1;
                    } else {
                        JOptionPane.showMessageDialog(this, "Saldo ingresado correctamente a la cuenta");
                        txtSaldoActual.setText("" + act);
                        sw = 1;
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(this, "digite un numero valido", "Error", JOptionPane.ERROR_MESSAGE);
                    sw = 0;
                } catch (NullPointerException e) {
                    int res = JOptionPane.showConfirmDialog(this, "¿Seguro que deseas salir?", "Salir", JOptionPane.YES_NO_OPTION);
                    if (res == 0) {
                        sw = 1;
                    } else {
                        sw = 0;
                    }
                }
            } while (sw == 0);

            break;
            case 3:
            sw = 1;
            do {
                try {
                    retiro = Double.parseDouble(JOptionPane.showInputDialog(this, "Dinero a retirar de la cuenta"));
                    act = c.retirar(retiro);
                    if (act >= 0) {
                        JOptionPane.showMessageDialog(this, "Saldo retirado correctamente");
                        txtSaldoActual.setText("" + act);
                        sw = 1;
                    } else {
                        JOptionPane.showMessageDialog(this, "El valor a retirar invalido", "Error", JOptionPane.ERROR_MESSAGE);
                        sw = 1;
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(this, "digite un numero valido", "Error", JOptionPane.ERROR_MESSAGE);
                    sw = 0;
                } catch (NullPointerException e) {
                    int res = JOptionPane.showConfirmDialog(this, "¿Seguro que deseas salir?", "Salir", JOptionPane.YES_NO_OPTION);
                    if (res == 0) {
                        sw = 1;
                    } else {
                        sw = 0;
                    }
                }
            } while (sw == 0);

            break;
            case 4:
            info = c.mostrar();
            datos = "El numero de la cuenta es: " + info.getNum_cuenta() + "\n"
            + "El numero de identificacion del cliente es: " + info.getI_cliente() + "\n"
            + "El saldo actual es: " + info.getS_actual() + " \n"
            + "El interes anual es de: " + info.getInteres() + "%";
           JOptionPane.showMessageDialog(this, datos);
            break;

        }
    }//GEN-LAST:event_cmdRealizarOperacionActionPerformed

    private void cmdLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLimpiarActionPerformed
        txtNumCuenta.setText("");
        txtIdCliente.setText("");
        txtSaldoActual.setText("");
        txtIntAnual.setText("");
        txtNumCuenta.setEditable(true);
        txtIdCliente.setEditable(true);
        txtSaldoActual.setEditable(true);
        txtIntAnual.setEditable(true);
        cmdGuardar.setEnabled(true);
        cmbOperacion.setEnabled(false);
        cmbOperacion.setSelectedIndex(0);
        cmdRealizarOperacion.setEnabled(false);
        cmdLimpiar.setEnabled(true);
        txtNumCuenta.requestFocusInWindow();
    }//GEN-LAST:event_cmdLimpiarActionPerformed

    private void cmdSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdSalirActionPerformed
   
        System.exit(0);
             
    }//GEN-LAST:event_cmdSalirActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbOperacion;
    private javax.swing.JButton cmdGuardar;
    private javax.swing.JButton cmdLimpiar;
    private javax.swing.JButton cmdRealizarOperacion;
    private javax.swing.JButton cmdSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField txtIdCliente;
    private javax.swing.JTextField txtIntAnual;
    private javax.swing.JTextField txtNumCuenta;
    private javax.swing.JTextField txtSaldoActual;
    // End of variables declaration//GEN-END:variables
}
