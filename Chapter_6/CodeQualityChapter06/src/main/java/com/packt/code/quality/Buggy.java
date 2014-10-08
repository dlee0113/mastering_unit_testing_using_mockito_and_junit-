package com.packt.code.quality;

public class Buggy implements Cloneable {
    private Integer magicNumber;

    Buggy() { }

    public Buggy(Integer magicNumber) {
        this.magicNumber = magicNumber;
    }

    public boolean isBuggy(String x) {
        return "Buggy" == x;
    }

    public boolean equals(Object o) {
        if (o instanceof Buggy) {
            return ((Buggy) o).magicNumber == magicNumber;
        }
        if (o instanceof Integer) {
            return magicNumber == ((Integer) o);
        }

        try {
            
        }catch (Exception e) {
        }
        return false;
    }

    static class MoreBuggy extends Buggy {
// TODO: Use explicit scoping instead of the default package private level
        static MoreBuggy singleton = new MoreBuggy();
    }

    static MoreBuggy foo = MoreBuggy.singleton;
}
