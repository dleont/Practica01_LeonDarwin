
package ec.edu.ups.main;

import ec.edu.ups.clases.*;
import java.util.Scanner;

/**
 * Esta es la clase principal donde se ejecuta el programa
 * @author Darwin Leon
 */
public class Main {
    public static void main (String[] args){
       
       System.out.println("►►►►►► Bienvenidos ◄◄◄◄◄◄◄");
       int op;
       int opcion =1;
        
	while (opcion==1) {
            //Opciones que tiene el menu.
            System.out.println("      Ingresar datos de:");
            System.out.println("1.  Local ");
            System.out.println("2.  Propietario");
            System.out.println("3.  Servicio ");
            System.out.println("4.  Reservación");
            System.out.println("5.  Cliente");
            System.out.println("6.  SALIR");
			
            Scanner leer = new Scanner(System.in);
            
            op=leer.nextInt();
            
            switch (op) {
                case 1:
                    //Crear objeto o instanciar clase
                    Local local = new Local();
                    System.out.println("►►LOCAL◄◄");
                    
                    //Se ingresan valores desde el teclado.
                    System.out.println("Ingrese el nombre del local");
                    local.setNombreL(leer.nextLine());
                    local.setNombreL(leer.nextLine());
                    
                    System.out.println("Ubicación del local "+local.getNombreL());
                    local.setDireccionL(leer.nextLine());
                    
                    System.out.println("Ingrese el telefono");
                    local.setTelefonoL(leer.nextLine());
                    
                    System.out.println("Ingrese el sitio web");
                    local.setUrl(leer.nextLine());
                    
                    //Se muestran en pantalla los valores ingresados.
                    System.out.println(" ");
                    System.out.println("↓↓↓↓↓↓↓↓");
                    System.out.println(" ");
                    System.out.println("Nombre del local: "+local.getNombreL());
                    System.out.println("Dirección: "+local.getDireccionL());
                    System.out.println("Contacto: "+local.getTelefonoL());
                    System.out.println("Sitio web: "+local.getUrl());
                    
                    //metodo toStting
                    System.out.println("to String: ");
                    System.out.println(local.toString()); 
                    break;
                    
                case 2:
                    //Crear objeto o instanciar clase
                    Propietario dueño = new Propietario();
                    System.out.println("►►PROPIETARIO◄◄");
                    
                    //Se ingresan valores desde el teclado.
                    System.out.println("Ingrese el nombre");
                    dueño.setNombre(leer.nextLine());
                    dueño.setNombre(leer.nextLine());
                    
                    System.out.println("Ingrese el apellido");
                    dueño.setApellido(leer.nextLine());
                    
                    System.out.println("Ingrese el ruc");
                    dueño.setRuc(leer.nextLine());
                    
                    System.out.println("Ingrese el nombre del local");
                    dueño.setNombreL(leer.nextLine());
                    
                    //Se muestran en pantalla los valores ingresados.
                    System.out.println(" ");
                    System.out.println("↓↓↓↓↓↓↓↓");
                    System.out.println(" ");
                    System.out.println("Nombre: "+dueño.getNombre());
                    System.out.println("Apellido: "+dueño.getApellido());
                    System.out.println("Ruc: "+dueño.getRuc());
                    System.out.println("Nombre del Local: "+dueño.getNombreL());
                    
                    //metodo toString
                    System.out.println("to String: ");
                    System.out.println(dueño.toString()); 
                    break;
                    
                case 3:
                    //Crear objeto o instanciar clase
                    Servicio servir = new Servicio();
                    System.out.println("►►SERVICIO◄◄");
                    
                    //Se ingresan valores desde el teclado.
                    System.out.println("Ingrese el nombre del servicio a recibir");
                    servir.setNombreSer(leer.nextLine());
                    servir.setNombreSer(leer.nextLine());
                    
                    System.out.println("Ingrese el tipo de servicio (publico/privado) ");
                    servir.setTipoSer(leer.nextLine());
                    
                    System.out.println("Ingrese la cantidad de personas a asistir");
                    servir.setPersona(leer.nextInt());
                    
                    System.out.println("Ingrese el valor a pagar");
                    servir.setValorSer(leer.nextInt());
                    
                    //Se muestran en pantalla los valores ingresados.
                    System.out.println(" ");
                    System.out.println("↓↓↓↓↓↓↓↓");
                    System.out.println(" ");
                    System.out.println("Nombre del servicio: "+servir.getNombreSer());
                    System.out.println("Tipo de servicio: "+servir.getTipoSer());
                    System.out.println("Cantidad de personas: "+servir.getPersona());
                    System.out.println("Valor a pagar: "+servir.getValorSer());
                    
                    //toString
                    System.out.println("to String: ");
                    System.out.println(servir.toString());
                    break;
                    
                case 4:
                    //SCrear objeto o instanciar una clase
                    Reservacion reservacion = new Reservacion();
                    System.out.println("►►RESERVACIÓN◄◄");
                    
                    //Se ingresan valores desde el teclado.
                    System.out.println("Ingrese el codigo");
                    reservacion.setCodigo(leer.nextInt());
                    
                    System.out.println("Ingrese la fecha a reservar");
                    reservacion.setFechaEncuentro(leer.nextLine());
                    reservacion.setFechaEncuentro(leer.nextLine());
                    
                    System.out.println("Ingrese la hora");
                    reservacion.setHoraEncuentro(leer.nextLine());
                    
                    System.out.println("Ingrese cantidad de asientos");
                    reservacion.setCantAsientos(leer.nextInt());
                    
                    System.out.println("Ingrese el nombre del reservista");
                    reservacion.setNombreReservista(leer.nextLine());
                    reservacion.setNombreReservista(leer.nextLine());
                    
                    //Se muestra en consola los valores ya ingresados
                    System.out.println(" ");
                    System.out.println("↓↓↓↓↓↓↓↓");
                    System.out.println(" ");
                    System.out.println("Codigo: "+reservacion.getCodigo());
                    System.out.println("Fecha de encuentro: "+reservacion.getFechaEncuentro());
                    System.out.println("Hora de encuentro :"+reservacion.getHoraEncuentro());
                    System.out.println("Asientos reservados: "+reservacion.getCantAsientos());
                    System.out.println("Reservado a nombre de: "+reservacion.getNombreReservista());
                    
                    //toString
                    System.out.println("to String: ");
                    System.out.println(reservacion.toString());
                    break;
                    
                case 5:
                    //Crear objeto o instanciar una clase
                    Cliente cliente = new Cliente();
                    System.out.println("►►CLIENTE◄◄");
                    
                    //Se ingresan valores desde el teclado.
                    System.out.println("Ingrese el nombre");
                    cliente.setNombre(leer.nextLine());
                    cliente.setNombre(leer.nextLine());
                    
                    System.out.println("Ingrese el apellido");
                    cliente.setApellido(leer.nextLine());
                    
                    System.out.println("Ingrese el ruc");
                    cliente.setRuc(leer.nextLine());
                    
                    System.out.println("Ingrese la dirección");
                    cliente.setDireccion(leer.nextLine());
                    
                    
                    //Se muestra en consola los valores ya ingresados
                    System.out.println(" ");
                    System.out.println("↓↓↓↓↓↓↓↓");
                    System.out.println(" ");
                    System.out.println("Nombre: "+cliente.getNombre());
                    System.out.println("Apellido: "+cliente.getApellido());
                    System.out.println("Ruc: "+cliente.getRuc());
                    System.out.println("Direccion: "+cliente.getDireccion());
                    
                    //toString
                    System.out.println("to String :");
                    System.out.println(cliente.toString());
                    break;
                     
            }
            System.out.println(" ");
            System.out.println("Desea continuar = 1.SI / 2.NO");
            opcion = leer.nextInt();
        }
    }
}
