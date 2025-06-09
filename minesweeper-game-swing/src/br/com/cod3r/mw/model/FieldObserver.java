package br.com.cod3r.mw.model;

@FunctionalInterface
public interface FieldObserver {

    public void eventOccurred(Field field, FieldEvent event);
}
