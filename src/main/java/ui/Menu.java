package ui;

import java.util.ArrayList;

public class Menu {
    private ArrayList<Option> options = new ArrayList<>();
    /*Afegeix les opcions al menú*/
    public void addOption2Menu(String name, Action action) {
        options.add(new Option(name,action));
    }
    /*Retorna si la opció seleccionada es una opció correcta o no*/
    public boolean selectOption(int index) {
        try {
            options.get(index).execute();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    /*Mostra el menu per pantalla (opcions)*/
    public void display() {
        for (int i = 0; i < options.size(); i++) {
            Printer.println(i + " - " + options.get(i).getName());
        }
    }
    /*Retorna el numero de opcions del menu*/
    public int getNumOfOptions() {
        return options.size();
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
    /*Funció que executa la opció seleccionada*/
    public interface Action {
        void execute();
    }
}
