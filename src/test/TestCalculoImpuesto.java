
package test;

import employees.Department;
import employees.concretos.Engenier;
import employees.concretos.Manager;
import employees.concretos.Secretary;
import employees.generico.Employee;
import services.TaxService;

/**
 *
 * @author Roberto Olveras
 */
public class TestCalculoImpuesto {
    public static void main(String[] args) {
        Department contabilidad = 
                new Department("Contabilidad");
        
        Employee [] staff = new Employee[3];
        
        staff[0] = (Employee)new Engenier("Roberto",
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
        ((Manager)staff[2]).setSecretary(staff[1]);
        
        TaxService tx = new TaxService();
        for (int i = 0; i < staff.length; i++) {
            double tasaImpuesto = tx.findTaxRate(staff[i]);
            System.out.println("El empleado "+staff[i].getFirstName()+
                    " paga de impuesto: "+tasaImpuesto);
        }
    }
}
