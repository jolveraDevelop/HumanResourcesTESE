/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import employees.Country;
import employees.Department;
import employees.generico.Employee;
import employees.Job;
import employees.Location;
import java.util.Date;

/**
 *
 * @author Humberto
 */
public class TestEmployee {

    public static void main(String[] args) {
        Country cArgentina = new Country("Argentina");
        Country cAustralia = new Country("Australia");

        Location lArgentina = new Location("12-98 Victoria street", 2901, "Sidney", "New South Wales", cAustralia);
        Location lAustralia = new Location("20 Rue des Corps-Saints", 1730, "Geneva", "Geneve", cArgentina);

        Department dAdministration = new Department("Administration", lAustralia);
        Department dMarketing = new Department("Marketing", lArgentina);
        Department dPurchasing = new Department("Purchasing", lAustralia);
        Department dHumanResources = new Department("Human Resources", lArgentina);
        Department dShipping = new Department("Shipping", lAustralia);
        Department dIT = new Department("IT", lArgentina);

        Job jAdministrationManager = new Job("Administration Manager", 15000, 30000);
        Job jAdministrationAssistant = new Job("Administration Assistant", 3000, 6000);
        Job jMarketingManager = new Job("Marketing Manager", 9000, 15000);
        Job jMarketingRepresentative = new Job("Marketing Representative", 4000, 9000);
        Job jPurchasingManager = new Job("Purchasing Manager", 8000, 15000);
        Job jPurchasingClerk = new Job("Purchasing Clerk", 2500, 5500);
        Job jHumanResourcesRepresentative = new Job("Human Resources Representative", 4000, 9000);
        Job jShippingClerk = new Job("Shipping Clerk", 2500, 5500);
        Job jProgrammer = new Job("Programmer", 4000, 10000);

        Employee e1 = new Employee("Jennifer", "Whalen", "JWHALEN", "515.123.4444", new Date(2003, 9, 17), jAdministrationManager, dAdministration);
        Employee e2 = new Employee("Karen", "Colmenares", "KCOLMENA", "515.127.4566", new Date(2007, 8, 10), jAdministrationAssistant, dAdministration);
        Employee e3 = new Employee("Michael", "Hartstein", "MHARTSTE", "515.123.5555", new Date(2004, 2, 17), jMarketingManager, dMarketing);
        Employee e4 = new Employee("Pat", "Fay", "PFAY", "603.123.6666", new Date(2005, 8, 17), jMarketingRepresentative, dMarketing);
        Employee e5 = new Employee("Den", "Raphaely", "DRAPHEAL", "515.127.4561", new Date(2002, 7, 12), jPurchasingManager, dPurchasing);
        Employee e6 = new Employee("Sigal", "Tobias", "STOBIAS", "515.127.4564", new Date(2005, 7, 24), jPurchasingClerk, dPurchasing);
        Employee e7 = new Employee("Susan", "Mavris", "SMAVRIS", "515.123.7777", new Date(2002, 6, 2007), jHumanResourcesRepresentative, dHumanResources);
        Employee e8 = new Employee("Winston", "Taylor", "WTAYLOR", "650.507.9876", new Date(2006, 1, 6), jShippingClerk, dShipping);
        Employee e9 = new Employee("Alexander", "Hunold", "AHUNOLD", "590.423.4567", new Date(2006, 1, 3), jProgrammer, dIT);
            
        dAdministration.setManager(e1);
        dHumanResources.setManager(e7);
        dIT.setManager(e9);
        dMarketing.setManager(e3);
        dPurchasing.setManager(e5);
        dShipping.setManager(e8);
        
        e1.setSalary(15000);
        e2.setSalary(30000);
        e3.setSalary(5);
        
        System.out.println(e1.getFirstName()+" "+e1.getLastName()+", salary: "+e1.getSalary());
        System.out.println(e2.getFirstName()+" "+e2.getLastName()+", salary: "+e2.getSalary());
        System.out.println(e3.getFirstName()+" "+e3.getLastName()+", salary: "+e3.getSalary());
        }
}
