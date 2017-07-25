package com.isoft.model;

import lombok.Data;

/**
 * Created by sunyi on 2017/7/25.
 */
@Data
public class PodSpec {
    private Integer activeDeadlineSeconds;
    private Affinity affinity;
    private boolean automountServiceAccountToken;
    private Container[] containers;
    private String dnsPolicy;
    private boolean hostIPC;
    private boolean hostNetWork;
    private boolean hostPID;
    private String hostname;
    private LocalObjectReference[] imagePullSecrets;
    private Container[] initContainers;
    private String nodeName;
    private Object nodeSelector;
    private String restartPolicy;
    private String schedulerName;
    private PodSecurityContext securityContext;
    private String serviceAccount;
    private String serviceAccountName;
    private String subdomain;
    private integer terminationGracePeriodSeconds;
    private Toleration[] tolerations;
    private Volume[] volumes;
}
