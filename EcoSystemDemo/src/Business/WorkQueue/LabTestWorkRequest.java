/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author srikar
 */
public class LabTestWorkRequest extends WorkRequest{
    
    private String testResult;
    private String fileupload;
    private String priority;

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }
    private String patientName;

    public String getFileupload() {
        return fileupload;
    }

    public void setFileupload(String fileupload) {
        this.fileupload = fileupload;
    }

    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }
    
    
}
