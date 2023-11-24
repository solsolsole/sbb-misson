package com.ll.sbb.user.user.repository;

import com.ll.sbb.user.user.entity.SiteUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<SiteUser, Long> {
}
