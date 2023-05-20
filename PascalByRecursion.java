public class PascalByRecursion
{
    public static void main(String[] args)
    {
        int maxHeight = 7;
        //so as indexing starts from 0 the max value of i is 6.
        for(int i=0;i<maxHeight;i++)
        {
            for(int j=0;j<=i;j++)
            {
            System.out.print(pattern(i,j)+" "); //it is calling the pattern method
            }

            System.out.println();
        }
    }

    static int pattern(int rownum, int colnum)
    {
        if (colnum==0||colnum==rownum) //if colnum=1or colnum=rownum then it will give 1
            return 1;

        int k = pattern(rownum-1,colnum-1)+pattern(rownum-1,colnum); 
        return k;
    }
}