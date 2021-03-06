package org.Hodor.Hodor_the_TRPG.Model;

import org.Hodor.Hodor_the_TRPG.Model.Items.Item;
import org.Hodor.Hodor_the_TRPG.Model.Units.Unit;
import org.Hodor.Hodor_the_TRPG.Util.Agent;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by jkoike on 12/5/14.
 */
public class PlayerNode implements Serializable{
    Agent ai;
    PlayerNode next;
    ArrayList<Unit> team;
    ArrayList<Item> items;
    public PlayerNode(Agent ai, ArrayList<Unit> team, ArrayList<Item> items, PlayerNode next){
        this.ai = ai;
        this.next = next;
        this.team = team;
        this.items = items;
    }

    public Agent getAi() {
        return ai;
    }

    public PlayerNode getNext() {
        return next;
    }

    public void setNext(PlayerNode next) {
        this.next = next;
    }

    public ArrayList<Unit> getTeam() {
        return team;
    }

    public ArrayList<Item> getItems() {
        return items;
    }
}
