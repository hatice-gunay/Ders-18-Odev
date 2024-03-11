package org.example;

public class main {
    public static void main(String[] args) {
        org.testng.TestNG.main(new String[]{"-d", "target/test-classes",
                "org.exampleTest.calisanTests"});
    }
}
