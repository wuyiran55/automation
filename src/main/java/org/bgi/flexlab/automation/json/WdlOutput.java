package org.bgi.flexlab.automation.json;

public class WdlOutput {
    private final String type;
    private final String expression;
    private final String description;

    public WdlOutput(String type, String expression, String description) {
        this.type = type;
        this.expression = expression;
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public String getExpression() {
        return expression;
    }

    public String getDescription() {
        return description;
    }
}
