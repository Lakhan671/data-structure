package interviewquestion;

public class SumDemo {
    public static void main(String[] args) {
        int[] a=  new int[]{3, 7, 11, 3};
        int  target=6;
        for(int as: new SumDemo().twoSum(a,target)){
            System.out.println(as);
        };
    }
    public  int[] twoSum(int[] nums, int target) {

        for(int i=0;i<nums.length;i++){
            int n=calculate(nums,i,target-nums[i]);
          if(n>-1){
              return new int[]{i,n};
          }
        }
        return new int[]{};
    }
    public static int calculate(int [] nums, int index,int n){
        for(int i=0;i<nums.length;i++){
            if(n==nums[i] && index!=i){
                return i;
            }
        }
      return -1;
    }
}
