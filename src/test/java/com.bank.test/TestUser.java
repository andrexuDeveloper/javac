package com.bank.test;

import com.sun.tools.javac.Main;
import org.junit.Test;

public class TestUser {

    @Test
    public  void mainTest() {
        String
                //str = "D:\\IdeaProjects\\javac\\src\\main\\java\\com\\test\\user\\User.java";
                str="D:\\IdeaProjects\\LearnApp\\learn_app_test\\src\\main\\java\\com\\keruyun\\infra\\user\\entity\\User.java";
        String a[] = {str};
        int demo = Main.compile(a);
    }
}
