package org.institute.repository;

import java.util.List;

import org.institute.dto.PhBookDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class PhBookRepository {

	@Autowired
	private JdbcTemplate template;
	
	public int saveContact(PhBookDto dto) {
		String query = "insert into phbook values(0,?,?,?)";
		//int count = template.update(query, dto.getFname(), dto.getLname(), dto.getContact());
		
		Object data[] = {dto.getFname(), dto.getLname(), dto.getContact()};
		int count = template.update(query, data);
		return count;
	}
	
	
	public List getAllContact() {
		String query = "select * from phbook";
		List records =  template.queryForList(query);
		return records;
	}
	
	
	// update the contact number by using ID
	
	// Delete the contact using ID
	
}











