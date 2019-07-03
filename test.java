import java.util.*;
public class test
{
    public static void main(String[]args)
    {
        Scanner s=new Scanner(System.in);
        String a=s.nextLine();
        TreeSet<Character>b=new TreeSet<>();
        char[]c=a.toCharArray();
        for(int i=0;i<c.length;i++)
        b.add(c[i]);
        System.out.println(b.size());
        
    }
}
