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
public class DiemSinhVien {
    private float diemGK;
    private float diemCK;
    private float diemKhac;
    private float diemTong;
    private SinhVien sv = new SinhVien();
    
    public DiemSinhVien(){
        this.sv = null;
        this.diemGK = 0;
        this.diemCK = 0;
        this.diemKhac = 0;
        this.diemTong = 0;
    }

    public DiemSinhVien(SinhVien _sv, float diemGK, float diemCK, float diemKhac, float diemTong) {
        this.sv = _sv;
        this.diemGK = diemGK;
        this.diemCK = diemCK;
        this.diemKhac = diemKhac;
        this.diemTong = diemTong;
    }
    
    public SinhVien getSV() {
        return sv;
    }

    public void setSV(SinhVien _sv) {
        this.sv = _sv;
    }
    
    public float getDiemGK(){
        return this.diemGK;
    }
    
    public void setDiemGK(float _diemGK){
        this.diemGK = _diemGK;
    }
    
    public float getDiemCK(){
        return this.diemCK;
    }
    
    public void setDiemCK(float _diemCK){
        this.diemCK = _diemCK;
    }
    
    public float getDiemKhac(){
        return this.diemKhac;
    }
    
    public void setDiemKhac(float _diemKhac){
        this.diemKhac = _diemKhac;
    }
    
    public float getDiemTong(){
        return this.diemTong;
    }
    
    public void setDiemTong(float _diemTong){
        this.diemTong = _diemTong;
    }
    
    public String xepLoai(){
        if(this.diemTong >= 0 && this.diemTong < 5){
            return "Rớt";
        }
        return "Đậu";
    }
    
}
