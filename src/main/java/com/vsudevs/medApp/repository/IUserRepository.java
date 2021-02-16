package com.vsudevs.medApp.repository;

import com.vsudevs.medApp.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Repository interface for {@link User} class.
 *
 * @author Eugene Okhryamkin
 * @version 1.0
 */
@Repository
public interface IUserRepository extends JpaRepository<User, Long> {

}
