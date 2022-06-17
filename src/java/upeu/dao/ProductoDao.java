/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package upeu.dao;

import java.util.List;
import upeu.entity.Productos;


public interface ProductoDao {
    int create(Productos p);
    int update(Productos p);
    int delete(int id);
    Productos read(int id);
    List<Productos> readAll();
  
}
