package dao;

import java.util.List;

import exoCar.Car;

public class CarDao extends Dao<Car> {
	public Car getBy(String immatriculationNumber) {
		openCurrentSession();
		Car car = (Car) getCurrentSession().get(Car.class, immatriculationNumber);
		closeCurrentSession();
		return car;
	}

	@SuppressWarnings("unchecked")
	public List<Car> getAll() {
		openCurrentSession();
		List<Car> car = (List<Car>) getCurrentSession().createQuery("from Car").list();
		closeCurrentSession();
		return car;
	}

	@SuppressWarnings("unchecked")
	public List<Car> getAllImmatriculationNumbers() {
		openCurrentSession();
		List<Car> carsImmatriculationNumbers = (List<Car>) getCurrentSession()
				.createQuery("select immatriculationNumber from Car").list();
		closeCurrentSession();
		return carsImmatriculationNumbers;
	}

	@SuppressWarnings("unchecked")
	public List<Car> findAll() {
		openCurrentSession();
		List<Car> books = (List<Car>) getCurrentSession().createQuery("from Car").list();
		closeCurrentSession();
		return books;
	}

	public void deleteAll() {
		List<Car> entityList = findAll();
		openCurrentSessionwithTransaction();
		for (Car entity : entityList) {
			delete(entity);
		}
		closeCurrentSessionwithTransaction();
	}
}
