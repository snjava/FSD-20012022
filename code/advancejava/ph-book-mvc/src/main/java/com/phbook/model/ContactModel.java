package com.phbook.model;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.phbook.dto.Contact;
import com.phbook.util.DbConncetionUtil;

public class ContactModel {

	public boolean saveContact(Contact contact) {
		boolean result = false;
		
		try {
			Connection con = DbConncetionUtil.getConnection();
			PreparedStatement stmt = con.prepareStatement("insert into phbook values(0,?,?,?)");
			stmt.setString(1, contact.getFname());
			stmt.setString(2, contact.getLname());
			stmt.setString(3, contact.getContact());
			
			int count = stmt.executeUpdate();
			
			DbConncetionUtil.closeConnection(con);
			
			if(count>0) {
				result = true;
			}
			
		} catch(Exception ex) {
			ex.printStackTrace();
		}
		
		return result;
	}
	
	
}
