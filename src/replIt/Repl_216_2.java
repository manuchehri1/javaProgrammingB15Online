package replIt;

import java.util.ArrayList;

public class Repl_216_2 {
    public static void main(String[] args) {
//        blogDb(r,"1")
//        returns:
//        title
//        content1
//        r = [
//["1","title","content1"],
//["2","another title","content2"],
//["3","yet another title","content3"]
//]


    }
    public String blogDb(ArrayList<String[]> r, String id)  {
        String rslt="";
        for (int i = 0; i < r.size(); i++) {
            for (int j = 0; j <r.get(i).length ; j++) {
                String [] temp=r.get(i);
                if (temp[j].contains(id)){
                    rslt +=temp[j+1]+"\n"+temp[j+2];

                }
            }
            System.out.println();

        }
        return rslt;

    }

}
