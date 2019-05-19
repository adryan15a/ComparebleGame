import java.util.Scanner;

public class Jucator extends TablaJoc {
Scanner sc = new Scanner(System.in);




    public int[] alegeSimbol1(){
        int row = sc.nextInt();
        int col = sc.nextInt();
        return new int[]{row,col};
    }


}
