package generics;

// In this case, BoxNumber is a generic class that extends Box with a type parameter N that must be a subclass of Number
// So it only accepts types like Integer, Double, Float, etc.
public class BoxNumber<N extends Number> extends Box<N>{
}
