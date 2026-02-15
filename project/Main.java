package project;

import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.preProcess("hello hel hell helium");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the prefix string: ");
        String str = sc.nextLine();
        List <String> suggestedStrings = new ArrayList<>();
        suggestedStrings = SearchString.searchInTrie(trie,str);
        for(int i = 0;i<suggestedStrings.size();i++){
            System.out.println(i+1 + " suggested string: ");
            System.out.println(suggestedStrings.get(i));
        }
    }
}
