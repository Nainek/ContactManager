package ua.na1nek.contactmanager.service;

import java.util.List;

import ua.na1nek.contactmanager.domain.Contact;

public interface ContactService {


	public void addContact(Contact contact);
	
	public List<Contact> listContact();
	
	public void removeContact(Integer id);
	
	
	
}
