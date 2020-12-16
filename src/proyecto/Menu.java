
package proyecto;

import javax.swing.JOptionPane;


public class Menu {
    public void Menu(){
    Proyecto user1 = new Proyecto();
    Libro user2 =new Libro();
    estudiantes user3=new estudiantes("","",0,"");
    Rentar ren= new Rentar();
      int opcion;
        do
        {
        opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
        "Biblioteca\n "
        + "Digite la  opcion que desee\n "
        + "1. Registrar libro\n "
        + "2. Registtrar el proyecto\n "
        + "3. Informacion del estudiante\n "
        + "4. Rentar un libro\n "
        + "5. Verificar informacion del proyecto\n "
        + "0. Salir"));
         switch(opcion) 
        {
            case 1:
            user2.ValidarLibro();
            user2.Info();
                break;
                
                case 2:
                    user1.Proyecto();
                break;
                
                case 3:
                    user1.infoEst();
                     break;
                case 4:
                    
                    ren.menu();
                    break;
                    
                case 5:
                                    JOptionPane.showMessageDialog(null, "INFORMACIÓN DEL PROYECTO"
                + "\n\n\nId: "+user1.getId()+"\nTitulo: "+user1.getTitulo()+"\nEstudiante: "+user1.getEstudiante()
                        + "\nMateria: "+"\nGrupo: "+user1.getGrupo()+"\nAño: "+user1.getAño()); 
                    break;
                
        }    
    }while(opcion !=0);
               }
}
