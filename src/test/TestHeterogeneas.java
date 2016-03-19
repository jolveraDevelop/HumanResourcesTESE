
package test;

import employees.Department;
import employees.concretos.Manager;
import employees.concretos.Secretary;
import employees.generico.Employee;

/**
 *
 * @author Roberto Olveras
 */
public class TestHeterogeneas {
    public static void main(String[] args) {
        Department contabilidad = 
                new Department("Contabilidad");
        
        Employee [] staff = new Employee[3];
        
        staff[0] = 
                new Employee("Roberto",
                        "Olvera",contabilidad);
        staff[1] = 
                    new Secretary();
        staff[1].setFirstName("Laura");
        staff[1].setLastName("Gomez");
        staff[1].setDepartment(contabilidad);
        
        staff[2]= new Manager();
        staff[2].setFirstName("Luis");
        staff[2].setLastName("Perez");
        staff[2].setDepartment(contabilidad);
        ((Manager)staff[2]).setSecretary((Secretary)staff[1]);
        
        for (int i = 0; i < staff.length; i++) {
               System.out.println(staff[i].getDetails());
        }
        
    }
}
