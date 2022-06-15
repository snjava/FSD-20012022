package org.institute.repository;

import java.util.List;
import java.util.Map;

import javax.transaction.Transactional;

import org.institute.entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Integer> {
	
	
	@Query(value = "select * from phbook where name='Abc'", nativeQuery = true) // SQL query
	public Map getContactByName(); 
	
	
	//@Query(value = "from Contact where phoneNo='7709878987'") // HQL query
	@Query(value = "from Contact where phoneNo= :pn") // parameterized query
	public Contact getContactByNumber(@Param("pn") String phoneNumber);
	
	
	//select * from phbook where month(dob)=6 and day(dob)=15;
	@Query(value =  "select * from phbook where month(dob)= :m and day(dob)= :d", nativeQuery = true)
	public List<Map> getContactOfBirthDay(@Param("m") int month, @Param("d") int day);
	
	// update phbook set contact=? where id=?
	@Transactional
	@Modifying
	@Query(value = "update Contact set phoneNo= :pn where id= :i")
	public void updatePhoneNumber(@Param("pn") String number,@Param("i") int id);
	
	
}
