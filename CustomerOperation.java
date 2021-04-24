/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package start;
import java.lang.*;
import java.util.*;
import java.io.*;

public interface CustomerOperation {
    public Customer getCustomer(String Nid) ;
    void insertCustomer(Customer c) ;
    void removeCustomer(Customer c) ;
    void showAllCustomers() ;
}
