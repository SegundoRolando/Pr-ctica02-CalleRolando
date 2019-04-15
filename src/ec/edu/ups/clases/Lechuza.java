/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

import ec.edu.ups.interfaces.Acciones;




public final class Lechuza extends AveSilvestre implements Acciones{
    private String nopturna;
    private String augero;
    private String caracorazonad;
    
    public Lechuza(){
        
    }

    public Lechuza(String nopturna, String augero, String caracorazonad) {
        this.nopturna = nopturna;
        this.augero = augero;
        this.caracorazonad = caracorazonad;
    }

    public Lechuza(String nopturna, String augero, String caracorazonad, String cuevas, String caseria, int codigo, String peso, String nombre, String colores, String genero) {
        super(cuevas, caseria, codigo, peso, nombre, colores, genero);
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
        return super.toString()+ "Lechuza{" + "nopturna=" + nopturna + ", augero=" + augero + ", caracorazonad=" + caracorazonad + '}';
    }

    @Override
    public void comer() {
        System.out.println("La lechuza come cuando "+super.getCaseria());
    }

    @Override
    public void dormir() {
        System.out.println("Esta ave es nocturna  y duerme cuando esta en  la  "+super.getCuevas());
    }
    @Override
    public void moverse() {
        System.out.println("Esta ave se mueve cuando "+super.getCaseria());
    }

    @Override
    public void volar() {
        System.out.println("Esta ave vuela cuando "+super.getCaseria());
    }

    @Override
    public void reproducirse() {
        System.out.println("Estas aves se reproducen solo cuando estas estan en  "+super.getCuevas());
    }
    
    }

    

