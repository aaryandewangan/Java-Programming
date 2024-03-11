package Arrays;

class LargeSmallSum
{
    public static void main(String[] args) {
        int arr[] = {3, 2, 1, 7, 5, 4};
        
        int max = arr[0];

        for(int i=0; i<arr.length-1; i++)
        {
            if(max<arr[i])
            {
                max = arr[i];
            }
        }
        System.out.println("Largest Number: "+max);

        int min = arr[0];

        for(int i=0; i<arr.length-1; i++)
        {
            if(min>arr[i])
            {
                min = arr[i];
            }
        }
        System.out.println("Smallest Number: "+min);

        System.out.println("Sum of Largest("+max+") and Smallest("+min+") Numbers: "+(max+min));
    }
}