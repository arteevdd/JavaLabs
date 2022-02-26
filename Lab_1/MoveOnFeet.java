package Lab_1;

public  class MoveOnFeet implements MoveStrategy {

    @Override
    public void move() {
        System.out.print(" Я иду пешком!");
    }
}