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
public abstract class Ave {

    private int codigo;
    private String peso;
    private String nombre;
    //private  int edad;
    private String colores;
    private String genero;
 
    public Ave(){
        
    }

    public Ave(int codigo, String nombre, String genero) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.genero = genero;
    }

    public Ave(int codigo, String peso, String nombre, String colores, String genero) {
        this.codigo = codigo;
        this.peso = peso;
        this.nombre = nombre;
        this.colores = colores;
        this.genero = genero;

    }
    
    //falta un metodo
    
    

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColores() {
        return colores;
    }

    public void setColores(String colores) {
        this.colores = colores;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Ave{" + "codigo=" + codigo + ", peso=" + peso + 
                ", nombre=" + nombre + ", colores=" + colores + 
                ", genero=" + genero + '}';
    }

   

    
    

   
    
    
}
