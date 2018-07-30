package offer;
//实现一个函数用来找出字符流中第一个只出现一次的字符
public class FirstAppearingOnce {
    //一个字符占8位，因此不会超过256个，可以申请一个256大小的数组来实现一个简易的哈希表。时间复杂度为O(n)，空间复杂度O(n).
    //Insert one char from stringstream
    int[] hashtable = new int[256];
    StringBuffer s = new StringBuffer();
    public void Insert(char ch)
    {
        s.append(ch);
        if(hashtable[ch]==0) hashtable[ch] =1;
        else hashtable[ch] +=1;
    }
    //return the first appearence once char in current stringstream
    public char FirstAppearingOnce()
    {
        char[] chars = s.toString().toCharArray();
        for (char c:chars){
            if (hashtable[c]==1) return c;
        }
        return '#';
    }
}
