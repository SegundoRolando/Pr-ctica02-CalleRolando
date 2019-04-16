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
public  abstract class AveSilvestre extends Ave {
    private String cuevas;
    private String caseria;
            
    
public AveSilvestre(){
    
}

    public AveSilvestre(String cuevas, String caseria) {
        this.cuevas = cuevas;
        this.caseria = caseria;
    }

    public AveSilvestre(String cuevas, String caseria, int codigo, String peso, String nombre, String colores, String genero) {
        super(codigo, peso, nombre, colores, genero);
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
        return super.toString()+ "Avesilvestre{" + "cuevas=" + cuevas + ", caseria=" + caseria + '}';
    }
    
    

    
    
}
