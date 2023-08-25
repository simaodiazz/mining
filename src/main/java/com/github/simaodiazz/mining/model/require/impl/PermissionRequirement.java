package com.github.simaodiazz.mining.model.require.impl;

import com.github.simaodiazz.mining.model.require.Require;
import com.github.simaodiazz.mining.model.require.RequireType;
import lombok.Getter;

@Getter
public class PermissionRequirement extends Require {

    private final String value;

    public PermissionRequirement(String value) {
        super(RequireType.PERMISSION);
        this.value = value;
    }
}
