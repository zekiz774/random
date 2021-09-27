import java.util.Arrays;
import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main(String args[]){
        tools tools= new tools();
        int a[]=new int[20];
        a=tools.ranArr2(a);

        
        
        System.out.print("Searched: ");
        Scanner eingabe = new Scanner(System.in);
        String eingabetext = eingabe.nextLine();
        int searched = Integer.parseInt(eingabetext);
        List<Integer> b = tools.search2(a, searched);

        
        
        //position=tools.position(a, searched);
        System.out.println(Arrays.toString(a));
        System.out.println(b);
        System.out.println(b.size());
    }
}