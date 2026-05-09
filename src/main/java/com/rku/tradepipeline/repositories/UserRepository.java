package com.rku.tradepipeline.repositories;

import com.rku.tradepipeline.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<User, UUID> {

//    @Query(value = "select count(*) from users", nativeQuery = true)
//    int getTotalUsers();

    @Query(value = "select id from users", nativeQuery = true)
    List<UUID> findAllIds();
}
