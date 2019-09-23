package com.acme;

public interface State {
    void evaluate(char command);
    void leave();
    Boolean isHat();
    void setHat(Boolean hat);
    Boolean isShirt();
    void setShirt(Boolean shirt);
    Boolean isPants();
    void setPants(Boolean pants);
    Boolean isSocks();
    void setSocks(Boolean socks);
    Boolean isShoes();
    void setShoes(Boolean shoes);
}
