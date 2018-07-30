package offer;
//将一个字符串转换成一个整数
public class StrToInt {
    public boolean flag ;
    public int StrToInt(String str) {
         flag =false;
        //判断输入是否合法
         if(str==null||str.trim().equals("")) {
             flag = true;
             return 0;
         }
         //  // symbol2=0,说明该数为正数;symbol=1，该数为负数;start用来区分第一位是否为符号位
         int symbol =0;
         int start = 0;
         char[] chars = str.toCharArray();
         if(chars[0]=='+') start=1;
         else if (chars[0]=='-') {
             start = 1;
             symbol = 1;
         }
         int result = 0;
         for (int i =start ;i<chars.length;i++){
             if (chars[i]>'9'||chars[i]<'0'){
                 flag =true;
                 return 0;
             }
             int sum = result*10 + (int)(chars[i]-'0');
            //这个flag是为了让调用者明白是否输入异常而设立的一个标志。当然没有flag运行也能通过
            // flag判断是因为输入字符串0返回0 还是错误情况下直接返回0
             //是不是如果sum大于了int能表示数的范围，就代表溢出了，具体怎么判断就用后面那个if？
             //当输入为value=2147483648时，在计算机内部的表示应该是-2147483648
            if((sum-(int) (chars[i] - '0'))/10!=result){
            flag=true;
            return 0;
            }

            result = result*10+ (int)(chars[i]-'0');
         }
        // 注意：java中-1的n次方不能用：(-1)^n .'^'异或运算
        // 注意，当value=-2147483648时，value=-value
        result = (int) Math.pow(-1, symbol) * result;
        return result;
    }
}
