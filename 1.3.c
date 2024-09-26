#include <stdio.h>

int main() {
    printf("Enter the number of elements: ");
    int n;
    scanf("%d", &n);
    int arr[n];
    int cou[n]; 
    int totalDuplicates = 0; 
    int mostRepeating = 0;
    int maxCount = 0; 
    printf("Enter the elements:\n");
    for (int i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }

    for (int j = 0; j < n; j++) {
       int count = 0;
        for (int k = 0; k < n; k++) {
            if (arr[j] == arr[k]) {
                count++;
            }
        }
        cou[j] = count;

        if (count > 1) {
            totalDuplicates += (count - 1); 
        }
        if (count > maxCount) {
            maxCount = count;
            mostRepeating = arr[j]; 
        }
    }

    // Display the counts for each element
    //printf("Counts of each element:\n");
    //for (int p = 0; p < n; p++) {
        //printf("%d appears %d times\n", arr[p], cou[p]);
    //}

    // Display the results
    printf("Total number of duplicate values = %d\n", totalDuplicates);
    printf("The most repeating element in the array = %d\n", mostRepeating);

    return 0;
}
