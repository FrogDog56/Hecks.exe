package me.frogdog.hecks.friend;

import me.frogdog.hecks.util.interfaces.Labeled;

public class Friend implements Labeled {
    private final String label;
    private final String alias;

    public Friend(String label, String alias) {
        this.label = label;
        this.alias = alias;
    }

    public String getAlias() {
        return this.alias;
    }

    @Override
    public String getLabel() {
        return this.label;
    }
}
