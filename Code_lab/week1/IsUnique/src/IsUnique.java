import java.util.HashSet;

public class IsUnique {
    //Assumption: the input string is not null
    public boolean isUnique(String word){
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < word.length(); i++){
            char c = word.charAt(i);
            if(set.contains (c)){
                return false;
            }
            set.add (c);
        }
        return true;
    }
    public static void main(String[] args){
        String word = "love";
        IsUnique string = new IsUnique();
        System.out.println(string.isUnique(word));
    }
}
