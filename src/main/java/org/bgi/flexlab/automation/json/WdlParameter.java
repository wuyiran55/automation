package org.bgi.flexlab.automation.json;

public class WdlParameter {
    private final String type;
    private final Object defaultValue;
    private final boolean required;
    private final String description;

    public WdlParameter(String type, String defaultValue, boolean required, String description) {
        this.type = type;
        this.defaultValue = defaultValue;
        this.required = required;
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public Object getDefaultValue() {
        return defaultValue;
    }

    public boolean isRequired() {
        return required;
    }

    public String getDescription() {
        return description;
    }
}
