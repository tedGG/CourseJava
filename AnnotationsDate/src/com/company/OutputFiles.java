package com.company;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(value= RetentionPolicy.SOURCE)
public @interface OutputFiles {
    boolean runFiles();

}
