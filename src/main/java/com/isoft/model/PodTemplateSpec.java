package com.isoft.model;

import lombok.Data;

/**
 * Created by sunyi on 2017/7/25.
 */
@Data
public class PodTemplateSpec {
    private ObjectMeta metadata;
    private PodSpec spec;
}
