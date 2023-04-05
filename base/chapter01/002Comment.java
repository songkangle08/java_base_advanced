/*
这是多行注释。
我们可以声明多行注释的信息！

1. java中的注释种类：
当行注释、多行注释、文档注释（java特有）

2. 单行注释、多行注释的作用：
    1. 对程序中的代码进行解释说明
    2. 对程序进行调试

3. 注意：
    1. 单行注释和多行注释中声明的信息，不参与编译，换句话说，编译以后声明的字节码文件中不包含单行注释和多行注释的信息。
    2. 多行注释不能嵌套使用

4. 文档注释：
    文档注释内容可以被JDK提供的工具javadoc所解析，生成一套以网页文件形式体现的该程序的说明文档
*/ 

/**
这是我的第一个java程序，很开森！
@author skl
@version 1.0 
*/ 
// javadoc -d mydoc -author -version Comment.java   生成文档信息的语句

class Comment {
    /**
     * 这里时main方法
     * @param args
    */ 
    public static void main(String[] args){
        // 这是输出语句
        System.out.println("Hello World");
    }
}


