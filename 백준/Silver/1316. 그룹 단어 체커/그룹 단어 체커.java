import java.util.Scanner;
 
public class Main {
 
	static Scanner in = new Scanner(System.in);
 
	public static void main(String[] args) {
 
		int count = 0;
		int N = in.nextInt();
 
		for (int i = 0; i < N; i++) {
			if (check() == true) {
				count++;
			}
		}
		System.out.println(count);
	}
 
	public static boolean check() {
		boolean[] check = new boolean[26];
		int prev = 0;
		String str = in.next();
		
		for(int i = 0; i < str.length(); i++) {
			int current = str.charAt(i);
			
			if (prev != current) {		
				if ( check[current - 'a'] == false ) {
					check[current - 'a'] = true;		
					prev = current;					
				}
	 
				else {
					return false;
				}
			}
			else {
				continue;
			}
		}    
		return true;
	}
}