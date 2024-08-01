package newprgms;

public class MissingNum {
	//method for finding num
	public  int MissNumber(int n, int[] arr)
    {
        int sum = 0;
        
        // Calculate the sum of array elements
        for (int i = 0; i < n - 1; i++) {
            sum += arr[i];
        }
        int sumOfNnumbers = (n * (n + 1)) / 2;

        //missing number
        return sumOfNnumbers - sum;
    }

    public static void main(String[] args)
    {
    	MissingNum m=new MissingNum();
        int[] arr = { 1, 2, 3, 5, 4, 7};
        int n = 7;
       int  result= m.MissNumber(n, arr);
        System.out.println("missing number is "+result);
    }

}
