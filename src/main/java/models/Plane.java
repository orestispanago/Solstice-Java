package models;

import java.util.List;

public class Plane {

    private List<Clip> clip ;

    public Plane(List<Clip> clip) {
        this.clip = clip;
    }

    public List<Clip> getClip() {
        return clip;
    }

    public void setClip(List<Clip> clip) {
        this.clip = clip;
    }

    @Override
    public String toString() {
        return "Plane{" + "clip=" + clip + '}';
    }

}
