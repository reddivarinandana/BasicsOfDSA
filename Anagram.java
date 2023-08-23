public class Anagram {
    public static void main(String[] args) {
        String str="abcd";
        String str1="cdab";
        int[] temp=new int[200];
        if(str.length()!=str1.length())
        {
            System.out.println("Not An Anagram");
        }
        else
        {
            for(int i=0;i<str.length();i++)
            {
                temp[str.charAt(i)]++;
            }
            for(int i=0;i<str1.length();i++)
            {
                temp[str1.charAt(i)]--;
            }
            for(int i=0;i<temp.length;i++)
            {
                if(temp[i]!=0)
                {
                    System.out.println("Not An Anagram");
                    return;
                }
            }
             System.out.println("Anagram");
        }
    }
}
