package org.bgi.flexlab.automation.json;

public class LinkParameter {
    private final String from;
    private final String value;
    private final boolean scatter; //输入是数组，将打散为单个值传入

    public LinkParameter(String from, String value, boolean scatter) {
        this.from = from;
        this.value = value;
        this.scatter = scatter;
    }

    public String getFrom() {
        return from;
    }

    public String getValue() {
        return value;
    }

    public boolean isScatter() {
        return scatter;
    }
}
