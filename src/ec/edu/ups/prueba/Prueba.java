/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.prueba;
import ec.edu.ups.clases.Ave;
import ec.edu.ups.clases.AveDomes2loro;
import ec.edu.ups.clases.Avesilvestre;
import ec.edu.ups.clases.AveSil1lechuza;
import ec.edu.ups.clases.AveSil2buitre;
import ec.edu.ups.clases.Avedomestica;
import ec.edu.ups.interfaces.AveDomes1pato;
        
/**
 *
 * @author ASUS
 */
public class Prueba {
    
    
    public static void main(String[] args) {
        
        
       Ave ave1=new Ave(3+"kg", "loro", "amarillo, rojo", "masculino", "5") ;
       
       Ave ave2=new Ave(2+"kg", "pato", "amarillo", "masculino", "8");
       Ave ave3=new Ave(8+"kg", "buitre", "negro,blanco", "masculino", "2");
       Ave ave4=new Ave(4+"kg", "luchuza", "cafe obscuro", "femenina", "3");
     ave3.setGenero("masculino");
     ave1.setColores("amarillo azul rojo");
       ave4.equals(m2);
     ave3.getGenero();
   
      Avesilvestre sil1=new Avesilvestre("cuevas de los andes ", "cuidad a animales para casar");
      Avesilvestre sil2=new Avesilvestre("cordilleras los andes", "cidan su comida para casar");
      
     Avedomestica dome1=new  Avedomestica("criadero de pericos loros etc", "Xavier", "agrovet", "vitaminas");
     Avedomestica dome2=new Avedomestica("criadero de patos", "pepito", "veterinario one", "desparasitantes");
     
     AveDomes2loro n1= new AveDomes2loro(dome1);
     AveDomes1pato n2= new AveDomes1pato(dome2);
      dome1.getSeguridad();
     dome2.comersemillas();
             
     AveSil1lechuza m1=new AveSil1lechuza("nocturna", "cuevas de cubrirse", "su forma de cabes es unica", "cuevas de la montañas", "se dedica a casar para alimentarse");
     AveSil2buitre m2=new AveSil2buitre("carnivoro", "simbolo del escudo nacional", "escondite y cuevas", " son casadores");
          sil2.getAves();
     sil1.getCuevas();
     ave4.equals(m2);
     ave3.getGenero();
   
    
    
    
    }
    
}
