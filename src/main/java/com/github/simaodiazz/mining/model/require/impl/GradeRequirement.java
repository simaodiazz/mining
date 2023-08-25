package com.github.simaodiazz.mining.model.require.impl;

import com.github.simaodiazz.mining.model.grade.Grade;
import com.github.simaodiazz.mining.model.require.Require;
import com.github.simaodiazz.mining.model.require.RequireType;
import lombok.Getter;

@Getter
public class GradeRequirement extends Require {

    private final Grade value;

    public GradeRequirement(Grade value) {
        super(RequireType.GRADE);
        this.value = value;
    }
}
