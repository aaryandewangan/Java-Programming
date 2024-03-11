package Arrays;
import java.util.*;
 
class DuplicateArray {
    public static void main(String[] args) {
        String arr[] = {"Aaryan", "Deep", "Adarsh", "Saman", "Sameen", "Aaryan"};

        for(int i=0; i<arr.length-1; i++)
        {
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[i].equals(arr[j]) && (i!=j))
                {
                    System.out.println("Duplicate Element: "+arr[j]);
                }
            }
        }
    }
}
