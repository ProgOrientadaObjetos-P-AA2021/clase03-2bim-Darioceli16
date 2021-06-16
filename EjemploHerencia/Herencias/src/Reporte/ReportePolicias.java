/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reporte;

import herencias2.Policia;
import java.util.ArrayList;

/**
 *
 * @author Smart
 */
public class ReportePolicias extends Reporte {

    String promedioEdades;
    ArrayList<Policia> listaPolicia;

    public ReportePolicias(String n) {

    }

    public void Promedio(String n) {
        promedioEdades = n;
    }

    public String Promedio() {
        return promedioEdades;
    }

    public void Lista(ArrayList n) {
        listaPolicia = n;
    }

    public ArrayList Lista() {
        return listaPolicia;
    }
 @Override
    public String toString(){
        return String.format("Lista: ",Lista());
    }
}
