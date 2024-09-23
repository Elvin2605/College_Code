#include<stdio.h>
#define size 10
int front,rear=-1 ;
struct PQueue
{
    int p,e;
}pq[size];
void enqueue(int item,int priority)
{
    if (front==0 && rear==0)
    {
        printf("Overflow !");
    }
    else if (rear == -1 && front == -1)
    {
        front = 0 ;
        rear = 0;
        pq[rear].e = item ;
        pq[rear].p = priority ;
    }
    else if (rear == size-1)
    {
        int i ;
        for (i=front ; i<= rear; i++)
        {
            pq[i-1]=pq[i];
        }
        front-- ;
        rear--;
        for (i=rear ; i>= front; i--)
        {
            if(pq[i].p <= priority)
                break ;
        }
        int loc = i+1 ;
        for (i=rear ; i> loc ; i--)
        {
            pq[i+1]=pq[i];
        }
        pq[loc].e = item ;
        pq[loc].p = priority ;
        rear++ ;
    }
    else
    {
        int i;
        for(i = rear ; i>=front ; i--)
        {
            if(pq[i].p <= priority)
                break;
        }
        int loc = i+1 ;
        for (i=rear ; i>=loc ; i--)
        {
            pq[i+1]=pq[i];
        }
        pq[loc].e = item ;
        pq[loc].p = priority ;
        rear++ ;
    }
}

void dequeue()
{
    if(rear == -1 && front == -1)
        printf("Underflow !");
    else if (front == 0 && rear == 0)
    {
        front = -1;
        rear = -1 ;
    }
    else
    {
        front++ ;
    }
}

void display()
{
    if(front==-1 || rear==-1)
    {
        printf("Empty");
    }
    else
    {
        for(int i= front; i<=rear; i++)
        {
            printf("%d (%d)\t",pq[i].p);
        }
    }
}

void main()
{
    int opt,e,pr;
    do
    {
        printf("1.Enqueue\n");
        printf("2.Dequeue\n");
        printf("3.display\n");
        printf("4.Exit\n");
        printf("Enter option\n");
        scanf("%d",&opt);
        switch(opt)
        {
            case 1:
                printf("Enter element: ");
                scanf("%d",&e);
                printf("Enter Priority: ");
                scanf("%d",&pr);
                enqueue(e,pr);
                break;
            case 2:
                dequeue();
                break;
            case 3:
                display();
                break;
            case 4:
                break;
            default :
                printf("Something went wrong !");
                break;
        }
    }while(opt != 4 );
}

