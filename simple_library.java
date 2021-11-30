import java.util.Scanner;
import java.util.ArrayList;
class lib{

	ArrayList<String> arr=new ArrayList<String>();
	ArrayList<String> krr=new ArrayList<String>();
	Scanner sc=new Scanner(System.in);
	public int b;
	public String v;
	public int h;
	public void addBook() {
		System.out.println("you can add a total of 10 books more... How many books do u want to add? ");
		b=sc.nextInt();
		sc.nextLine();
		for(int i=0;i<b;i++) {
			System.out.println("add book name "+(i+1));
			String c=sc.nextLine();
			arr.add(c);
			
		}
		System.out.println("Books added successfully!!");
	}

	public void showBooks() {
		for(int j=0;j<arr.size();j++) {
			System.out.println((j+1)+" "+arr.get(j));
			}
		if(arr.size()==0) {
			System.out.println("No books available!!");
			}
		}
	
	public void issueBooks() {
		for(int k=0;k<arr.size();k++) {

			System.out.println((k+1)+" "+arr.get(k));
			}
		System.out.println("How many books do u want to issue from the above list? ");
		h=sc.nextInt();
		for(int o=0;o<h;o++) {
			System.out.println("Enter the index number of book number "+(o+1)+" : ");
			int y=sc.nextInt();
			sc.nextLine();
			krr.add(arr.remove(y-1));
			for(int vvv=0;vvv<arr.size();vvv++) {
				System.out.println((vvv+1)+" "+arr.get(vvv));
			}
				
			}
		System.out.println("Books issued successfully!!");
		}

	public void returnBooks() {
		if(krr.size()==0) {
			System.out.println("you cant return any books!");
		}
		else if(krr.size()>0){
			System.out.println("You can return "+krr.size()+" books");
			for(int d=0;d<krr.size();d++) {
				System.out.println((d+1)+" "+krr.get(d));
			}
			System.out.println("How many books do u want to return? ");
			int e=sc.nextInt();
			if(e>h) {
				System.out.println("Sorry u cant return more than the number of books that u have borrowed!!");
				}
			else if(e>0 && e<=h) {
				for(int m=0;m<e;m++) {
					System.out.println("Enter the index number of the book by looking at the list of books u have borrowed : ");
					int p=sc.nextInt();
					sc.nextLine();
					arr.add(krr.remove(p-1));
					for(int yy=0;yy<krr.size();yy++) {
						System.out.println((yy+1)+" "+krr.get(yy));
					}
					
					}
					
				}
		}
				
				else {
					System.out.println("sorry cant return that book");
						
						
							}
			
				
					
				}
		
			
		}
	

public class library {
	public static void main(String[] args) {
		lib lib1=new lib();
		Scanner ho=new Scanner(System.in);
		System.out.println("Do u wanna start?(y/n) ");
		String g=ho.next();
		while(true) {
			if(g.equals("n")) {
				break;
			}
			else if(g.equals("y")) {
				System.out.println("Enter : \n1 to add books\n2 to view books\n3 to issue books\n4 to return books\n5 to exit");
				int z=ho.nextInt();
				if(z==1) {
					lib1.addBook();
					
				}
				else if(z==2) {
					lib1.showBooks();
				}
				else if(z==3) {
					lib1.issueBooks();
				}
				else if(z==4) {
					lib1.returnBooks();
				}
				else if(z==5) {
					System.out.println("Bye");
					break;
				}
				
			}
		}
		
		

}
}

