package app;

import java.io.Serializable;

public class Pedido implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long cogigo;
    private String descricao;
    private int quantidade;

    public Long getCogigo() {
        return cogigo;
    }

    public void setCogigo(Long cogigo) {
        this.cogigo = cogigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
