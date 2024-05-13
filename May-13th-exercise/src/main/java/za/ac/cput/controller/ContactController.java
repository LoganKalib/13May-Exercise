package za.ac.cput.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.domain.Contact;
import za.ac.cput.factory.ContactFactory;
import za.ac.cput.service.ContactService;

import java.util.List;

@RestController
@RequestMapping("/contact")
public class ContactController {

    private ContactService contactService;

    @Autowired
    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }

    @PostMapping("/createOrUpdate")
    public Contact create(@RequestBody Contact obj) {
        Contact contact = ContactFactory.buildContact(obj.getEmail()
                ,obj.getMobile(),obj.getWorkTel());

        return contactService.create(contact);
    }

    @GetMapping("/read/{s}")
    public Contact read(@PathVariable String s) {
        return contactService.read(s);
    }

    @PostMapping("/delete/{id}")
    public void delete(@PathVariable String id) {
        Contact contact= ContactFactory.buildContact(id);
        contactService.delete(contact);
    }

    @GetMapping("/getAll")
    public List<Contact> getall() {
        return contactService.getall();
    }
}
