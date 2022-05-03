package dao;

import java.util.List;

import exoCar.Person;

public class PersonDao extends Dao<Person> {
	public Person getById(String id) {
		openCurrentSession();
		Person person = (Person) getCurrentSession().get(Person.class, id);
		closeCurrentSession();
		return person;
	}

	@SuppressWarnings("unchecked")
	public List<Person> getAll() {
		openCurrentSession();
		List<Person> person = (List<Person>) getCurrentSession().createQuery("from Person").list();
		closeCurrentSession();
		return person;
	}

	@SuppressWarnings("unchecked")
	public List<Person> findAll() {
		openCurrentSession();
		List<Person> books = (List<Person>) getCurrentSession().createQuery("from Person").list();
		closeCurrentSession();
		return books;
	}

	public void deleteAll() {
		List<Person> entityList = findAll();
		openCurrentSessionwithTransaction();

		for (Person entity : entityList) {
			delete(entity);
		}
		closeCurrentSessionwithTransaction();
	}
}
