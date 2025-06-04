package generics;

// A generic class that can hold any type of object <T> and we define the type when we instantiate the class ou when true heritage
public class Box <T>{

    private T thing;

    public void keep(T thing) {
        this.thing = thing;
    }

    public T open() {
        return thing;
    }

}
