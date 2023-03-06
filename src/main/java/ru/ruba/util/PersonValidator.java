package ru.ruba.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import ru.ruba.dao.PersonDAO;
import ru.ruba.models.Person;

@Component
public class PersonValidator implements Validator {

    private final PersonDAO personDAO;

    @Autowired
    public PersonValidator(PersonDAO personDAO) {
        this.personDAO = personDAO;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return Person.class.equals(clazz);
    }


    @Override
    public void validate(Object target, Errors errors) {
        Person person = (Person) target;

        if (personDAO.getPersonByFullName(person.getFio()).isPresent())
            errors.rejectValue("fullName", "", "Человек с таким ФИО уже существует");
    }
}
