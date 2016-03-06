package employees;

import employees.generico.Employee;

/**
 * Clase que modela un departamento en la empresa
 * @author Roberto Olvera
 * @version 1.0
 */
public class Department {

    private String name;
    private Employee manager;

    public Department(String name) {
        this.name = name;
    }

    public Employee getManager() {
        return manager;
    }

    public void setManager(Employee manager) {
        this.manager = manager;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
