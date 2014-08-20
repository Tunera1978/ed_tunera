/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package R_W_ExercicioHeranca;

/**
 *
 * @author Aluno
 */
public class exercicioHeranca {
    public  static void main(String[] args){
        Carro c = new Carro();
        c.marca = "Fiat";
        c.modelo = "Siena";
        c.quantCombustivel = 50;
        c.andar(100, 100);
        
        Moto m = new Moto();
        m.marca = "Kawazaki";
        m.modelo = "Ninja";
        m.quantCombustivel = 30;
        
        m.andar(50, 120);
        
        
    }
}
