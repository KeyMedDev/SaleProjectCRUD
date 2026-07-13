package com.SaleProject.dao;

import com.SaleProject.config.connectiondb;
import com.SaleProject.model.MLocal;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public class DAOlocal {
    public List<MLocal> ListarLocal(){
        Connection cn = connectiondb.getConexion();
        String sql = "select * from tlocal";
        Statement st; ResultSet rs = null;
        List<MLocal> list = new ArrayList<>();

        try{
            st = cn.createStatement();
            rs = st.executeQuery(sql);

            while (rs.next()){
                int idLocal = rs.getInt("idLocal");
                String administrador = rs.getString("administrador");
                String diasAtenc = rs.getString("diasAtenc");
                String horario = rs.getString("horario");
                String direccion = rs.getString("direccion");
                MLocal oLocal = new MLocal(idLocal, administrador, diasAtenc, horario, direccion);
                list.add(oLocal);
            }
            return list;
        }
        catch (Exception e){
            System.out.println(e.toString());
            return null;
        }
    }
}
