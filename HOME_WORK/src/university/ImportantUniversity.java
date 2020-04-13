package university;

public class ImportantUniversity extends University {

    public ImportantUniversity() {
        super();
    }

    public void enterRule(double math, double english, double chinese) {
        setMath(math);
        setChinese(chinese);
        setEnglish(english);
        if((getMath() + getChinese() +getEnglish())>=245)
            System.out.println("Congratulations!");
        else
            System.out.println("Sorry!");
    }
}