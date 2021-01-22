package io.jenkins.plugins.opentelemetry.semconv;

public class JenkinsSemanticMetrics {
    public static final String  CI_PIPELINE_RUN_LAUNCHED = "ci.pipeline.run.launched";
    public static final String  CI_PIPELINE_RUN_STARTED = "ci.pipeline.run.started";
    public static final String  CI_PIPELINE_RUN_COMPLETED = "ci.pipeline.run.completed";
    public static final String  CI_PIPELINE_RUN_ABORTED = "ci.pipeline.run.aborted";
    public static final String JENKINS_QUEUE_WAITING = "jenkins.queue.waiting";
    public static final String JENKINS_QUEUE_BLOCKED = "jenkins.queue.blocked";
    public static final String JENKINS_QUEUE_BUILDABLE = "jenkins.queue.buildable";
    public static final String JENKINS_QUEUE_LEFT = "jenkins.queue.left";

    private JenkinsSemanticMetrics(){}
}