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
    
    public MonHoc(){
        this.maMonHoc = "";
        this.tenMonHoc = "";
    }
    
    public MonHoc(String _maMH, String _tenMH){
        this.maMonHoc = _maMH;
        this.tenMonHoc = _tenMH;
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
}