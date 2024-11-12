package version1;

public class Vowels {
    public static void main(String[] args) {

        boolean yIsVowel = true;
        char ch = 'Y';

        boolean isVowel = switch (ch){
            case 'a' , 'e' , 'i' , 'o' , 'u' -> true;
            default -> false;
            case 'y' , 'Y' ->{
                if (yIsVowel) yield true;
                 yield false;
            }
        };
        System.out.println(isVowel);
    }
}
