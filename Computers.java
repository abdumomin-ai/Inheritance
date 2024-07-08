public class Computers extends Electronics{
    public void computerTypes(){
        System.out.println("Computer types");
    }

    public static void main(String[] args) {
        Computers computers = new Computers();
        computers.allelectronicdevices();
        computers.computerTypes();
    }
}
