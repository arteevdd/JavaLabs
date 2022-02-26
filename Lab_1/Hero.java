package Lab_1;

public class Hero {

    private String Name;
    private MoveStrategy moveStrategy;

    public Hero (String Name ){
        this.Name = Name;
        System.out.println("Создан герой с именем: " + Name);
    }

    public void setMoveStrategy(MoveStrategy moveStrategy) {
        this.moveStrategy = moveStrategy;
    }

    public void move(){
        System.out.print(Name + ":");
        moveStrategy.move();
        System.out.println();
    }
}
