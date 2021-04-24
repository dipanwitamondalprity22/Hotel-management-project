/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package start;
import java.lang.*;
import java.util.*;
import java.io.*;
public interface RoomOperation {
    void insertRoom(Room r) ;
    void removeRoom(Room r) ;
    Room getRoom(int RoomNumber) ;
    void showAllRoom( ) ;
}
