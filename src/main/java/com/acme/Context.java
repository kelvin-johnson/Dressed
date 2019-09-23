package com.acme;

public class Context {
    private static Context instance = null;

    private Context() {}
    private State state = NotDressed.getInstance(this);
    public void setState(State state) {
        this.state = state;
    }

    public static Context getInstance() {
        if (instance == null)
            instance = new Context();
        return instance;
    }

    public void evaluate(char command) {
        state.evaluate(command);
    }


}
