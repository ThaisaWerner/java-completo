package br.com.cod3r.mw.vision;

import br.com.cod3r.mw.model.Field;
import br.com.cod3r.mw.model.FieldEvent;
import br.com.cod3r.mw.model.FieldObserver;

import javax.swing.*;
import java.awt.*;

public class FieldButton extends JButton implements FieldObserver {

    private final Color BG_STANDARD = new Color(184, 184, 184);
    private final Color BG_MARKED = new Color(88, 179, 247);
    private final Color BG_EXPLOSION = new Color(189, 66, 68);
    private final Color TEXT_GREEN = new Color(0, 100, 0);

    private Field field;

    public FieldButton(Field field) {
        this.field = field;
        setBackground(BG_STANDARD);
        setBorder(BorderFactory.createBevelBorder(0));

        field.registerObserver(this);
    }

    @Override
    public void eventOccurred(Field field, FieldEvent event) {
        switch (event) {
            case OPEN:
                applyOpenStyle();
                break;
            case MARK:
                applyMarkStyle();
                break;
            case EXPLODE:
                applyExplodeStyle();
                break;
            default:
                applyDefaultStyle();
        }
    }

    private void applyDefaultStyle() {
    }

    private void applyExplodeStyle() {
    }

    private void applyMarkStyle() {
    }

    private void applyOpenStyle() {
    }
}
