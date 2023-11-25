public class Carro {
    protected String modelo;
    protected int idCarro;
    protected int ano;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getIdCarro() {
        return idCarro;
    }

    public void setIdCarro(int idCarro) {
        this.idCarro = idCarro;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    protected String cor;
    public Carro(int idCarro, String modelo, int ano, String cor){
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.idCarro = idCarro;
    }

    public Carro(){

    }

    @Override
    public String toString() {
        return "Carro{" +
                "modelo='" + modelo + '\'' +
                ", ano=" + ano +
                ", cor='" + cor + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        return (o instanceof Carro)
                && ((Carro) o).idCarro == this.idCarro;
    }

    @Override
    public int hashCode() {
        return modelo.length();
    }
}
