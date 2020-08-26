import java.util.*;
public class Solution1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int t = sc.nextInt();
		for(int z = 0 ; z < t ; z++)
		{
			System.out.print("Case #" + (z+1) + ": ");
			int n= sc.nextInt();
			Map<Long , Long> map = new HashMap<Long ,Long>(); 
			long a = sc.nextLong();
			long ans = 1;
			long prev = 0 ;
			for(int i = 0 ; i < n-1 ; i++ )
			{
				long b = sc.nextLong();
				long temp = b-a ;
				if(temp != prev )
				{
					map.clear();
					prev = temp;
				}
				if(map.containsKey(temp))
				{
					long val = map.get(temp)+1 ;
					ans = Math.max(val, ans);
					map.put(temp, val);
				}
				else
				{
					map.put(temp, (long)1 );
				}
				a = b;
			}
			System.out.println((ans+1));
		}
		
		sc.close();
	}

}


/*

4
7
10 7 4 6 8 10 11
4
9 7 5 3
9
5 5 4 5 5 5 4 5 6
10
5 4 3 2 1 2 3 4 5 6


*/
