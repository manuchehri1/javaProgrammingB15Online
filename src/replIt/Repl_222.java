package replIt;

public class Repl_222 {
    public static void main(String[] args) {
//        hma","11.0"],["sek","5.0"]]   ,   [["drachma","0.6"],["sek","100"]]);
//        returns:  506.6
//        (Bob has 11.0  drachma and 5.0 Sek currency money and he needs to
//        convert them to USD. Conversion rates are in second array. So we multiple
//                (11.0 * 0.6) +(5.0 * 100) and return the result    )

        String[][] test_money =
                {
                        {"mark","5"},
                        {"shekel","30.5"},
                };

        String[][] test_convert=
                {
                        {"mark","1"},
                        {"shekel","0.5"},
                };

     //   double res = Main.convertC(test_money,test_convert);
//        System.out.print(res);

    }
    public static  double convertC(String[][] money,String[][] convertionRate)
    {
        double res1=0;

        for (int i = 0; i <money.length ; i++) {
            res1=res1+(Double.parseDouble(money[0][i])*Double.parseDouble(convertionRate[0][i]));

        }
        return res1;
    }
}
