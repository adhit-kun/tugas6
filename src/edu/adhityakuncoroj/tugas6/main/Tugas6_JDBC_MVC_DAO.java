/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.adhityakuncoroj.tugas6.main;

import edu.adhityakuncoroj.tugas6.database.KingsBarbershopDatabase;
import edu.adhityakuncoroj.tugas6.entity.Pelanggan;
import edu.adhityakuncoroj.tugas6.error.PelangganException;
import edu.adhityakuncoroj.tugas6.service.PelangganDao;
import java.sql.SQLException;

/**
 *
 * @author RadenKun
 */
public class Tugas6_JDBC_MVC_DAO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, PelangganException{
        // TODO code application logic here
        // KingsBarbershopDatabase.getConnection();
        
        
    /*  PelangganDao dao = KingsBarbershopDatabase.getPelangganDao();
        Pelanggan pelanggan  = new Pelanggan();
        pelanggan.setNama("ADHITYA KUNCORO JATTI");
        pelanggan.setAlamat("jalan sukarapih V");
        pelanggan.setTelepon("0211502655");
        pelanggan.setEmail("adhitya@gmail.com");
        
        dao.insertPelanggan(pelanggan);
    */
    /*
        PelangganDao dao = KingsBarbershopDatabase.getPelangganDao();
        Pelanggan pelanggan  = dao.getPelanggan(1);
        pelanggan.setNama("ADHITYA unch");
        pelanggan.setAlamat("jalan sukarapih VIII");
        pelanggan.setTelepon("081995802770");
        
        dao.updatePelanggan(pelanggan);
    */
    /*
        PelangganDao dao = KingsBarbershopDatabase.getPelangganDao();
        Pelanggan pelanggan  = dao.getPelanggan("adhitya@gmail.com");
        System.out.println(" nama : " + pelanggan.getNama());
    */
        PelangganDao dao = KingsBarbershopDatabase.getPelangganDao();
        dao.deletePelanggan(1);
    }
    
}
