
package employees.concretos;

import employees.generico.Employee;

/**
 *
 * @author Roberto Olveras
 */
public class Manager extends Employee{
    private Secretary secretary;
    
    public String getDetails() {
        return 
                "Nombre: "+this.getFirstName()
                    +" "+this.getLastName()+
                "Departamento: "+
                    this.getDepartment().getName()+
                "Secretaria: "+
                    this.getSecretary().getFirstName();
    }

    public Secretary getSecretary() {
        return secretary;
    }

    public void setSecretary(Secretary secretary) {
        this.secretary = secretary;
    }
}
