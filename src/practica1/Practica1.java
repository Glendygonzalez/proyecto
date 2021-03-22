
package practica1;
import java.util.Scanner;
import static practica1.Dispositivos.correo_electronico;
import static practica1.Dispositivos.estado;
import static practica1.Dispositivos.nombre;
/* @author glend*/
public class Practica1 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        int opcion_menu, respuesta;
        /* MENU   PRINCIPAL   */
        do{
        System.out.println("-------------------- ECOSISTEMAS DE DISPOSITIVOS ----------------");
        System.out.println("1. CREAR DISPOSITIVO");
        System.out.println("2. ADMINISTRAR DISPOSITIVO");
        System.out.println("3. ACCIONES CON DISPOSITIVO");
        System.out.println("4. ACCIONES EXTERNAS CON DISPOSITIVOS");
        System.out.println("5. CARGAS MASIVAS");
        System.out.println("6. LOGS");
        System.out.println(" Seleccione la opcion que desea ejecutar");
        opcion_menu = leer.nextInt();
        switch (opcion_menu){
            case 1: 
                System.out.println("------------- CREAR DISPOSITIVO -------------------");
                 MenuDispositivo ();
                break;
            case 2: 
                System.out.println("---------------  ADMINISTRAR DISPOSITIVOS -----------");
                AdministrarDispositivos ();
                break;
            case 3: 
                System.out.println("---------------- ACCIONES CON DISPOSITIVOS ---------");
                AccionesDispositivos();
                break;
            case 4: 
                System.out.println("------ ACCIONES EXTERNAS CON DISPOSITIVOS ----------");
                AccionesExternas();
                break;
            case 5: 
                System.out.println("----------- CARGAS MASIVAS ----------------");
                
                break;
            case 6: 
                System.out.println("------------------- LOGS -------------");
                
                break;
        }
            System.out.println("Desea regresar al Menu Inicio"+ " 1. Si"+ " 2. Terminar ");
            respuesta = leer.nextInt();
        }while (respuesta == 1);  
        
    }
    /*********************************************MENU DE DISPOSITIVO********************************************/
    public static void  MenuDispositivo (){
        Scanner leer = new Scanner (System.in);
        int opc, respuesta;
        do{
        System.out.println("---------------- NUEVO DISPOSITIVO ---------------");
        System.out.println("1. Computadora Portatil");
        System.out.println("2. Tablet");
        System.out.println("3. SmartWatch");
        System.out.println("4. SmartPhone");
        System.out.println("5. Auriculares inalambricos");
        opc = leer.nextInt();
        
        switch (opc){
            case 1:
                System.out.println("----- COMPUTADORA PORTATIL----");
                Computadora ();
                break;
            case 2: 
                System.out.println("-----TABLET----------");
                Tablet ();
                break;
            case 3: 
                System.out.println("--------SMARTWATCH-------");
                SmartWatch ();
                break;
            case 4:
                System.out.println("----------SMARTPHONE------");
                SmartPhone();
                break;
            case 5:
                System.out.println("-------AURICULARES INALAMBRICOS---------");
                
                break;
        }
            System.out.println("Si desea regresar al menu Nuevo Dispositivo" + " 1. Si "+ " 2. No");
            respuesta = leer.nextInt();
        }while (respuesta ==1);
}
    /*----------------------------------MENU ADMINISTRAR DISPOSITIVOS-------------------*/
    public static void AdministrarDispositivos (){
        Scanner leer = new Scanner (System.in);
        int op,resp;
        do{
        System.out.println("1. Computadora Portatil.");
        System.out.println("2. Tablet.");
        System.out.println("3. Smartwatch.");
        System.out.println("4. Smartphone.");
        System.out.println("5. Auriculares Inalambricos.");
        op = leer.nextInt();
        switch (op){
            case 1: 
                System.out.println("-------- COMPUTADORA PORTATIL -------");
                
                break;
            case 2: 
                System.out.println("--------- TABLET ------------");
                
                break;
            case 3: 
                System.out.println("---------- SMARTWATCH ------------");
                
                break;
            case 4: 
                System.out.println("------------ SMARTPHONE -----------");
                
                break;
            case 5: 
                System.out.println("-------------- AURICULARES INALAMBRICOS----------");
                Auriculares ();
                break;
        }
        System.out.println("Desea regresar al menu Administrar Dispositivo"+ " 1.Si"+ " 2.No");
        resp = leer.nextInt();
        }while (resp==1);
    }
    /* ********************************* ACCIONES CON DISPOSITIVOS *****************************************************/
    public static void AccionesDispositivos() {
        Scanner lec = new Scanner (System.in);
        int opcion, respuesta;
        do{
        System.out.println("Seleccione el tipo de dispositivo:");
        System.out.println("Computadora Portatil.");
        System.out.println("Tablet.");
        System.out.println("SmartWatch.");
        System.out.println("Smartphone.");
        System.out.println("Ariculares Inalambricos.");
        opcion = lec.nextInt();
        switch(opcion){
            case 1: 
                System.out.println("--------- COMPUTADORA PORTATIL --------------");
               
                break;
            case 2: 
                System.out.println("------------- TABLET -----------------------");
               
                break;
            case 3: 
                System.out.println("-------------- SMARTWATCH ---------------------");
                
                break;
            case 4: 
                System.out.println("------------ SMARTPHONE ---------------------");
                
                break;
            case 5:
                System.out.println("----------- ARICULARES INALAMBRICOS -----------");
                
                break;
        }
        System.out.println("Si desea volver al menu Acciones con el Dispositivo"+" 1.si "+" 2.No");
        respuesta=lec.nextInt();
        }while(respuesta == 1);
    }
    /**********************************************ACCIONES EXTERNAS CON DISPOSITIVOS **********************************/
    public static void AccionesExternas(){
        Scanner entrada = new Scanner(System.in);
        int op, res ;
        do{
        System.out.println("Seleccione la Accion que desea Realizar:");
        System.out.println("1. Llamada telefonica.");
        System.out.println("2. Mensaje.");
        System.out.println("3. Notificacion.");
        op = entrada.nextInt();
        switch(op){
            case 1: 
                System.out.println("---------- LLAMADA TELEFONICA -----------------");
                
                break;
            case 2: 
                System.out.println("-------- MENSAJE ---------------------");
                
                break;
            case 3: 
                System.out.println("--------------- NOTIFICACION ---------- ");
                
                break;
        }
        System.out.println("Desea regresar al menu Acciones Externas 1.Si 2.No");
        res = entrada.nextInt();
    }while(res==1);
 
    } 
    /*----------------------------------- DISPOSITIVOS-----------------------------------------------------------------*/
 public static void Computadora() {
     Scanner datos = new Scanner (System.in);
     String correo, nombre, estado;
     
     System.out.println("Correo Electronico:");
     correo = datos.nextLine();
     System.out.println("Nombre del Dispositivo:");
     nombre = datos.nextLine();
     System.out.println("Desea que el estado sea Visible");
     estado = datos.nextLine();
     if (estado.equals("Si")){
         estado = "Visible";
     } else
         estado = "No Visible";
     System.out.println("NOTA:  Este Dispositivo esta encendido por defecto.");
     Dispositivos d [] = new Dispositivos [1];
     d[0]= new Dispositivos (correo, nombre, estado);

       System.out.println("********** COMPUTADORA CREADA **********"); 
       for(Dispositivos dis: d){
           System.out.println("Telefono"+'\n'+dis.toString());
           System.out.println(" ");
       }}
 public static void Tablet (){
     Scanner datos = new Scanner (System.in);
     String correo, nombre, estado;
     
     System.out.println("Correo Electronico:");
     correo = datos.nextLine();
     System.out.println("Nombre del Dispositivo:");
     nombre = datos.nextLine();
     System.out.println("Desea que el estado sea visible");
     estado = datos.nextLine();
      if (estado.equals("Si")){
         estado = "Visible";
     } else
         estado = "No Visible";
     System.out.println("NOTA: El dispositivo estara encendido por defecto.");
     Dispositivos d [] = new Dispositivos [1];
     d[0]= new Dispositivos (correo, nombre, estado);
       System.out.println("********** Tablet Creada**********"); 
       for(Dispositivos dis: d){
           System.out.println("Tablet:"+'\n'+dis.toString());
           System.out.println("");
 }}
       
 public static void SmartWatch (){
     Scanner dat = new Scanner (System.in);
     String correo, nombre, estado;
     
     System.out.println("Correo Electronico:");
     correo = dat.nextLine();
     System.out.println("Nombre del Dispositivo:");
     nombre = dat.nextLine();
     System.out.println("Desea que el estado sea Visible");
     estado = dat.nextLine();
     if (estado.equals("Si")){
         estado = "Visible";
     } else
         estado = "No Visible";
     System.out.println("NOTA: El dispositivo se encuentra encendido por defecto.");
      Dispositivos d [] = new Dispositivos [1];
     d[0]= new Dispositivos (correo, nombre, estado);
       System.out.println("********** Smartwatch Creado **********");
       for(Dispositivos dis: d){
           System.out.println("SmartWatch:"+'\n'+dis.toString());
           System.out.println("");
       }}
 public static void SmartPhone (){
     Scanner dato = new Scanner (System.in);
     String correo, nombre, estado, numero;
     
     System.out.println("Correo Electronico:");
     correo = dato.nextLine();
     System.out.println("Nombre del Dispositivo:");
     nombre = dato.nextLine();
     System.out.println("Ingrese el numero de telefono");
     numero = dato.nextLine();
     System.out.println("Desea que el estado sea Visible");
     estado = dato.nextLine();
     if (estado.equals("Si")){
         estado = "Visible";
     } else
         estado = "No Visible";
     System.out.println("NOTA: El dispositivo se encuentra encendido por defecto.");
     Telefono t [] = new Telefono [1];
     t[0]= new Telefono (correo, nombre,numero, estado);
       System.out.println("********** SmartPhone Creado **********");
       for(Telefono tele: t){
           System.out.println("Telefono:"+'\n'+tele.toString());
           System.out.println("");
 } }
 public static void Auriculares (){
     System.out.println("Los dispositivos Activos son:");
    
       
     
 }
}