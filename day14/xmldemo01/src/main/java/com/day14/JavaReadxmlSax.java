package com.day14;

import java.util.List;

public class JavaReadxmlSax {
    public static void main(String[] args) {
        MyRunner runner  = new MyRunner();
        List<User> lines = runner.parseUsers();
        lines.forEach(System.out::println);
    }
}
