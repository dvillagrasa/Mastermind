package UI;

import java.util.ArrayList;

public class Menu {
    private ArrayList<Option> options = new ArrayList<>();

    public void addOption2Menu(String name, Action action) {
        options.add(new Option(name,action));
    }

    public boolean selectOption(int index) {
        try {
            options.get(index).execute();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public void display() {
        for (int i = 0; i < options.size(); i++) {
            System.out.println(i + " - " + options.get(i).getName());
        }
    }

    public class Option{

        private String name;
        private Action action;

        public Option(String name,Action action) {
            this.name = name;
            this.action = action;
        }

        public String getName() {
            return name;
        }

        public void execute() {
            action.execute();
        }

    }
    public interface Action {
        void execute();
    }
}
