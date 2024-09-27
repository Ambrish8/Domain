#include <stdio.h>
void EXCHANGE(int *p, int *q) {
    int temp = *p;
    *p = *q;
    *q = temp;
}
void ROTATE_RIGHT(int *p1, int p2) {
    if (p2 <= 1) {
        return;
    }
    int lastElement = p1[p2 - 1];
    for (int i = p2 - 1; i > 0; i--) {
        EXCHANGE(&p1[i], &p1[i - 1]);
    }

    
    p1[0] = lastElement;
}
void printArray(int *arr, int size) {
    for (int i = 0; i < size; i++) {
        printf("%d ", arr[i]);
    }
    printf("\n");
}
int main() {
    int n, p2;
    printf("Enter the number of elements in the array: ");
    scanf("%d", &n);

    int arr[n];
    printf("Enter %d elements of the array:\n", n);
    for (int i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }
    printf("Enter the number of elements to rotate: ");
    scanf("%d", &p2);
    if (p2 > n || p2 < 1) {
        printf("Invalid number of elements to rotate.\n");
        return 1;
    }
    printf("Original array: ");
    printArray(arr, n);
    ROTATE_RIGHT(arr, p2);
    printf("Array after rotating the first %d elements to the right: ", p2);
    printArray(arr, n);
    return 0;
}