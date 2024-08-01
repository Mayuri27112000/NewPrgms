package newprgms;

//main class
public class RevStr {
	
	    //main method
	    public static void main(String[] args) {
	    	
	    	//initialize the string name 
	        String name = "Mayuri Goud";
	        
	        //take an empty set to store reversed name
	        String reversed_name = "";

	        for(int i = name.length() - 1; i >= 0; i--) {
	            reversed_name += name.charAt(i);
	        }
	        
	        //printing initialized string
	        System.out.println("Given Name: "+ name);
	        
	        //printing after reversed
	        System.out.println("Reversed Name: "+ reversed_name);
	    }
}


