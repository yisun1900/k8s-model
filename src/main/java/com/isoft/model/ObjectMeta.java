package com.isoft.model;

import lombok.Data;

import java.sql.Timestamp;

/**
 * Created by sunyi on 2017/7/25.
 */
@Data
public class ObjectMeta {
    private Object annotations;
    private String clusterName;
    private Timestamp creationTimestamp;
    private Integer deletionGracePeriodSeconds;
    private Timestamp deletionTimestamp;
    private String[] finalizers;
    private String generateName;
    private Integer generation;
    private Object labels;
    private String name;
    private String namespace;
    private OwnerReference[] ownerReferences;
    private Integer resourceVersion;
    private Object selfLink;
    private String uid;
}
