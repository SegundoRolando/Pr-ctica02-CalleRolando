/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.menu;
import ec.edu.ups.Controlador.ControladorPato;
import ec.edu.ups.clases.Loro;
import ec.edu.ups.clases.Pato;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class principal {
   
    public static void main(String[] args) {
Scanner l = new Scanner(System.in);
ControladorLoro controlador = new ControladorLoro();
 
    String z;
    do{
    int r, r2, r3, r4, r5, r6;
     System.out.println("Digite la opcion que desea realizar?");
        System.out.println("1. CRUD Loro");
        System.out.println("2. CRUD Pato");
        System.out.println("3. CRUD Buitre");
        System.out.println("4. CRUD Lechuza");
        System.out.println("5. Salir");

        System.out.println("Digite su opción?");
        r=l.nextInt();
        switch (r){
        case 1:
     
            do{
               
                        System.out.println("Loro");
                        System.out.println("1. Create");
                        System.out.println("2. Read");
                        System.out.println("3. Update");
                        System.out.println("4. Delete");
                        System.out.println("5. Regresar al menu principal");
                        System.out.println("Selecciona una opción");
                        r2 =l.nextInt();
                        
                        switch(r2){
                            case 1:
                               Loro loro=new Loro();
                               String nombre=l.next();
                               loro.setNombre(nombre);
                               int codigo=l.nextInt();
                               loro.setCodigo(codigo);
                               String color=l.next();
                               loro.setColores(color);
                               String genero=l.next();
                               loro.setGenero(genero);
                               String peso=l.next();
                               loro.setPeso(peso);
                                //ceate
                                //pide todos los datos por teclado
                                //instancia un objeto
                                //llama al metodo create del controlador
                                break;
                            case 2:
                                nombre=l.next();
                                System.out.println(" "+);
                                //read
                                //pide el codigo por teclado
                                //llama al metodo read del controlador
                                //visualizo los datos del objeto
                                break;
                            case 3:
                                //update
                                //pide todos los datos por teclado
                                //instancia un objeto
                                //llama al metodo update del controlador
                                break;
                            case 4:
                                //delete
                                //pide el codigo por teclado
                                //llama al metodo delete del controlador
                                break;
                            case 5:
                                //regresar
                                System.out.println("Regresando al menú principal");
                                break;
                        }
                        
                    }while(r2 !=5);
                    break;
            
        case 2:
             do{
                        System.out.println("MENU AIRE ACONDICIONADO");
                        System.out.println("1. Create");
                        System.out.println("2. Read");
                        System.out.println("3. Update");
                        System.out.println("4. Delete");
                        System.out.println("5. Regresar al menu principal");
                        System.out.println("Selecciona una opción");
                        r3 =l.nextInt();
                        
                        switch(r3){
                            case 1:
                                
                                //create
                                //pide todos los datos por teclado
                                //instancia un objeto
                                //llama al metodo create del controlador
                                break;
                            case 2:
                                //read
                                //pide el codigo por teclado
                                //llama al metodo read del controlador
                                //visualizo los datos del objeto
                                break;
                            case 3:
                                //update
                                //pide todos los datos por teclado
                                //instancia un objeto
                                //llama al metodo update del controlador
                                break;
                            case 4:
                                //delete
                                //pide el codigo por teclado
                                //llama al metodo delete del controlador
                                break;
                            case 5:
                                //regresar
                                System.out.println("Regresando al menú principal");
                                break;
                        }
                        
                    }while(r3 !=5);
                    break;
           
        case 3:
             do{
                        System.out.println("MENU AIRE ACONDICIONADO");
                        System.out.println("1. Create");
                        System.out.println("2. Read");
                        System.out.println("3. Update");
                        System.out.println("4. Delete");
                        System.out.println("5. Regresar al menu principal");
                        System.out.println("Selecciona una opción");
                        r4 =l.nextInt();
                        
                        switch(r4){
                            case 1:
                                
                                //create
                                //pide todos los datos por teclado
                                //instancia un objeto
                                //llama al metodo create del controlador
                                break;
                            case 2:
                                //read
                                //pide el codigo por teclado
                                //llama al metodo read del controlador
                                //visualizo los datos del objeto
                                break;
                            case 3:
                                //update
                                //pide todos los datos por teclado
                                //instancia un objeto
                                //llama al metodo update del controlador
                                break;
                            case 4:
                                //delete
                                //pide el codigo por teclado
                                //llama al metodo delete del controlador
                                break;
                            case 5:
                                //regresar
                                System.out.println("Regresando al menú principal");
                                break;
                        }
                        
                    }while(r4 !=5);
                    break;
        case 4:
             do{
                        System.out.println("MENU AIRE ACONDICIONADO");
                        System.out.println("1. Create");
                        System.out.println("2. Read");
                        System.out.println("3. Update");
                        System.out.println("4. Delete");
                        System.out.println("5. Regresar al menu principal");
                        System.out.println("Selecciona una opción");
                        r5 =l.nextInt();
                        
                        switch(r5){
                            case 1:
                                
                                //create
                                //pide todos los datos por teclado
                                //instancia un objeto
                                //llama al metodo create del controlador
                                break;
                            case 2:
                                //read
                                //pide el codigo por teclado
                                //llama al metodo read del controlador
                                //visualizo los datos del objeto
                                break;
                            case 3:
                                //update
                                //pide todos los datos por teclado
                                //instancia un objeto
                                //llama al metodo update del controlador
                                break;
                            case 4:
                                //delete
                                //pide el codigo por teclado
                                //llama al metodo delete del controlador
                                break;
                            case 5:
                                //regresar
                                System.out.println("Regresando al menú principal");
                                break;
                        }
                        
                    }while(r5 !=5);
                    break;
        case 5:
            
             do{
                        System.out.println("MENU AIRE ACONDICIONADO");
                        System.out.println("1. Create");
                        System.out.println("2. Read");
                        System.out.println("3. Update");
                        System.out.println("4. Delete");
                        System.out.println("5. Regresar al menu principal");
                        System.out.println("Selecciona una opción");
                        r6 =l.nextInt();
                        
                        switch(r6){
                            case 1:
                                
                                //create
                                //pide todos los datos por teclado
                                //instancia un objeto
                                //llama al metodo create del controlador
                                break;
                            case 2:
                                //read
                                //pide el codigo por teclado
                                //llama al metodo read del controlador
                                //visualizo los datos del objeto
                                break;
                            case 3:
                                //update
                                //pide todos los datos por teclado
                                //instancia un objeto
                                //llama al metodo update del controlador
                                break;
                            case 4:
                                //delete
                                //pide el codigo por teclado
                                //llama al metodo delete del controlador
                                break;
                            case 5:
                                //regresar
                                System.out.println("Regresando al menú principal");
                                break;
                        }
                        
                    }while(r6 !=5);
                    break;
		    default: System.out.println("Error a exedido el # rango de 1 a 5");
                        }
           System.out.println("Desea continuar (si) o (no)");
           z=l.next();
	}while(z.equals("si"));
    }
    
    
    
}
