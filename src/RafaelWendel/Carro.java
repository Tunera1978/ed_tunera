/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RafaelWendel;

/**
 *
 * @author Aluno
 */
public class Carro {

    public int idcarro;
    public String nomeCarro;
    public String modelo;
    public String fabricante;
    public static void main(String[] args) {
        Carro c1 = new Carro();
        c1.idcarro = 1 ;
        c1.nomeCarro = "Marvado";
        c1.modelo = "Utilitário";
        c1.fabricante = "Mané autos";
        
        Carro c2 = new Carro();
        c1.idcarro = 2 ;
        c1.nomeCarro = "Porcaria";
        c1.modelo = "Mini";
        c1.fabricante = "Mané autos";
    }

}
