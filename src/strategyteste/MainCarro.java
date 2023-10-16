package strategyteste;

public class MainCarro {
    public static void main(String[] args) {
        Velocidade normal = new VelocidadeNormal();
        Velocidade lenta = new VelocidadeLenta();
        Velocidade rapida = new VelocidadeRapida();

        Carro carro = new Carro();
        carro.setVelocidade(rapida);
        carro.correr();
    }
}
