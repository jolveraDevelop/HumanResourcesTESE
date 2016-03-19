package services;

import employees.concretos.Director;
import employees.concretos.Engenier;
import employees.concretos.Manager;
import employees.concretos.Secretary;
import employees.generico.Employee;

/**
 *
 * @author Roberto Olveras
 */
public class TaxService {
    public double findTaxRate(Employee employee) {
        if(employee instanceof Secretary){
            return .10;
        }else if(employee instanceof Engenier){
            return .15;
        }else if(employee instanceof Manager){
            return .18;
        }else if(employee instanceof Director){
            return .25;
        }if(employee instanceof Employee){
            return .30;
        }else{
            return .20;
        }  
    }
}
