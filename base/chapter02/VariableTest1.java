package base.chapter02;

public class VariableTest1 {
    public static void main(String[] args){
        // 1.测试整形变量的使用
        // byte(-128-127 -- 1个字节) short(-2^15~2^15-1 --  2个字节) int(-2^31~2^31-1 -- 4个字节) long(-2^63~2^63 -- 8个字节 )
        // 1byte(1字节) = 8bit 
        
        // 声明long类型变量时,需要提供后缀,后缀为"L"或"l"
        long l1 = 1212222L;
        System.out.println(l1);

        // 开发中,大家定义整形型变量时,没有特殊情况的话,通常都声明为int类型
        

        // 2. 浮点类型： float、double
        // float  4字节
        // double 8字节
        double d1 = 12.3;
        // 声明float类型变量时，需要提供后缀。后缀为”f“或"F";
        float f1 = 12.3F;

        // 开发中,大家定义浮点型变量时,没有特殊情况的话,通常都声明为double类型，因为精度更高。
        // float类型表数范围要大于long类型的表数范围，但是精度不高。

        // 测试浮点型变量的精度
        // 通过测试，浮点型的精度不高，如果在开发中，需要极高的精度，需要使用BigDecimal类替换浮点型变量。
        System.out.println(0.1+0.2);

        
    }
}
