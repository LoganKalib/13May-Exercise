package za.ac.cput.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.domain.Contact;
import za.ac.cput.repository.ContactRepository;

import java.util.List;

@Service
public class ContactService implements ImplService<Contact, String>{

    private ContactRepository contactRepository;

    @Autowired
    public ContactService(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    @Override
    public Contact create(Contact obj) {
        return contactRepository.save(obj);
    }

    @Override
    public Contact read(String s) {
        return contactRepository.findById(s).orElseThrow(null);
    }

    @Override
    public void delete(Contact obj) {
        contactRepository.delete(obj);
    }

    @Override
    public List<Contact> getall() {
        return contactRepository.findAll();
    }
}
