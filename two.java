public class two {
    public static void main(String[] args) {
        String s=" ";
        boolean check=true;
        s=s.toLowerCase();
        int i=0;
        int j=s.length()-1;
        while (i<j) {
            while(!(s.charAt(i)>='a' && s.charAt(i)<='z')){
                i++;
            }
            while(!(s.charAt(j)>='a' && s.charAt(j)<='z')){
                j--;
            }
            if(i>j|| j<i){
                check=false;
                break;
            }
            if(s.charAt(i)!=s.charAt(j)){
                check=false;
                break;
            }
            i++;
            j--;
        }
        System.out.println(check);
    }
}
