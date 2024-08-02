/*
package chapter3;

public class queue {
}


#define MaxSize=10

//顺序存储队列结构
typedef struct queue{
    int data[MaxSize];
    int front,rear;
        }SqQueue

//顺序队列初始化
void InitSqQueue(SqQueue &Q){
    Q.front = 0;
    Q.rear = 0;
        }

//判空
bool testQueue(SqQueue &Q){
    if(Q.rear==Q.front)
        return true;
    else
        return false;
        }

//入队1.0,存在队首前有空位不能利用的弊端
bool EnQueue(SqQueue &Q;int x){
    if(Q.rear==MaxSize)
        return false;
    Q.data[rear]=x;
    Q.rear++;
        }

//入队2.0，循环队列,rear取模，变成循环队列，利用上队首空位
bool EnQueue(SqQueue &Q;int x){
    if((Q.rear+1)%MaxSize==Q.front))    //牺牲一格，不让f和r重合，保证判空函数可用
        return false;
    Q.data[rear]=x;
    Q.rear=(Q.rear+1)%MaxSize;  //取模操作,使得队头空位可用
    return true;
        }

//出队
bool Dequeue(SqQueue &S;int x){
    if(S.front==S.rear)     //判空
        return false;
    x=S.data[front];
    S.front=(S.front+1)%MaxSize;    //front后移
    return true;
        }

//查询：查头
bool Dequeue(SqQueue &S;int x){
    if(S.front==S.rear)     //判空
        return false;
    x=S.data[front];
//    S.front=(S.front+1)%MaxSize;    //移除后移就行
    return true;
    }
*/
