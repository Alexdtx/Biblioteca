package proyecto;

import javax.swing.JOptionPane;

public class Proyecto {
    private int id;
    private String titulo;
    private String estudiante;
    private String materia;
    private int grupo;
    private int año;
    
    public void Proyecto()
    {
        id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del proyecto que desea retirar")); //Ingresar la info del proyecto a retirar
        titulo = JOptionPane.showInputDialog("Ingrese el Titulo del proyecto que desea retirar");
        infoEst();
        estudiante = JOptionPane.showInputDialog("Ingrese el nombre del autor del proyecto que desea retirar");
        materia = JOptionPane.showInputDialog("Ingrese a materia correspondiente del proyecto que desea retirar");
        grupo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de grupo del proyecto que desea retirar"));
        año = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año de publicación del proyecto que desea retirar"));
    }
    
    
    public void infoEst() //método para llenar la info del proyecto y ver la info del estudiante
    {
        int opcion = 0;
       estudiantes arreglo1[] = new estudiantes[99];
        
        arreglo1[0] = new estudiantes("Carlos Martinez","Y",101110111,"Enseñanza");
        arreglo1[1] = new estudiantes("María Valverde","N",305550999,"Ingenieria");
        
        do
        {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("\n1-Ver primer autor. \n2-Ver segundo autor. "
                    + "\n3-Añadir nuevo. autor\n0-Salir."));
            switch(opcion)
            {
                case 1:
                    JOptionPane.showMessageDialog(null, "*****INFORMACIÓN DEL ESTUDIANTE*****"
                            + "\n\n\n\nNombre: "+arreglo1[0].getNombre()+"\nEgresado: "+arreglo1[0].getEgresado()+"\nCédula: "+arreglo1[0].getCedula()
                            + "\nCarrera: "+arreglo1[0].getCarrera());  //muestra información de un autor predeterminado.
                    break;
                    
                case 2:
                    JOptionPane.showMessageDialog(null, "*****INFORMACIÓN DEL ESTUDIANTE*****"
                            + "\n\n\n\nNombre: "+arreglo1[1].getNombre()+"\nEgresado: "+arreglo1[1].getEgresado()+"\nCédula: "+arreglo1[1].getCedula()
                            + "\nCarrera: "+arreglo1[1].getCarrera());
                    break;
                    
                case 3:
                    int decision;   //variable para decidir si continuar el añadido de autores.
                    int y=2; //variable que controla el ciclo de preguntado de variables.
                    while (y!=0)
                    {
                    String nombre = (JOptionPane.showInputDialog("Ingrese nombre del autor."));
                    String egresado = (JOptionPane.showInputDialog("El estudiante está egresado? (Y para sí, N para no."));
                    int cedula = (Integer.parseInt(JOptionPane.showInputDialog("Ingrese número de cédula.")));
                    String carrera = (JOptionPane.showInputDialog("Ingrese carrera a la pertenece o pertenecía el autor."));
                    
                    arreglo1[y] = new estudiantes(nombre,egresado,cedula,carrera);
                    decision = Integer.parseInt(JOptionPane.showInputDialog("¿Desea continuar añadiendo autores?"
                                                                          + "\n1.Sí."
                                                                          + "\n0.No."));
                    y++;
                    if (decision==0)
                    {
                        y = 0;
                    }
                    }
                    break;
                    
                case 0:
                    break;
                
                default:
                    JOptionPane.showMessageDialog(null, "Número no valido");
            }
            
            
        }while (opcion != 0);
        
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getEstudiante() {
        return estudiante;
    }

    public String getMateria() {
        return materia;
    }

    public int getGrupo() {
        return grupo;
    }

    public int getAño() {
        return año;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setEstudiante(String estudiante) {
        this.estudiante = estudiante;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public void setGrupo(int grupo) {
        this.grupo = grupo;
    }

    public void setAño(int año) {
        this.año = año;
    }   
}
