/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.Transportation;

import Business.Order.Order;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author patol
 */


public class ProcessWorkRequestJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    private Order order;
    /**
     * Creates new form ProcessWorkRequestJPanel
     */
    public ProcessWorkRequestJPanel(JPanel userProcessContainer, Order order) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.order = order;
    }

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JBtnSubmit = new javax.swing.JButton();
        jLabelStatus = new javax.swing.JLabel();
        textStatus = new javax.swing.JTextField();
        JBtnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 204));

        JBtnSubmit.setBackground(new java.awt.Color(0, 51, 102));
        JBtnSubmit.setForeground(new java.awt.Color(255, 255, 255));
        JBtnSubmit.setText("Submit Result");
        JBtnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtnSubmitActionPerformed(evt);
            }
        });

        jLabelStatus.setText("Status");

        JBtnBack.setBackground(new java.awt.Color(0, 0, 0));
        JBtnBack.setForeground(new java.awt.Color(255, 255, 255));
        JBtnBack.setText("<<Back");
        JBtnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(jLabelStatus)
                .addGap(46, 46, 46)
                .addComponent(textStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(154, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JBtnBack)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JBtnSubmit)
                .addGap(140, 140, 140))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JBtnBack)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelStatus)
                    .addComponent(textStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addComponent(JBtnSubmit)
                .addContainerGap(162, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void JBtnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtnBackActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        TransportTeamWorkAreaJPanel dwjp = (TransportTeamWorkAreaJPanel) component;
        dwjp.populateTable();
        
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_JBtnBackActionPerformed

    private void JBtnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtnSubmitActionPerformed
       order.setStatus(textStatus.getText());
        JOptionPane.showMessageDialog(null, "Status Updated Successfully");
    }//GEN-LAST:event_JBtnSubmitActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBtnBack;
    private javax.swing.JButton JBtnSubmit;
    private javax.swing.JLabel jLabelStatus;
    private javax.swing.JTextField textStatus;
    // End of variables declaration//GEN-END:variables
}