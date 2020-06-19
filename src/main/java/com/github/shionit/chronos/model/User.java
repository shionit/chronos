package com.github.shionit.chronos.model;

import lombok.Data;
import lombok.NonNull;

/**
 * ユーザエンティティ
 * Created by @shionit on 2020/05/30.
 */
@Data
public class User {

    /** ユーザID */
    @NonNull
    private String id;

    /** ユーザ名称 */
    private String name;
}
