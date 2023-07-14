import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Modulo 17 - Generics");

        Onix onix = new Onix();
        Cruze cruze = new Cruze();
        Spin spin = new Spin();
        Montana montana = new Montana();

        List<Carro> listaDeCarros = new ArrayList<>();
        listaDeCarros.add(onix);
        listaDeCarros.add(cruze);
        listaDeCarros.add(spin);
        listaDeCarros.add(montana);

        System.out.println("Os modelos de carros são:");
        listaDeCarros.forEach(carro -> System.out.println(carro.getClass().getName()));

    }
}