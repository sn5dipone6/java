package cn.campsg.java.experiment;

public class HrMarketer {
    public String seekJob(SeekJob p) {
        String s = "";
        if(p.getSeekerAverage()> SeekJob.SEEKER_AVERAGE_SCORE)
            System.out.println(p.getName() + "被本公司录用");
        if(p.getSeekerAverage()<SeekJob.SEEKER_AVERAGE_SCORE)
            System.out.println(p.getName() + "成绩未达标，未被本公司录用");
        return s;
    }
}