package second;

public class MinMaxObj {
	public static void main(String[] args) {
		int[] input={56,34,7,3,54,3,34,34,53};
        Client clientobj= new Client(Integer.MAX_VALUE,Integer.MIN_VALUE);
        Client unb=clientobj.min_max(input);

	}

}


