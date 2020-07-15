package com.github.shionit.chronos.model;

import lombok.Data;
import lombok.NonNull;

/**
 * ユーザエンティティ
 */
@Data
public class User {

  /**
   * ユーザID
   */
  @NonNull
  private String id;

  /**
   * ユーザ名称
   */
  private String name;
}
