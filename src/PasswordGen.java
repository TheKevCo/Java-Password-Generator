import java.util.*;

public class PasswordGen {

    private int numbers;
    private int letters;
    private int symbols;
    private Set<Integer> numHashSet = new LinkedHashSet<Integer>();
    private Set<String> letterHashSet = new LinkedHashSet<String>();
    private Set<String> symbolHashSet = new LinkedHashSet<String>();
    public PasswordGen(int nums, int letters, int syms) {
        this.numbers = nums;
        this.letters = letters;
        this.symbols = syms;

        // creating hashset for numbers
        for (int i=0; i < 10; i++) {
            this.numHashSet.add(i);
        }

        // creating hashset for letters
        String[] letterArray = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P",
                "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        for (String element: letterArray){
            this.letterHashSet.add(element);
        }

        // creating hashset for symbols
        String[] symbolArray = {"?", "!", "@", "#", "$", "=", "+", "*", "%"};
        for (String element: symbolArray){
            this.symbolHashSet.add(element);
        }

    }
    public String PasswordGenerator() {
        int numberCount = this.numbers;
        int letterCount = this.letters;
        int symbolCount = this.symbols;


        // our password stuck in a tree set.
        List<String> passwordList = new LinkedList<String>();

        // append letters, numbers and symbols into password
        for (int n=0; n < numberCount; n++){
            Random rand = new Random();
            // using size of numHashSet, select random index number using random class
            int numRanInd = rand.nextInt(this.numHashSet.size());
            // before we can get element out of linked hashset, apparently you need to make an array the size of the
            // linked hashset and then convert to array allowing you to use the list[i] method, I love java
            Integer[] numArray = new Integer[this.numHashSet.size()];
            this.numHashSet.toArray(numArray);
            passwordList.add(numArray[numRanInd].toString());
        }
        for (int l=0; l < letterCount; l++){
            Random rand = new Random();
            int letterRanInd = rand.nextInt(this.letterHashSet.size());
            String[] letterArray = new String[this.letterHashSet.size()];
            this.letterHashSet.toArray(letterArray);
            passwordList.add(letterArray[letterRanInd]);
        }
        for (int s=0; s < symbolCount; s++){
            Random rand = new Random();
            int symbolRanInd = rand.nextInt(this.symbolHashSet.size());
            String[] symArray = new String[this.symbolHashSet.size()];
            this.symbolHashSet.toArray(symArray);
            passwordList.add(symArray[symbolRanInd]);
        }

        System.out.println(passwordList);
        Collections.shuffle(passwordList);
        String password = String.join("",passwordList);

        return password;
    }
}
