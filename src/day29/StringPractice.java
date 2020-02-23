package day29;

public class StringPractice {
    public static void main(String[] args) {
        String hero1= "Superman-Clark Kent";

        // Her

//        String heroCode= hero1.substring(0,hero1.indexOf("-"));
//        hero1.split("-");
//        String [] eachWord=hero1.split("-");
//        String superman =eachWord[0];
//        char cLetter= eachWord[0].charAt(0);
//        char kLetter=hero1
//        String[] heroSplitted=hero1.split("-");
//        System.out.println("heroSplitted = " + heroSplitted);
//        String code=heroSplitted[0];
//        String identity=heroSplitted[1];
        String hero2="Superman-Clark Jon Kent";

        String code2=hero2.substring(0,hero2.indexOf("-"));
        String cLetter= hero2.substring(hero2.indexOf("-")+1,hero2.indexOf("-"+2));
        String jLetter = hero2.substring(hero2.indexOf(" ")+1,hero2.indexOf(" ")+2);
        String kLetter =hero2.substring(hero2.lastIndexOf(" ")+1,hero2.lastIndexOf(" ")+2);
        System.out.println("code is "+code2+" identity is "+cLetter+jLetter+kLetter);



    }
}
