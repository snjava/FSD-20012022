package org.institute.repository;

import java.util.List;
import java.util.Map;

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
		// int count = template.update(query, dto.getFname(), dto.getLname(),
		// dto.getContact());

		Object data[] = { dto.getFname(), dto.getLname(), dto.getContact() };
		int count = template.update(query, data);
		return count;
	}

	// update the contact number by using ID
	public int updateContact(PhBookDto dto) {
		String query = "update phbook set contact=? where id=?";
		Object data[] = { dto.getContact(), dto.getId() };
		int count = template.update(query, data);
		return count;
	}

	// Delete the contact using ID
	public int deleteContact(int id) {
		String query = "delete from phbook where id=?";
		int count = template.update(query, id);
		return count;
	}
	
	public List getAllContact() {
		String query = "select * from phbook";
		List records = template.queryForList(query);
		return records;
	}
	
	public Map getContactById(int id) {
		String query = "select * from phbook where id = ?";
		Object data[] = {id};
		Map record = template.queryForMap(query,data);
		return record;
	}
}
