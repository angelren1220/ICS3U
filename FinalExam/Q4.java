 public class Q4 {

		public static void main(String[] args) {
			int [] nums = { 10, 20, 30, 40, 50};
			int pq = calc(nums);
			System.out.println(pq);
		}
	
		public static int calc(int [] num) {
			int result=0;
			for(int i=0; i<num.length; i++) {
				if(i%2==0)
				  result = result+num[i];
			}
		
			return result;
		}

}

