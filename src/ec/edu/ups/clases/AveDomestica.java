/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

/**
 *
 * @author ASUS
 */
public abstract class AveDomestica extends Ave{
    private String cautiverio;
    private String dueño;
    private String veterinario;
    private String medicamento;

   public AveDomestica(){
       
   }
    
   
    public AveDomestica(String cautiverio, String dueño, String veterinario, String medicamento) {
        this.cautiverio = cautiverio;
        this.dueño = dueño;
        this.veterinario = veterinario;
        this.medicamento = medicamento;
    }

    public AveDomestica(String cautiverio, String dueño, String veterinario, String medicamento, int codigo, String peso, String nombre, String colores, String genero) {
        super(codigo, peso, nombre, colores, genero);
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
        return  super.toString()+"AveDomestica{" + "cautiverio=" + cautiverio +
                ", due\u00f1o=" + dueño + ", veterinario=" + veterinario +
                ", medicamento=" + medicamento + '}';
    }

    
   
    
    
}
