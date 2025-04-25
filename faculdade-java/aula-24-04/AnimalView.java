import java.util.ArrayList;
import java.util.Scanner;

public class AnimalView {
    public static void main(String[] args, Scanner in){

        AnimalController controller = new AnimalController(new ArrayList<Animall>());

        AnimalFactory.criarCachorro("Stella", "Pequeno", 9)
                .ifPresentOrElse(controller::adicionarAnimal,
                        () -> System.out.println("Erro ao adicionar cachorro")
                        );

        AnimalFactory.criarGato("Sininho", "Pequeno")
                .ifPresentOrElse(controller::adicionarAnimal,
                        () -> System.out.println("Erro ao adicionar gato")
                );

        System.out.println("Animais Correndo");
        controller.animaisCorrendo().forEach(System.out::println);

        System.out.println("Cachorros Correndo");
        controller.cachorrosCorrendo().forEach(System.out::println);

        System.out.println("Cachorros correndo com velocidade");
        controller.cachorrosCorrendo(100).forEach(System.out::println);

    }
}
