package br.com.alura.bytebank.model;
import br.com.alura.bytebank.model.Tipo;

import java.time.LocalDate;

public class Pagamento {

    private Tipo tipo;
    private Double valor;
    private String descricao;
    private LocalDate data;

    // contructor
    public Pagamento(Tipo tipo, Double valor, String descricao) {
        this.tipo = tipo;
        this.valor = valor;
        this.descricao = descricao;
        this.data = LocalDate.now();
    }

    // getters and setter
    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Pagamento{" +
                "descricao='" + descricao + '\'' +
                ", tipo=" + tipo +
                ", valor=" + valor +
                ", data=" + data +
                '}';
    }
}
