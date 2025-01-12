/*1. take two variable ptr and "temp" and store the head in both
2. make ptr = temp if "temp-next"is not null
3. update temp as temp-next
4. repeat "2" and "3"
5. ptr-next=null and free*/

void delete_end(){
    struct node *ptr, *temp;
    ptr = head;temp = head;
    while(temp->next!=NULL){
        ptr = temp;
        temp = temp->next;
    }
    ptr->next = NULL;
    free(temp);
}