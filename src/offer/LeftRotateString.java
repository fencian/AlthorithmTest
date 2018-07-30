package offer;
//对于一个给定的字符序列S，请你把其循环左移K位后的序列输出。
// 例如，字符序列S=”abcXYZdef”,要求输出循环左移3位后的结果，即“XYZdefabc”
public class LeftRotateString {
    public String LeftRotateString(String str,int n) {
      //  if(str.length()==0||str==null||n<0) return null; 不对
        char[] chars = str.toCharArray();
        if (chars.length<n) return "";//字符串返回只能是'' 空的时候!!!
        Reverse(chars,0,n-1);
        Reverse(chars,n,chars.length-1);
        Reverse(chars,0,chars.length-1);
       // return chars.toString();
        String s = new String(chars);
        return s;
    }

    private void Reverse(char[] chars, int low, int high) {
        char temp;
        while (low<high){
        temp = chars[low];
        chars[low] = chars[high];
        chars[high] = temp;
        low++;
        high--;
        }
    }
}
