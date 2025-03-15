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
@Table(name = "artist")
public class Artist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "biography")
    private String biography;

    @OneToMany(mappedBy = "artist")
    @Column(name = "artwork")
    private List<Artwork> artworkList = new ArrayList<>();

}
