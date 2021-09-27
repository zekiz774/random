import java.util.ArrayList;
import java.util.List;

public class tools {    
  public int[] ranArr(int[] a){
        
        for(int i=0;i<20;i++) a[i]=i;

        for(int i=0;i<20;i++){
            int pos=(int)(Math.random()*20);
            int temp = a[i];
            a[i]=a[pos];
            a[pos]=temp;
        }
     return a;
  }


  public int[] ranArr2(int[] a){
        for(int i=0; i<20; i++){
            a[i]=(int)(Math.random()*20);
            System.out.print(a[i]+",");
        }
     return a;
  }

  public int position(int[] a, int searched){

    int pos=1;
    //foreach loop
    for (int i : a) { 
      if (a[i]==searched){
        pos=i;
        break;
      }
    }
    return pos;
  }

  public List<Integer> search2(int[] a, int searched){
    List<Integer> b = new ArrayList<Integer>();
    for (int i=0; i<20; i++) { 
      if (a[i]==searched){
        b.add(i);
        
      }
    }
    return b;
  }
}