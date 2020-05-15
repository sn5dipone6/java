package cn.campsg.java.experiment;

public class Student {
    public enum Sex {
        MALE(0), FEMALE(1);

        private String s = "";
        private int i;

        private Sex(int i) {
            this.i = i;
        }

        public String value() {
            if (i == 0)
                s = "男";
            if (i == 1)
                s = "女";
            return s;
        }
    }

    private String name;
    private Sex sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public Student() {
        name = "a";
        sex = Sex.MALE;
    }

    public Student(String name, Sex sex) {
        this.name = name;
        this.sex = sex;
    }

}