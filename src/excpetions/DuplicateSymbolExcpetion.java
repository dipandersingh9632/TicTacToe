package excpetions;

public class DuplicateSymbolExcpetion extends RuntimeException{
    public DuplicateSymbolExcpetion(Character ch){
        System.out.println("Character already exists " + ch);
    }
}
