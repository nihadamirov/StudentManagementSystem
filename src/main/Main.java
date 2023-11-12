package main;

import bean.Config;
import menu.MenuUtil;

public class Main {
    public static void main(String[] args) {
        Config.initialize();
        MenuUtil.showMenu();

    }
}
