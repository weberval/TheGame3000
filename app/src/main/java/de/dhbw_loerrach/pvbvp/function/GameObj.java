package de.dhbw_loerrach.pvbvp.function;

/**
 * Created by weva on 04.04.2017.
 * super GameObj
 */
public class GameObj {
    protected String type;

    /**
     * deny creation of GameObj
     */

    protected GameObj() {
    }

    public String getType() {
        return type;
    }
}
