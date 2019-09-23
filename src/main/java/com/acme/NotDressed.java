package com.acme;

import java.util.ArrayList;
import java.util.List;

public class NotDressed implements State {
    private List<Character> clothingArticles = new ArrayList<>();

    private Context context;
    private static NotDressed instance = null;

    public static NotDressed getInstance(Context context) {
        if(instance == null)
            instance = new NotDressed(context);
        return instance;
    }

    private NotDressed(Context context) {
        this.context = context;
    }

    @Override
    public void evaluate(char command) {

        clothingArticles.add(command);
        try {
            switch (command) {
                case '1': //Hat
                    if (!shirt) {//Must put shirt on before hat
                        throw new RuntimeException();
                    }
                    hat = true;
                    if (dressed()) context.setState(NotDressed.getInstance(context));
                    break;

                case '2': //Pants
                    pants = true;
                    if (dressed()) context.setState(NotDressed.getInstance(context));
                    break;

                case '3': //Shirt
                    shirt = true;
                    if (dressed()) context.setState(NotDressed.getInstance(context));
                    break;

                case '4': //Shoes
                    if (!(pants && socks)) //pants and socks must be on before you can put on your shoes
                    {
                        throw new RuntimeException();
                    }
                    shoes = true;
                    if (dressed()) context.setState(Dressed.getInstance(context));
                    break;

                case '5': //Socks
                    socks = true;
                    if (dressed()) context.setState(Dressed.getInstance(context));
                    break;

                case '6': //Leave
                    leave();
                    break;
            }
        } catch (RuntimeException e) {
            StatePrinter.printState(clothingArticles);
            throw e;
        }
    }

    @Override
    public void leave() {
        throw new RuntimeException("failed");
    }

    private Boolean dressed() {
        return pants && shirt && socks && shoes;
    }
    private Boolean hat = false;
    @Override
    public Boolean isHat() {
        return hat;
    }

    @Override
    public void setHat(Boolean hat) {
        this.hat = hat;
    }

    private Boolean shirt = false;
    @Override
    public Boolean isShirt() {
        return shirt;
    }

    @Override
    public void setShirt(Boolean shirt) {
        this.shirt = shirt;
    }

    private Boolean pants = false;
    @Override
    public Boolean isPants() {
        return pants;
    }

    @Override
    public void setPants(Boolean pants) {
        this.pants = pants;
    }

    private Boolean socks = false;
    @Override
    public Boolean isSocks() {
        return socks;
    }

    @Override
    public void setSocks(Boolean socks) {
        this.socks = socks;
    }

    private Boolean shoes = false;
    @Override
    public Boolean isShoes() {
        return shoes;
    }

    @Override
    public void setShoes(Boolean shoes) {
        this.shoes = shoes;
    }

}
