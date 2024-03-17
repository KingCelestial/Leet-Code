package Difficulty_Medium;
import java.util.*;
public class Q57_Insert_Interval {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] intervals = {{1,3},{6,9}};
		int[] newInterval = {2,5};
		int n = intervals.length;
		List<int[]> result = new ArrayList<>();
		
//		adding non-overlaping arrays
		int i = 0;
		while(i < n && intervals[i][1] < newInterval[0]) {
			result.add(intervals[i]);
			i++;
		}
		
//		merging overlapping arrays
		while(i<n && newInterval[1] >= intervals[i][0]) {
			newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
			newInterval[1] = Math.min(newInterval[1], intervals[i][1]);
			i++;
		}
		
		result.add(newInterval);
		
		while(i<n) {
			result.add(intervals[i]);
			i++;
		}
		
		
//		return result.toArray(new int[result.size()][]);
	}

}
