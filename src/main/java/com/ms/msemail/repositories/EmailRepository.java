package com.ms.msemail.repositories;

import com.ms.email.models.EmailModel;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
public interface EmailRepository extends JpaRepository<EmailRepository, UUID> {

}
