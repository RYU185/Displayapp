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
@Table(name = "작가")
public class Artist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "artist")
    @Column(name = "biography")
    private List<Biography> biographyList;

    @Column(name = "profile_img")
    private String profile_img;

    @OneToMany(mappedBy = "artist")
    @Column(name = "artwork")
    private List<Artwork> artworkList = new ArrayList<>();

}
