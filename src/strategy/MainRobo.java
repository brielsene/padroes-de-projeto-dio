package strategy;

public class MainRobo {
    public static void main(String[] args) {
        //strategy


        Comportameto defensivo = new ComportamentoDefensivo();
        Comportameto normal = new ComportamentoNormal();
        Comportameto agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
    }
}
