package base.chapter02;

/*
    测试基本数据类型变量间的运算规则--强制类型转换
    规则：
    1. 如果需要将容量大的变量的类型转换为容量小的变量类型，需要使用强制类型转换
    2. 强制类型转换需要使用强转符：（）。在（）内指明要转换的数据类型。
    3. 强制类型转换可能会导致精度损失的问题
*/ 

public class variableTest4 {
    public static void main(String[] args){
        
        double d1 = 12; // 自动类型提升
        
        // 编译失败
        // int i1 = d1;

        int i2 = (int)d1;
        System.out.println(i2);


        long l1 = 123;
        // short s1 = l1;  // 编译失败
        short s2 = (short)l1;
        System.out.println(s2);

        // 练习
        int i3 = 12;
        float f1 = i3;  // 自动类型提升
        System.out.println(f1);  // 12.0

        float f2 = (float)i3; // 编译也可以通过，只不过可以省略（）



        // 精度损失的问题
        double d2 = 12.9;
        int i4 = (int)d2;
        System.out.println(i4); // 13

        int i5 = 128;
        byte b1 = (byte)i5;
        System.out.println(i5); // -128

        // 实际开发的举例
        byte b2 = 12;
        method(b2);

        long l2 = 12L;
        method((int)l2);
    }


    public static void method(int num){

    }
}
