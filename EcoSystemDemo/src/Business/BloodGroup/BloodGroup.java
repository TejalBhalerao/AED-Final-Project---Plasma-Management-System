/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.BloodGroup;

/**
 *
 * @author TEJAL
 */
public class BloodGroup {
    
    private static int aPos = 30;
    private static int aNeg = 25;
    private static int bPos = 65;
    private static int bNeg = 35;
    private static int oPos = 75;
    private static int oNeg = 27;
    private static int abPos = 35;
    private static int abNeg = 28;

    public BloodGroup(String bloodGroup){
        if(bloodGroup.equals("A+")){
            aPos++;
        }
        else if(bloodGroup.equals("A-")){
            aNeg++;
        }
        else if(bloodGroup.equals("B+")){
            bPos++;
        }
        else if(bloodGroup.equals("B-")){
            bNeg++;
        }
        else if(bloodGroup.equals("AB+")){
            abPos++;
        }
        else if(bloodGroup.equals("AB-")){
            abNeg++;
        }
        else if(bloodGroup.equals("O+")){
            oPos++;
        }
        else if(bloodGroup.equals("O-")){
            oNeg++;
        }
        else{
            System.out.println("Blood Group invalid");
        }
        
    }
    
    
    public static int getaPos() {
        return aPos;
    }

    public static void setaPos(int aPos) {
        BloodGroup.aPos = aPos;
    }

    public static int getaNeg() {
        return aNeg;
    }

    public static void setaNeg(int aNeg) {
        BloodGroup.aNeg = aNeg;
    }

    public static int getbPos() {
        return bPos;
    }

    public static void setbPos(int bPos) {
        BloodGroup.bPos = bPos;
    }

    public static int getbNeg() {
        return bNeg;
    }

    public static void setbNeg(int bNeg) {
        BloodGroup.bNeg = bNeg;
    }

    public static int getoPos() {
        return oPos;
    }

    public static void setoPos(int oPos) {
        BloodGroup.oPos = oPos;
    }

    public static int getoNeg() {
        return oNeg;
    }

    public static void setoNeg(int oNeg) {
        BloodGroup.oNeg = oNeg;
    }

    public static int getAbPos() {
        return abPos;
    }

    public static void setAbPos(int abPos) {
        BloodGroup.abPos = abPos;
    }

    public static int getAbNeg() {
        return abNeg;
    }

    public static void setAbNeg(int abNeg) {
        BloodGroup.abNeg = abNeg;
    }
    
     public void addBloodGroup(String bloodGroup){
        if(bloodGroup.equals("A+")){
            aPos++;
        }
        else if(bloodGroup.equals("A-")){
            aNeg++;
        }
        else if(bloodGroup.equals("B+")){
            bPos++;
        }
        else if(bloodGroup.equals("B-")){
            bNeg++;
        }
        else if(bloodGroup.equals("AB+")){
            abPos++;
        }
        else if(bloodGroup.equals("AB-")){
            abNeg++;
        }
        else if(bloodGroup.equals("O+")){
            oPos++;
        }
        else if(bloodGroup.equals("O-")){
            oNeg++;
        }
        else{
            System.out.println("Blood Group invalid");
        }
        
    }   
    public void subtractBloodGroup(String bloodGroup){
        if(bloodGroup.equals("A+")){
            aPos--;
        }
        else if(bloodGroup.equals("A-")){
            aNeg--;
        }
        else if(bloodGroup.equals("B+")){
            bPos--;
        }
        else if(bloodGroup.equals("B-")){
            bNeg--;
        }
        else if(bloodGroup.equals("AB+")){
            abPos--;
        }
        else if(bloodGroup.equals("AB-")){
            abNeg--;
        }
        else if(bloodGroup.equals("O+")){
            oPos--;
        }
        else if(bloodGroup.equals("O-")){
            oNeg--;
        }
        else{
            System.out.println("Blood Group invalid");
        }
        
    }  
    
    public BloodGroup() {
        
    }
    
    
    
    
}

