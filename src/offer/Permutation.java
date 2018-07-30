package offer;

import java.util.ArrayList;
import java.util.Collections;

//输入一个字符串,按字典序打印出该字符串中字符的所有排列。
// 例如输入字符串abc,则打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。
public class Permutation {
    //错误的写法
    public ArrayList<String> Permutation(String str) {
        if(str==null) return null;
        ArrayList<String> res = new ArrayList<>();
        if(str.length()==0) return res;
        else{
            PermutationCore(str.toCharArray(),0,res);
            Collections.sort(res);
        }
        return  res;
    }

    private void PermutationCore(char[] str, int i, ArrayList<String> res) {
        if(i==str.length-1 && res.contains(String.valueOf(str))){
            res.add(String.valueOf(str));
        }
        else{
            for (int j = i;j<str.length;j++){
                //原来的位置或者不同的位置且值不同??
                if(j==i||str[i]!=str[j]) {
                    swap(str,i,j);
                    PermutationCore(str,i+1,res);
                    swap(str,i,j);
                }
            }
        }
    }

    public void swap(char[] cs,int i,int j){
        char temp = cs[i];
        cs[i] = cs[j];
        cs[j]= temp;
    }
}
