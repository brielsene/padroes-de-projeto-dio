package strategy;

public class Robo {
    private Comportameto strategy;

    public void setComportamento(Comportameto strategy){
        this.strategy = strategy;
    }

    public void mover(){
        strategy.mover();
    }
}
