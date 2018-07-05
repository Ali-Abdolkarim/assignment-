package com.itlobby.assignment572018;

public class Phone {
    private String name;
    private int model;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public Phone(String name, int model) {
        this.name = name;
        this.model = model;
    }

    public String printToLog() {
        return "phone Class  printToLog: " + getName() + "   " + getModel();
    }

    public String printToLog(String nameOfDevice) {
        return "phone Class" + "  printToLog: " + nameOfDevice + "  " + getName() + "   " + getModel();
    }
}
