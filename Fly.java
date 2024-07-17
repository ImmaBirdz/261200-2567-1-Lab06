public class Fly extends Animal implements Flyable{
    @Override
    void sound(){
        System.out.println("fuzzzz");
    }
    public void fly(){
        System.out.println("I believe I can fly");
    }
    public void glide(){
        System.out.println("I can also ron");
    }
    public void land(){
        System.out.println("I can land on human and escape :)");
    }
}
