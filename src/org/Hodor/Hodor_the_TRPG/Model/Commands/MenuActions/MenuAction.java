package org.Hodor.Hodor_the_TRPG.Model.Commands.MenuActions;

import org.Hodor.Hodor_the_TRPG.Controller.MapController;
import org.Hodor.Hodor_the_TRPG.View.TileView;

import java.io.Serializable;

/**
 * Created by jkoike on 11/24/14.
 */
public abstract class MenuAction implements Serializable{
    protected int numArgs;
    public abstract void execute(MapController controller, TileView a, TileView b);
}
