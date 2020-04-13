package circle;

public class Circle {
    private double point_x;
    private double point_y;
    private double radius;

    public Circle() {//初始化圆，设定圆心为（0，0），半径为1.
        point_x = 0;
        point_y = 0;
        radius = 1;
    }

    public void setRadius(double radius) {//设定半径   半径必须大于0.
        if(radius <= 0)
        {
            System.out.println("The radius " + radius + " is invalid, auto set to 1.");
            radius = 1;
        }
        this.radius = radius;
    }

    public void setCenterX(final double point_x) {// 设定圆心横坐标
        this.point_x = point_x;
    }

    public void setCenterY(final double point_y) {// 设定圆心纵坐标
        this.point_y = point_y;
    }

    public double getCenterX() {// 获取圆心横坐标
        return point_x;
    }

    public double getCenterY() {// 获取圆心纵坐标
        return point_y;
    }

    public double getRaidus() {// 获取半径
        return radius;
    }

    public double calculateArea() {// 计算圆的面积
        final double PI = 3.1415926f;
        return PI * radius * radius;
    }

    public double calculateC() {// 计算圆的周长
        final double PI = 3.1415926f;
        return PI * radius * 2;
    }

    public static void main(final String[] args) {
        final Circle round = new Circle();
        System.out.println(round.getCenterX());
        System.out.println(round.getCenterY());
        System.out.println(round.getRaidus());
        round.setCenterY(1);
        round.setCenterX(1);
        round.setRadius(-3);
        System.out.println(round.getCenterX());
        System.out.println(round.getCenterY());
        System.out.println(round.getRaidus());
        System.out.println(round.calculateArea());
        System.out.println(round.calculateC());
    }
}