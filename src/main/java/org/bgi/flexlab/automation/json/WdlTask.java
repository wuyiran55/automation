package org.bgi.flexlab.automation.json;

import java.util.HashMap;

public class WdlTask {
    private final String task_name;
    private final String description;
    private final String version;
    private final int maxRetries;
    private final int continueOnReturnCode;
    private final boolean failOnStderr;
    private final HashMap<String, WdlParameter> parameter;
    private final String command;
    private final HashMap<String, WdlOutput> output;

    public WdlTask(String task_name, String description, String version, int maxRetries, int continueOnReturnCode,
                   boolean failOnStderr, HashMap<String, WdlParameter> parameter,
                   String command, HashMap<String, WdlOutput> output) {
        this.task_name = task_name;
        this.description = description;
        this.version = version;
        this.maxRetries = maxRetries;
        this.continueOnReturnCode = continueOnReturnCode;
        this.failOnStderr = failOnStderr;
        this.parameter = parameter;
        this.command = command;
        this.output = output;
    }

    public String getTask_name() {
        return task_name;
    }

    public String getDescription() {
        return description;
    }

    public String getVersion() {
        return version;
    }

    public int getMaxRetries() {
        return maxRetries;
    }

    public int getContinueOnReturnCode() {
        return continueOnReturnCode;
    }

    public boolean isFailOnStderr() {
        return failOnStderr;
    }

    public HashMap<String, WdlParameter> getParameter() {
        return parameter;
    }

    public String getCommand() {
        return command;
    }

    public HashMap<String, WdlOutput> getOutput() {
        return output;
    }
}
