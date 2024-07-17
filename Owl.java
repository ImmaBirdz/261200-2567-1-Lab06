public class Owl extends Animal implements Flyable, Pettable {
    @Override   
    public void sound(){
        System.out.println("hook hoot");
    }
    public void fly(){
        System.out.println("I believe I can fly");
    }
    public void glide(){
        System.out.println("I can also ron");
    }
    public void land(){
        System.out.println("I can land on tree");
    }
    public void canPet(){
        System.out.println("I can be pet by human");
    }
}
