package org.bgi.flexlab.automation.json;

import java.util.HashMap;

public class WdlTask {
    private final String taskName;
    private final String description;
    private final String version;
    private final String backends;
    private final int maxRetries;
    private final int continueOnReturnCode;
    private final boolean failOnStderr;
    private final HashMap<String, WdlParameter> parameter;
    private final String command;
    private final HashMap<String, WdlOutput> output;

    public WdlTask(String taskName, String description, String version, String backends, int maxRetries,
                   int continueOnReturnCode, boolean failOnStderr, HashMap<String, WdlParameter> parameter,
                   String command, HashMap<String, WdlOutput> output) {
        this.taskName = taskName;
        this.description = description;
        this.version = version;
        this.backends = backends;
        this.maxRetries = maxRetries;
        this.continueOnReturnCode = continueOnReturnCode;
        this.failOnStderr = failOnStderr;
        this.parameter = parameter;
        this.command = command;
        this.output = output;
    }

    public String getTaskName() {
        return taskName;
    }

    public String getDescription() {
        return description;
    }

    public String getVersion() {
        return version;
    }

    public String getBackends() {
        return backends;
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
