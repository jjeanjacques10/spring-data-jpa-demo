package com.jjeanjacques.shinobi.models;

import javax.persistence.*;

@Entity
@Table(name = "tool")
public class Tool {

    @Id
    @GeneratedValue(
            strategy = GenerationType.TABLE,
            generator = "tool_id_table"
    )
    @TableGenerator(
            name =  "tool_id_table",
            table = "id_tools"
    )
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column
    private Integer power;
}
