package br.com.cod3r.mw.vision;

import br.com.cod3r.mw.model.Field;
import br.com.cod3r.mw.model.FieldEvent;
import br.com.cod3r.mw.model.FieldObserver;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class FieldButton extends JButton implements FieldObserver, MouseListener {

    private final Color BG_STANDARD = new Color(184, 184, 184);
    private final Color BG_MARKED = new Color(88, 179, 247);
    private final Color BG_EXPLOSION = new Color(189, 66, 68);
    private final Color TEXT_GREEN = new Color(0, 100, 0);

    private Field field;

    public FieldButton(Field field) {
        this.field = field;
        setBackground(BG_STANDARD);
        setBorder(BorderFactory.createBevelBorder(0));

        addMouseListener(this);
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
        setBackground(BG_STANDARD);
        setBorder(BorderFactory.createLineBorder(Color.GRAY));

        switch (field.minesInTheNeighborhood()) {
            case 1:
                setForeground(TEXT_GREEN);
                break;
            case 2:
                setForeground(Color.BLUE);
                break;
            case 3:
                setForeground(Color.YELLOW);
                break;
            case 4:
                setForeground(Color.ORANGE);
                break;
            case 5:
                setForeground(Color.MAGENTA);
                break;
            case 6:
                setForeground(Color.RED);
                break;
            default:
                setForeground(Color.BLACK);
        }

        String value = !field.secureNeihborhood() ? field.minesInTheNeighborhood() + "" : "";
        setText(value);
    }

    // Implement MouseListener methods
    @Override
    public void mousePressed(MouseEvent e) {
        if(e.getButton() == 1) {
            field.open();
        } else {
            field.rotateTag();
        }
    }

    public void mouseClicked(MouseEvent e) {}

    public void mouseEntered(MouseEvent e) {}

    public void mouseExited(MouseEvent e) {}

    public void mouseReleased(MouseEvent e) {}
}
