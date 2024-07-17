public class Duck extends Animal implements Flyable{
    @Override
    public void sound(){
        System.out.println("Gaab quack");
    }
    public void fly(){
        System.out.println("I believe I can fly");
    }
    public void glide(){
        System.out.println("I can also ron");
    }
    public void land(){
        System.out.println("I can land on water");
    }
    public void clean(String input){
        System.out.println("Duck is cleaning " + input);
    }
}
