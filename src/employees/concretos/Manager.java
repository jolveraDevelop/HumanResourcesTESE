
package employees.concretos;

import employees.generico.Employee;

/**
 *
 * @author Roberto Olveras
 */
public class Manager extends Employee{
    private Secretary secretary;
    
    public String getDetails() {
        return super.getDetails()+" Secretary Name:"+
                getSecretary().getFirstName();
    }

    public Secretary getSecretary() {
        return secretary;
    }

    public void setSecretary(Employee secretary) {
        this.secretary = (Secretary)secretary;
    }
}
