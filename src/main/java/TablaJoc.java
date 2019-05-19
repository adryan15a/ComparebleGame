import java.util.Random;

public class TablaJoc{

    @Override
    public String toString() {
        String txt = "";
        for (int row = 0; row <4; row++) {
            for (int col = 0; col <4; col++){
                txt = txt + m[row][col] + "  ";
            }
            txt = txt + "\n";
        }
        return txt;
    }

    private Simbol m[][];

    public TablaJoc() {

        Random x = new Random();
        m = new Simbol[4][4];
        Simbol []simbolList = Simbol.values();

        for(Simbol s : simbolList) {

            do {
                int row = x.nextInt(4);
                int col = x.nextInt(4);
                if (m[row][col] == null) {
                    m[row][col] = s;
                    break;
                }
            }
            while (true);
        }

    }



    public void arata(int []coord){
        int row = coord[0];
        int col = coord[1];
        m[row][col].descopera();
    }

    public void ascunde(int []coord){
        int row = coord[0];
        int col = coord[1];
        m[row][col].ascunde();
    }

    boolean esteEgal(int[]first, int []second){
        int firstRow = first[0];
        int firstCol = first[1];
        int secondRow = second[0];
        int secondCol = second[1];

        return m[firstRow][firstCol].toString().equals(m[secondRow][secondCol].toString());
    }



}
