import java.util.Scanner;

class Stack{


    int n ;
    int [] a;
    int top = -1;

    Stack(int n){
     this.n = n;
     a = new int[n];
    }
   

    void push(int i){
       if(top >= n-1){
        System.err.println("Overflow");

       }else{
        top++;
        a[top] = i;

        System.out.println(a[top] + " pushed");
       }
    } 

    void pop(){
        if(top == -1){
            System.out.println("Underflow");

        }else{
            System.out.println(a[top] + " popped");
            top--;
            
            
        }
    }

    void Display(){
        for(int i = 0 ; i <= top ; i++){
            System.out.print(a[i]+" ");
        }
    }


    void peek(){
        System.out.println( "Top element "+ a[top]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("Please enter the size of stack");
        n = sc.nextInt();

        Stack s = new Stack(n);

        s.push(1);
        s.push(2);
        s.push(5);

        s.pop();

        s.peek();

        

        s.Display();

       


        
    }

}