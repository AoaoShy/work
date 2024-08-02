package chapter2;


public class StaticSqList {
    private int[] data;
    private int length;
    private int MaxSize;

    //初始化
    private StaticSqList(int initSize){
        this.data = new int[initSize];
        this.length = 0;
        this.MaxSize = initSize;
    }
}

/*c++实现
* 定义MaxSize
* #define MaxSize
* struct StasticSqList{
*   int data[MaxSize];
*   int Length;
* }
* */

/*
* 单链表的结构定义
* typedef struct LNode{
*   int data;
*   struct LNode * next;
* }LNode,*LinkList;
* */

/*
* 有头节点的单链表的初始化
* void InitLinkList(LinkList &L){
*   L=(LNode*)malloc(sizeof(LNode));
*   L->next=null;
*   return true;
* }
* */

/*链表的插入函数
* void InsertNode(LinkList &L;int i;int e){
*   if(i<1)
*       return 0;
*   LNode *p;   //p指向当前扫描到的节点
*   p=L;    //把p放到头上
*   while(p！=null && int j=0;j<i-1)    //要插入到第i个位置，就要找到第i-1个节点，j=p所在位置
*       p=p->next;
*       j++;
*   LNode *s = (LNode*)malloc(sizeof(LNode));   //为新节点s创建空间
*   s->data=e;
*   s->next=p->next;  //新节点s的next指向后面的节点
*   p->next=s;   //更新p节点的next为新增节点的地址
*   return 1;
* }
* */

/*
* 无头节点专属操作：判断插入位置是否为1
* if(i==1)
*   LNode *s = (LNode)malloc(sizeof(LNode));
*   s->data = e;
*   s->next = L;
*   L = s;
* */