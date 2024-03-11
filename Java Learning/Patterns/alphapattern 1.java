package Patterns;

class alphapatternone
{
    public static void main(String[] args) 
    {
        int i, j;
        char ch = 65;
        for(i=1;i<=4;i++)
        {
            for(j=1;j<=4;j++)
            {
                System.out.print(ch+"\t");
                ch++;
            }
        System.out.println();
        }
    }
}
