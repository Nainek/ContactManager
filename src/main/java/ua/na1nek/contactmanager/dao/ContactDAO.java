package ua.na1nek.contactmanager.dao;

import java.util.List;

import ua.na1nek.contactmanager.domain.Contact;

public interface ContactDAO {

	public void addContact(Contact contact);
	
	public List<Contact> listContact();
	
	public void removeContact(Integer id);
	
	
	
}
