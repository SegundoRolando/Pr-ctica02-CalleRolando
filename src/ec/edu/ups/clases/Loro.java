/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

import ec.edu.ups.interfaces.Acciones;

/**
 *
 * @author ASUS
 */
public final class Loro extends AveDomestica implements Acciones {

    private String hablar;
    private String fama;
    private String aseo;
    private String seguridad;
    
public Loro(){
    
}

    public Loro(String hablar, String fama, String aseo, String seguridad) {
        this.hablar = hablar;
        this.fama = fama;
        this.aseo = aseo;
        this.seguridad = seguridad;
      
    }

    public Loro(String hablar, String fama, String aseo, String seguridad, String cautiverio, String dueño, String veterinario, String medicamento, int codigo, String peso, String nombre, String colores, String genero) {
        super(cautiverio, dueño, veterinario, medicamento, codigo, peso, nombre, colores, genero);
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
        return super.toString()+"Loro{" + "hablar=" + hablar + ", fama=" + fama + ", aseo=" + aseo + ", seguridad=" + seguridad + ", Avesil1lechuza=" +'}';
    }

    @Override
    public void comer() {
        System.out.println("El loro "+super.getNombre()+" Esta comiendo semillas");
    }

    @Override
    public void dormir() {
        System.out.println(" Su dueño del loro es "+super.getDueño()+" y lo cuida cuando duerme");
    }
    @Override
    public void moverse() {
        System.out.println("El loro teme a  "+super.getVeterinario()+" cuando llega a casa");
    }
    @Override
    public void volar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void reproducirse() {
        System.out.println("el loro se reproduce cuando sus  " +super.getMedicamento()+" son muy utiles");
    }
    
}
