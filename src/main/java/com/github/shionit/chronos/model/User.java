package com.github.shionit.chronos.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

/**
 * ユーザエンティティ
 */
@Data
@Entity
@NoArgsConstructor
public class User {

  /**
   * ユーザID
   */
  @NonNull
  @Id
  private String id;

  /**
   * ユーザ名称
   */
  private String name;
}
