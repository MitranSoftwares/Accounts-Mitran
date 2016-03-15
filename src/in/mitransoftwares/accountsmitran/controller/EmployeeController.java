/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.mitransoftwares.accountsmitran.controller;

import in.mitransoftwares.mitranaccountingsystem.dao.EmployeeDAO;

/**
 *
 * @author nikil sanghvi
 */
public class EmployeeController {
   
    public static void main(String args[]){
        EmployeeDAO employeedao=new EmployeeDAO();
        int e1=employeedao.addEmployee("Zara", "Ali", 1000);
        System.out.println(e1);
        int e2=employeedao.addEmployee("Daisy", "Das", 5000);
        System.out.println(e2);
        int e3=employeedao.addEmployee("John", "Paul", 10000);
        System.out.println(e3);
    }
    
    
}
