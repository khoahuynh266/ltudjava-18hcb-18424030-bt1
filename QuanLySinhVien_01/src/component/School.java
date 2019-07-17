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
    private int schoolYear;
    private ArrayList<LopHoc> listLopHoc = new ArrayList<LopHoc>();
    
    public int getSchoolYear(){
        return this.schoolYear;
    }
    
    public void setSchoolYear(int year){
        this.schoolYear = year;
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
        return this.listLopHoc;
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
}