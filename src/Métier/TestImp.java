package Métier;

import java.util.List;

public class TestImp {
	public static void main(String[] args) {
		Ivoyages metier = new voyagesImpl();
		
		IUserMetier metier1 = new UserMetierImp();
		List<voyages> voy = metier.listeVoyages();
		
		IContactMetier metier2 = new ContactMetierImp();
		
//		for(voyages v:voy)
//		{
//			System.out.println(v.getNom_voy());
//		}
		
//		user u = new user(2,"Mask","Ayoub","maskayoub@gmail.com","Hay Riad","Fès","0635797671","qwerty");
//		metier1.createUser(u);
		
		String test = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
		String test2 = "test test test test test";
		System.out.println(firstWords(test2,4));
		System.out.println(wordCount(test));
		
//		List<contact> ct = metier2.listeContactDisplay();
//		
//		for(contact r:ct)
//		{
//			
//		}
	}
	
	

	public static String firstWords(String input, int words) {
        for (int i = 0; i < input.length(); i++) {
            // When a space is encountered, reduce words remaining by 1.
            if (input.charAt(i) == ' ') {
                words--;
            }
            // If no more words remaining, return a substring.
            if (words == 0) {
                return input.substring(0, i);
            }
        }
        // Error case.
        return "";
    }
	
	public static int wordCount(String input) {
	    if (input == null || input.isEmpty()) {
	      return 0;
	    }

	    String[] words = input.split("\\s+");
	    return words.length;
	  }

}
