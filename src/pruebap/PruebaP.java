/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebap;

import java.io.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Andrea
 */
public class PruebaP {

    public static ArrayList leerContenido(String archivo) throws FileNotFoundException, IOException {
        String cadena;
        FileReader f = new FileReader(archivo);
        BufferedReader b = new BufferedReader(f);
        ArrayList<String> cifrados = new ArrayList();
        while ((cadena = b.readLine()) != null) {
            cifrados.add(cadena);
        }
        b.close();
        return cifrados;
    }

    public static ArrayList separar(ArrayList datos, int sum) {
        ArrayList<String> guardar = new ArrayList();
        for (int i = sum; i < datos.size(); i = i + 3) {
            guardar.add((String) datos.get(i));
        }
        return guardar;
    }

    public static void sec(ArrayList div) {
        for (int i = 0; i < div.size(); i++) {
            String linea = (String) div.get(i);
            String[] parts = linea.split(",");
            for (int j = 0; j <parts.length; j++){
           // System.out.print (parts[j] + "    ");
            System.out.print (des ("OLQGVHB"));
            }
            System.out.println ();
        }
    }
    
    public static String des (String des){

        char[] letras = des.toCharArray();
        int [] newletras = new int[letras.length];
        for (int i = 0; i < letras.length; i++){
            newletras[i] =  ((int) letras[i]-65)%26;
        }
        String b = new String (newletras);
        
        
                return b;
    }

public static void main(String[] args) throws IOException {
        ArrayList<String> cif1 = new ArrayList();
        cif1 = leerContenido("C:\\Users\\Andrea\\Documents\\NetBeansProjects\\pruebaP\\src\\pruebap\\datos.txt");
        int f = 1;
        int s = 2;
        int e = 0;
        ArrayList<String> facultad = new ArrayList();
        ArrayList<String> staff = new ArrayList();
        ArrayList<String> estudiante = new ArrayList();

        facultad = separar(cif1, f);
        staff = separar(cif1, s);
        estudiante = separar(cif1, e);
        
        sec (facultad);

    }

}
