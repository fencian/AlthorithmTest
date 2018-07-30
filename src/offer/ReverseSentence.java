package offer;
//“I am a student.” 翻转 “student. a am I”
public class ReverseSentence {
    public String ReverseSentence(String str) {
        if(str==null||str.trim().equals("")){//为空
            return str;
        }
        String[] a =str.split(" ");
        StringBuffer o = new StringBuffer();
        int i ;
        for (i=a.length;i>0;i--){//只有一个字符 str.length();
            o.append(a[i-1]);
            if (i>1) o.append(" ");
        }
        return o.toString();
    }
}
