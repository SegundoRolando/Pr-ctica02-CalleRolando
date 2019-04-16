/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.Controlador;

import ec.edu.ups.clases.Pato;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class ControladorPato {

    private final  List<Pato> lista;

    public ControladorPato() {
        lista = new ArrayList<>();
    }

    public void create(Pato pato) {
        lista.add(pato);
    }

    public Pato read(int codigo) {

        for (Pato pato : lista) {
            if (pato.getCodigo() == codigo) {
                return pato;
            }
        }
        return null;
    }

    public void update(Pato pato) {
        for (int i = 0; i < lista.size(); i++) {
            Pato elemento = lista.get(i);
            if (elemento.getCodigo() == pato.getCodigo()) {
                lista.set(i, pato);
                break;
            }
        }
    }
     public void delete(int codigo){
        for (int i = 0; i < lista.size(); i++) {
            Pato elemento = lista.get(i);
            if(elemento.getCodigo() == codigo){
                lista.remove(i);
                break;
            }            
        }
    }
}
