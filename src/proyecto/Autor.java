package proyecto;

import javax.swing.JOptionPane;

public class Autor {
private String nombre;
private double date;
private String genero;
private String nacionalidad;
private int ID;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getDate() {
        return date;
    }

    public void setDate(double date) {
        this.date = date;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }


public void InfoAutor(){
nombre =JOptionPane.showInputDialog(null, "Quien es el autor del libro?");
ID =Integer.parseInt(JOptionPane.showInputDialog(null, "Cual es la identificacion del autor?"));
nacionalidad =JOptionPane.showInputDialog(null, "De que  nacionalidad es el autor?");
date =Integer.parseInt(JOptionPane.showInputDialog(null, "Cual es la fecha de nacimiento del autor?"));
genero =JOptionPane.showInputDialog(null, "El autore es hombre o mujer?");
}
}
