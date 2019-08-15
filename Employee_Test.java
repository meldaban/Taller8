/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerpruebasunitarias;

import junit.framework.TestCase;
import static junit.framework.TestCase.assertEquals;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Melanie Banchon
 */
public class Employee_Test extends TestCase {
    
    public Employee_Test() {
    }
    //Worker trabajò certa cantidad de horas extras y se le
    //da bono de 10%
    public void calcularCSWorker(){
        Employee e1 = new Employee(500.00f,"USD",10.0f,EmployeeType.Worker);
        float res = e1.cs();
        assertEquals(516.08f,res);
        
     
    }
      //Worker trabajò certa cantidad de horas extras y se le
    //da bono de 20%
    @Test
       public void calcularSupervisor(){
        Employee e1 = new Employee(600.00f,"USD",20.0f,EmployeeType.Supervisor);
        float res = e1.cs();
        assertEquals(516.08f,res);
        
     
    }
    
      //Manager trabajò certa cantidad de horas extras y se le
    //da bono de 30%
   @Test
       public void calcularManager(){
        Employee e1 = new Employee(700.00f,"USD",30.0f,EmployeeType.Manager);
        float res = e1.cs();
        assertEquals(516.08f,res);
        
     
    }
       
       
     //Calculo para verificar el bonus anual de un trabajador con 10% de bonificacion 
       
       public void testCalculateYearBonusWorker(){
            Employee worker=new Employee(500.00f,"USD",10.0f,EmployeeType.Worker);
            assertEquals(386.00f,worker.CalculateYearBonus());

}
     //Calculo para verificar el bonus anual de un Supervisor con 10% de bonificacion 
       public void testCalculateYearBonusSupervisor(){
            Employee Supervisor=new Employee(500.00f,"USD",20.0f,EmployeeType.Supervisor);
            assertEquals(668.00f,Supervisor.CalculateYearBonus());

}
    //Calculo para verificar el bonus anual de un Manager con 10% de bonificacion 
        public void testCalculateYearBonusManager(){
            Employee Manager=new Employee(500.00f,"USD",30.0f,EmployeeType.Manager);	
            assertEquals(861.00f,Manager.CalculateYearBonus());

}
       
       
    
}
