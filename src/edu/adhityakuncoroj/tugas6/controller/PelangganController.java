/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.adhityakuncoroj.tugas6.controller;


import edu.adhityakuncoroj.tugas6.model.PelangganModel;
import edu.adhityakuncoroj.tugas6.view.PelangganVIew;
import javax.swing.JOptionPane;

/**
 *
 * @author RadenKun
 */
public class PelangganController {
    
    private PelangganModel model;

    public void setModel(PelangganModel model) {
        this.model = model;
    }
    
    public void resetPelanggan(PelangganVIew vIew){
        model.resetPelanggan();
    }
    
    public void insertPelanggan(PelangganVIew vIew){
        
       String nama = vIew.getTxtNama().getText();
       String alamat = vIew.getTxtAlamat().getText();
       String telepon = vIew.getTxtTelepon().getText();
       String email = vIew.getTxtEmail().getText();
       
        if (nama.trim().equals("")) {
             JOptionPane.showMessageDialog(vIew, "Nama Masih Kosong");
        } else if (nama.length() > 255) {
            JOptionPane.showMessageDialog(vIew, "Nama Depan tak boleh lebih dari 255");
        } else if (telepon.length() > 12) {
            JOptionPane.showMessageDialog(vIew, "Number telepon tak boleh lebih dari 12 digit");
        } else if (!email.contains("@") || !email.contains(".")) {
            JOptionPane.showMessageDialog(vIew, "Email tidak valid");
        } else {
            model.setNama(nama);
            model.setAlamat(alamat);
            model.setTelepon(telepon);
            model.setEmail(email);
            try {
                model.updatePelanggan();
                JOptionPane.showMessageDialog(vIew, "Data Pelanggan Berhasil Di Ubah");
                model.resetPelanggan();
            } catch (Throwable throwable) {
                JOptionPane.showMessageDialog(vIew, new Object[]{
                    "Terjadi error di database dengan pesan ", throwable.getMessage()
                });
             }
       
    }

    public void updatePelanggan(PelangganVIew vIew){
     
        Integer id = Integer.parseInt(vIew.getTxtId().getText());

        String nama = vIew.getTxtNama().getText();
        String alamat = vIew.getTxtAlamat().getText();
        String telepon = vIew.getTxtTelepon().getText();
        String email = vIew.getTxtEmail().getText();

        if (nama.trim().equals("")) {
            JOptionPane.showMessageDialog(vIew, "Nama Masih Kosong");
        } else if (nama.length() > 255) {
            JOptionPane.showMessageDialog(vIew, "Nama Depan tak boleh lebih dari 255");
        } else if (telepon.length() > 12) {
            JOptionPane.showMessageDialog(vIew, "Number telepon tak boleh lebih dari 12 digit");
        } else if (!email.contains("@") || !email.contains(".")) {
            JOptionPane.showMessageDialog(vIew, "Email tidak valid");
        } else {
            model.setId(id);
            model.setNama(nama);
            model.setAlamat(alamat);
            model.setTelepon(telepon);
            model.setEmail(email);
            try {
                model.updatePelanggan();
                JOptionPane.showMessageDialog(vIew, "Data Pelanggan Berhasil Di Ubah");
                model.resetPelanggan();
            } catch (Throwable throwable) {
                JOptionPane.showMessageDialog(vIew, new Object[]{
                    "Terjadi error di database dengan pesan ", throwable.getMessage()
                });
            }
        }
    }
    
    public void deletePelanggan(PelangganVIew vIew){
        
    }
    }
    
}
