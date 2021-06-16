/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reporte;

import herencias2.Estudiante;
import java.util.ArrayList;

/**
 *
 * @author Smart
 */
public class ReporteEstudiantes extends Reporte {

    String promedioMatriculas;
    ArrayList<Estudiante> listaEstudiante;

    public ReporteEstudiantes(String n) {

    }

    public void Promedio(String n) {
        promedioMatriculas = n;
    }

    public String Promedio() {
        return promedioMatriculas;
    }

    public void Lista(ArrayList n) {
        listaEstudiante = n;
    }

    public ArrayList Lista() {
        return listaEstudiante;
    }

    @Override
    public String toString() {
        return String.format("Lista: ", Lista());
    }
}
