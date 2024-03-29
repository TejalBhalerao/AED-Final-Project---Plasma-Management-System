/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.AwarenessCamps;

import Business.Account.Account;
import Business.ECOSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.CommitteeEnterprise;
import Business.Network.Network;
import Business.Organization.GovernmentFunding;
import Business.Organization.Organization;
import Business.Organization.VisitorOrganization;
import Business.Person.AwarenessEvent;
import Business.Person.Visitor;
import Business.Person.VisitorDirectory;
import Business.RegularExpressionCheck;
import Business.WorkQueue.FundWorkRequest;
import java.awt.CardLayout;
import java.awt.Font;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userInterface.GovernmentFunding.FundRequestStatusJPanel;

/**
 *
 * @author patol
 */
public class AwarenessCamps extends javax.swing.JPanel {

    ECOSystem system;
    JPanel rightPanel;
    VisitorDirectory vd = new VisitorDirectory();
    private Account userAccount;
    private Enterprise enterprise;
    
    /**
     * Creates new form AwarenessCamps
     */
    public AwarenessCamps(JPanel rightPanel, ECOSystem system, Account account,Enterprise enterprise ) {
        initComponents();
        this.rightPanel = rightPanel;
        this.system = system;
        this.userAccount = account;
        this.enterprise=enterprise;
    
        
        populateTable();
        populateNetworkComboBox();
        JTableeventInfo.getTableHeader().setFont(new Font("Times New Roman" , Font.ITALIC,23));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        JComboBoxCity = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        btnCreateEvent = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTableeventInfo = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        textevent = new javax.swing.JTextField();
        jDateChoosereventdate = new com.toedter.calendar.JDateChooser();
        textFunds = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnResultStatus = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setForeground(new java.awt.Color(0, 153, 153));
        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Select the city");
        add(jLabel1);
        jLabel1.setBounds(96, 312, 143, 29);

        JComboBoxCity.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        JComboBoxCity.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(JComboBoxCity);
        JComboBoxCity.setBounds(310, 310, 147, 33);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setText("Select Date");
        add(jLabel2);
        jLabel2.setBounds(132, 401, 115, 29);

        btnCreateEvent.setBackground(new java.awt.Color(153, 204, 255));
        btnCreateEvent.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnCreateEvent.setText("Create Event");
        btnCreateEvent.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCreateEvent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateEventActionPerformed(evt);
            }
        });
        add(btnCreateEvent);
        btnCreateEvent.setBounds(105, 549, 361, 35);

        JTableeventInfo.setBackground(new java.awt.Color(255, 204, 204));
        JTableeventInfo.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        JTableeventInfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Event", "Network", "Date", "Funds "
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
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
        jScrollPane1.setViewportView(JTableeventInfo);
        if (JTableeventInfo.getColumnModel().getColumnCount() > 0) {
            JTableeventInfo.getColumnModel().getColumn(0).setResizable(false);
            JTableeventInfo.getColumnModel().getColumn(1).setResizable(false);
            JTableeventInfo.getColumnModel().getColumn(2).setResizable(false);
            JTableeventInfo.getColumnModel().getColumn(3).setResizable(false);
        }

        add(jScrollPane1);
        jScrollPane1.setBounds(54, 99, 896, 158);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setText("Scheduled Event Details");
        add(jLabel3);
        jLabel3.setBounds(54, 53, 247, 29);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setText("Event Name");
        add(jLabel4);
        jLabel4.setBounds(123, 352, 124, 29);

        textevent.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        add(textevent);
        textevent.setBounds(310, 350, 147, 33);
        add(jDateChoosereventdate);
        jDateChoosereventdate.setBounds(310, 397, 147, 32);

        textFunds.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFundsActionPerformed(evt);
            }
        });
        add(textFunds);
        textFunds.setBounds(309, 448, 147, 33);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setText("Request Funds");
        add(jLabel5);
        jLabel5.setBounds(96, 447, 151, 29);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel6.setText("$");
        add(jLabel6);
        jLabel6.setBounds(279, 447, 18, 29);

        btnResultStatus.setBackground(new java.awt.Color(153, 204, 255));
        btnResultStatus.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnResultStatus.setText("Fund Request Status");
        btnResultStatus.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnResultStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResultStatusActionPerformed(evt);
            }
        });
        add(btnResultStatus);
        btnResultStatus.setBounds(105, 602, 361, 35);
        add(jLabel8);
        jLabel8.setBounds(580, 300, 460, 340);
    }// </editor-fold>//GEN-END:initComponents

    public void sendEmail(String email, String eventName, String dateOfEvent){
            final String to = email;
            boolean sessionDebug=false;
            String from = "sidjonas12345@gmail.com"; 
            String host = "smtp.gmail.com";
            String user="sidjonas12345@gmail.com";
            String pass = "Smart@1995";
            Properties properties = System.getProperties();  
            properties.setProperty("mail.smtp.host", host); properties.put("mail.smtp.starttls.required", "true");
            properties.put("mail.smtp.starttls.enable", "true");
            properties.put("mail.smtp.host",host);  
            properties.put("mail.smtp.port", "587");  
            properties.put("mail.smtp.auth", "true");  
            //java.security.Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());  
            Session session;
            session = Session.getDefaultInstance(properties,  null);
            session.setDebug(sessionDebug);
            try{
            MimeMessage message = new MimeMessage(session);  
            message.setFrom(new InternetAddress(from));  
            message.setRecipient(Message.RecipientType.TO,new InternetAddress(to));  
            InternetAddress address;
            address = new InternetAddress(to);
            message.setSubject("Did you know?");  
            message.setText("Please visit the awareness camp titled "+eventName+"on "+dateOfEvent+"in "+JComboBoxCity.getItemAt(JComboBoxCity.getSelectedIndex())+" to learn more about the important of organ donation. Please RSVP");  
            Transport transport = session.getTransport("smtp");
            transport.connect(host,user,pass);
            transport.sendMessage(message, message.getAllRecipients());
            transport.close();
            //JOptionPane.showMessageDialog(null, "Please check your email for further details!");
            }
            
            catch(Exception e){
                System.out.println(e);
                JOptionPane.showMessageDialog(null, "Error!");
            }
    }
    
    
    
    
    private void btnCreateEventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateEventActionPerformed
        
        Network city =  (Network) JComboBoxCity.getSelectedItem();
        String name = textevent.getText();
        Date date = jDateChoosereventdate.getDate();
        float Funds = 0;
        //Funds = Float.parseFloat(txtFunds.getText());
        Date today = new Date();
        Date currentDate = new java.sql.Date(today.getTime());
        
        //Validate Event field
        if(!RegularExpressionCheck.isValidEvent(name)){
            JOptionPane.showMessageDialog(null, " Invalid Event Name!!");
            return;
        }
        
        
        
        //Adding If loop for date field validation
           try{
            if (date.compareTo(currentDate) < 0) {
            //System.out.println("Date1 is before Date2");
            JOptionPane.showMessageDialog(null,"Please choose future date!! ");
            return;
            
            }
        
           }catch(NullPointerException e)
           {
           JOptionPane.showMessageDialog(null,"Please fill all details. ");
           return;
           
           
           }
         
        //Exception handling
        try
        {
            Funds = Float.parseFloat(textFunds.getText());
            textFunds.setText("");
            //return;
        }
        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null, "Please enter valid funds.");
            textFunds.setText("");
            return ;
        }
        
 
        
        
        if(name.equals("") && date == null && city.equals(null)){
            JOptionPane.showMessageDialog(null, "Please fill all details.");
            return;
        }
        
        
       
        if(system != null){
            for(Visitor v :vd.getVisitorList()){
                sendEmail(v.getEmail(), textevent.getText(), String.valueOf(date));
            }
            for(Network n: system.getNetworkList()){
                if(n.getName().equals(String.valueOf(JComboBoxCity.getItemAt(JComboBoxCity.getSelectedIndex())))){
                  for(Enterprise e:   n.getEnterpriseDirectory().getEnterpriseList()){
                    for (Organization o: e.getOrganizationDirectory().getOrganizationList()){
                        if(o instanceof VisitorOrganization){
//                        for(Visitor v: o.getVd().getVisitorList()){
//                            sendEmail(v.getEmail(), eventNameTxt.getText(), String.valueOf(date));  
//                        }
                    }
                    }
                  }
                }
            }
            
            FundWorkRequest request = new FundWorkRequest();
            request.setMessage("Please approve the funds");
            request.setSender(userAccount);
            request.setStatus("Sent");
            request.setNGO(textevent.getText());
            request.setFunds(Funds);
            request.setEventName(name);
            
            
            //System.out.println(request.getFunds());
            
            Organization o= null;
         for(Network n: system.getNetworkList()){
           
            for(Enterprise e:n.getEnterpriseDirectory().getEnterpriseList()){
                if(e instanceof CommitteeEnterprise){
                   for(Organization org:  e.getOrganizationDirectory().getOrganizationList()){
                       if(org instanceof GovernmentFunding){
                           
                           //System.out.println("INSIDE AWARENESSCAMP IF LOOP GovernmentFunding ORGANISATION ");
                           o=org;
                           
                       }
                   }
                }
            }
        }
       if(o!=null){
            ECOSystem.getInstance().getWorkQueue().getWorkRequestList().add(request);
            userAccount.getWorkQueue().getWorkRequestList().add(request);}
        
        
        
        //AWRENESS 
            AwarenessEvent event = system.createEvent();
            event.setEventName(name);
            event.setNetworkName(city.getName());
            event.setEventDate(date);
            event.setFunds(Funds);
            JOptionPane.showMessageDialog(null, "Awareness event created successfully.");
            textevent.setText("");
            jDateChoosereventdate.setDate(null);
            textFunds.setText("");
            populateTable();
        }
    }//GEN-LAST:event_btnCreateEventActionPerformed

    private void textFundsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFundsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFundsActionPerformed

    private void btnResultStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResultStatusActionPerformed
        
        FundRequestStatusJPanel fundRequestJPanel = new FundRequestStatusJPanel(rightPanel, enterprise,userAccount);
        rightPanel.add("FundRequestStatusJPanel", fundRequestJPanel);
        CardLayout layout = (CardLayout) rightPanel.getLayout();
        layout.next(rightPanel);
    }//GEN-LAST:event_btnResultStatusActionPerformed


    private void populateNetworkComboBox(){
        JComboBoxCity.removeAllItems();
        
        for (Network network : system.getNetworkList()){
            JComboBoxCity.addItem(network);
        }
    }
    
    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) JTableeventInfo.getModel();

        model.setRowCount(0);
        if(system != null && system.getEventList() != null){
            for (AwarenessEvent event : system.getEventList()) {
                Object[] row = new Object[4];
                row[0] = event.getEventName();
                row[1] = event.getNetworkName();
                row[2] = event.getEventDate();
                row[3] = event.getFunds();

                model.addRow(row);
            }
        }
 
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox JComboBoxCity;
    private javax.swing.JTable JTableeventInfo;
    private javax.swing.JButton btnCreateEvent;
    private javax.swing.JButton btnResultStatus;
    private com.toedter.calendar.JDateChooser jDateChoosereventdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField textFunds;
    private javax.swing.JTextField textevent;
    // End of variables declaration//GEN-END:variables
}
