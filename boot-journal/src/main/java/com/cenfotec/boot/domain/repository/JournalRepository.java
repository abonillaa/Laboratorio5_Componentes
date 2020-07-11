package com.cenfotec.boot.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cenfotec.boot.domain.*;

public interface JournalRepository extends JpaRepository<Journal, Long> {

}
