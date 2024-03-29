/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.DoctorWorkArea;

import Business.Account.Account;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Person.Recipient;
import Business.WorkQueue.LabTestWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Font;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author patol
 */
public class DoctorActivityJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DoctorActivityJPanel
     */
    
    private JPanel rightPanel;
    private Enterprise enterprise;
    private Account account;
    String patientName;
    List<String> tests;
    String patient;
    public DoctorActivityJPanel(JPanel rightPanel,Enterprise enterprise,Account account, String patientName, List<String> tests, String patient) {
        initComponents();
        this.rightPanel = rightPanel;
        this.patientName= patientName;
        this.tests= tests;
        this.enterprise = enterprise;
        this.patient=patient;
        //requestTestJButton.setVisible(false);
        valueLabel.setText(enterprise.getName());
        this.account = account;
        populateRequestTable();
        workRequestJTable.getTableHeader().setFont(new Font("Times New Roman" , Font.ITALIC,23));
    }

    
    public void populateRequestTable(){
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();
        /*
        model.setRowCount(0);
        LabTestWorkRequest r = new LabTestWorkRequest();
        for (WorkRequest request : account.getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[4];
            row[0] = patientName;
            row[1] = request.getReceiver();
            row[2] = request.getStatus();
            String result = ((LabTestWorkRequest) request).getTestResult();
            row[3] = result == null ? "Waiting" : result;
            model.addRow(row);
        }
        */
        
        model.setRowCount(0);
        LabTestWorkRequest r = new LabTestWorkRequest();
        for (WorkRequest request : account.getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[4];
            /*if(((LabTestWorkRequest) request).getPatientName().equals(patientName))
            {
            row[0] = ((LabTestWorkRequest) request).getPatientName();
            row[1] = ((LabTestWorkRequest) request).getReceiver();
            row[2] = ((LabTestWorkRequest) request).getStatus();
            String result = ((LabTestWorkRequest) request).getTestResult();
            row[3] = result == null ? "Waiting" : result;
            model.addRow(row);
            }*/
            
            row[0] = ((LabTestWorkRequest) request).getPatientName();
            row[1] = ((LabTestWorkRequest) request).getReceiver();
            row[2] = ((LabTestWorkRequest) request).getStatus();
            String result = ((LabTestWorkRequest) request).getTestResult();
            row[3] = result == null ? "Waiting" : result;
            model.addRow(row);
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

        refreshTestJButton = new javax.swing.JButton();
        valueLabel = new javax.swing.JLabel();
        enterpriseLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        priorityBx = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        refreshTestJButton.setBackground(new java.awt.Color(153, 204, 255));
        refreshTestJButton.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        refreshTestJButton.setText("Refresh");
        refreshTestJButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        refreshTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshTestJButtonActionPerformed(evt);
            }
        });

        valueLabel.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        valueLabel.setText("<value>");

        enterpriseLabel.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        enterpriseLabel.setText("Enterprise :");

        workRequestJTable.setBackground(new java.awt.Color(255, 204, 204));
        workRequestJTable.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Patient Name", "Sender", "Status", "Result"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);
        if (workRequestJTable.getColumnModel().getColumnCount() > 0) {
            workRequestJTable.getColumnModel().getColumn(0).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(1).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(2).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(3).setResizable(false);
        }

        priorityBx.setBackground(new java.awt.Color(204, 204, 204));
        priorityBx.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        priorityBx.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1- High", "2- Medium", "3- Low" }));
        priorityBx.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton1.setText("Set Priority");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(153, 204, 255));
        btnBack.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 794, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(priorityBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(refreshTestJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBack, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE))
                .addGap(83, 943, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(priorityBx, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(refreshTestJButton)
                .addGap(18, 18, 18)
                .addComponent(btnBack)
                .addGap(446, 446, 446))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void refreshTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshTestJButtonActionPerformed
    populateRequestTable();
    }//GEN-LAST:event_refreshTestJButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int selectedRow = workRequestJTable.getSelectedRow();
         if (selectedRow < 0){
             JOptionPane.showMessageDialog(null, "Please select a row.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(patient.equals("recipient")){
        for(Organization o: enterprise.getOrganizationDirectory().getOrganizationList()){
          for  (Recipient r: o.getRecipientDirectory().getRecipientList()){
        if(r.getEmailAdd().equals(patientName)){
        if((workRequestJTable.getValueAt(selectedRow, 2).equals("Completed"))){
        if(priorityBx.getSelectedIndex()==0)
        {
            r.setPriority(1);
             JOptionPane.showMessageDialog(null, "Priority has been set as High!");
            
        }
        else if(priorityBx.getSelectedIndex()==1)
        {
             r.setPriority(2);
              JOptionPane.showMessageDialog(null, "Priority has been set as Medium!");
        }
        else if(priorityBx.getSelectedIndex()==2)
        {
             r.setPriority(3);
              JOptionPane.showMessageDialog(null, "Priority has been set as Low!");
        }
       
              }
             }
           }
        }
        
    }
    else{
     JOptionPane.showMessageDialog(null, "Priority cannot be set for a donor!");
        }
    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
         rightPanel.remove(this);
        Component[] componentArray = rightPanel.getComponents();
        Component component = componentArray[componentArray.length - 1];
        PatientTestRequestJPanel dwjp = (PatientTestRequestJPanel) component;
       //dwjp.populateRequestTable();
        CardLayout layout = (CardLayout)rightPanel.getLayout();
        layout.previous(rightPanel);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox priorityBx;
    private javax.swing.JButton refreshTestJButton;
    private javax.swing.JLabel valueLabel;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
