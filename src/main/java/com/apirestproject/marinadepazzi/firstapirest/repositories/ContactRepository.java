package com.apirestproject.marinadepazzi.firstapirest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apirestproject.marinadepazzi.firstapirest.models.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {

}
