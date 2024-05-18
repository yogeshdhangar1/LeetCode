public class WildcardMatching {
//    Given an input string (s) and a pattern (p), implement wildcard pattern matching with support for '?' and '*' where:
//
//            '?' Matches any single character.
//            '*' Matches any sequence of characters (including the empty sequence).
//    The matching should cover the entire input string (not partial).


    public static boolean isMatch(String s, String p) {
        int m = s.length();
        int n = p.length();
        boolean[][] obj = new boolean[m+1][n+1];
        obj[0][0] = true;
        for(int j = 1;j<=n;j++) {
            if (p.charAt(j - 1) == '*') {
                obj[0][j] = obj[0][j - 1];
            }
        }
            for(int i =1;i<=m;i++){
                for (int j = 1; j <= n; j++) {
                    if(p.charAt(j-1) =='*'){
                        obj[i][j]=obj[i][j-1]||obj[i-1][j];
                    }else if(p.charAt(j-1)=='?'|| p.charAt(j-1)==s.charAt(i-1)){
                        obj[i][j]=obj[i-1][j-1];
                    }else{
                        obj[i][j]=false;
                    }
                }

        }
        return obj[m][n];
    }
    public static void main(String[]args){
        String s1 = "aj";
        String p1 = "ajjj";
        System.out.println("input is : s1 \""+s1+"input is: p1\""+p1);
        System.out.println("output is : "+isMatch(s1,p1));
    }
}
