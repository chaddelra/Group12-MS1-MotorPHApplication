/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package MPHpages;

/**
 *
 * @author Dell
 */
public class RequestLeavePage extends javax.swing.JFrame {

    /**
     * Creates new form RequestLeavePage
     */
    public RequestLeavePage() {
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

        leavemainPNL = new javax.swing.JPanel();
        leaveheaderPNL = new javax.swing.JPanel();
        leaveheaderLBL = new javax.swing.JLabel();
        backbuttonreqleavePB = new javax.swing.JButton();
        leaverecordTP = new javax.swing.JTabbedPane();
        leavescrollSP = new javax.swing.JScrollPane();
        rlfirstnameLBL = new javax.swing.JLabel();
        rllastnameLBL = new javax.swing.JLabel();
        rlpositionLBL = new javax.swing.JLabel();
        rlsupervisorLBL = new javax.swing.JLabel();
        rllastnameTF = new javax.swing.JTextField();
        rlfirstnameTF = new javax.swing.JTextField();
        rlpositionTF = new javax.swing.JTextField();
        rlsupervisorTF = new javax.swing.JTextField();
        typeofleaveLBL = new javax.swing.JLabel();
        typeofleaveCB = new javax.swing.JComboBox<>();
        submitleavePB = new javax.swing.JButton();
        clearleavePB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        leavemainPNL.setBackground(new java.awt.Color(204, 204, 204));

        leaveheaderLBL.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        leaveheaderLBL.setText("Request Leave Management");

        backbuttonreqleavePB.setBackground(new java.awt.Color(204, 0, 0));
        backbuttonreqleavePB.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        backbuttonreqleavePB.setText("Back");
        backbuttonreqleavePB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbuttonreqleavePBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout leaveheaderPNLLayout = new javax.swing.GroupLayout(leaveheaderPNL);
        leaveheaderPNL.setLayout(leaveheaderPNLLayout);
        leaveheaderPNLLayout.setHorizontalGroup(
            leaveheaderPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leaveheaderPNLLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(backbuttonreqleavePB, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(175, 175, 175)
                .addComponent(leaveheaderLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(284, Short.MAX_VALUE))
        );
        leaveheaderPNLLayout.setVerticalGroup(
            leaveheaderPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leaveheaderPNLLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(leaveheaderPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(leaveheaderLBL)
                    .addComponent(backbuttonreqleavePB, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        leaverecordTP.setBackground(new java.awt.Color(102, 102, 102));
        leaverecordTP.addTab("tab1", leavescrollSP);

        rlfirstnameLBL.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rlfirstnameLBL.setForeground(new java.awt.Color(0, 0, 0));
        rlfirstnameLBL.setText("First Name:");

        rllastnameLBL.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rllastnameLBL.setForeground(new java.awt.Color(0, 0, 0));
        rllastnameLBL.setText("Last Name:");

        rlpositionLBL.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rlpositionLBL.setForeground(new java.awt.Color(0, 0, 0));
        rlpositionLBL.setText("Position:");

        rlsupervisorLBL.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rlsupervisorLBL.setForeground(new java.awt.Color(0, 0, 0));
        rlsupervisorLBL.setText("Immediate Supervisor:");

        rlfirstnameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rlfirstnameTFActionPerformed(evt);
            }
        });

        typeofleaveLBL.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        typeofleaveLBL.setForeground(new java.awt.Color(0, 0, 0));
        typeofleaveLBL.setText("Type of Leave:");

        typeofleaveCB.setBackground(new java.awt.Color(18, 30, 49));
        typeofleaveCB.setEditable(true);
        typeofleaveCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Medical Leave", "Annual Leave", "Emergency Leave", "Paternity Leave", "Maternity Leave" }));
        typeofleaveCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeofleaveCBActionPerformed(evt);
            }
        });

        submitleavePB.setText("Submit");

        clearleavePB.setText("Clear");

        javax.swing.GroupLayout leavemainPNLLayout = new javax.swing.GroupLayout(leavemainPNL);
        leavemainPNL.setLayout(leavemainPNLLayout);
        leavemainPNLLayout.setHorizontalGroup(
            leavemainPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(leaveheaderPNL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(leavemainPNLLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(leavemainPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(leavemainPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(rlfirstnameLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rllastnameTF)
                        .addComponent(rllastnameLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rlfirstnameTF, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
                        .addComponent(rlpositionLBL)
                        .addComponent(rlpositionTF, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
                        .addComponent(rlsupervisorLBL)
                        .addComponent(rlsupervisorTF, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
                        .addComponent(typeofleaveLBL)
                        .addComponent(typeofleaveCB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(leavemainPNLLayout.createSequentialGroup()
                        .addComponent(submitleavePB, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(clearleavePB, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(leaverecordTP, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        leavemainPNLLayout.setVerticalGroup(
            leavemainPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leavemainPNLLayout.createSequentialGroup()
                .addComponent(leaveheaderPNL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(leavemainPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(leavemainPNLLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(leaverecordTP, javax.swing.GroupLayout.DEFAULT_SIZE, 448, Short.MAX_VALUE))
                    .addGroup(leavemainPNLLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(rlfirstnameLBL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rlfirstnameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(rllastnameLBL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rllastnameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(rlpositionLBL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rlpositionTF, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(rlsupervisorLBL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rlsupervisorTF, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(typeofleaveLBL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(typeofleaveCB, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addGroup(leavemainPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(submitleavePB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(clearleavePB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(leavemainPNL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(leavemainPNL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backbuttonreqleavePBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbuttonreqleavePBActionPerformed

        // Create an instance of EmployeePage
        EmployeePage employeePage = new EmployeePage();
        // Center the EmployeePage
        employeePage.setLocationRelativeTo(null);
        // Make the EmployeePage visible
        employeePage.setVisible(true);
        // Close the current AboutPage
        this.dispose();
    }//GEN-LAST:event_backbuttonreqleavePBActionPerformed

    private void typeofleaveCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeofleaveCBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_typeofleaveCBActionPerformed

    private void rlfirstnameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rlfirstnameTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rlfirstnameTFActionPerformed

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
            java.util.logging.Logger.getLogger(RequestLeavePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RequestLeavePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RequestLeavePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RequestLeavePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RequestLeavePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backbuttonreqleavePB;
    private javax.swing.JButton clearleavePB;
    private javax.swing.JLabel leaveheaderLBL;
    private javax.swing.JPanel leaveheaderPNL;
    private javax.swing.JPanel leavemainPNL;
    private javax.swing.JTabbedPane leaverecordTP;
    private javax.swing.JScrollPane leavescrollSP;
    private javax.swing.JLabel rlfirstnameLBL;
    private javax.swing.JTextField rlfirstnameTF;
    private javax.swing.JLabel rllastnameLBL;
    private javax.swing.JTextField rllastnameTF;
    private javax.swing.JLabel rlpositionLBL;
    private javax.swing.JTextField rlpositionTF;
    private javax.swing.JLabel rlsupervisorLBL;
    private javax.swing.JTextField rlsupervisorTF;
    private javax.swing.JButton submitleavePB;
    private javax.swing.JComboBox<String> typeofleaveCB;
    private javax.swing.JLabel typeofleaveLBL;
    // End of variables declaration//GEN-END:variables
}
