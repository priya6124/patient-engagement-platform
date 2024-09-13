/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.MedicalEquipmentRole;
import Business.Role.PharmacistRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author family
 */
public class EquipmentHandlingOrganization extends Organization {
    
     public EquipmentHandlingOrganization() {
        super(Organization.Type.MedicalEquipment.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new MedicalEquipmentRole());
        return roles;
    }
     
    
    
}
