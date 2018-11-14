package org.bgi.flexlab.automation.json;

public class WdlParameter {
    private final String type;
    private final Object defaultValue;
    private final boolean optional;
    private final String description;

    // defaultValue为空 且 optional == false, 则该参数必须在workflow中传入
    public WdlParameter(String type, String defaultValue, boolean optional, String description) {
        this.type = type;
        this.defaultValue = defaultValue;
        this.optional = optional;
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public Object getDefaultValue() {
        return defaultValue;
    }

    public boolean isOptional() {
        return optional;
    }

    public String getDescription() {
        return description;
    }
}
