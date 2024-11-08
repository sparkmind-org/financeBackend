package com.example.finance.repository;

import com.example.finance.entity.FinanceCompany;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "financeCompanies", path = "companies")
public interface FinanceCompanyRepository extends MongoRepository<FinanceCompany, String> {

}
