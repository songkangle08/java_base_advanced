/*
总结：
    1. Java程序编写和执行过程：
        步骤1：编写，将java代码编写在.java结尾的源文件中
        步骤2：编译，针对于.java结尾的源文件进行编译操作，格式：javac 文件名.java
        步骤3：运行，针对于编译后生成的字节码文件，进行解释运行。格式：java 字节码文件名

    2. 针对于步骤1编写过程进行说明：
        class HelloChinese{
            public static void main(String[] args){
                System.out.println("Hello world!");
            }
        }
        其中：
            1. class：关键字。表示“类”，后面跟着类名
            2. main()方法的格式时固定的，务必记住！表示程序的入口
                public static void main(String[] args){}
            3. Java程序严格区分大小写
            4. 从控制台输出数据的操作：
                System.out.println("输出的信息");  ： 输出数据之后，会换行
                System.out.print("输出的信息");    ： 输出数据之后，不会换行
                每一行执行语句必须以;结束 

    3. 针对于步骤2编译的过程：
        1. 如果编译不通过，可以考虑的问题：
            问题1：查看编译的文件名，文件路径是否书写错误
            问题2：查看代码中是否存中语法问题，如果存中，就可能导致编译不通过。
        2. 编译以后，会生成1个或多个字节码文件，每一个字节码文件对应一个Java类，并且字节码文件名与类名相同。

    4. 针对于步骤3运行进行说明：
        1. 我们是针对于字节码文件对应的java类进行解释运行的
        2. 如果运行不通过，可以考虑的问题：
            问题1：查看解释运行的类名，字节码文件路径是否书写错误
            问题2：可能存在运行时异常。

    5. 一个源文件中可以声明多个类，但是最多只能有一个类使用Public进行声明，且要求声明为public的类的类名与源文件名相同。

*/ 

class HelloChinese{
    public static void main(String[] args){
        System.out.println("Hello world!");
    }
}