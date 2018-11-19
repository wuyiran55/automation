package org.bgi.flexlab.automation.json;

import java.util.HashMap;

public class WdlWorkflow {
    private final String workflowName;
    private final String description;
    private final String version;
    private final String workflow_failure_mode;
    // 设置call task的全局默认属性
    //  applyType ： [default, override]
    //  default:  task中未设置时使用该值，此处也未设置时使用cromwell的默认值（0）
    //  override: 强制应用于所有task， 忽略task内的设置
    //  "maxRetries":{
    //     "value":0,
    //     "applyType":"default"
    //  }
    private final HashMap<String, WdlParameter> parameter;
    private final HashMap<String, LinkTask> tasks;
    private final HashMap<String, WdlOutput> output;

    public WdlWorkflow(String workflowName, String description, String version, String workflow_failure_mode,
                       HashMap<String, WdlParameter> parameter, HashMap<String, LinkTask> tasks,
                       HashMap<String, WdlOutput> output) {
        this.workflowName = workflowName;
        this.description = description;
        this.version = version;
        this.workflow_failure_mode = workflow_failure_mode;
        this.parameter = parameter;
        this.tasks = tasks;
        this.output = output;
    }

    public String getWorkflowName() {
        return workflowName;
    }

    public String getDescription() {
        return description;
    }

    public String getVersion() {
        return version;
    }

    public String getWorkflow_failure_mode() {
        return workflow_failure_mode;
    }

    public HashMap<String, WdlParameter> getParameter() {
        return parameter;
    }

    public HashMap<String, LinkTask> getTasks() {
        return tasks;
    }

    public HashMap<String, WdlOutput> getOutput() {
        return output;
    }
}
