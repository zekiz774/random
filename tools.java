
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

  public int position(int[] a, int searched){

    int pos;
    //foreach loop
    for (int i : a) { 
      if (a[i]==searched){
        pos=i;
        break;
      }
    }
    return pos;
  }
}