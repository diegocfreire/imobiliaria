package br.com.dcf.model;

/**
 * Created by diego on 29/12/15.
 */
public enum TipoImovel {

    APARTAMENTO("Apartamento"),
    TERRENO("Terreno"),
    CASA("Casa"),
    COMODO_COMERCIAL("Cômodo comercial");

    private String descricao;

    TipoImovel(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return this.descricao;
    }

}
