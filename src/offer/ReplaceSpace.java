package offer;
//请实现一个函数，将一个字符串中的空格替换成“%20”。例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
public class ReplaceSpace {
    public String replaceSpace(StringBuffer str) {
        if (str == null||str.length()==0) return null;//"" null not same!
        int count = 0 ;
        int i=0;
        int p1 = str.length()-1;
        //计算空格count
        while(i<str.length()){//no -1
            if(str.charAt(i)==' '){
                count++;
                i++;
            }
            else i++;
        }
        str.setLength(str.length()+2*count);

       int p2 = str.length()-1;
       while(p1!=p2){
            if(str.charAt(p1)==' '){
                str.replace(p2 - 2, p2 + 1,"%20");
                p2 = p2 - 3;
                p1 = p1 - 1;
            }
            else{
                str.setCharAt(p2,str.charAt(p1));
                p2--;
                p1--;
            }
        }
        System.out.println(str);
        return String.valueOf(str);

    }

    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("We Are Happy ");
        ReplaceSpace r = new ReplaceSpace();
        r.replaceSpace(s);
    }
}
