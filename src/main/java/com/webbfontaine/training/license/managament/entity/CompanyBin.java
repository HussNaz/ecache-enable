package com.webbfontaine.training.license.managament.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
@Table(name = "COMPANYBIN", schema = "LICENSE_USER")
public class CompanyBin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "BIN_ID", nullable = false)
    private Long binId;

    @Column(name = "NAME", nullable = false, length = 200)
    private String name;
}
