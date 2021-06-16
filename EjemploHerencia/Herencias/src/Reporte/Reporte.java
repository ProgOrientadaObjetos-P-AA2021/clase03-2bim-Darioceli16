/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reporte;

/**
 *
 * @author Smart
 */
public class Reporte {
    protected String codigo;
    
     public void Codigo(String mat) {
        codigo = mat;
    }

    public String getRango() {
        return codigo;
    }
}
