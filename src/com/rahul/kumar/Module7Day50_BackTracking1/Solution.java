public class Solution {

    ArrayList <String> res= new ArrayList <String> ();

    void solve (String str, int open, int close, int N)
    {
        if (open < N)
        {
            StringBuilder sb1=new StringBuilder();
            sb1.append(str);
            sb1.append("(");
            String temp1=sb1.toString();
            solve (temp1, open+1, close, N);
        }

        if (close < open)
        {
            StringBuilder sb2=new StringBuilder();
            sb2.append(str);
            sb2.append(")");
            String temp2=sb2.toString();
            solve (temp2, open, close+1, N);
        }

        if (open==N && close==N)
        {
            res.add(str);
            return;
        }
    }
    public ArrayList<String> generateParenthesis(int A) {

        String str= new String();

        solve (str,0,0,A);

        return res;

    }
}