//Write a program to find out the second smallest and second largest element stored in an array of n integers.
#include <stdio.h>
#include <limits.h>
int main(){
    int n;
    printf("Enter the size of array:");
    scanf("%d",&n);
    int sid[n];
    printf("Enter the elements of array:\n");
    for (int i=0; i<n; i++){
        scanf("%d", &sid[i]);
    }
    int smallest = sid[0];
    int scndsmallest = sid[1];
    int largest = sid[0];
    int scndlargest = sid[1];
    for (int i=0; i<n; i++){
        if (sid[i] < smallest){
            scndsmallest = smallest;
            smallest = sid[i];
        }
        else if (sid[i] < scndsmallest && sid[i] != smallest){
            scndsmallest = sid[i];
        }
        if (sid[i] > largest){
            scndlargest = largest;
            largest = sid[i];
        }
        else if (sid[i] > scndlargest && sid[i] != largest){
        	scndlargest = sid[i];
        }
    }
    printf("Second Smallest Number : %d\n", scndsmallest);
    printf("Second Largest Number : %d\n", scndlargest);
    return 0;
}

