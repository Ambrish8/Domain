//Implement Quick Sort Algorithm
#include<stdio.h>
void swap(int *a,int *b){
    int temp=*a;
    *a=*b;
    *b=temp;
}
int Partition(int arr[],int p,int r){
    int x=arr[r];
    int i=p-1;
    for(int j=p;j<r;j++){
        if(arr[j]<=x){
            i=i+1;
            swap(&arr[i],&arr[j]);
        }
    }
    swap(&arr[i+1],&arr[r]);
    return i+1;
}
void QuickSort(int arr[],int p,int r){
    //int q=arr[r];
    if(p<r){
        int pi=Partition(arr,p,r);
        QuickSort(arr,p,pi-1);
        QuickSort(arr,pi+1,r);
    }
}
int main(){
    int n;
    printf("Enter the size of array:");
    scanf("%d",&n);
    int arr[n];
    printf("Enter the elements of array:");
    for(int i = 0;i<n; i++){
        scanf("%d",&arr[i]);
    }
    QuickSort(arr,0,n-1);
    for(int i=0;i<n;i++){
        printf("%d ",arr[i]);
    }
    printf("\n");
    return 0;
}