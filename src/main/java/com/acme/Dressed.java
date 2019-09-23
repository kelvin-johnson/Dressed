package com.acme;

public class Dressed implements State {

    private Context context;
    private static Dressed instance = null;

    public static Dressed getInstance(Context context) {
        if(instance == null)
            instance = new Dressed(context);
        return instance;
    }

    private Dressed(Context context) {
        this.context = context;
    }

    @Override
    public void evaluate(char command) {
        switch(command) {
            case '1':
                hat = true;
                break;

            case '6':
                leave();
                break;
        }


    }

    @Override
    public void leave() {
        StatePrinter.printState(this);
        System.out.println(" Leaving");
    }

    /** We track hat here and in the NotDressed state since a hat is optional and a person my transition for the dressed and not dressed state
     * BEFORE putting on a hat!
     */
    private Boolean hat = false;
    @Override
    public Boolean isHat() {
        return hat;
    }

    @Override
    public void setHat(Boolean hat) {
        this.hat = hat;
    }

    @Override
    public Boolean isShirt() {
        return true;
    }

    @Override
    public void setShirt(Boolean shirt) {
        //do nothing.  at this point your are dressed!
    }

    @Override
    public Boolean isPants() {
        return true;
    }

    @Override
    public void setPants(Boolean pants) {
        //do nothing.  at this point your are dressed!
    }

    @Override
    public Boolean isSocks() {
        return true;
    }

    @Override
    public void setSocks(Boolean socks) {
        //do nothing.  at this point your are dressed!
    }

    @Override
    public Boolean isShoes() {
        return true;
    }

    @Override
    public void setShoes(Boolean shoes) {
        //do nothing.  at this point your are dressed!
    }
}
