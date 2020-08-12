import java.util.Scanner;

public class SecretOperation extends Secret {

    private static String[] encrypt() {
        SecretOperation sec = new SecretOperation();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String[] S = new String[n];
        int[] L = new int[n];
        for(int i=0;i<n;i++){
            S[i]=s.next();
        }
        for(int i=0;i<n;i++){
            L[i]=s.nextInt();
        }
        String[] ans = new String[n];
        for(int i=0;i<n;i++){
            switch (L[i]){
                case 0:
                    ans[i]=sec.Asia(S[i]);
                    break;
                case 1:
                    ans[i]=sec.US(S[i]);
                    break;
                case 2:
                    ans[i]=sec.Dubai(S[i]);
                    break;
                default:
                    ans[i]="Invalid locale";
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String[] encrypted=encrypt();
        for(String s : encrypted){
            System.out.println(s);
        }
    }

}

class Secret{
    protected String Asia(String msge){
        String ans="";
        for(int i=0;i<msge.length();i++){
            if(msge.charAt(i)>=65 && msge.charAt(i)<=91 || msge.charAt(i)>=97 && msge.charAt(i)<=122){
                ans+=(char)(msge.charAt(i)+2);
            }
            else{
                return "Invalid message";
            }
        }
        return ans;
    }
    protected String US(String msge){
        String ans="";
        for(int i=0;i<msge.length();i++){
            ans+=((int)msge.charAt(i))+".";
        }
        return ans.substring(0,ans.length()-1);
    }
    protected String Dubai(String msge){
        StringBuilder str = new StringBuilder(msge);
        return str.reverse().toString();
    }

}
