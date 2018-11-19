package org.bgi.flexlab.automation.json;

import java.util.HashMap;

public class LinkTask {
    private final String aliasName;  // call taskName as aliasName , 可缺省
    private final String source; //task.wdl的大型机路径或url
    private final String[] dependency;
    private final HashMap<String, LinkParameter> linkParameter;

    public LinkTask(String aliasName, String source, String[] dependency,
                    HashMap<String, LinkParameter> linkParameter) {
        this.aliasName = aliasName;
        this.source = source;
        this.dependency = dependency;
        this.linkParameter = linkParameter;
    }

    public String getAliasName() {
        return aliasName;
    }

    public String getSource() {
        return source;
    }

    public String[] getDependency() {
        return dependency;
    }

    public HashMap<String, LinkParameter> getLinkParameter() {
        return linkParameter;
    }
}
