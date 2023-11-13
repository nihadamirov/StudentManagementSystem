package sevice.menu;

import servise.menu.inter.MenuExitInter;

public class MenuExit implements MenuExitInter {
    @Override
    public void process() {
        System.out.println("Logging out of the system...");
        System.exit(0);
    }
}
