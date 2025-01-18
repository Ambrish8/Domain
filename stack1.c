#include<stdio.h>
#include<stdlib.h>
#include<conio.h>
int Stack[5];
int top=-1;
void push();
void pop();
void peek();
void display();
void push()
{
    int x;
    printf("Enter data ");
    scanf("%d",&x);
    if(top==4)
    {
        printf("Overflow \n");
    }
    else
    {
        top++;
        Stack[top]=x;
    }
}
void pop()
{
    int item;
    if(top==-1)
    {
        printf("Underflow");
    }
    else
    {
        item=Stack[top];
        top--;
    }
    printf("The popped item is: %d\n",item);
}
void peek()
{
    if(top==-1)
    {
        printf("Stack is empty\n");
    }
    else
    {
        printf("The first element is: %d\n",Stack[top]);
    }
}
void display()
{
    int i;
    printf("The elements are:");
    for(i=top;i>=0;i--)
    {
        printf("%d ",Stack[i]);
    }
}
void main()
{
    int ch;
    do
    {
        printf("Enter choice 1:push 2:pop 3:peek 4:display ");
        scanf("%d",&ch);
        switch(ch)
        {
            case 1:
            push();
            break;
            
            case 2:
            pop();
            break;
            
            case 3:
            peek();
            break;
            
            case 4:
            display();
            break;
            
            default:
            printf("Invalid choice");
        }
    }
    while(ch!=0);
    getch();
}