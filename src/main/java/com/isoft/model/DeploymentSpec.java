package com.isoft.model;

/**
 * Created by sunyi on 2017/7/25.
 */

import lombok.Data;

@Data
public class DeploymentSpec {
    private Integer minReadySeconds;
    private boolean paused;
    private Integer progressDeadlineSeconds;
    private Integer replicas;
    private Integer revisionHistoryLimit;
    private RollbackConfig rollbackTo;
    private LabelSelector selector;
    private DeploymentStrategy strategy;
    private PodTemplateSpec template;
}
