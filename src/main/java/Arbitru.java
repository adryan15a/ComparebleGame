public class Arbitru {
    Jucator j;
    TablaJoc t;

    public Arbitru(Jucator j, TablaJoc t) {
        this.j = j;
        this.t = t;
    }

    public void start() {
        System.out.println("introdu cele 2 coordonate");
        int contor = 0;
        System.out.println(t);
        while(contor <= 8) {
            int[] coord1 = j.alegeSimbol1();
            t.arata(coord1);
            System.out.println(t);
            int[] coord2 = j.alegeSimbol1();
            t.arata(coord2);
            System.out.println(t);

            if (t.esteEgal(coord1,coord2)) {
                contor++;
            }
            else {
                t.ascunde(coord1);
                t.ascunde(coord2);
                System.out.println(t);
                System.out.println("================");
            }
        }
        System.out.println("Felicitari ai castigat");
    }
}
