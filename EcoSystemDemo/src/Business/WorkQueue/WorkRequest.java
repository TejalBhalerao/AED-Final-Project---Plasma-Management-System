/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Account.Account;
import Business.DB4OUtil.DB4OUtil;
import Business.Enterprise.Enterprise;
import Business.People.Donor;
import Business.People.People;
<<<<<<< HEAD
=======
import Business.UserAccount.UserAccount;
>>>>>>> 5f8eaeead469eab9fad6c663c9464f1f58d8b92e
import java.util.Date;

/**
 *
 * @author raunak
 */
public abstract class WorkRequest {

    private String message;
    private Account sender;
    private Account receiver;
    private String status;
    private String fileDn;
    private Date requestDate;
    private Date resolveDate;
    private String NGO;

    public String getNGO() {
        return NGO;
    }

    public void setNGO(String NGO) {
        this.NGO = NGO;
    }
    
    public WorkRequest(){
        requestDate = new Date();
    }

    public String getMessage() {
        return message;
    }
    
    
    public String getFileDn() {
        return fileDn;
    }

    public void setFileDn(String fileDn) {
        this.fileDn = fileDn;
    }
    
    public void setMessage(String message) {
        this.message = message;
    }

    public Account getSender() {
        return sender;
    }

    public void setSender(Account sender) {
        this.sender = sender;
    }

    public Account getReceiver() {
        return receiver;
    }

    public void setReceiver(Account receiver) {
        this.receiver = receiver;
    }

    

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public Date getResolveDate() {
        return resolveDate;
    }

    public void setResolveDate(Date resolveDate) {
        this.resolveDate = resolveDate;
    }
<<<<<<< HEAD
=======

    public Date getActDate() {
        return actDate;
    }

    public void setActDate(Date actDate) {
        this.actDate = actDate;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getRequestNo() {
        return requestNo;
    }

    public void setRequestNo(String requestNo) {
        this.requestNo = requestNo;
    }

    public String getAssigned() {
        return assigned;
    }

    public void setAssigned(String assigned) {
        this.assigned = assigned;
    }

    public UserAccount getPathologist() {
        return pathologist;
    }

    public void setPathologist(UserAccount pathologist) {
        this.pathologist = pathologist;
    }

    public UserAccount getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(UserAccount userAccount) {
        this.userAccount = userAccount;
    }

    public String getOverallStatus() {
        return overallStatus;
    }

    public void setOverallStatus(String overallStatus) {
        this.overallStatus = overallStatus;
    }

    public Donor getDonor() {
        return donor;
    }

    public void setDonor(Donor donor) {
        this.donor = donor;
    }

    public Enterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public People getPatient() {
        return patient;
    }

    public void setPatient(People patient) {
        this.patient = patient;
    }

    public DB4OUtil getdB4OUtil() {
        return dB4OUtil;
    }

    public void setdB4OUtil(DB4OUtil dB4OUtil) {
        this.dB4OUtil = dB4OUtil;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        WorkRequest.count = count;
    }

    public static int getCt() {
        return ct;
    }

    public static void setCt(int ct) {
        WorkRequest.ct = ct;
    }
        
    private Date actDate;
    private String summary;
    private String notes;
    private String requestNo;
    private String assigned;
    private UserAccount pathologist;
    private UserAccount userAccount;
    private String overallStatus;
    private Donor donor;
    private Enterprise enterprise;
    private String type;
    private People patient;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();

    private static int count = 1;
    private static int ct;
    
    public WorkRequest(){
        
        System.out.println(dB4OUtil.retrieveSystem().getWorkQueue().getWorkRequestList().size()+"count");
        requestNo = "REQ00000"+ String.valueOf(count);
        count++;
        
        requestDate = new Date();
    }
   
>>>>>>> 5f8eaeead469eab9fad6c663c9464f1f58d8b92e
    @Override
    public String toString(){
        return this.message;
    }
}
