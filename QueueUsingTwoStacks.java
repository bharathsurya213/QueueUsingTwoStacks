import java.io.*;
import java.util.*;

public class QueueUsingTwoStacks {

   static Stack<Integer> s=new Stack<Integer>();
    static void remove()
    {
        if(!s.empty())
            s.remove(0);
    }
    static void printtop()
    {
        if(!s.empty())
            System.out.println(s.firstElement());
    }
    
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        
        for(int i=0;i<n;i++)
        {
            int choice=scan.nextInt();
            switch(choice)
                    {
                case 1:s.push(scan.nextInt());
                        break;
                case 2: remove();
                        break;
                case 3: printtop();
                        break;
                    }
        }
    }
}
