public class CarroEletrico extends Carro implements Recarregavel{
    private int autonomiaBateria;

    public CarroEletrico(int idCarro, String modelo, int ano, String cor, int autonomiaBateria) {
        super(idCarro,modelo, ano, cor);
        this.autonomiaBateria = autonomiaBateria;
    }

    @Override
    public void recarregarBateria() {
        System.out.println("Carregando bateria...");
        autonomiaBateria = 100;
        System.out.println("Bateria carregada!");
    }

    @Override
    public String toString() {
        return "CarroEletrico{" +
                "autonomiaBateria=" + autonomiaBateria +
                ", modelo='" + modelo + '\'' +
                ", ano=" + ano +
                ", cor='" + cor + '\'' +
                '}';
    }
}
