/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.People;

import java.util.ArrayList;

/**
 *
 * @author TEJAL
 */
public class DonorReqDirectory {
    
    private ArrayList<DonorRequest> donorReqList;

    public ArrayList<DonorRequest> getDonorReqList() {
        return donorReqList;
    }
    
    public void setDonorReqList(ArrayList<DonorRequest> donorReqList) {
        this.donorReqList = donorReqList;
    }
    
    public DonorReqDirectory(){
        donorReqList = new ArrayList<DonorRequest>();
    }
    
    public DonorRequest addDonorRequest()
    {
        DonorRequest donorRequest = new DonorRequest();
        donorReqList.add(donorRequest);
        return donorRequest;
    }
    public DonorRequest removeDonorRequest(DonorRequest donor)
    {
        
        donorReqList.remove(donor);
        
        return null;
    }

}
