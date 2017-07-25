package com.isoft.model;

import lombok.Data;

@Data
public class Deployment {
    private String apiVersion;
    private String kind;
    private ObjectMeta metadata;
    private DeploymentSpec spec;
    private DeploymentStatus status;
}
