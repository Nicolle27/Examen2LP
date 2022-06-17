/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package upeu.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import upeu.config.Conexion;
import upeu.dao.ClienteDAO;
import upeu.entity.Clientes;


public class ClientesDAOImlp implements ClienteDAO{
private PreparedStatement ps;
    private ResultSet rs;
    private Connection cx;
    @Override
    public int create(Clientes clientes) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int update(Clientes clientes) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int delete(int idcliente) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Clientes read(int idcliente) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Clientes> readAll() {String SQL = "SELECT clientes.Idclientes, clientes.direccion, clientes.hobby, clientes.correo, clientes.Idpersonas, personas.nombres FROM clientes, personas";
        List<Clientes> lista = new ArrayList<>();
        try {
            cx = Conexion.getConexion();
            ps = cx.prepareStatement(SQL);
            rs = ps.executeQuery();
            while (rs.next()) {
                Clientes s = new Clientes();
                s.setIdclientes(rs.getInt("Idclientes"));
                s.setNombre(rs.getString("nombres"));
                s.setDireccion(rs.getString("direccion"));
                s.setHobby(rs.getString("hobby"));
                s.setCorreo(rs.getString("correo"));
                s.setIdpersonas(rs.getInt("Idpersonas"));
                
           
                lista.add(s);
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        }
        return lista;
    }
    
}
