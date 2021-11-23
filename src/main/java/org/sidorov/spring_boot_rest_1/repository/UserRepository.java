package org.sidorov.spring_boot_rest_1.repository;

import org.sidorov.spring_boot_rest_1.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User readUserByName(String name);
    void deleteById(long id);
}
