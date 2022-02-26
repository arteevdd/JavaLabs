package Lab_1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Hero Artem = new Hero("Артём");
        Artem.setMoveStrategy(new MoveOnFeet());
        Artem.move();
        Artem.setMoveStrategy(new MoveOnHorse());
        Artem.move();
        Artem.setMoveStrategy(new MoveFly());
        Artem.move();

        System.out.println("-------------------------------------");

        Hero Nikolai = new Hero("Николай");
        Nikolai.setMoveStrategy(new MoveOnFeet());
        Nikolai.move();
        Nikolai.setMoveStrategy(new MoveOnHorse());
        Nikolai.move();

        System.out.println("-------------------------------------");

        Hero Mary = new Hero("Мария");
        Mary.setMoveStrategy(new MoveFly());
        Mary.move();

    }
}
