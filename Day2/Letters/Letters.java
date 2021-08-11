public class Letters {
    private static char[] vowels = new char[] {'a', 'e', 'i', 'o', 'u'};
    private static char[] consonants = new char[] {'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z'};

    public static void main(String[] args) {
        System.out.println("f is a consonant: " + isConsonant('f'));
        System.out.println("a is a consonant: " + isConsonant('a'));
        System.out.println("c is a vowel: " + isVowel('c'));
        System.out.println("i is a vowel: " + isVowel('i'));
    }

    public static boolean isVowel(Character c) {
        for (char ch : vowels) {
            if (ch == c) {
                return true;
            }
        }
        return false;
    }
    public static boolean isConsonant(Character c) {
        for (char ch : consonants) {
            if (ch == c) {
                return true;
            }
        }
        return false;
    }


}
