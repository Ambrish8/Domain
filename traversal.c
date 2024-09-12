#include <stdio.h>

#define MAX_SIZE 100

int main() {
    int arr[100];
    int i, size;

    // Input the size of the array
    printf("Enter the size of the array: ");
    scanf("%d", &size);

    // Input elements of the array
    printf("Enter %d elements:\n", size);
    for (i = 0; i < size; i++) {
        printf("Element %d: ", i+1);
        scanf("%d", &arr[i]);
    }

    // Print the array elements
    printf("\nArray elements are:\n");
    for (i = 0; i < size; i++) {
        printf("%d ", arr[i]);
    }

    // Traverse the array
    printf("\nTraversing the array:\n");
    for (i = 0; i < size; i++) {
        printf("Element %d: %d\n", i+1, arr[i]);
    }

    return 0;
}
