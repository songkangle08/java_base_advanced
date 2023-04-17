package base.chapter02;

public class variableTest2 {
    public static void main(String[] args){
        // 1. 字符类型:char(2个字节)

        // 表示形式1: 使用一对''表示,内部有且仅有一个字符
        char c1 = 'a';
        char c2 = '中';
        char c3 = '1';
        char c4 = '%';
        char c5 = '@';

        // 编译不通过
        // char c6 = '';
        // char c7 = 'ab';

        // 表示形式2: 直接使用unicode编码值来表示字符型常量
        char c8 = '\u0036';

        // 表示形式3: 转义字符
        char c9 = '\n';
        char c10 = '\t';

        // 表示形式4:使用具体字符对应的数值(比如ASCII码);
        char c11 = 97;  // ASCII码
        System.out.println(c11); // a

        char c12 = '1';
        char c13 = 1;


        // 布尔类型: boolean;
        // boolean类型只有两个取值,常使用在流程控制语句中,比如:条件判断,循环结构等
        // 我们不谈布尔类型占用的空间大小,但是真正在内存中分配的话,使用的是4个字节
        boolean bo1 = true;
        boolean bo2 = false;
        boolean isMarried = true;
        if(isMarried){
            System.out.println("很遗憾,不能参加单身派对了");
        }else{
            System.out.println("可以多找几个女朋友");
        }

    }
}
