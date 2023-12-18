package com.coursAPI.cours.Repository;

import com.coursAPI.cours.Model.Chat;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ChatRepository extends MongoRepository<Chat,String> {

}
