
package proyecto;

public class estudiantes {
  //La clase estudiante contiene la información del estudiante que ha creado el proyecto
    private String nombre;
    private String egresado;
    private int cedula;
    private String carrera;
    
public estudiantes(String nombre,String egresado,int cedula,String carrera){

    this.nombre = nombre;
    this.egresado = egresado;
    this.cedula = cedula;
    this.carrera = carrera;
}

    public String getNombre() 
    {
        return nombre;
    }

    public String getEgresado() 
    {
        return egresado;
    }

    public int getCedula() 
    {
        return cedula;
    }

    public String getCarrera() 
    {
        return carrera;
    }

    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }

    public void setEgresado(String egresado) 
    {
        this.egresado = egresado;
    }

    public void setCedula(int cedula) 
    {
        this.cedula = cedula;
    }

    public void setCarrera(String carrera) 
    {
        this.carrera = carrera;
    }    
}
