package com.jasty.repository;

/**
 * Created by cppc on 2018-02-03.
 */
import com.jasty.join.model.Users;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Users, Long> {

/*    List<User> findByEmail(String email);

    List<User> findByDate(Date date);*/

    // custom query example and return a stream
/*    @Query("select c from Customer c where c.email = :email")
    Stream<User> findByEmailReturnStream(@Param("email") String email);*/

}
