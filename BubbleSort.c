#include<stdio.h>
int bubbleSort(int a[],int size)
{
    int flag;
    int temp;
    for(int i=0;i<size-1;i++)   //For number of passes
    {
        flag=0;                 //for avoiding extra comparison
        for(int j=0;j<size-1-i;j++)   //For comparison 
        {
            if(a[j]>a[j+1])
            {
                temp=a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
                flag=1;
            }
        }
        if(flag==0)
        break;
    }
}
int main()
{
    int a[] = {22,11,4,66,8,0,33,48,18};
    int size = sizeof(a) / sizeof(a[0]);
    printf("Original array: ");
    for (int i = 0; i < size; i++) {
        printf("%d ", a[i]);
    }
    printf("\n");

    bubbleSort(a,size);
     printf("Sorted array: ");
    for (int i = 0; i < size; i++) {
        printf("%d ", a[i]);
    }
    printf("\n");
    return 0;

}