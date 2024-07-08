public class Subwoofer extends Sounds{
    public void subwoofer(){
        System.out.println("Make a sound");
    }

    public static void main(String[] args) {
        Subwoofer subwoofer = new Subwoofer();
        subwoofer.allelectronicdevices();
        subwoofer.soundSystem();
        subwoofer.subwoofer();
    }
}
