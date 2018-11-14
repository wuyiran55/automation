package org.bgi.flexlab.automation.json;

import java.util.HashMap;
import java.util.Map;

public class WdlWorkflow {
    private final String workflow_name;
    private final String description;
    private final String version;
    private final String workflow_failure_mode;
    private final int maxRetries;
    private final int continueOnReturnCode;
    private final boolean failOnStderr;
    private final HashMap<String, WdlParameter> parameter;
    private final String command;
    private final HashMap<String, WdlOutput> output;

}

public class RuntimeAttributes{
    private final Map<String, > maxRetries;
        "value":0,
                "applyType":"default"
    },
            "continueOnReturnCode":{
        "value":"0",
                "applyType":"override"
    },
            "failOnStderr":{
        "value":false,
                "applyType":"default"
    },
            "backends":{
        "value":"SGE",
                "applyType":"default"
    }
}
