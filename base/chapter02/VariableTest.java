/*
    变量的概念：
        1. 变量的理解：内存中的一个存储区域，该区域的数据可以在同一类型范围内不断变化
        2. 变量的构成包含三要素：数据类型，变量名，存储的值
        3. java中变量声明的格式：数据类型 变量名 = 变量值 
        4. java中的变量按照数据类型来分类：
            基本数据类型(8种)：
                整形：byte、short、int、long
                浮点型：float、double
                字符型：char
                布尔型：boolean
            引用数据类型：
                类（class）
                数组（array）
                接口（interface）
                枚举（enum）
                注解（annotation）
                记录（record）
        5. 定义变量时，变量名要遵循标识符命名的规则和规范
        6. 说明：
            变量都有其作用域，变量只在作用域内有限的，出了作用域就失效了
            在同一个作用域内不能声明两个相同的变量名
            定义好变量以后，就可以通过变量名使用了。
            变量值在赋值时必须满足变量的数据类型，并且在数据类型有效的变化
*/ 

public class VariableTest {
    public static void main(String[] args){

        // 定义变量
        int myAge = 27;

        char gender; // 变量的声明
        gender = '女'; // 变量的赋值

        // 由于number前没有声明类型，即当前number变量没有提前定义，所有编译不通过
        // number = 10;


        byte b1 = 127;
        // b1超出了byte的范围
        // b1 = 128;
        System.out.println(myAge);
        System.out.println(gender);
        System.out.println(b1);
    }
}
