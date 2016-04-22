/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyect.basic.register.hotel;


import java.util.Scanner;

/**
 *
 * @author pcccasd
 */
public class ProyectBasicRegisterHotel {

    /**
     *- El sistema se debe preocupar de gestionar las habitaciones de un hotel.

- El hotel lo simularemos para efectos práctico con 15 habitaciones, 5 
* singles, 5 dobles y 5 familiares (se debe poder definir el precio por noche
* dentro del programa)

- El usuario del software debe poder ver la disponibilidad de las
* habitaciones del hotel.

- Además, debe poder hacer una reserva de una habitación, con lo 
* que la habitación pasa de disponible a reservada.

- Si confirma la reserva, la habitación pasa de reservada a ocupada.

- Cuando el pasajero abandona el hotel, se le debe imprimir un vale 
* que indique el tipo de habitación usada, cantidad e noches y valor a cancelar.

- Sólo el administrador debe tener acceso a una reconfiguración del 
* hotel, dejando todas las habitaciones disponibles.TODO code application 
* 
* logic here @param  the command line arguments
     */
    public static void main(String[] args) {
        //  De lo discutido quedamos en que:
Scanner Entrada = new Scanner(System.in) ;
String []singles = new String [5];
String []dobles = new String [5];
String []familiares = new String [5];
String []usuarios = new String [15];
String []datosusuario = new String [6];
String []precioHabitacion = new String [10];
String opcion; 
int opc ; 
do{       
  Menu();
 opcion = Entrada.nextLine();
 opc = Integer.parseInt(opcion);
   switch(opc){
       case 1 :
           DatosHotel();
           break; 
       case 2 :
           IngresarNombres(Entrada);
           IngresarApellidos(Entrada);
           break; 
       case 3 :
           break; 
       case 4 :
           break; 
       case 5 :
           break; 
       case 6 :
           break;
           
       default:
           System.out.println("Lo ingresado no es valido!!!! ");
   }} while(opc<6||opc>0);
    }
    
    
    public static void  DatosHotel (){
        System.out.println("Hotel Ciudad Del Mar");
        System.out.println("Ubicado en :   Arturo Prat 234 ");
        System.out.println("Ciudad : Temuco  ");
        System.out.println("Horario de atencion: 9:00 a 12:00  y 14:30 a 18;00");
    } 
    public static  void Menu (){
     System.out.println("  Bienvenidos a ");
System.out.println("BasicRegisterHotel");
 System.out.println("");
System.out.println("Elija opcion");
System.out.println("");
System.out.println(" 1....Ver Ubicacion del Hotel");
System.out.println("");
System.out.println("2.....Ingresar Mis Datos");
System.out.println("");
System.out.println("3......Ver Habitaciones Disponibles");
System.out.println("");
System.out.println("4.....Reservar Habitacion");
System.out.println("");
System.out.println("5.....Terminar  hotel");
 System.err.println("");
System.out.println("6.....Salir ");
    
    }

    public static  void  HabitacionesDisponibles (
            
    ){
    } 
    
  public static void IngresarNombres(Scanner Entrada){
      System.out.println("Ingrese Primer Nombre");
      String Nombre1 = Entrada.nextLine() ; 
      System.out.println("Ingrese Segundo Nombre");
        String Nombre2 = Entrada.nextLine() ; 
       }
  public static  void IngresarApellidos(Scanner Entrada){
      System.out.println("Ingrese Primer Apellido");
      String Apelldo1 = Entrada.nextLine() ; 
      System.out.println("Ingrese Segundo Apellido");
        String Apellido = Entrada.nextLine() ; 
       }
    public static String [] datosusuario (  String []datosusuario,
        String nombre1,String nombre2,String apellido1,String Apellido2,
        String numeroHabitacion,String Estadia,String Precio ){
    
        
    return  ;    }    
    public void  Ingresarapellidos (){} 
    
  
    public static void ReservarHabitaciones (){} 
    public static void DiaIngreso (){} 
    public static void DiaSalida (){} 
    public static void ConfirmarHabitacion (){} 
}
