/**
 * 
 */
package com.ssd.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ssd.entity.UserProfile;

/**
 * @author abhimanyu
 *
 */
public interface UserProfileRepository extends JpaRepository<UserProfile, String>{

	UserProfile findByUserSid(String userSid);
	UserProfile findByFirstName(String firstName);
	UserProfile findByLastName(String lastName);

}
