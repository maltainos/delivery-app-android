package co.mz.myrestaurante.domain;

import java.io.Serializable;

public class Producto implements Serializable {

    private String id;
    private String nomeProducto;
    private String precoProducto;
    private String classificaoProducto;
    private Restaurante restauranteProducto;
    private Categoria categoriaProdutcto;
    private String tempoPrepracaoProducto;
    private String descricaoProducto;

    public Producto() {
    }

    public Producto(String nomeProducto, String precoProducto, String classificaoProducto, Restaurante restauranteProducto, Categoria categoriaProdutcto, String tempoPrepracaoProducto, String descricaoProducto) {
        this.nomeProducto = nomeProducto;
        this.precoProducto = precoProducto;
        this.classificaoProducto = classificaoProducto;
        this.restauranteProducto = restauranteProducto;
        this.categoriaProdutcto = categoriaProdutcto;
        this.tempoPrepracaoProducto = tempoPrepracaoProducto;
        this.descricaoProducto = descricaoProducto;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNomeProducto() {
        return nomeProducto;
    }

    public void setNomeProducto(String nomeProducto) {
        this.nomeProducto = nomeProducto;
    }

    public String getPrecoProducto() {
        return precoProducto;
    }

    public void setPrecoProducto(String precoProducto) {
        this.precoProducto = precoProducto;
    }

    public String getClassificaoProducto() {
        return classificaoProducto;
    }

    public void setClassificaoProducto(String classificaoProducto) {
        this.classificaoProducto = classificaoProducto;
    }

    public Restaurante getRestauranteProducto() {
        return restauranteProducto;
    }

    public void setRestauranteProducto(Restaurante restauranteProducto) {
        this.restauranteProducto = restauranteProducto;
    }

    public Categoria getCategoriaProdutcto() {
        return categoriaProdutcto;
    }

    public void setCategoriaProdutcto(Categoria categoriaProdutcto) {
        this.categoriaProdutcto = categoriaProdutcto;
    }

    public String getTempoPrepracaoProducto() {
        return tempoPrepracaoProducto;
    }

    public void setTempoPrepracaoProducto(String tempoPrepracaoProducto) {
        this.tempoPrepracaoProducto = tempoPrepracaoProducto;
    }

    public String getDescricaoProducto() {
        return descricaoProducto;
    }

    public void setDescricaoProducto(String descricaoProducto) {
        this.descricaoProducto = descricaoProducto;
    }
}
