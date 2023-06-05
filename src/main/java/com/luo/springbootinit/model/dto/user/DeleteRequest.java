package com.luo.springbootinit.model.dto.user;

import lombok.Data;

import java.io.Serializable;

/**
 * @author lkx
 * @version 1.0.0
 */
@Data
public class DeleteRequest implements Serializable {
    private static final long serialVersionUID = -3074798741920923768L;

    private Long id;
}
