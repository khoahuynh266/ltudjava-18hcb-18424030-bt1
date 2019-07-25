/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package component;

/**
 *
 * @author Gogojungle
 */
public class Lop_MonHoc {
    private String tenLop;
    private String maMonHoc;
    
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
    
    public boolean isExists(String name, String id) {
        if (this.tenLop.equalsIgnoreCase(name) && this.maMonHoc.equalsIgnoreCase(id)) {
            return true;
        }
        return false;
    }
}
