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
public final class Pato extends AveDomestica implements Acciones  {
    private String nadar;
    private String estanquedeagua;
public Pato(){
    
}

    public Pato(String nadar, String estanquedeagua) {
        this.nadar = nadar;
        this.estanquedeagua = estanquedeagua;
    }

    public Pato(String nadar, String estanquedeagua, String cautiverio, String dueño, String veterinario, String medicamento, int codigo, String peso, String nombre, String colores, String genero) {
        super(cautiverio, dueño, veterinario, medicamento, codigo, peso, nombre, colores, genero);
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
        return super.toString()+"Pato{" + "nadar=" + nadar + ", estanquedeagua=" + estanquedeagua + '}';
    }

    @Override
    public void comer() {
        System.out.println("El pato come cuando "+ super.getDueño()+"leda su alimento");
    }

    @Override
    public void dormir() {
        System.out.println("PatitoFeon  duerme cuando "+super.getVeterinario()+" su veterinario le da su medicamento");
    }
    @Override
    public void moverse() {
        System.out.println("Se siente incomodo cuando las "+super.getMedicamento()+" se hayan vacunado");
    }

    @Override
    public void volar() {
        System.out.println("EL pato vuela cuando "+ super.getVeterinario()+" se acerca");
    }

    @Override
    public void reproducirse() {
        System.out.println("Estas aves se  reproducen  en "+ super.getCautiverio());
    }

  
    
    
}
