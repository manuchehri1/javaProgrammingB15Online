package day63_Set_Review_Map;

import java.util.HashMap;
import java.util.Map;

public class WordFrequency_My {
    public static void main(String[] args) {
        String str = "Was he mute a while," +
                "or all tears. Did he raise" +
                "his hands to his ears so" +
                "he could scream scream" +
                "scream. Did he eat only" +
                "with his fists. Did he eat" +
                "as if something inside of him" +
                "would never be fed. Did he" +
                "arch his back and hammer" +
                "his heels into the floor" +
                "the minute there was" +
                "something he sought." +
                "And did you feel yourself" +
                "caught there, wanting" +
                "to let go, to run, to" +
                "be called back to wherever" +
                "your two tangled souls" +
                "had sprung from. Did you ever" +
                "feel as though something" +
                "were rising up inside you." +
                "A fire-white ghost. Did you" +
                "feel pity. And for whom.";
        String [] allWords =str.split(" ");

        Map<String, Integer> wordFreq = new HashMap<>();


        for (int x = 0; x < allWords.length; x++) {

            String currentWord = allWords[x];
            // if we do not have the key yet , it means we are entering for the first time
            // the count will be 1
            if (!wordFreq.containsKey(currentWord)) {
              //  System.out.println("Entering for the first time " + currentWord);
                wordFreq.put(currentWord, 1);

            } else {
                // if we come to this point it means it has already showed up
                // so we update the count with 1 extra than existing count
               // System.out.println("Incrementing the count of " + currentWord + " by one and replacing old count");
                wordFreq.replace(currentWord, wordFreq.get(currentWord) + 1);

            }
        }
        System.out.println("charFreq = " + wordFreq);

    }
}
