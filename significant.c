//Ambrish Kalia
//2230143
#include <stdio.h>
#include <stdlib.h>
void BubbleSort(int a[], int n) {
for (int i = 0; i < n - 1; i++) {
for (int j = 0; j < n - i - 1; j++) {
if (a[j] < a[j + 1]) {
 int temp = a[j + 1];
a[j + 1] = a[j];
 a[j] = temp;
  }
   }
 }
printf("Sorted array is:");
for (int i = 0; i < n; i++) {
printf(" %d ", a[i]);
}
}
int main() {
int * p, n;
printf("Ambrish Kalia\n");
 printf("enter the size of the array");
p = (int * ) malloc(n * sizeof(int));
scanf("%d", & n);
for (int i = 0; i <= n - 1; i++) {
printf("%d element of the array", i + 1);
scanf("%d", & p[i]);
}
 BubbleSort(p, n);
printf("\nLargest element : %d\n", * p);
printf("Smallest element : %d \n", p[n - 1]);
return 0;
}