package singleton;

/**
 * Singleton "apressado"
 *
 *
 * @author gabrielsene
 */

public class SingletonEager {
    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager(){
        super();
    }

    public static SingletonEager getInstancia(){
        return instancia;
    }
}
