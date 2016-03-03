import java.util.ArrayList;
import java.util.Arrays;

public class subsets {
	
	    public static ArrayList<ArrayList<Integer>> subsets(int[] num) {
	        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
	        if(num == null || num.length == 0) {
	            return result;
	        }
	        ArrayList<Integer> list = new ArrayList<Integer>();
	        Arrays.sort(num);  
	        subsetsHelper(result, list, num, 0);

	        return result;
	    }


	    private static void subsetsHelper(ArrayList<ArrayList<Integer>> result,
	        ArrayList<Integer> list, int[] num, int pos) {

	        result.add(new ArrayList<Integer>(list));

	        for (int i = pos; i < num.length; i++) {

	            list.add(num[i]);
	            subsetsHelper(result, list, num, i + 1);
	            list.remove(list.size() - 1);
	        }
	    }
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int [] num={1,2,3};
      System.out.println(subsets(num));
      
      
	}

}
