/**
 */
package exoCar.impl;

import exoCar.Car;
import exoCar.ExoCarPackage;
import exoCar.Person;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import dao.PersonDao;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Person</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link exoCar.impl.PersonImpl#getName <em>Name</em>}</li>
 *   <li>{@link exoCar.impl.PersonImpl#getAge <em>Age</em>}</li>
 *   <li>{@link exoCar.impl.PersonImpl#getCars <em>Cars</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PersonImpl extends MinimalEObjectImpl.Container implements Person {
	PersonDao personDao = new PersonDao();

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getAge() <em>Age</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getAge()
	 * @generated
	 * @ordered
	 */
	protected static final int AGE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAge() <em>Age</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getAge()
	 * @generated
	 * @ordered
	 */
	protected int age = AGE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCars() <em>Cars</em>}' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getCars()
	 * @generated
	 * @ordered
	 */
	protected EList<Car> cars;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExoCarPackage.Literals.PERSON;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExoCarPackage.PERSON__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public int getAge() {
		return age;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setAge(int newAge) {
		int oldAge = age;
		age = newAge;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExoCarPackage.PERSON__AGE, oldAge, age));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Car> getCars() {
		if (cars == null) {
			cars = new EObjectWithInverseResolvingEList<Car>(Car.class, this, ExoCarPackage.PERSON__CARS, ExoCarPackage.CAR__PERSON);
		}
		return cars;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExoCarPackage.PERSON__CARS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCars()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExoCarPackage.PERSON__CARS:
				return ((InternalEList<?>)getCars()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	public void refuiling(Car car, float liters) {
		if (!cars.contains(car)) {
			throw new IllegalArgumentException("car not available");
		}
		if (liters < 0)
			throw new IllegalArgumentException("negative liters value: " + liters);
		car.addFuel(liters);
	}

	public void drive(Car car, float distance) {
		if (!cars.contains(car)) {
			throw new IllegalArgumentException("car" + car.getMatriculationNumber() + " is not of " + getName());
		}
		if (distance < 0)
			throw new IllegalArgumentException("negative distance value: " + distance);
		car.move(distance);
	}

	public void buyCar(Car car) {
//		car.setPerson(this);
		getCars().add(car);
		
		personDao.update(this);
	}

	public void sellCar(Car car) {
		if (!cars.contains(car))
			throw new IllegalArgumentException("car not available");
		car.setPerson(null);
		cars.remove(car);
		
		personDao.update(this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExoCarPackage.PERSON__NAME:
				return getName();
			case ExoCarPackage.PERSON__AGE:
				return getAge();
			case ExoCarPackage.PERSON__CARS:
				return getCars();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ExoCarPackage.PERSON__NAME:
				setName((String)newValue);
				return;
			case ExoCarPackage.PERSON__AGE:
				setAge((Integer)newValue);
				return;
			case ExoCarPackage.PERSON__CARS:
				getCars().clear();
				getCars().addAll((Collection<? extends Car>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ExoCarPackage.PERSON__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ExoCarPackage.PERSON__AGE:
				setAge(AGE_EDEFAULT);
				return;
			case ExoCarPackage.PERSON__CARS:
				getCars().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ExoCarPackage.PERSON__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ExoCarPackage.PERSON__AGE:
				return age != AGE_EDEFAULT;
			case ExoCarPackage.PERSON__CARS:
				return cars != null && !cars.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", age: ");
		result.append(age);
		result.append(')');
		return result.toString();
	}

} // PersonImpl
