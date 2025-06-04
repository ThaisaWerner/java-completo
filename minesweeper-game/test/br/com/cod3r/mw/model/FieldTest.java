package br.com.cod3r.mw.model;

import br.com.cod3r.mw.exception.ExplosionException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FieldTest {

    private Field field;

    @BeforeEach
    void initiateField() {
        field = new Field(3,3);
    }

    @Test
    void testNeighborDistance1() {
        Field neighbor = new Field(3,2);
        boolean result = field.addNeighbor(neighbor);
        assertTrue(result);
    }

    @Test
    void testNeighborDistance2() {
        Field neighbor = new Field(2,2);
        boolean result = field.addNeighbor(neighbor);
        assertTrue(result);
    }

    @Test
    void testNoNeighbor() {
        Field neighbor = new Field(1,1);
        boolean result = field.addNeighbor(neighbor);
        assertFalse(result);
    }

    @Test
    void testDefaultValueMarkedAttribute() {
        assertFalse(field.isMarked());
    }

    @Test
    void testRotateTag() {
        field.rotateTag();
        assertTrue(field.isMarked());
    }

    @Test
    void testRotateTagTwoCalls() {
        field.rotateTag();
        field.rotateTag();
        assertFalse(field.isMarked());
    }

    @Test
    void testOpenFieldNotMinedAndNotMarked() {
        assertTrue(field.open());
    }

    @Test
    void testOpenFieldNotMinedAndMarked() {
        field.rotateTag();
        assertFalse(field.open());
    }

    @Test
    void testOpenFieldMinedAndMarked() {
        field.rotateTag();
        field.mine();
        assertFalse(field.open());
    }

    @Test
    void testOpenFieldMinedAndNotMarked() {
        field.mine();
        assertThrows(ExplosionException.class, () -> {
            field.open();
        });
    }

    @Test
    void testOpenWithNeighbors1() {
        Field field11 = new Field(1,1);

        Field field22 = new Field(2,2);
        field22.addNeighbor(field11);

        field.addNeighbor(field22);

        field.open();

        assertTrue(field22.isOpen() && field11.isOpen());
    }

    @Test
    void testOpenWithNeighbors2() {
        Field field11 = new Field(1,1);
        Field field12 = new Field(1,2);
        field12.mine();

        Field field22 = new Field(2,2);
        field22.addNeighbor(field11);
        field22.addNeighbor(field12);

        field.addNeighbor(field22);

        field.open();

        assertTrue(field22.isOpen() && field11.isClosed());
    }
}
