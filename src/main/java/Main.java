public class Main {

    public static void main(String[] args) {
        TablaJoc j = new TablaJoc();
        Jucator i = new Jucator();


        Arbitru a = new Arbitru(i,j);
        System.out.println(j);
        a.start();


    }
}
