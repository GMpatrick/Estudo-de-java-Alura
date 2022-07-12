package br.com.alura.bytebank;

import br.com.alura.bytebank.model.Funcionario;
import br.com.alura.bytebank.model.Pagamento;
import br.com.alura.bytebank.model.Tipo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args){

        /*Funcionario patrick = new Funcionario("Patrick", 1, LocalDate.of(2003, 3, 20));
        Funcionario maria = new Funcionario("Maria", 2, LocalDate.of(1998, 5, 25));
        System.out.println(patrick +" "+ maria); */

        Pagamento almoco = new Pagamento(Tipo.DEBITO, 20.0, "Almoço de feijuca");

    }
}
