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
public class LopHoc {
    private String tenLop;
    private ArrayList<SinhVien> listSinhVien = new ArrayList<SinhVien>();
    
    public LopHoc(){
        this.tenLop = "";
    }
    
    public String getTenLop(){
        return this.tenLop;
    }
    
    public void setTenLop(String className){
        this.tenLop = className;
    }
    
    public ArrayList<SinhVien> getListSinhVien(){
        return listSinhVien;
    }
    
    public void themSinhVien(SinhVien sv){
        listSinhVien.add(sv);
        System.out.println("Size: " + listSinhVien.size());
    }
    
    public boolean checkClassName(String name){
        if(this.tenLop.equalsIgnoreCase(name))
            return true;
        return false;
    }
}
