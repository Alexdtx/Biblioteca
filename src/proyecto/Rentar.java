
package proyecto;

import javax.swing.JOptionPane;

public class Rentar 
{
// cosa para permitirme instanciar 
    public Rentar(){
        
    }

//Variables
    private String NombreCliente;
    private String Documento;
    private String FechaRenta;
    private String FechaLimite;
    //private Date Fecha;
// Cosa de constructores
    public Rentar(String NombreCliente, String Documento, String FechaRenta, String FechaLimite) {
        this.NombreCliente = NombreCliente;
        this.Documento = Documento;
        this.FechaRenta = FechaRenta;
        this.FechaLimite = FechaLimite;
    }
 /// Cosa de gets y sets 
    public String getNombreCliente() {
        return NombreCliente;
    }

    public void setNombreCliente(String NombreCliente) {
        this.NombreCliente = NombreCliente;
    }

    public String getDocumento() {
        return Documento;
    }

    public void setDocumento(String Documento) {
        this.Documento = Documento;
    }
// Division silabica//////////////////////////////////////////////////
    public String getFechaRenta() {
        return FechaRenta;
    }

    public void setFechaRenta(String FechaRenta) {
        this.FechaRenta = FechaRenta;
    }

    public String getFechaLimite() {
        return FechaLimite;
    }

    public void setFechaLimite(String FechaLimite) {
        this.FechaLimite = FechaLimite;
    }
    //Metodos
 public void DetallesCliente ()
            //detalles del cliente que renta las cosas
    {  int opc;
        do{
        Rentar ren= new Rentar();
        Cliente cos = new Cliente();
        
        ///pregunta nombre
      NombreCliente=JOptionPane.showInputDialog(null,"Bueno, primero deme su nombre.");
      ren.setNombreCliente(NombreCliente);
        cos.setNombre(NombreCliente);
        // pregunta cedula 
        int Ced;
        do {//Entrada a do while por si lo escribe mal 
           Ced=Integer.parseInt(JOptionPane.showInputDialog(null,"¿Tu cedula?"));
      cos.setCedula(Ced); 
      if(Integer.toString(Ced).length()<=8){//Mensaje de error 
          JOptionPane.showMessageDialog(null,"Pero dime bien los numeros, la cedula tiene 9 digitos, ni mas ni menos.");
      }
        }while(Integer.toString(Ced).length()!=9);
        //Pregunta numero telefono
       int Numt=Integer.parseInt(JOptionPane.showInputDialog(null,"Listo, ¿tu numero telefonico?"
               + "\n En este no es necesario preocuparse por la longitud igual muy pocas veces llamamos ajaja..."));
      cos.setNumTelefono(Numt);
     //pregunta carrera
        String carr=JOptionPane.showInputDialog(null,"¿Que carrera estudias en este momento?");
        cos.setCarrera(carr);
     //Continuacion
       JOptionPane.showMessageDialog(null,"Bueno preguntas de rutina tu sabes, veamos..");
      
       
       opc=Integer.parseInt(JOptionPane.showInputDialog(null,
               "Te mostrare lo que apunte dime si es correcto la informacion."
                       +"\n---------------------------"
       +"\nNombre:"+cos.getNombre()
       +"\nCedula:"+cos.getCedula()
       +"\nNumero Telefonico:"+cos.getNumTelefono()
       +"\nCarrera cursada:"+cos.getCarrera()
                       +"\n---------------------------"
       +"\n 1. Si es mi informacion continuemos."
       +"\n 2. No no, es mi informacion preguntame de nuevo."));           
     //Info
      }while(opc!=1);
    }
    public void emitirTiquete ()
    {Rentar ren= new Rentar();
     //emitacion y seleccion de documentos a rentar 
     int opt=0;
     do{
        Documento=JOptionPane.showInputDialog(null,"¿Bueno, entonces que quieres rentar?"); 
        
        ren.setDocumento(Documento);
        opt=Integer.parseInt(JOptionPane.showInputDialog(null,"¿Entonces quieres rentar "+ren.getDocumento()+"?"
        +"\n1.Si."
        +"\n2.No"
        + "\n3.Talves, dejame recordar..."));
     }while(opt!=1);
        
        
    }
    public void DeclararMoroso()
    {
        //tiempo de renta
        //Por cuanto tiempo vas a rentar el documento?
        Rentar ren=new Rentar();
        Cliente cos=new Cliente();
        JOptionPane.showMessageDialog(null,"Piuh... esto es cansado, bueno solo falta que me digas el tiempo que quieres rentarlo.");
        JOptionPane.showMessageDialog(null,"Recuerde escribir los datos sin espacios...");
        FechaRenta=JOptionPane.showInputDialog(null,"¿Que dia es hoy para la fecha de renta?");
        ren.setFechaRenta(FechaRenta);  
        FechaLimite=JOptionPane.showInputDialog(null,"Bueno, casi hay,¿cuanto tiempo quieres rentar el documento?");
        ren.setFechaLimite(FechaLimite);
        cos.setMorosidad(FechaLimite);
        JOptionPane.showMessageDialog(null,"¡Bueno!, ah pásado tiempo desde que hacia tanto trabajo ajajja");
        JOptionPane.showMessageDialog(null,"Si quieres saber tu tiempo limite ve el tiquete que no se te olvide que casi nadie entrega los documentos despues tsk tsk...");
        
    }
    //menu
   public void menu()// menu interno sobre las selecciones 
    {
         int op=0;//variable de menu 1 
         op= Integer.parseInt(JOptionPane.showInputDialog(null,
                 "¡Bienvenido cliente!"
                + "\n¿Para que me necesitas?"
                 +"\n "
                 + "\n1.Busco rentar un libro.."
                 + "\n2.Nada,nada adios."));
        //menu 1
       switch(op){
            case 1:
              JOptionPane.showMessageDialog(null,"Entonces, responda unas preguntas para registrarlo en el sistema por favor.");
              DetallesCliente();
              JOptionPane.showMessageDialog(null,"Bueno con eso tengo tu informacion gracias por tu tiempo."); 
              int opa=0;//variable menu 2
       do{
      
      opa= Integer.parseInt(JOptionPane.showInputDialog(null,
                 "¡Ahora si!"
                + "\n¿Que querias hacer entonces que ya me olvide?"
                 +"\n "
                 + "\n1.Editar mi informacion en la base de datos"
                 + "\n2.Emitir un tiquete de renta."
                 + "\n3.Declarar Morosidad de la renta."
                 + "\n4.Ver mi Tiquete de Renta."        
                 + "\n5.Nada gracias y adios."));  
       switch(opa){
            case 1:
              JOptionPane.showMessageDialog(null,"Entonces, responda unas preguntas para editarlo en el sistema por favor.");
              DetallesCliente();
              JOptionPane.showMessageDialog(null,"Bueno con eso tengo tu informacion gracias por tu tiempo.");
              break;
            case 2:
                emitirTiquete();
                 break;
            case 3:
                DeclararMoroso();
                 break;
        case 4:
                Rentar ren= new Rentar();
               Cliente cos=new Cliente();
        System.out.println();
        JOptionPane.showMessageDialog(null,"---Tiquete de renta-----"
       +"\n---------------------------"
       +"\nNombre:"+NombreCliente
       +"\nDocumento Rentado:"+Documento
       +"\nFecha de Renta:"+FechaRenta
       +"\nFecha limite de uso:"+FechaLimite
       +"\n---------------------------");
                 break;
                         
                }
       
       
       }while(opa !=5);       
      //menu 2
            break;         
       }
       
    }
}
