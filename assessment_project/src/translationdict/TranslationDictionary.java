package translationdict;

import java.util.*;

public class TranslationDictionary {
    private Map<String, Set<String>> dictionary;

    
    public TranslationDictionary() {
        dictionary = new HashMap<>();
    }

   
    public void addTranslation(String word, String translation) {
       
        Set<String> translations = dictionary.getOrDefault(word, new HashSet<>());
        translations.add(translation); 
        dictionary.put(word, translations); 
    }

  
    public Set<String> getTranslations(String word) {
        return dictionary.getOrDefault(word, new HashSet<>()); // Return translations or an empty set
    }

   
    public void removeTranslation(String word, String translation) {
        Set<String> translations = dictionary.get(word);
        if (translations != null) {
            translations.remove(translation); // Remove the translation
            if (translations.isEmpty()) {
                dictionary.remove(word); // If no translations left, remove the word
            } else {
                dictionary.put(word, translations); // Update the word with the new set
            }
        }
    }

   
    public void removeWord(String word) {
        dictionary.remove(word); // Simply remove the word from the dictionary
    }

    
    public void displayDictionary() {
        if (dictionary.isEmpty()) {
            System.out.println("The dictionary is empty.");
        } else {
            for (Map.Entry<String, Set<String>> entry : dictionary.entrySet()) {
                System.out.println("Word: " + entry.getKey() + " | Translations: " + entry.getValue());
            }
        }
    }

    
    public static void main(String[] args) {
        TranslationDictionary dict = new TranslationDictionary();
        
        
        dict.addTranslation("hello", "bonjour");
        dict.addTranslation("hello", "salut");
        dict.addTranslation("world", "monde");
        
        // Display dictionary
        System.out.println("Initial Dictionary:");
        dict.displayDictionary();
        
        // Get translations for a word
        System.out.println("\nTranslations for 'hello': " + dict.getTranslations("hello"));

        // Remove a specific translation
        dict.removeTranslation("hello", "salut");
        System.out.println("\nDictionary after removing 'salut' from 'hello':");
        dict.displayDictionary();
        
        // Remove a word completely
        dict.removeWord("world");
        System.out.println("\nDictionary after removing 'world':");
        dict.displayDictionary();
    }
}
