# Pr-ctica02-CalleRolando
Práctica  N.-02  de la Materia Programación  Aplicada
 

CARRERA: Computación
NRO. PRÁCTICA:	01	TÍTULO PRÁCTICA:  Programación Orientada a Objetos

OBJETIVO ALCANZADO:
Esta práctica nos permite desarrollar el conocimiento básico hacia la programación.
Se utilizó la página (lucitchart) la cual nos permite diseñar clases Uml Siendo esta la que nos facilita y nos orienta en la programación. 
Esta práctica nos permitirá  conocer herramientas que nos facilitaran  compartir información sobre la programación.
ACTIVIDADES DESARROLLADAS
1.	Crear un repositorio en GitHub con el nombre “Práctica 02 – POO con Java” 
 




2.	Sincronizar el repositorio creado con un proyecto en NetBeans. Realizar un commit y push por cada requerimiento de los puntos a continuación descritos (incluir un mensaje que identifique claramente los commits realizados a GitHub).
 
3. Crear un paquete para las clases, otro para las interfaces, otro para las pruebas.
 
4. Crear una jerarquía de clases de tres niveles, es decir, una clase “abuelo”, dos clases “padres” y cuatro clases “hijas” (dos de cada padre).










 
5. Todas las clases deben tener por lo menos cuatros atributos (aparte de los de herencia), tres métodos (aparte de los getters y setters) y método toString().
public class Avedomestica {
    private String cautiverio;
    private String dueño;
    private String veterinario;
    private String medicamento;

    public Avedomestica(String cautiverio, String dueño, String veterinario, String medicamento) {
        this.cautiverio = cautiverio;
        this.dueño = dueño;
        this.veterinario = veterinario;
        this.medicamento = medicamento;
    }

    public String getCautiverio() {
        return cautiverio;
    }
    public void setCautiverio(String cautiverio) {
        this.cautiverio = cautiverio;
    }
    public String getDueño() {
        return dueño;
    }
    public void setDueño(String dueño) {
        this.dueño = dueño;
    }
    public String getVeterinario() {
        return veterinario;
    }
    public void setVeterinario(String veterinario) {
        this.veterinario = veterinario;
    }
    public String getMedicamento() {
        return medicamento;
    }
    public void setMedicamento(String medicamento) {
        this.medicamento = medicamento;
    }

    @Override
    public String toString() {
        return "Avedomestica{" + "cautiverio=" + cautiverio + ", due\u00f1o=" + dueño + ", veterinario=" + veterinario + ", medicamento=" + medicamento + '}';
    }
    

public class AveDomes2loro {
    private String hablar;
    private String fama;
    private String aseo;
    private String seguridad;
    public AveDomes2loro(String hablar, String fama, String aseo, String seguridad) {
        this.hablar = hablar;
        this.fama = fama;
        this.aseo = aseo;
        this.seguridad = seguridad;
    }
    public String getHablar() {
        return hablar;
    }
    public void setHablar(String hablar) {
        this.hablar = hablar;
    }
    public String getFama() {
        return fama;
    }
    public void setFama(String fama) {
        this.fama = fama;
    }
    public String getAseo() {
        return aseo;
    }

    public void setAseo(String aseo) {
        this.aseo = aseo;
    }
    public String getSeguridad() {
        return seguridad;
    }
    public void setSeguridad(String seguridad) {
        this.seguridad = seguridad;
    }
    @Override
    public String toString() {
        return "AveDomes2loro{" + "hablar=" + hablar + ", fama=" + fama + ", aseo=" + aseo + ", seguridad=" + seguridad + '}';
    }

public class AveSil1lechuza {
    private String nopturna;
    private String augero;
    private String caracorazonad;

    public AveSil1lechuza(String nopturna, String augero, String caracorazonad) {
        this.nopturna = nopturna;
        this.augero = augero;
        this.caracorazonad = caracorazonad;
    }
    public String getNopturna() {
        return nopturna;
    }

    public void setNopturna(String nopturna) {
        this.nopturna = nopturna;
    }
    public String getAugero() {
        return augero;
    }
    public void setAugero(String augero) {
        this.augero = augero;
    }
    public String getCaracorazonad() {
        return caracorazonad;
    }
    public void setCaracorazonad(String caracorazonad) {
        this.caracorazonad = caracorazonad;
    }
    @Override
    public String toString() {
        return "AveSil1lechuza{" + "nopturna=" + nopturna + ", augero=" + augero + ", caracorazonad=" + caracorazonad + '}';
    }
   
public class AveSil2buitre {
  private  String carnivoro;
  private String simbologismo;

    public AveSil2buitre(String carnivoro, String simbologismo) {
        this.carnivoro = carnivoro;
        this.simbologismo = simbologismo;
    }

    public String getCarnivoro() {
        return carnivoro;
    }
    public void setCarnivoro(String carnivoro) {
        this.carnivoro = carnivoro;
    }
    public String getSimbologismo() {
        return simbologismo;
    }
    public void setSimbologismo(String simbologismo) {
        this.simbologismo = simbologismo;
    }
    @Override
    public String toString() {
        return "AveSil2buitre{" + "carnivoro=" + carnivoro + ", simbologismo=" + simbologismo + '}';
    }
  
public class Avedomestica {
    private String cautiverio;
    private String dueño;
    private String veterinario;
    private String medicamento;

    public Avedomestica(String cautiverio, String dueño, String veterinario, String medicamento) {
        this.cautiverio = cautiverio;
        this.dueño = dueño;
        this.veterinario = veterinario;
        this.medicamento = medicamento;
    }
    public String getCautiverio() {
        return cautiverio;
    }
    public void setCautiverio(String cautiverio) {
        this.cautiverio = cautiverio;
    }
    public String getDueño() {
        return dueño;
    }
    public void setDueño(String dueño) {
        this.dueño = dueño;
    }
    public String getVeterinario() {
        return veterinario;
    }
    public void setVeterinario(String veterinario) {
        this.veterinario = veterinario;
    }
    public String getMedicamento() {
        return medicamento;
    }
    public void setMedicamento(String medicamento) {
        this.medicamento = medicamento;
    }
    @Override
    public String toString() {
        return "Avedomestica{" + "cautiverio=" + cautiverio + ", due\u00f1o=" + dueño + ", veterinario=" + veterinario + ", medicamento=" + medicamento + '}';
    }
 public class AvesDomes1pato {
    private String nadar;
    private String estanquedeagua;
    public AvesDomes1pato(String nadar, String estanquedeagua) {
        this.nadar = nadar;
        this.estanquedeagua = estanquedeagua;
    }
    public String getNadar() {
        return nadar;
    }
    public void setNadar(String nadar) {
        this.nadar = nadar;
    }
    public String getEstanquedeagua() {
        return estanquedeagua;
    }
    public void setEstanquedeagua(String estanquedeagua) {
        this.estanquedeagua = estanquedeagua;
    }
    @Override
    public String toString() {
        return "AvesDomes1pato{" + "nadar=" + nadar + ", estanquedeagua=" + estanquedeagua + '}';
    }

public class Avesilvestre {
    private String cuevas;
    private String caseria;

    public Avesilvestre(String cuevas, String caseria) {
        this.cuevas = cuevas;
        this.caseria = caseria;
    }

    public String getCuevas() {
        return cuevas;
    }

    public void setCuevas(String cuevas) {
        this.cuevas = cuevas;
    }

    public String getCaseria() {
        return caseria;
    }

    public void setCaseria(String caseria) {
        this.caseria = caseria;
    }

    @Override
    public String toString() {
        return "Avesilvestre{" + "cuevas=" + cuevas + ", caseria=" + caseria + '}';
    }
    
}


6. Cada clase padre debe tener por lo menos un método abstracto cada una. 7
   


7. Los métodos abstractos deben ser sobre-escritos (implementados) en cada clase h 
 

8. Todas las clases hijas deben ser clases finales
 



9. Crear una interface, con al menos dos métodos abstractos. Estos métodos deben ser implementados en cada clase hija.











 
 
 
 
10. Crear una clase “Prueba”, en donde se demostrará el funcionamiento del proyecto. Además, se pide demostrar el uso de downcasting con el operador instanceof. También, se pide demostrar el uso de clases anónimas
 

11. Desarrollar el diagrama de clases correspondiente usando la herramienta LucidChart. 
 
13. Crear el archivo README del repositorio, en este archivo, debe constar la misma información del informe de resultados de la práctica que se indica en el punto anterior (incluidas las imágenes del informe).
Para revisar README revisar
 https://github.com/SegundoRolando/Pr-ctica02-CalleRolando/new/master?readme=1       
https://github.com/SegundoRolando/Pr-ctica02-CalleRolando.git 

RESULTADO(S) OBTENIDO(S):
Los resultados que hemos obtenido son los siguiente: hemos cargado toda la información en github  con la siguiente dirección  donde está más detallado y cargado  tanto como en NetBeans, https://github.com/SegundoRolando/Pr-ctica02-CalleRolando.git  de acuerdo a lo desarrollado se pudo realizar  lo que se pudo y también dando seguimiento a la guía práctica, logramos  realizar esta práctica.
