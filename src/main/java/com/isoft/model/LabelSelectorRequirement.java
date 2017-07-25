package com.isoft.model;

import lombok.Data;

/**
 * Created by sunyi on 2017/7/25.
 */
@Data
public class LabelSelectorRequirement {
    private String key;
    private String operator;
    private String[] values;
}
