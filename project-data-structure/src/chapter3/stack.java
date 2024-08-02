package chapter3;

public class stack {
}

//栈的实现

//分为顺序栈和链式栈
//顺序栈的数据结构

/*#define MaxSize
   typedef struct{
   int data[MaxSize];
   int top;
}SqStack;

//顺序栈的初始化
bool InitStack(SqStack &S){
    S.top=-1;
        };

//顺序栈判空
bool StackEmpty(SqStack S){
    if(S.top==-1)
        return true;
    return false;
        }

//顺序栈入栈
bool Push(SqStack &S;int x){
    if(S.top==MaxSize-1)
        return false;
    S.top++;
    S.data[top]=x;
    return true;
        }
//顺序表出栈
bool pull(SqStack &S;int &x){
    if(S.top==-1)
        return false;
    x=S.data[top];
    top--;
    return true;
        }

//返回栈顶
bool GetTop(SqStack &S,int &x){
    if(S.top==-1)
        return false;
    x=S.data[top];
    return true;
        }


//---链栈的数据结构---
typedef struct LinkNode{
    int data;
    struct LinkNode *next;
        }*LiStack;

//链栈初始化
void initStack(LiStack &S){
    S.next=null;
    S.data=null;
        }

//头插法链栈入栈
void push(LiStack &S;int value){
    LinkNode *x = (LinkNode*)malloc(sizeof(LinkNode));
    if(x==NULL)
        printf('out of memory')
    x->data=value;
    x->next=S;
    S->next=x;
        }*/


/*
//---链式队列---
//结构
#define MaxSize=10;

typedef struct LiNode{
    int data;
    struct LiNode *next;
        }LiNode;

typedef struct LiQueue{
    LiNode *front,*rear=NULL;
        }LiQueue;

//初始化
void initLiQueue(LiQueue &Q){
    Q.front=NULL;
    Q.rear=NULL;
        }

//入队
bool EnLiQueue(LiQueue &Q;int x){
    LiNode *node = (LiNode*)malloc(sizeof(LiNode));     //申请空间
    //初始化新节点
    node.data=x;
    node->next=NULL;
    //新节点入队
    Q->rear->next=node;
    //改队尾指针
    Q->rear=node
        }

//出队
bool DeLiQueue(LiQueue &Q;int &x){
    if(Q.front==Q.rear)
        return false;
    LiNode *temp = Q.front->next;
    x=temp.data;
    Q.front->next=temp->next;
    if(Q.rear==temp)
        Q.rear=Q.front;
    free(temp);
        }*/
