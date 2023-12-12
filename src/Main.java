import Anotacoes.TabelaBD;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException {
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
        System.out.println();

        // REFLECTIONS -----------------------------------------------------------------------
        System.out.println("Modulo 19 - Reflections");
        Class tabelaBdClass = TabelaBD.class;
        Constructor construtorTabelaBd = tabelaBdClass.getConstructor(String.class);
        Annotation[] anotacoesConstrutor = construtorTabelaBd.getAnnotations();

        for(Annotation anotacao : anotacoesConstrutor) {
            System.out.println(anotacao.toString());
            System.out.println(anotacao.annotationType().getName());
            System.out.println(anotacao.annotationType());
        }

    }
}