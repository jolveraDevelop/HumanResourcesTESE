
package employees.concretos;

import employees.Department;
import employees.generico.Employee;

/**
 *
 * @author Roberto Olveras
 */
public class Engenier extends Employee{

//    public Engenier() {
//        super();
//    }
//
    public Engenier(String firstName, String lastName, 
            Department department) {
        //super();
        super(firstName, lastName, department);
        //setFirstName(firstName);
        //setLastName(lastName);
        //setDepartment(department);
    }
    
    public Engenier(String firstName, String lastName, 
            Department department,String phone) {
        this(firstName,lastName,department);
        setPhoneNumber(phone);
    }
    
    
//    
    
}
