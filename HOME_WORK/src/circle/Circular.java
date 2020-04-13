package circle;
public class Circular {
    private final Circle bottom;
    private final double height;

    public Circular(final Circle c, final double h) {// 带参数初始化
        bottom = c;
        height = h;
    }

    public Circular() {// 不带参数 默认 半径为1，圆心坐标（0，0），高为1从圆柱
        bottom = new Circle();
        height = 1;
    }

    public double getVolume() {// 计算体积
        return bottom.calculateArea() * height / 3.0;
    }

    public double getBottomRadius() {// 获取底面半径
        return bottom.getRaidus();
    }

    public void setBottomRadius(final double r) {// 设置底面半径
        bottom.setRadius(r);
    }

    public static void main(final String[] args) {
        final Circular cone = new Circular();
        System.out.println(cone.getBottomRadius());
        System.out.println(cone.getVolume());
        cone.setBottomRadius(2);
        System.out.println(cone.getBottomRadius());
        System.out.println(cone.getVolume());
        cone.setBottomRadius(-2);
        System.out.println(cone.getBottomRadius());
        System.out.println(cone.getVolume());

    }
}

// class Circle {
//     private double point_x;
//     private double point_y;
//     private double radius;

//     public Circle() {//初始化圆，设定圆心为（0，0），半径为1.
//         point_x = 0;
//         point_y = 0;
//         radius = 1;
//     }

//     public void setRadius(double radius) {//设定半径   半径必须大于0.
//         if (radius <= 0) {
//             System.out.println("The radius " + radius + " is invalid, auto set to 1.");
//             radius = 1;
//         }
//         this.radius = radius;
//     }

//     public void setCenterX(final double point_x) {// 设定圆心横坐标
//         this.point_x = point_x;
//     }

//     public void setCenterY(final double point_y) {// 设定圆心纵坐标
//         this.point_y = point_y;
//     }

//     public double getCenterX() {// 获取圆心横坐标
//         return point_x;
//     }

//     public double getCenterY() {// 获取圆心纵坐标
//         return point_y;
//     }

//     public double getRaidus() {// 获取半径
//         return radius;
//     }

//     public double calculateArea() {// 计算圆的面积
//         final double PI = 3.1415926f;
//         return PI * radius * radius;
//     }

//     public double calculateC() {// 计算圆的周长
//         final double PI = 3.1415926f;
//         return PI * radius * 2;
//     }
// }