package com.isoft.model;

import lombok.Data;

/**
 * Created by sunyi on 2017/7/25.
 */
@Data
public class OwnerReference {
    private String apiVersion;
    private boolean blockOwnerDeletion;
    private boolean controller;
    private String kind;
    private String name;
    private String uid;
}
