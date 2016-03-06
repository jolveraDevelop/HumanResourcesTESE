package employees.generico;

import employees.Department;
import employees.Job;
import java.util.Date;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Humberto
 */
public class Employee {

    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private String email;
    private String phoneNumber;
    private Date hireDate;
    private Job job;
    private double salary;
    private Department department;

    public Employee() {
    }

    public Employee(String firstName, String lastName, Department department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
    }
    
    

    public Employee(String firstName, String lastName, String email, String phoneNumber, Date hireDate, Job job, Department department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.hireDate = hireDate;
        this.job = job;
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public boolean setAge(int age) {
        if (age >= 18) {
            this.age = age;
            return true;
        } else {
            return false;
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary > this.getJob().getMaxSalary()) {
            salary = this.getJob().getMaxSalary();
        } else if (salary < this.getJob().getMinSalary()) {
            salary = this.getJob().getMinSalary();
        }
        this.salary = salary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
    
    public String getDetails(){
        return 
                "Nombre: "+this.getFirstName()
                    +" "+this.getLastName()+
                " Departamento: "+
                    this.getDepartment().getName();
    }
}