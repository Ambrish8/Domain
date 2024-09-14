#include<stdio.h>
int main()
{
    int a[3][3] = {1,2,3,4,5,6,7,8,9};
    int *p;
    p=&a[0][0];
    printf("%d \n",a);  // or printf("%d",p); &a[0][0] , &a , *a , a[0]
    printf("%d \n",a+1);   // or &a[1] , a[1] , *(a+1)
    printf("%d \n",*(a+1)+2);
    printf("%d \n",*(*(a+1)+2));
    printf("%d \n",*(*a+1));
    printf("%d \n",**a);
    printf("%d \n",a[1]+1);
    printf("%d \n",&a[1]+1);
}