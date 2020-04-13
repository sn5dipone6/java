package university;

public class University {
    private double math;
    private double english;
    private double chinese;

    public University() {
        this.math = 0;
        this.english = 0;
        this.chinese = 0;
    }

    public void setMath(double math) {
        if ((math < 0) || (math > 100)){
            System.out.println("Invalid Math score: " + math + " , auto set to 100");
            math = 100;
        }
        this.math = math;
    }

    public void setEnglish(double english) {
        if ((english < 0) || (english > 100)) {
            System.out.println("Invalid English score: " + english + ", auto set to 100");
            english = 100;
        }
        this.english = english;
    }

    public void setChinese(double chinese) {
        if ((chinese < 0) || (chinese > 100)) {
            System.out.println("Invalid Chinese score: " + chinese + ", auto set to 100");
            chinese = 100;
        }
        this.chinese = chinese;
    }

    public double getMath() {
        return math;
    }

    public double getChinese() {
        return chinese;
    }

    public double getEnglish() {
        return english;
    }

    public void enterRule(double math, double english, double chinese) {
        setMath(math);
        setChinese(chinese);
        setEnglish(english);
        if((getMath() + getChinese() +getEnglish())>=200)
            System.out.println("Congratulations!");
        else
            System.out.println("Sorry!");
    }
}