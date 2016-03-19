
package test;

import employees.Department;
import employees.concretos.Manager;
import employees.concretos.Secretary;
import employees.generico.Employee;

/**
 *
 * @author Roberto Olveras
 */
public class TestPolimorfismo {
    public static void main(String[] args) {
        Department contabilidad = 
                new Department("Contabilidad");
        Employee roberto = 
                new Employee("Roberto",
                        "Olvera",contabilidad);
        Employee laura = 
                    new Secretary();
        laura.setFirstName("Laura");
        laura.setLastName("Gomez");
        laura.setDepartment(contabilidad);
        
        Employee luis = new Manager();
        luis.setFirstName("Luis");
        luis.setLastName("Perez");
        luis.setDepartment(contabilidad);
        ((Manager)luis).setSecretary((Secretary)laura);
        
        System.out.println(roberto.getDetails());
        System.out.println(laura.getDetails());
        System.out.println(luis.getDetails());
    }
}
