package org.Hodor.Hodor_the_TRPG.Model.Units.Targaryen;

import org.Hodor.Hodor_the_TRPG.Model.House;
import org.Hodor.Hodor_the_TRPG.Model.Units.Warrior;

/**
 * Created by jkoike on 12/2/14.
 */
public class Jorah extends Warrior {
    public Jorah(int x, int y){
        super(x, y, "Jorah", House.Targaryen, 110, 20, 18, 15, 10, 1);
    }
}