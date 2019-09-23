package com.acme;

import java.util.List;

public class StatePrinter {
    static public void printState(State state) {
        if(state.isPants()) System.out.print("Pants ");
        if(state.isShirt()) System.out.print("Shirt ");
        if(state.isSocks()) System.out.print("Socks ");
        if(state.isShoes()) System.out.print("Shoes ");
        if(state.isHat()) System.out.print("Hat ");
    }

    static public void printState(List<Character> clothingArticles) {
        clothingArticles.forEach(item -> commandMapper(item));
    }

    static private void commandMapper(Character command) {
        switch(command) {
            case '1':
                System.out.print("Hat ");
                break;
            case '2':
                System.out.print("Pants ");
                break;
            case '3':
                System.out.print("Shirt ");
                break;
            case '4':
                System.out.print("Shoes ");
                break;
            case '5':
                System.out.print("Socks ");
                break;
        }
    }
}
