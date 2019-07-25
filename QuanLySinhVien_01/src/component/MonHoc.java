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
public class MonHoc {
    private String maMonHoc;
    private String tenMonHoc;
    private String phongHoc;
    
    public MonHoc(){
        this.maMonHoc = "";
        this.tenMonHoc = "";
        this.phongHoc = "";
    }
    
    public MonHoc(String _maMH, String _tenMH, String _phongHoc){
        this.maMonHoc = _maMH;
        this.tenMonHoc = _tenMH;
        this.phongHoc = _phongHoc;
    }
    
    public String getMaMH(){
        return this.maMonHoc;
    }
    
    public void setMaMH(String maMH){
        this.maMonHoc = maMH;
    }
    
    public String getTenMH(){
        return this.tenMonHoc;
    }
    
    public void setTenMH(String tenMH){
        this.tenMonHoc = tenMH;
    }

    public String getPH(){
        return this.phongHoc;
    }
    
    public void setPH(String phong){
        this.phongHoc = phong;
    }
}


