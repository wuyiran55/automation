package org.bgi.flexlab.automation.task;

public class Main {
    public static  void main(String[] args){
        TaskWdlBuilder builder = new  TaskWdlBuilder("/Users/wuyiran55/IdeaProjects/tmp2/automation/task_example.json") ;
        String content = builder.getWdlString() ;
        System.out.println(content);
    }
}
