package com.sanidhya.accountManager;

import org.springframework.data.jpa.repository.JpaRepository;

/* Extending the JpaRepository provides the CRUD functions
 * including finding one,all.  
 */
public interface UserRepository extends JpaRepository<Users, Long> {

}
