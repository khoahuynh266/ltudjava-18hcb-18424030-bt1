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
public class ThoiKhoaBieu {
    private MonHoc monHoc;
    private String phongHoc;
    
    public ThoiKhoaBieu(){
        this.monHoc.setMaMH("");
        this.monHoc.setTenMH("");
        this.phongHoc = "";
    }
    
    public ThoiKhoaBieu(MonHoc _mh, String _ph){
        this.monHoc = _mh;
        this.phongHoc = _ph;
    }
     
    public MonHoc getMH(){
        return this.monHoc;
    }
    
    public void setMH(MonHoc mh){
        this.monHoc = mh;
    }
    
    public String getPH(){
        return this.phongHoc;
    }
    
    public void setPH(String phong){
        this.phongHoc = phong;
    }
}
