package com.accenture.flywaydemo;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.UUID;

@RepositoryRestResource(collectionResourceRel = "notes", path = "notes")
public interface NoteRepository extends PagingAndSortingRepository<Note, UUID> {


    Note findByAssignee(@Param("assignee") String assignee);
}
