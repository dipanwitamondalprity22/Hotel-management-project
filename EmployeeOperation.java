/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package start;
import java.lang.*;
import java.util.*;
import java.io.*;

public interface EmployeeOperation {
    public Employee getEmployee(String NId) ;
    void insertEmployee(Employee e) ;
    void removeEmployee(Employee e) ;
    void showAllEmployee() ;
}
