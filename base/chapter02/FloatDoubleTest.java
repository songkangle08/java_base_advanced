package base.chapter02;

public class FloatDoubleTest {
    public static void main(String[] args){
        // 定义圆周率
        double pi = 3.14;

        // 定义三个园的半径
        double radius1 = 1.2;
        double radius2 = 2.5;
        int radius3 = 3;

        // 计算面积
        double area1 = radius1 * radius1 * pi;
        double area2 = radius2 * radius2 * pi;
        double area3 = radius3 * radius3 * pi;

        System.out.println("园1的半径为"+radius1+",面积为:"+area1);
        System.out.println(area2);
        System.out.println(area3);

    }
}
