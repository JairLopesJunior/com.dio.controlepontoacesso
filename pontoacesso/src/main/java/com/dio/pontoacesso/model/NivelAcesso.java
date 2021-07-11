package com.dio.pontoacesso.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class NivelAcesso {

    private Long id;
    private String descricao;

}
