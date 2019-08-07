import java.util.*;
class SeptToDecnum
{
    public static void main(String s[])
    {  
        System.out.println("Enter a septendecimal value:");
        Scanner sc=new Scanner(System.in);

        String sept_num = sc.next();
        int val=0,j=0;
        int num_len = sept_num.length();
        String str2="0123456789ABCDEF";

        for(int i=num_len-1;i>=0;i--)
        {
            char ch = sept_num.charAt(i);
            int ind=str2.indexOf(ch);
            val = ind*(int)Math.pow(17,j)+val;
            j++;
        }
        System.out.println("Decimal value of SeptenDecimal num " +val);
    }
}
