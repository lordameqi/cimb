
package com.finalproject.transport.entity.md;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
public class Agen_db {

    @Id
    @Column(name = "agency_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String code;

    private String name;

    private String details;

    private Long owner_user_id;
}
