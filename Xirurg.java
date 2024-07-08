public class Xirurg extends Doktors {

    public void surgery(){
        System.out.println("Surgery");
    }

    public static void main(String[] args) {
        Xirurg xirurg = new Xirurg();
        xirurg.treatment();
        xirurg.surgery();
    }
}
