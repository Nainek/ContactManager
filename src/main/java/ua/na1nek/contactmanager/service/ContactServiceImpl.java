package ua.na1nek.contactmanager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ua.na1nek.contactmanager.dao.ContactDAO;
import ua.na1nek.contactmanager.domain.Contact;

@Service
public class ContactServiceImpl implements ContactService {

	@Autowired
	private ContactDAO contactDAO;
	
	@Override
	@Transactional
	public void addContact(Contact contact) {
		contactDAO.addContact(contact);

	}

	@Override
	@Transactional
	public List<Contact> listContact() {
		
		return contactDAO.listContact();
	}

	@Override
	@Transactional
	public void removeContact(Integer id) {
		contactDAO.removeContact(id);
		

	}

}
