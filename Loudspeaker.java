public class Loudspeaker extends Sounds{
    public void loudspeaker() {
        System.out.println("A piece of equipment that changes electrical signals into sounds");
    }

    public static void main(String[] args) {
        Loudspeaker loudspeaker = new Loudspeaker();
        loudspeaker.allelectronicdevices();
        loudspeaker.soundSystem();
        loudspeaker.loudspeaker();
    }
}
