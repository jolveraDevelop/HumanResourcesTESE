
package employees.concretos;

import employees.generico.Employee;

/**
 *
 * @author Roberto Olveras
 */
public class Secretary extends Employee{

    @Override
    public String getDetails() {
        return super.getDetails() + "soy secretaria";
    }
    
}
