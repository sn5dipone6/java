package cn.campsg.java.experiment;

import cn.campsg.java.experiment.impl.BigDataSeeker;
import cn.campsg.java.experiment.impl.SoftwareSeeker;

public class MainClass {
    public static void main(String[] args) {
        HrMarketer Hr = new HrMarketer();
        SeekJob s1, s2;
        SeekJob b1, b2;
        s1 = new SoftwareSeeker("张小龙", new float[] { 10.0f, 100.0f });
        s2 = new SoftwareSeeker("李小龙", new float[] { 80.0f, 100.0f });
        b1 = new BigDataSeeker("张艳红", new float[]{10.0f, 100.0f});
        b2 = new BigDataSeeker("李彦宏", new float[] { 80.0f, 100.0f });
        Hr.seekJob(s1);
        Hr.seekJob(s2);
        Hr.seekJob(b1);
        Hr.seekJob(b2);
    }

}