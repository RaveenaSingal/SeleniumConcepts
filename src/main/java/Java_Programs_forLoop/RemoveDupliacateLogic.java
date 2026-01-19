package Java_Programs_forLoop;

public class RemoveDupliacateLogic {

	public static void main(String[] args) {
		// Remove duplicate with logic
		String name = "automation";
		
		for(int i=0; i<name.length(); i++) {
			boolean isFound = false;
			
			for(int j=0; j<i; j++) {
				if(name.charAt(i)==name.charAt(j)) {
					isFound = true;
					break;
					
				}
			}
			if(!isFound) {
				System.out.println(name.charAt(i)+" ");
			}
		}
		

	}

}
