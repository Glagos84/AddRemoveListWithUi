package cl.mind.listexample;

/**
 * Created by Gabriel on 08-08-2017.
 */

public class Bands {

    private String name;
    private boolean rock;

    public Bands(String name, boolean rock) {
        this.name = name;
        this.rock = rock;
    }

    public String getName() {
        return name;
    }

    public boolean isRock() {
        return rock;
    }
}
