/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package component;

import component.MonHoc;
import java.util.ArrayList;
/**
 *
 * @author Gogojungle
 */
public class ThoiKhoaBieu {
    private String tenLop;
    private ArrayList<MonHoc> listMonHoc = new ArrayList<MonHoc>();
    
    public ThoiKhoaBieu(){
        this.tenLop = "";
    }
    
    public ThoiKhoaBieu(String _tenLop){
        this.tenLop = _tenLop;
    }
    
    public String getClassName(){
        return this.tenLop;
    }
    
    public void setClassName(String className){
        this.tenLop = className;
    }
}
