
package stack;

public class Stack {
private int[] elements;
private int top;
private int son;
private int max;
private int bas;
int kontrol=0;
Stack(int size)
{
elements = new int[size];
top = 0;
max = size;
son= max;
bas=0;

}
public void push(int element)
{
elements[top] = element;
top++;
}

public int pop()
{
top--;
return elements[top];
}

public int peek()
{
return elements[top];
}

public boolean isEmpty()
{
if(top > 0) return true;
else return false;
}

public boolean isFull()
{
if(top == max) return true;
else return false;
}

public int size()
{
return top;
}

public void list()
{
for(int i = max - 1; i >= 0; i--) { if(elements[i] != 0)System.out.print(elements[i] + " ");}
}
public void ondenekle(int ilk)
{
    if (bas<son) {
        
    
    elements[bas]=ilk;
    bas++;
    }
    else {
        System.out.println("Stack dolu");
        kontrol++;
    } 
}

public void sondanekle(int sondan)
{
    if (son>bas) {
        
  
    elements[son-1]=sondan;
    son--;
    
    }
    else {
        System.out.println("Stack dolu");
        kontrol++;
    }
}
}
