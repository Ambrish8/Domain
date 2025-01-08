#include<stdio.h>
int main()
{
    int ch = 0,x=10,y=12,z=0;
    while(1)
    {
    printf("\n 1-Add");
    printf("\n 2-Sub");
    printf("\n 3-Mul");
    printf("\n 4-Div");
    printf("\n Enter your choice");
    scanf("%d", &ch);
    switch(ch)
    {
        case 1: z=x+y;printf("\n The Add is : %d",z);break;
        case 2: z=x-y;printf("\n The Sub is : %d",z);break;
        case 3: z=x*y;printf("\n The Mul is : %d",z);break;
        case 4: z=x/y;printf("\n The Div is : %d",z);break;
        default: printf("\n Wrong input");
    }
    }
    return(0);
}