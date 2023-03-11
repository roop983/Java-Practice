package Test_Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMap_Sort_the_People {

	public static void main(String[] args) {
		
		String[] names = { "Mary","John","Emma"};
		
		int[] heights = {180,165,170};
		
		Map<Integer, String> map = new HashMap<>();
		
		if(names.length != heights.length) {
			
			System.out.println("People cannot be sorted");
		}
		else {
			
			for(int i=0;i<heights.length;i++) {
				
				map.put(heights[i], names[i]);
			}
		
		
			List<Integer> list = new ArrayList(map.keySet());
			Collections.sort(list, Collections.reverseOrder());
			
			for(int i =0;i<list.size();i++) {
				names[i] = map.get(list.get(i));
			}
			for(int i =0;i<names.length;i++) {
				System.out.println(names[i]);
			}
			
		
			
//			int i = Collections.max(map.keySet());
//			
//			System.out.println(map.get(i));
		}
	}

}
