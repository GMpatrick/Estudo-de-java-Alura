package br.com.alura.bytebank;

import br.com.alura.bytebank.model.Funcionario;
import br.com.alura.bytebank.model.Pagamento;
import br.com.alura.bytebank.model.Tipo;
import br.com.alura.bytebank.registrador.RegistroDePagamento;

import java.util.Arrays;
import java.util.List;

public class Principal {
    public static void main(String[] args){

        Pagamento almoco = new Pagamento(Tipo.DEBITO, 20.0, "Almoço de feijuca");
        Pagamento videogame = new Pagamento(Tipo.CREDITO, 1000.0, "PS4");

        List<Pagamento> pagamentos = Arrays.asList(almoco, videogame);

        RegistroDePagamento registrador = new RegistroDePagamento();
        registrador.registra(pagamentos);
    }
}
