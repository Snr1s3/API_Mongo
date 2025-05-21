package com.iticbcn.mongoapi.api_mongo.Models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Document(collection = "Usuaris")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Usuaris {
    @Id
    private String id;
    private String nom;
    private int edat;
    private String cognom;
    private String correuElectronic;
    private String telefon;
    private String adreca;
}