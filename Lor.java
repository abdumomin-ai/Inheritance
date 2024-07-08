public class Lor extends Doktors {
    public void otorhinolaryngologist(){
        System.out.println("Lor treats ear, throat, nose, head and neck pathologies.");
    }

    public static void main(String[] args) {
        Lor lor = new Lor();
        lor.treatment();
        lor.otorhinolaryngologist();
    }
}
