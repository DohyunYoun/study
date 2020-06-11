package solved;
import java.util.ArrayDeque;
import java.util.Deque;

//42
public class TrappingRainWater{
    public static void main(String[] args) {
        System.out.println("Default Main Fuction Sample");
    } 
    
    //시간 O(n)
    //공간O(n)
    public int trap(int[] height)
	{
		Deque<Integer> stack = new ArrayDeque<>();
		int result = 0;

		for(int current = 0; current < height.length; current++)
		{
			while(!stack.isEmpty() && height[current] > height[stack.peek()])
			{
				int top = stack.pop();
				
				if(!stack.isEmpty())
				{
					int distance = current - stack.peek() - 1;
					int bounded_height = Math.min(height[current], height[stack.peek()]) - height[top];
					result += distance * bounded_height;
				}
			}	
			stack.push(current);
		}
		return result;
    }
    


    //시간 O(n)
    //공간 O(1)
    public int trap2(int[] height)
	{
        int start = 0, end = height.length - 1;
		int water = 0, minHeight = 0;

		while(start < end)
		{
            while(start < end && height[start] <= minHeight) water += minHeight - height[start++];
            while(start < end && height[end] <= minHeight)   water += minHeight - height[end--];
            minHeight = Math.min(height[start], height[end]);
        }
        return water;
    }
















    // public int trap(int[] height) {
    //     int start =0;
    //     int[] water = null;
    //     int waterLevel = 0;
    //     for (int i = 0 ; i < height.length ; i++){
    //         if(start == 0 && height[i]>0){
    //             start = height[i];
    //             water[waterLevel] = start;
    //             waterLevel++;
    //         }else{
    //             if(start>height[i]){
                    
    //             }

    //         }
            
    //     }
    //     return 0;
    // }

    // public int trap2(int[] A) {
    //     if (A == null || A.length == 0) {
    //         return 0;
    //     }
    
    //     final int N = A.length;
    //     int left = A[0];
    
    //     final int[] rigth = new int[N];
    //     rigth[N - 1] = A[N - 1];
    //     for (int ind = A.length - 2; ind >= 0; ind--) {
    //         rigth[ind] = Math.max(A[ind], rigth[ind + 1]);
    //     }
    
    //     int trap = 0;
    //     for (int ind = 0; ind < A.length; ind++) {
    //         left = Math.max(left, A[ind]);
    //         trap += Math.max(0, Math.min(left, rigth[ind]) - A[ind]);
    //     }
    //     return trap;
    // }


    // public static int trap3(int a[]) {
    //     if (a == null || a.length <= 0)
    //         return 0;
    //     int n = a.length;
    //     int low = 0, high = n - 1, secondMaxHeight = -1, area = 0;//
    //     while (low <= high) {
    //         if (a[low] < a[high]) {
    //             if (a[low] > secondMaxHeight)
    //                 secondMaxHeight = a[low];
    //             area += secondMaxHeight - a[low];
    //             low++;
    
    //         } else {
    //             if (a[high] > secondMaxHeight)
    //                 secondMaxHeight = a[high];
    //             area += secondMaxHeight - a[high];
    //             high--;
    //         }
    //     }
    
    //     return area;
    // }
}
