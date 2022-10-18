import java.util.*;
public class Nope {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		boolean play = true;
		String youWish ="";
		
		while(play) {
			System.out.println("Once their was a little boy and he decied to walk down an ally way to get to his house faster. AS he was half way through a van pulled up next to him and...");
			
			System.out.println("Do you wish i coninue the story?");
			youWish = input.next();
			
			if(youWish.contentEquals("yes")) {
				play = false;
			}else {
				System.out.println("No keep listening to me little one, now let me restart");
			}
		}
		System.out.print("HAHAHA, no you cant keep lisenting! Now shoe little fly befor the van come.");
	}
}
