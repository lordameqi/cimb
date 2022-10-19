package com.starterkit.springboot.brs.model.bus;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@NoArgsConstructor
@Accessors(chain = true)
@Entity
@Table(
        name = "stop",
        indexes = @Index(
                name = "idx_stop_code",
                columnList = "code",
                unique = true
        )
)
public class Stop {
    @Id
    @Column(name = "stop_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String code;

    private String name;

    private String detail;
}
