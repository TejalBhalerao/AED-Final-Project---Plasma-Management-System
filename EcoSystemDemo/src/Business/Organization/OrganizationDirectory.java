/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author TEJAL
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.Doctor.getValue())){
            organization = new DoctorOrganization();
            organizationList.add(organization);
        }
        
        else if (type.getValue().equals(Type.Lab.getValue())){
            organization = new LocalLabOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Visitor.getValue())){
            organization = new VisitorOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Reception.getValue())){
            organization = new ReceptionOrganization();
            organizationList.add(organization);
        }
       
        
        else if (type.getValue().equals(Type.Screening.getValue())){
            organization = new ScreeningOrganization();
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Type.Radiology.getValue())){
            organization = new RadiologyOrganization();
            organizationList.add(organization);
        }
        
        else if (type.getValue().equals(Type.NGO.getValue())){
            organization = new NGOOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.GovernmentFunding.getValue())){
            organization = new GovernmentFunding();
            organizationList.add(organization);
        }
        if (type.getValue().equals(Type.CommitteeAdmin.getValue())){
            organization = new CommitteeAdminOrganization();
            organizationList.add(organization);
        }
        
          if (type.getValue().equals(Type.PlasmaBankAdmin.getValue())){
            organization = new PlasmaBankOrganization();
            organizationList.add(organization);
        }
        
        return organization;
    }
}