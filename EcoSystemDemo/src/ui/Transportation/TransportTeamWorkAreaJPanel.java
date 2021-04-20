/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.Transportation;

import Business.DeliveryMan.DeliveryMan;
import Business.EcoSystem;
import Business.Order.Order;

import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author patol
 */
public class TransportTeamWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    
    
    /**
     * Creates new form LabAssistantWorkAreaJPanel
     */
    public TransportTeamWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem business) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.business = business;
      
        
        populateTable();
    }
    
    public void populateTable(){
        DefaultTableModel tablemodel = (DefaultTableModel) tblOrderDetails.getModel();
        
        tablemodel.setRowCount(0);
        
        for(DeliveryMan deliveryMan : business.getDeliveryManDirectory().getDeliveryManDirectory()){
            if(deliveryMan.getUserName().equals(userAccount.getUsername())){
                    
                for(Order order : deliveryMan.getOrderList()){
                Object[] row = new Object[6];
                row[2] = order.getCustomerName();
                row[1] = order.getRestaurantName();
               
                row[4] = order.getPrice();
                row[5] = order.getStatus();
                row[0] = order;
                row[3] = order.getDeliveryAddress();
                tablemodel.addRow(row);
                    
                }
            }
            
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblOrderDetails = new javax.swing.JTable();
        JBtnProcess = new javax.swing.JButton();
        JBtnRefresh = new javax.swing.JButton();
        jLabelOrderDetail = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblOrderDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "OrderID", "Laboratory Name", "Hospital Name", "Delivery Address", "Quantity", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblOrderDetails);
        if (tblOrderDetails.getColumnModel().getColumnCount() > 0) {
            tblOrderDetails.getColumnModel().getColumn(0).setResizable(false);
            tblOrderDetails.getColumnModel().getColumn(1).setResizable(false);
            tblOrderDetails.getColumnModel().getColumn(2).setResizable(false);
            tblOrderDetails.getColumnModel().getColumn(3).setResizable(false);
            tblOrderDetails.getColumnModel().getColumn(4).setResizable(false);
            tblOrderDetails.getColumnModel().getColumn(5).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 58, 650, 96));

        JBtnProcess.setBackground(new java.awt.Color(0, 0, 0));
        JBtnProcess.setForeground(new java.awt.Color(255, 255, 255));
        JBtnProcess.setText("Process");
        JBtnProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtnProcessActionPerformed(evt);
            }
        });
        add(JBtnProcess, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 220, -1, -1));

        JBtnRefresh.setBackground(new java.awt.Color(0, 0, 0));
        JBtnRefresh.setForeground(new java.awt.Color(255, 255, 255));
        JBtnRefresh.setText("Refresh");
        JBtnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtnRefreshActionPerformed(evt);
            }
        });
        add(JBtnRefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, -1, -1));

        jLabelOrderDetail.setText("Order Detail");
        jLabelOrderDetail.setMaximumSize(new java.awt.Dimension(68, 20));
        jLabelOrderDetail.setMinimumSize(new java.awt.Dimension(68, 20));
        jLabelOrderDetail.setPreferredSize(new java.awt.Dimension(58, 20));
        add(jLabelOrderDetail, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void JBtnProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtnProcessActionPerformed
        int selectedRow = tblOrderDetails.getSelectedRow();
        
        if (selectedRow < 0){
            return;
        }
        
        Order order = (Order)tblOrderDetails.getValueAt(selectedRow, 0); 
        ProcessWorkRequestJPanel processWorkRequestJPanel = new ProcessWorkRequestJPanel(userProcessContainer, order);
        userProcessContainer.add("processWorkRequestJPanel", processWorkRequestJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

        
    }//GEN-LAST:event_JBtnProcessActionPerformed

    private void JBtnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtnRefreshActionPerformed
        populateTable();
    }//GEN-LAST:event_JBtnRefreshActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBtnProcess;
    private javax.swing.JButton JBtnRefresh;
    private javax.swing.JLabel jLabelOrderDetail;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblOrderDetails;
    // End of variables declaration//GEN-END:variables
}