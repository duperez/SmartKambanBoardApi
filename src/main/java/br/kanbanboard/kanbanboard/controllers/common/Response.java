package br.kanbanboard.kanbanboard.controllers.common;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Generic Response Template.
 *
 * @param <T> Response Data Type.
 * @author Anthony Vilarim Caliani
 * @since 19.2.0
 */
@AllArgsConstructor
@Data
public class Response<T> {

    private T data;

}

