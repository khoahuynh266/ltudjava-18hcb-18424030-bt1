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
public class School {
    private int soLop;
    private ArrayList<LopHoc> listLopHoc = new ArrayList<LopHoc>();
    private ArrayList<Lop_MonHoc> listLopMonHoc = new ArrayList<>();
        
    public School() {
        this.soLop = 0;
    }
    
    public int getsoLop(){
        return this.soLop;
    }

    public void setSoLop(int soLop) {
        this.soLop = soLop;
    }
    
    public void setSchoolYear(int year){
        this.soLop = year;
    }
    
    public void addClass(LopHoc lh){
        this.listLopHoc.add(lh);
    }
    
    public void addSVToClass(String lopHoc, SinhVien sv) {
        for(LopHoc lh : listLopHoc){
            if(lh.checkClassName(lopHoc))
                lh.themSinhVien(sv);
        }        
    }
    
    public ArrayList<LopHoc> getList(){
        return listLopHoc;
    }
    
    public LopHoc getLop(int index) {
        if ((index >= 0) && (index < listLopHoc.size() - 1)) {
            return listLopHoc.get(index);
        }
        return null;
    }

    public LopHoc getLopHoc(String tenLop){
        LopHoc rs = new LopHoc();
        if(!tenLop.equals("")){
            for(LopHoc lh : this.listLopHoc){
                boolean checkName = lh.checkClassName(tenLop);
                if (checkName) {
                    rs = lh;
//                    System.out.print("Lớp đã tồn tại");
                }
            }
        }
        return rs;
    }
    
    public void setLopHoc(LopHoc lh, String className) {
        for (LopHoc cr : this.listLopHoc) {
            if (cr.checkClassName(className)) {
                int _index = this.listLopHoc.indexOf(cr);
                this.listLopHoc.set(_index, lh);
            }
        }
    }    
    
        
    public ArrayList<Lop_MonHoc> getListMHClass(){
        return this.listLopMonHoc;
    }
//    
    public void setMonHocClass(ArrayList<Lop_MonHoc> target){
        this.listLopMonHoc = target;
    }
    
    public void setListLopMonHoc(ArrayList<Lop_MonHoc> list) {
        this.listLopMonHoc = (ArrayList<Lop_MonHoc>) list.clone();
    }
    
    public Lop_MonHoc getLopMonHoc(String tenLop, String maMH){
        Lop_MonHoc result = new Lop_MonHoc();
        
        if(this.listLopMonHoc.size() > 0){
            for(Lop_MonHoc item : this.listLopMonHoc){
                if(item.isExists(tenLop, maMH))
                    result = item;
            }
        }
        return result;
    }
    
    public void addSVBySubject(String lop, String idMH ,SinhVien sv) {
        for (Lop_MonHoc lop_mh : this.listLopMonHoc) {
            if (lop_mh.isExists(lop, idMH)) {
                lop_mh.addSV(sv);
            }
        }
    }
    
    
    public void setLopMonHoc(String tenLop, String maMH, Lop_MonHoc _target){
        for(Lop_MonHoc item : this.listLopMonHoc){
            if(item.isExists(tenLop, maMH)){
                int index = this.listLopMonHoc.indexOf(item);
                this.listLopMonHoc.set(index, _target);
            }
        }
    }
}
  