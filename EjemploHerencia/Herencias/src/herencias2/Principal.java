/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencias2;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // TODO code application logic here
        String nombre;
        String apellido;
        int edad;
        Double rango;
        int opcion;

        System.out.println("\t===========================\n");

        System.out.print("ingrese el nombre: ");
        nombre = sc.nextLine();
        System.out.print("ingrese el apellido: ");
        apellido = sc.nextLine();
        System.out.print("ingrese la edad: ");
        edad = sc.nextInt();
        System.out.println("\t===========================\n");
        System.out.println("\t Escoja el tipo \n"
                + "1 - Estudiante\n"
                + "2 - Docente\n"
                + "3 - Policia");
        opcion = sc.nextInt();

        while (opcion == 1) {

            System.out.print("ingrese el rango: ");
            rango = sc.nextDouble();
            Estudiante e = new Estudiante(nombre, apellido, edad, rango);
            System.out.println(e);
        }
        while (opcion == 2) {
            System.out.print("ingrese el rango: ");
            rango = sc.nextDouble();
            Docente d = new Docente(nombre, apellido, edad, rango); // falta implementar
            System.out.println(d);
        }

        while (opcion == 2) {
            String ran;
            System.out.print("ingrese el ran: ");
            ran = sc.nextLine();
            Policia p = new Policia(nombre, apellido, edad, ran); // falta implementar
            System.out.println(p);

        }

    }

}
