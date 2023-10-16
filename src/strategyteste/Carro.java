package strategyteste;

public class Carro {
    private Velocidade velocidade;

    public void setVelocidade(Velocidade velocidade){
        this.velocidade = velocidade;
    }

    public void correr(){
        velocidade.correr();
    }
}
