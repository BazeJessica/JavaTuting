package tutorialpoint;

public class Work {
    public static void main(String[] args) {
        // int n = 10;
        // int count;
        // for (int i = 1; i <= n; i++) {
        // count = 0;
        // for (int j = 1; j <= i; j++) {
        // if (i % j == 0) {
        // count = count + 1;
        // }
        // }
        // if (count == 2) {
        // System.out.print(i + " ");
        // }
        // }

        int num = 1234;
        int reverse = 0;
        int remainder = 0;
        while (num != 0) {
            remainder = num % 10;
            reverse = reverse * 10 + remainder;
            num /= 10;
        }

        System.out.println(reverse);

        System.out.println(myPow(3, 5));
    }

   public static 
   double myPow(double x, int n) {
       if(n == 0){
           return 1;
       }
        if (n < 0){
           x = 1/x;
           n = -n;
           
           }
       

       if(n%2==1){
           return x * myPow(x*x,n/2);
       }
       return myPow(x*x,n/2);
   }

   public static
    int searchInsert(vector<int>& nums, int target) {
        int initial = 0,finall = nums.size(),mid;
        if(target > finall - 1){
            return finall;
        }
        while(initial <= finall){
            mid = (initial+finall)/2;
            if(nums[mid] == target){
                return mid;
            }

            if(target < nums[mid]){
            finall = mid-1;
        }else{
            low = mid +1;
        }
    
        }
        return low;
    
     }
