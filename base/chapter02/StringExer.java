package base.chapter02;

/*
    要求填写自己的姓名，年龄，性别，体重，婚姻状况（已婚true表示，单身false表示），联系方式
*/ 

public class StringExer {
    public static void main(String[] args){
        System.out.println("Hello World");

        String name = "skl";
        int age = 28;
        char gender = '男';
        double weight = 140.5;
        boolean isMarried = true;
        String phone = "13111111111";

        System.out.println("name = " + name + ",age = " + age + ",gender = " + gender + ",weight = " + weight + ",isMarried = " + isMarried + ",phone = " + phone);
        
        // 练习
        System.out.println("*     *");      // "*     *"
        System.out.println("*\t*");         // "*   *"
        System.out.println("*" + "\t" + "*"); // "* *"
        System.out.println('*' + "\t" + "*"); // "* *"
        System.out.println('*' + '\t' + "*"); // 51*
        System.out.println("*" + '\t' + '*'); // "*   *"
        System.out.println('*' + '\t' + '*'); // 93
    }
}
