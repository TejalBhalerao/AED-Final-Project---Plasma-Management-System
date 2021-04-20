/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.NGOWorkPlace;


import Business.Organization.Organization;
import Business.Person.Visitor;
import Business.Person.VisitorDirectory;
import Business.RegularExpressionCheck;
import java.awt.CardLayout;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author patol
 */
public class AwarnessCampaignsArea extends javax.swing.JPanel {

    JPanel rightPanel;
    Organization organization;
    VisitorDirectory vd = new VisitorDirectory();
    
    public AwarnessCampaignsArea(JPanel rightPanel, Organization organization) {
        initComponents();
        this.rightPanel=rightPanel;
        this.organization = organization;
        ButtonGroup bg = new ButtonGroup();
        bg.add(jRadioButton1);
        bg.add(jRadioButton2);
    }

   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        yesnoGroup = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        emailTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel1.setText("Showing Awareness Of Plasma donation");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, -1, 42));

        jRadioButton1.setBackground(new java.awt.Color(255, 255, 51));
        yesnoGroup.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        jRadioButton1.setText("YES");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        jRadioButton2.setBackground(new java.awt.Color(255, 255, 51));
        yesnoGroup.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        jRadioButton2.setText("NO");
        add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, -1, -1));

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(255, 255, 0));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("Help!!!\nSomeone is waiting for your kind anticipation.\nLots of patients from various blood group urgently require a plasma for covid 19 plasma therapy.\nKindly revert us if you could help us to serve patients.\n\n\nThanking You,\nPlasma Management team.");
        jTextArea1.setWrapStyleWord(true);
        jTextArea1.setBorder(null);
        jTextArea1.setCaretColor(new java.awt.Color(255, 51, 51));
        jTextArea1.setFocusable(false);
        jScrollPane1.setViewportView(jTextArea1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 101, 510, 360));

        emailTxt.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        add(emailTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 160, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        jLabel2.setText("Enter email ID");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jButton4.setBackground(new java.awt.Color(153, 204, 255));
        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton4.setText("<< Back");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, 200, 40));

        jButton2.setBackground(new java.awt.Color(153, 204, 255));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton2.setText("Submit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 510, 200, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        rightPanel.remove(this);
        CardLayout layout = (CardLayout) rightPanel.getLayout();
        layout.previous(rightPanel);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if(emailTxt.getText().equals("")&& jRadioButton1.isSelected()==false && jRadioButton2.isSelected()==false){
            JOptionPane.showMessageDialog(null, "Please enter email and choose one of the options-Yes or No.");
            return;
        }
        if(!emailTxt.getText().equals("")){


            for(Visitor v: vd.getVisitorList()){
                if(v.getEmail().equals(emailTxt.getText())){
                   JOptionPane.showMessageDialog(null, "Email already exists!");
                    return; 
                }
            }
        boolean validity= RegularExpressionCheck.isValidEmailAddress(emailTxt.getText());
        if(validity){
            if (jRadioButton1.isSelected())
            {
                //yes
               
            }
            else if(jRadioButton2.isSelected())
            {
                //no
                RegularExpressionCheck.c++;
                vd.createVisitor(emailTxt.getText(),false);
                JOptionPane.showMessageDialog(null, "Thanks for your time!");
                //To-do send email
                return;
            }
        }
        
        else{
            JOptionPane.showMessageDialog(null, "Please re enter email in correct format!");
        }  
     }
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField emailTxt;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.ButtonGroup yesnoGroup;
    // End of variables declaration//GEN-END:variables
}