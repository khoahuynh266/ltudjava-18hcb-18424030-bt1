/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package component;

import java.util.ArrayList;
/**
 *
 * @author Gogojungle
 */
public class Lop_MonHoc {
    private String tenLop;
    private String maMonHoc;
    private ArrayList<SinhVien> listSV = new ArrayList<SinhVien>();
    private ArrayList<DiemSinhVien> listDiem = new ArrayList<>();
    
    public String getClassName(){
        return this.tenLop;
    }
    
    public void setClassName(String name){
        this.tenLop = name;
    }
    
    public String getMaMonHoc(){
        return this.maMonHoc;
    }
    
    public void setMaMonHoc(String id){
        this.maMonHoc = id;
    }
    
    public ArrayList<SinhVien> getListSV() {
        return listSV;
    }

    public void setListSV(ArrayList<SinhVien> list) {
        this.listSV = (ArrayList<SinhVien>) list.clone();
    }
    
    public boolean isExists(String name, String id) {
        if (this.tenLop.equalsIgnoreCase(name) && this.maMonHoc.equalsIgnoreCase(id)) {
            return true;
        }
        return false;
    }
    
    public void addSV(SinhVien sv){
        this.listSV.add(sv);
    }
    
    public ArrayList<DiemSinhVien> getListDiem() {
        return listDiem;
    }
    
    public void setListDiemSV(ArrayList<DiemSinhVien> _listDiem) {
        this.listDiem = (ArrayList<DiemSinhVien>) _listDiem.clone();
    }
}
