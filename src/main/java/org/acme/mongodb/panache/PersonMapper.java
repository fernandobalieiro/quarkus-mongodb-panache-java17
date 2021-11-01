package org.acme.mongodb.panache;

import org.mapstruct.Mapper;

import java.util.List;

@Mapper(config = QuarkusMapperConfig.class)
public interface PersonMapper {
    PersonDTO toDto(Person person);

    List<PersonDTO> toDtoList(List<Person> persons);
}
