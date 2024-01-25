package Strings;

public class arrayStringsAreEqual {
    public static void main(String[] args) {

        String[] word1={"ab", "c"};
        String[] word2= {"a", "bc"};
        System.out.println(arrayStringsAreEqual(word1,word2));
    }
    public static boolean  arrayStringsAreEqual(String[] word1, String[] word2){


        StringBuilder stringBuilder= new StringBuilder();
        StringBuilder stringBuilder1= new StringBuilder();

        for(int i=0;i<word1.length;i++){
            stringBuilder.append(word1[i]);
        }
        for(int i=0;i<word2.length;i++){
            stringBuilder1.append(word2[i]);
        }
        return stringBuilder.toString().equals(stringBuilder1.toString());
    }
}
