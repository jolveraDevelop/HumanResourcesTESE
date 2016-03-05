/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package employees;

/**
 *
 * @author Humberto
 */
public class Department {

    private String name;
    private Employee manager;
    private Location location;

    public Department(String name, Location location) {
        this.name = name;
        this.location = location;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
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
