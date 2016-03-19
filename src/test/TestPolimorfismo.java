
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
        Secretary laura = 
                    new Secretary();
        laura.setFirstName("Laura");
        laura.setLastName("Gomez");
        laura.setDepartment(contabilidad);
        
        Manager luis = 
                    new Manager();
        luis.setFirstName("Luis");
        luis.setLastName("Perez");
        luis.setDepartment(contabilidad);
        luis.setSecretary(laura);
    }
}
