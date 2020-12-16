package proyecto;
import javax.swing.JOptionPane;

public class Libro {
private String Titulo;
private double date;
private String editorial;
private char disponibilidad;


    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public double getDate() {
        return date;
    }

    public void setDate(double date) {
        this.date = date;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public char getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(char disponibilidad) {
        this.disponibilidad = disponibilidad;
    }



public void ValidarLibro(){
Titulo =JOptionPane.showInputDialog(null, "Introduce el nombre del libro");
editorial =JOptionPane.showInputDialog(null, "Cual es su editorial?");
date =Double.parseDouble(JOptionPane.showInputDialog(null, "Digite su fecha de lanzamiento"));
disponibilidad =JOptionPane.showInputDialog(null, "Cuantos libros estan disponibles?").charAt(0);
}

public void Info(){
Autor fide=new Autor();
fide.InfoAutor();
JOptionPane.showMessageDialog(null, "nombre: " +Titulo
+"\n Editorial:" +editorial
 +"\n Fecha de lanzamiento:" +date
 +"\n Cantidad de libros disponibles: "+disponibilidad);

JOptionPane.showMessageDialog(null, "Info del autor: \n "
+"\n Nombre del autor:" +fide.getNombre()
+"\n Fecha de nacimiento: "+fide.getDate()
+"\n Genero del autor: "+fide.getGenero()
+"\n Nacionalidad del autor: "+fide.getGenero());

}
}
