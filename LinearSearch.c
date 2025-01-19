#include <stdio.h>

 int linearSearch (int arr[], int n, int target)
{
for (int i = 0; i < n; i++)
    {
        if (arr[i] == target)
	{
return i;
}
}
return -1;
}
int main ()
{
int staticArray[] = { 12, 34, 45, 67, 89, 23, 56, 78 };
  
int n = sizeof (staticArray) / sizeof (staticArray[0]);	
  
int elementToSearch = 34;
  
 
int index = linearSearch (staticArray, n, elementToSearch);
  
 
if (index != -1)
    {
      
printf ("Element %d found at index %d.\n", elementToSearch, index);
    
}
  else
    {
      
printf ("Element %d not found in the array.\n", elementToSearch);
    
}
  
 
return 0;

}