package com.contact.Service;

import com.contact.Entities.Contact;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactServiceImpl implements ContactService {

    List<Contact> list = List.of(
            (new Contact( 1, "kinesh@gmail.com", "234567891", 102)),
            (new Contact( 2, "Aneri@gmail.com", "345678912", 103)),
            (new Contact( 3, "Payal@gmail.com", "456789123", 104)),
            (new Contact( 3, "kritika@gmail.com", "567891234", 101))
    );

    @Override
    public List<Contact> getUserContact(Long userId) {

        return list.stream().filter(contact -> contact.getUserid()==userId).collect(Collectors.toList());
    }
}
