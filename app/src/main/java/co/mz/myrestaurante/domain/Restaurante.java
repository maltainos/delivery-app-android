package co.mz.myrestaurante.domain;

import java.io.Serializable;

public class Restaurante implements Serializable {

    private String id;
    private String primeiroNome;
    private String segundoNome;
    private String nomeRestaurante;
    private String cidade;
    private Double classificacao;
    private Double cordenadaX;
    private Double cordenadaY;
    private String email;
    private String password;
    private Boolean status;
    private Boolean isSuperAdmin;
    private Boolean isAdmin;

    public Restaurante() { }

    public Restaurante(String id, String primeiroNome, String segundoNome,
                       String nomeRestaurante, String cidade, Double classificacao,
                       Double cordenadaX, Double cordenadaY, String email,
                       String password, Boolean status, Boolean isSuperAdmin,
                       Boolean isAdmin) {
        this.id = id;
        this.primeiroNome = primeiroNome;
        this.segundoNome = segundoNome;
        this.nomeRestaurante = nomeRestaurante;
        this.cidade = cidade;
        this.classificacao = classificacao;
        this.cordenadaX = cordenadaX;
        this.cordenadaY = cordenadaY;
        this.email = email;
        this.password = password;
        this.status = status;
        this.isSuperAdmin = isSuperAdmin;
        this.isAdmin = isAdmin;
    }

    public Restaurante(String primeiroNome, String segundoNome, String nomeRestaurante,
                       Double classificacao, String cidade, Double cordenadaX,
                       Double cordenadaY, String email, String password,
                       Boolean status, Boolean isSuperAdmin, Boolean isAdmin) {
        this.primeiroNome = primeiroNome;
        this.segundoNome = segundoNome;
        this.nomeRestaurante = nomeRestaurante;
        this.classificacao = classificacao;
        this.cidade = cidade;
        this.cordenadaX = cordenadaX;
        this.cordenadaY = cordenadaY;
        this.email = email;
        this.password = password;
        this.status = status;
        this.isAdmin = isAdmin;
        this.isSuperAdmin = isSuperAdmin;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getSegundoNome() {
        return segundoNome;
    }

    public void setSegundoNome(String segundoNome) {
        this.segundoNome = segundoNome;
    }

    public String getNomeRestaurante() {
        return nomeRestaurante;
    }

    public void setNomeRestaurante(String nomeRestaurante) {
        this.nomeRestaurante = nomeRestaurante;
    }

    public Double getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(Double classificacao) {
        this.classificacao = classificacao;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Double getCordenadaX() {
        return cordenadaX;
    }

    public void setCordenadaX(Double cordenadaX) {
        this.cordenadaX = cordenadaX;
    }

    public Double getCordenadaY() {
        return cordenadaY;
    }

    public void setCordenadaY(Double cordenadaY) {
        this.cordenadaY = cordenadaY;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Boolean getSuperAdmin() {
        return isSuperAdmin;
    }

    public void setSuperAdmin(Boolean superAdmin) {
        isSuperAdmin = superAdmin;
    }

    public Boolean getAdmin() {
        return isAdmin;
    }

    public void setAdmin(Boolean admin) {
        isAdmin = admin;
    }

    @Override
    public String toString() {
        return "Restaurante{" +
                "id='" + id + '\'' +
                ", primeiroNome='" + primeiroNome + '\'' +
                ", segundoNome='" + segundoNome + '\'' +
                ", nomeRestaurante='" + nomeRestaurante + '\'' +
                ", classificacao='" + classificacao + '\'' +
                ", cidade='" + cidade + '\'' +
                ", cordenadaX='" + cordenadaX + '\'' +
                ", cordenadaY='" + cordenadaY + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", status=" + status +
                ", isSuperAdmin=" + isSuperAdmin +
                ", isAdmin=" + isAdmin +
                '}';
    }
}
