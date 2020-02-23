package replIt;

public class Repl_216 {
    public static void main(String[] args) {


        int [] arr ={1,1,1,1,0,0,0};
        System.out.println(badP(arr,2));
    }
    public static boolean badP(int[] products,int limit)
    {
        int count=0;
        for(int i=0; i<products.length; i++){

            if(products[i]==0){
                count++;
            }
        }
        if(count>limit){
            return false;
        }

        return true;
    }
}
