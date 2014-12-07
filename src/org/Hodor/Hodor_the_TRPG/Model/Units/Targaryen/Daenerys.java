package org.Hodor.Hodor_the_TRPG.Model.Units.Targaryen;

import org.Hodor.Hodor_the_TRPG.Model.House;
import org.Hodor.Hodor_the_TRPG.Model.Units.Archer;

/**
 * Created by jkoike on 12/2/14.
 */
public class Daenerys extends Archer {
    public Daenerys(int x, int y){
        super(x, y, "Daenerys", House.Targaryen, 100, 22, 15, 10, 6, 1);
    }
}