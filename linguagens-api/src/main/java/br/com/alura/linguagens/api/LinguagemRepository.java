package br.com.alura.linguagens.api;

import org.springframework.data.mongodb.repository.MongoRepository;

// interface que estende MongoRepository
public interface LinguagemRepository extends MongoRepository<Linguagem, String> {

}
