public class PC extends Computers{
    public void DesktopComputer(){
        System.out.println("Desktop Computer");
    }

    public static void main(String[] args) {
        PC pc = new PC();
        pc.allelectronicdevices();
        pc.computerTypes();
        pc.DesktopComputer();
    }
}
