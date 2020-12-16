package proyecto;


public class Cliente {
//Metodo para permitirme instanciar 
    public Cliente()
    {
    }
// Variables 
    private String Nombre;
    private int Cedula;
    private int NumTelefono;
    private String Carrera;
    private String morosidad;
 //Contructores
    public Cliente(String Nombre, int Cedula, int NumTelefono, String Carrera, String morosidad) {
        this.Nombre = Nombre;
        this.Cedula = Cedula;
        this.NumTelefono = NumTelefono;
        this.Carrera = Carrera;
        this.morosidad = morosidad;
    }
/// Gets y Sets 
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getCedula() {
        return Cedula;
    }

    public void setCedula(int Cedula) {
        this.Cedula = Cedula;
    }

    public int getNumTelefono() {
        return NumTelefono;
    }

    public void setNumTelefono(int NumTelefono) {
        this.NumTelefono = NumTelefono;
    }

    public String getCarrera() {
        return Carrera;
    }

    public void setCarrera(String Carrera) {
        this.Carrera = Carrera;
    }

    public String getMorosidad() {
        return morosidad;
    }

    public void setMorosidad(String morosidad) {
        this.morosidad = morosidad;
    }
    ///Metodos    
}
