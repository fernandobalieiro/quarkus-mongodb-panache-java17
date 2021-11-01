package org.acme.mongodb.panache;

import org.bson.types.ObjectId;

import java.time.LocalDateTime;

public record PersonDTO(ObjectId id, String name, LocalDateTime birthDate, Status status) {}
