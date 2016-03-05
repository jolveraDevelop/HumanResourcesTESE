/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package employees;

/**
 *
 * @author Humberto
 */
public class Job {

    private String title;
    private double maxSalary;
    private double minSalary;

    public Job(String title, double maxSalary, double minSalary) {
        this.title = title;
        this.maxSalary = maxSalary;
        this.minSalary = minSalary;
    }

    public double getMinSalary() {
        return minSalary;
    }

    public void setMinSalary(double minSalary) {
        this.minSalary = minSalary;
    }

    public double getMaxSalary() {
        return maxSalary;
    }

    public void setMaxSalary(double maxSalary) {
        this.maxSalary = maxSalary;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
