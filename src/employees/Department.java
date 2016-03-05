/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package employees;

import employees.generico.Employee;

/**
 *
 * @author Humberto
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
