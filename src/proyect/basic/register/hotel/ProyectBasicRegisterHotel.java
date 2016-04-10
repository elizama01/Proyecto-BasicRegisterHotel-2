/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyect.basic.register.hotel;

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
String []Habitaciones = new String [15];
String []usuarios = new String [15];
String []datosusuarios = new String [15];
        
 System.out.println("  Bienvenidos a ");
System.out.println("BasicRegisterHotel");
        System.out.println("");
System.out.println("Elija opcion");
System.out.println("");
System.out.println("Ver Datos del Hotel");
System.out.println("");
System.out.println("Ingresar Mis Datos");
System.out.println("");
System.out.println("Ver Habitaciones Disponibles");
System.out.println("");
System.out.println("Reservar Habitacion");
System.out.println("");
System.out.println("abandonar hotel");

    }
    
    
    public void  DatosHtel (){
    } 
    public void  HabitacionesDisponibles (){
    } 
    
    public void  Ingresarnombres (){}    
    public void  Ingresarapellidos (){} 
    public static void datosusuario(){}  
    public static void ReservarHabitaciones (){} 
    public static void DiaIngreso (){} 
    public static void DiaSalida (){} 
    public static void ConfirmarHabitacion (){} 
}
