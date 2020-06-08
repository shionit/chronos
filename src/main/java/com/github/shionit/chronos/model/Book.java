package com.github.shionit.chronos.model;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

/**
 * Created by @shionit on 2020/05/30.
 */
@Data
@Builder
public class Book {

    @NonNull
    private Long id;

    private String title;

    private String isbn;

    private String url;
}
