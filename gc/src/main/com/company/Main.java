package java.com.company;

public class Main {

    public static void main(String[] args) {
        int i;
        Calc[] name = new Calc [100];
        for (i = 0; i < 100; i++) {
            name[i] = new Calc();
        }
    }
}

// jvmArgs += ["-XX:+UseSerialGC"] -> build.gradle
