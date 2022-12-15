package com.nissan.dao;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;
import com.nissan.model.Enquiry;
@Repository
public interface IEnquiryDAO extends JpaRepositoryImplementation<Enquiry, Integer> {

}
