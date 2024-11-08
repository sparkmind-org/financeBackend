package com.example.finance.repository;

import com.example.finance.entity.File;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "files", path = "files")
public interface FileRepository extends MongoRepository<File, String> {

}
