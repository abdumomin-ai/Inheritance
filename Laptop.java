public class Laptop extends Computers{
    public void laptop(){
        System.out.println("Laptop");
    }

    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        laptop.allelectronicdevices();
        laptop.computerTypes();
        laptop.laptop();
    }
}
