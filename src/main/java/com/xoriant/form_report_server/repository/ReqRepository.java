package com.xoriant.form_report_server.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.xoriant.form_report_server.model.Req;

@Repository
public interface ReqRepository extends MongoRepository<Req, String> {
}
