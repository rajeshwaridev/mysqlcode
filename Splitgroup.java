import java.util.*;

public class Splitgroup{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Total Number of students: ");
		int n = sc.nextInt();
		int start = 101;
		int group = 4;
		rollNumber (n, start, group);
		sc.close();
	}
	public static void rollNumber(int n, int start, int group){
		// Creating a nested list!
		ArrayList<Integer>[] arr = new ArrayList[group];
        	for (int i = 0; i < group; i++) {
            		arr[i] = new ArrayList<>();
        	}

		while(n != 0){
			int splitGroup = (start-101) % group;
			arr[splitGroup].add(start);
			start++;
			n--;
		}

		for(int i=0 ; i<group;i++ ){
			System.out.println("Group: "+(i+1));
			for(int j: arr[i]){
				System.out.println(j);
			}
			System.out.println();
		}

	}
}