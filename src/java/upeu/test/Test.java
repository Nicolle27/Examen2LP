/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package upeu.test;

import com.google.gson.Gson;
import upeu.config.Conexion;
import upeu.dao.ClienteDAO;
import upeu.dao.ProductoDao;
import upeu.dao.SucursalDAO;
import upeu.daoImpl.ClientesDAOImlp;
import upeu.daoImpl.ProductoDaoImpl;
import upeu.daoImpl.SucursalDaoImpl;
import upeu.daoImpl.TablaDaoImpl;
import upeu.dao.TablaDAO;



/**
 *
 * @author admin
 */
public class Test {

static Gson g = new Gson();
    /**
     * @param args the command line arguments
     */
    static Gson gson = new Gson();
    static ClienteDAO clienteDao = new ClientesDAOImlp();
    static TablaDAO tablitaDAO = new TablaDaoImpl();
    static SucursalDAO sucursalesdao=new SucursalDaoImpl();
    static ProductoDao productodao=new ProductoDaoImpl();
    public static void main(String[] args) {
        // TODO code application logic here

        
        System.out.println(gson.toJson(clienteDao.readAll()));
        System.out.println("");
        System.out.println(gson.toJson(tablitaDAO.readAll()));
        System.out.println(gson.toJson(sucursalesdao.readAll()));
        System.out.println(gson.toJson(productodao.readAll()));
        if(Conexion.getConexion()!=null){
            System.out.println("si");
        }else{
            System.out.println("no");
        }

        
    }
    
}
