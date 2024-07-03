//Majority Element In An Array In Java
//The Boyer-Moore Majority Vote Algorithm is a widely used algorithm for finding the majority element in an array. The majority element in an array in Java is an element that appears more than n/2 times, where n is the size of the array.

//Steps to implement the algorithm :
//Step 1 – Find a candidate with the majority –
//Initialize a variable say i ,votes = 0, candidate =-1 
//Traverse through the array using for loop
//If votes = 0, choose the candidate = arr[i] , make votes=1.
//else if the current element is the same as the candidate increment votes
//else decrement votes.

//Step 2 – Check if the candidate has more than N/2 votes –
//
//Initialize a variable count =0 and increment count if it is the same as the candidate.
//If the count is >N/2, return the candidate.
//else return -1.
import java.util.*;

class array_majority_ele
{
    
    public static int findMajoriytElement(int n, int [] arr)
    {
        int candidate = 0;
        int count = 0;
        
        for(int i  = 0; i < n; i++)
        {
            if(count == 0)
            {
                candidate = arr[i];
                count = 1;
            }
            else if(arr[i] == candidate)
            {
                count++;
            }
            else
            {
                count--;
            }
        }
  
        count = 0;
        for(int i =0; i < n; i++)
        {
            if(arr[i] == candidate)
            {
                count++;
            }
        }
     
        if(count >= n/2)
        {
            return candidate;
        }
        else
        {
            return -1;
        }
    }
    
    public static void main(String[] args) {
        //int arr[] = {3, 3, 4, 2, 4, 4, 2, 4, 4,3};
    	int arr[] = { 1, 1, 1, 1, 2, 3, 4 };
        int n = arr.length;
        int majorityElement = findMajoriytElement(n, arr);
        if(majorityElement != -1)
        {
            System.out.print("Majority element is : " + majorityElement);
        }
        else
        {
            System.out.print("No majority element found");
        }
    }
}