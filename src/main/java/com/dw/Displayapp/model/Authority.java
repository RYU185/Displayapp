package com.dw.Displayapp.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "권한")
public class Authority {
    @Id
    @Column(name = "authority_name", length = 255)
    private String authorityName;


}
