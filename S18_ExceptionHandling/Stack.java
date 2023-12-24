class StackUnderFlowException extends Exception
{
    public String toString(){
        return "StackUnderFlowException: Stack is empty";
    }
}
class StackOverFlowException extends Exception
{
    public String toString(){
        return "StackOverFlowException: Stack is full";
    }
}

class Stack{
    static int size = 5, top = -1;
    static int stack[] = new int[size];

    static void push(int i) throws StackOverFlowException{
        if(top == size-1)
            throw new StackOverFlowException();
        else
            stack[++top] = i;
    }

    static int pop() throws StackUnderFlowException{
        if(top == -1)
            throw new StackUnderFlowException();
        else
            return stack[top--];
    }

    public static void main(String[] args){
        try{
            push(1);
            push(1);
            push(1);
            push(1);
            push(1);
            push(1);
            pop();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}