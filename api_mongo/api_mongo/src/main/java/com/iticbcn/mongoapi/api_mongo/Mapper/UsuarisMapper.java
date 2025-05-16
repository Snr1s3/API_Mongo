package com.iticbcn.mongoapi.api_mongo.Mapper;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import com.iticbcn.mongoapi.api_mongo.DTO.UsuarisDTO;
import com.iticbcn.mongoapi.api_mongo.Models.Usuaris;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UsuarisMapper {
    public UsuarisDTO toDto(Usuaris usuari);
    public Usuaris toEntity(UsuarisDTO usuariDTO);
}