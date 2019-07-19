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
        for(LopHoc lh : this.listLopHoc){
            if(lh.checkClassName(lopHoc))
                listLopHoc.add(lh);
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
                boolean checkName = lh.checkClassName(lh.getTenLop());
                System.out.print(checkName);
                if (checkName) {
                    rs = lh;
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
    
    public LopHoc getClassRoom(int index) {
        if ((index >= 0) && (index < this.listLopHoc.size() - 1)) {
            return listLopHoc.get(index);
        }
        return null;
    }
    
    public LopHoc getClassRoom(String className) {
        LopHoc result = new LopHoc();
        if (!className.equalsIgnoreCase("")) {
            for(LopHoc lh : this.listLopHoc) {
                if(lh.checkClassName(className)) {
                    result = lh;
                }
            }
            
        }
        return result;
    }
}
