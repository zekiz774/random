import java.util.Arrays;


public class Main {
    public static void main(String args[]){
        int a[]=new int[20];
        int position;
        int searched=13;
        tools tools= new tools();
        
        a=tools.ranArr(a);
        position=tools.position(a, searched);
        System.out.println(position);
        System.out.println(Arrays.toString(a));
    }
}