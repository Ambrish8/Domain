#include<stdio.h>
#include<stdlib.h>
#include<conio.h>

void main()
{
struct node
{
    int data;
    struct node *next;
};
    struct node *head, *newnode, *temp;
    head = NULL;
    int choice = 1;
    while(choice==1)
    {
    newnode=(struct node*)malloc(sizeof(struct node));
    printf("Enter data ");
    scanf("%d",&newnode->data);
    newnode->next=0;
    if(head==0)
    {
        head=temp=newnode;
    }
    else
    {
        temp->next=newnode;
        temp=newnode;
    }
    printf("Do you want to continue(0,1)?\n");
    scanf("%d",&choice);
    }
    temp=head;
    while(temp!=0)
    {
        printf("%d ->",temp->data);
        temp=temp->next;
    }
    printf("NULL \n");
    getch();
}