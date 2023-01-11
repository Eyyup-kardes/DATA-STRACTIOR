
public class Main {

    public static void main(String [] args)
    {
    stack yigin = new stack(11);
    yigin.push(47);
    yigin.push(9);
    yigin.push(16);
    yigin.push(6);
    yigin.push(7);
    
    System.out.println("boyut : "+ yigin.pop());
    yigin.push(2);
    System.out.println("pop : "+ yigin.pop());
    System.out.println("pop : "+ yigin.pop());
    System.out.println("pop : "+ yigin.pop());
    
    yigin.push(57);
    System.out.println("peek : "+ yigin.peek());
    yigin.list();
    }
    
    }