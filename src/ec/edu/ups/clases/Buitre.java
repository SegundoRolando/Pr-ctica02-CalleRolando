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
public final class Buitre extends AveSilvestre implements Acciones{
  private  String carnivoro;
  private String simbologismo;

  public Buitre(){
      
  }
    public Buitre(String carnivoro, String simbologismo) {
        this.carnivoro = carnivoro;
        this.simbologismo = simbologismo;
    }

    public Buitre(String carnivoro, String simbologismo, String cuevas, String caseria, int codigo, String peso, String nombre, String colores, String genero) {
        super(cuevas, caseria, codigo, peso, nombre, colores, genero);
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
        return super.toString()+ "Buitre{" + "carnivoro=" + carnivoro + ", simbologismo=" + simbologismo + '}';
    }

    @Override
    public void comer() {
        System.out.println("El buitre come solo cuando "+super.getCaseria());
    }

    @Override
    public void dormir() {
        System.out.println("el buitre  duerme mientras "+super.getCuevas());
    }

    @Override
    public void moverse() {
        System.out.println("El recorrido del buitre es  cuando  "+ super.getCaseria());
    }

    @Override
    public void volar() {
        System.out.println("el condor vuela solo  cuando va "+ super.getCaseria());
    }

    @Override
    public void reproducirse() {
        System.out.println("ESte se puede reporducir  cuando estan en sus "+super.getCuevas());
    }
  
 
}


