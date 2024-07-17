public class Main {
    public static void main(String[] args) {
        Duck duck = new Duck();
        Owl owl = new Owl(); //Pettable
        Pig pig = new Pig();
        Cow cow = new Cow();
        Fly fly = new Fly();
        PekingDuck pekingDuck = new PekingDuck();
        duck.sound();
        owl.sound();
        cow.sound();
        pig.sound();
        fly.sound();
        duck.fly();
        owl.glide();
        owl.canPet();
        duck.clean("Southgate's brain");
        pekingDuck.clean("floor");
    }
}
