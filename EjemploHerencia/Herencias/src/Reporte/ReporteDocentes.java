/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reporte;

import herencias2.Docente;
import java.util.ArrayList;

/**
 *
 * @author Smart
 */
public class ReporteDocentes extends Reporte {

    String promedioSueldo;
    ArrayList<Docente> listaDocente;

    public ReporteDocentes(String n) {

    }

    public void Promedio(String n) {
        promedioSueldo = n;
    }

    public String Promedio() {
        return promedioSueldo;
    }

    public void Lista(ArrayList n) {
        listaDocente = n;
    }

    public ArrayList Lista() {
        return listaDocente;
    }

    @Override
    public String toString() {
        return String.format("Lista: ", Lista());
    }
}
