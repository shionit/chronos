package com.github.shionit.chronos.model;

import lombok.Data;
import lombok.NonNull;

/**
 * Created by @shionit on 2020/05/30.
 */
@Data
public class User {

    @NonNull
    private String id;

    private String name;
}
