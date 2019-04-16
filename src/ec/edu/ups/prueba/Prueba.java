/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.prueba;
import ec.edu.ups.clases.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author ASUS
 */
public class Prueba {
    
    
    public static void main(String[] args) {
        List<Ave> lista=new ArrayList<>();
        
     
        Loro loro = new Loro("Lora habla", "alagos a loro", "aseo", "canta",
                "hohgar", "Pepito", "Juanito", "vitaminas", 23, "2kg","cotorra", "verde roja", "embra");
        System.out.println("informacion de loro :"+ loro);
        
        loro.comer();
        loro.dormir();
        loro.moverse();
        loro.reproducirse();
        System.out.println("");
        
        Pato pato= new Pato("ActividAD DEL PATO NADAR", "charcos de agua",
                "criadero de patos", "Pepito", "Juanito", "vitaminas ,hierro", 4,
                "3Kg","Patitofeo", "amarillo banco", "macho");
        System.out.println("Informacion del PATO: "+ pato);
        pato.comer();
        pato.dormir();
        pato.reproducirse();
        pato.moverse();
         
        System.out.println("");
        
        

       Lechuza lechuza=new Lechuza("Este animal es nocturno", "cordilleras", 
               "su cara unicca Acorazonada", "cueva  de selva", "casa ratones"
               ,1, "1kg", "lechusita", "cafe obscuro", "embra");
        System.out.println(" Informacion de la Lechuza :" +lechuza);
        lechuza.comer();
        lechuza.dormir();
        lechuza.moverse();
        lechuza.reproducirse();
        System.out.println("");
        
        Buitre buitre=new Buitre("es un animal sumamente carnivoro", "esta representado en el escudo naional del Ecuador "
                , "sus cuevas son en la cordillera de los andes", "casa animales de toda clase"
                , 4, "3kg", "Condor", "blanco y negro", "masculino");
        System.out.println("Informacion del buitre :" +buitre);
        buitre.comer();
        buitre.dormir();
        buitre.moverse();
        buitre.reproducirse();
       
        
        System.out.println("");
    }  
}
