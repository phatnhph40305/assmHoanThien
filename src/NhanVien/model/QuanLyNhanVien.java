/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NhanVien.model;

import java.util.ArrayList;

/**
 *
 * @author Acer
 */
public class QuanLyNhanVien {

    ArrayList<NhanVien> listNhanVien = new ArrayList<>();

    public QuanLyNhanVien() {
//        listNhanVien.add(new NhanVien("ma 1", "nguyen van A", 20, "huu@gmail.com", 144.4));
//        listNhanVien.add(new NhanVien("ma 2", "nguyen van b", 10, "hudu@gmail.com", 144.4));
//        listNhanVien.add(new NhanVien("ma 3", "nguyen van A", 21, "hdudau@gmail.com", 144.4));
//        listNhanVien.add(new NhanVien("ma 4", "nguyen van c", 40, "huadfu@gmail.com", 144.4));
    }

    public ArrayList<NhanVien> listNv() {
        return listNhanVien;
    }

    public Boolean addNew(NhanVien nhanVien) {
        listNhanVien.add(nhanVien);
        return true;
    }

    public Boolean deleteRow(int vitri) {
        listNhanVien.remove(vitri);
        return true;
    }

    public NhanVien timTheoMa(String maNV) {
        for (NhanVien nv : listNhanVien) {
            if (nv.getMaNhanVien().equalsIgnoreCase(maNV)) {
                return nv;

            }
        }
        return null;

    }

    public void capNhat(NhanVien newNV) {
        NhanVien nv1 = timTheoMa(newNV.getMaNhanVien());
        if (nv1 != null) {
            
            nv1.setHoTen(newNV.getHoTen());
            nv1.setTuoi(newNV.getTuoi());
            nv1.setEmail(newNV.getEmail());
            nv1.setLuong(newNV.getLuong());

        }
    }

    public NhanVien timKiem(String maNV) {
        NhanVien nhanVienCanTim = new NhanVien();
        for (NhanVien nhanVien : listNhanVien) {
            if (nhanVien.getMaNhanVien().equals(maNV)) {
                nhanVienCanTim = nhanVien;
            }
        }
        return nhanVienCanTim;
    }

}
