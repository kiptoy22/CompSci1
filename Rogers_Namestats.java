import java.util.Scanner;
public class Rogers_Namestats {
    public static void main(String[] args) {  
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your first name?"); 
        String first = scan.nextLine();
        System.out.println("What is your middle name?");
        String middle = scan.nextLine();
        System.out.println("What is your last name?"); 
        String last = scan.nextLine();

        System.out.println("----------------------");
        System.out.println("Your input name: "+first+" "+middle+" "+last); 

        int fletters = first.length(); 
        int mletters = middle.length(); 
        int lletters = last.length(); 
        int full = fletters + mletters + lletters;

        System.out.println("Letters count: "+full); 

        String firstI = first.substring(0,1).toUpperCase(); 
        String middleI = middle.substring(0,1).toUpperCase(); 
        String lastI = last.substring(0,1).toUpperCase();

        System.out.println("Your initials: "+firstI+middleI+lastI);
        String tc = first.substring(0,1).toUpperCase() + first.substring(1).toLowerCase(); 
        String tcm = middle.substring(0,1).toUpperCase() + middle.substring(1).toLowerCase(); 
        String tcl = last.substring(0,1).toUpperCase() + last.substring(1).toLowerCase(); 

        System.out.println("Title case: "+tc+ " "+tcm+" "+tcl);
        
        String lc = first.toLowerCase();
        String lc2 = middle.toLowerCase(); 
        String lc3 = last.toLowerCase(); 
        
        System.out.println("Lower case: "+lc+" "+lc2+" "+lc3);
        
         String uc = first.toUpperCase();
        String uc2 = middle.toUpperCase(); 
        String uc3 = last.toUpperCase(); 
        
        System.out.println("Upper case: "+uc+" "+uc2+" "+uc3);
        
        int v = 0;
        	for (int i = 0, i < full.length(); ++i) {
        		if(full.substring(i,i+1).equals("a")||full.substring(i,i+1).equals("e")||full.substring(i,i+1).equals("i")||full.substring(i,i+1).equals("o")||full.substring(i,i+1).equals("u")||full.substring(i,i+1).equals("y")) {
        			v++
        	}
        }
        
        
        

    }
}