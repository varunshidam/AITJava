package com.myait.Repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.myait.Model.User;
import com.myait.View.UserView;

@Repository
public interface userRepository extends JpaRepository<User, Serializable> {

//	public List<User> findByait_id(String ait_id);
	@Query("Select a from User a where a.ait_id=?1")
	public User findByAit_id(String ait_id);
	
	@Query("Select a from User a where a.ait_id= :id")
	public User findByAit_id11(@Param("id") String id);

}
