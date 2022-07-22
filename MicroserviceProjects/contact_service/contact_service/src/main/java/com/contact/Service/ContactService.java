package com.contact.Service;

import com.contact.Entities.Contact;

import java.util.List;

public interface ContactService {

    public List<Contact> getUserContact(Long userId);
}
