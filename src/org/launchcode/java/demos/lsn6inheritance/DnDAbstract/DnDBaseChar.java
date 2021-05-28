//TODO follow Cat example and creat a DnD character base and sub-classes
package org.launchcode.java.demos.lsn6inheritance.DnDAbstract;

import java.util.ArrayList;

public class DnDBaseChar {

    String name;
    Integer charLevel;
    Integer exp;
    Integer hp;
    String save1;
    String save2;


    public DnDBaseChar(String name, Integer charLevel, Integer exp, Integer hp, String save1, String save2) {
        this.name = name;
        this.charLevel = charLevel;
        this.exp = exp;
        this.hp = hp;
        this.save1 = save1;
        this.save2 = save2;
    }

    public String getName() {
        return name;
    }

    public Integer getCharLevel() {
        return charLevel;
    }

    public void setCharLevel(Integer charLevel) {
        this.charLevel = charLevel;
    }

    public Integer getExp() {
        return exp;
    }

    public void setExp(Integer exp) {
        this.exp = exp;
    }

    public Integer getHp() {
        return hp;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
    }

    public String getSave1() {
        return save1;
    }

    public void setSave1(String save1) {
        this.save1 = save1;
    }

    public String getSave2() {
        return save2;
    }

    public void setSave2(String save2) {
        this.save2 = save2;
    }
}
