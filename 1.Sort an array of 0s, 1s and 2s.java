
//Expected Time Complexity: O(N)
//Expected Auxiliary Space: O(1)

//Expaination :-

// Input: 
// N = 5
// arr[]= {0 2 1 2 0}
// Output:
// 0 0 1 2 2

//Solution using Java 

class Solution
{
    public static void sort012(int a[], int n)
    {
        // code here 
        int l=0;
        int m=0;
        int h=n-1;
        int temp;
        while(m<=h){
            
            switch(a[m]){
                
                case 0:{
                    temp = a[l];
                    a[l] = a[m];
                    a[m] = temp;
                    l++;
                    m++;
                    break;
                }
                    
                case 1:{
                    
                    m++;
                    break;
                }
                    
                case 2:{
                    temp = a[m];
                    a[m] = a[h];
                    a[h] = temp;
                    
                    h--;
                    
                    break;
                }
            }
        }
        
    }
}
