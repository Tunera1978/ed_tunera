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
public class Moto extends Carro {

    public void andar(int distancia, int velocidade) {

        quantCombustivel = quantCombustivel - 1;
        if (velocidade <= 100) {
            CombustivelFinal = quantCombustivel - (distancia / 25);
            System.out.println("Marca: " + marca + " Modelo: " + modelo + " combustível: " + quantCombustivel + " inicial : " + (quantCombustivel + 1) + " distância: " + distancia + " velocidade: " + velocidade + " combustível final: " + CombustivelFinal);
        } else {
            CombustivelFinal = quantCombustivel - (distancia / 18);
            System.out.println("Marca: " + marca + " Modelo: " + modelo + " combustível: " + quantCombustivel + " inicial : " + (quantCombustivel + 1) + " distância: " + distancia + " velocidade: " + velocidade + " combustível final: " + CombustivelFinal);
//System.out.println(CombustivelFinal);
        }

    }
}
