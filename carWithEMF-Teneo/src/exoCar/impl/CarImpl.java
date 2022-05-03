/**
 */
package exoCar.impl;

import exoCar.Car;
import exoCar.ColorsType;
import exoCar.ExoCarPackage;

import exoCar.GazType;
import exoCar.Person;

import java.util.List;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import dao.CarDao;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Car</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link exoCar.impl.CarImpl#getMatriculationNumber <em>Matriculation Number</em>}</li>
 *   <li>{@link exoCar.impl.CarImpl#getMileage <em>Mileage</em>}</li>
 *   <li>{@link exoCar.impl.CarImpl#getFuelCapacity <em>Fuel Capacity</em>}</li>
 *   <li>{@link exoCar.impl.CarImpl#getBrend <em>Brend</em>}</li>
 *   <li>{@link exoCar.impl.CarImpl#getFuelConsumption <em>Fuel Consumption</em>}</li>
 *   <li>{@link exoCar.impl.CarImpl#getCurrentFuelLevel <em>Current Fuel Level</em>}</li>
 *   <li>{@link exoCar.impl.CarImpl#getFuelType <em>Fuel Type</em>}</li>
 *   <li>{@link exoCar.impl.CarImpl#getPerson <em>Person</em>}</li>
 *   <li>{@link exoCar.impl.CarImpl#getColor <em>Color</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CarImpl extends MinimalEObjectImpl.Container implements Car {
	/**
	 * The default value of the '{@link #getMatriculationNumber() <em>Matriculation Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatriculationNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String MATRICULATION_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMatriculationNumber() <em>Matriculation Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatriculationNumber()
	 * @generated
	 * @ordered
	 */
	protected String matriculationNumber = MATRICULATION_NUMBER_EDEFAULT;

	/**
	 * This is true if the Matriculation Number attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean matriculationNumberESet;

	CarDao carDao = new CarDao();
	
	/**
	 * The default value of the '{@link #getMileage() <em>Mileage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMileage()
	 * @generated
	 * @ordered
	 */
	protected static final int MILEAGE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMileage() <em>Mileage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMileage()
	 * @generated
	 * @ordered
	 */
	protected int mileage = MILEAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFuelCapacity() <em>Fuel Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuelCapacity()
	 * @generated
	 * @ordered
	 */
	protected static final int FUEL_CAPACITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFuelCapacity() <em>Fuel Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuelCapacity()
	 * @generated
	 * @ordered
	 */
	protected int fuelCapacity = FUEL_CAPACITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getBrend() <em>Brend</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBrend()
	 * @generated
	 * @ordered
	 */
	protected static final String BREND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBrend() <em>Brend</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBrend()
	 * @generated
	 * @ordered
	 */
	protected String brend = BREND_EDEFAULT;

	/**
	 * The default value of the '{@link #getFuelConsumption() <em>Fuel Consumption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuelConsumption()
	 * @generated
	 * @ordered
	 */
	protected static final float FUEL_CONSUMPTION_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getFuelConsumption() <em>Fuel Consumption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuelConsumption()
	 * @generated
	 * @ordered
	 */
	protected float fuelConsumption = FUEL_CONSUMPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrentFuelLevel() <em>Current Fuel Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentFuelLevel()
	 * @generated
	 * @ordered
	 */
	protected static final float CURRENT_FUEL_LEVEL_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCurrentFuelLevel() <em>Current Fuel Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentFuelLevel()
	 * @generated
	 * @ordered
	 */
	protected float currentFuelLevel = CURRENT_FUEL_LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getFuelType() <em>Fuel Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuelType()
	 * @generated
	 * @ordered
	 */
	protected static final GazType FUEL_TYPE_EDEFAULT = GazType.GASOLINE;

	/**
	 * The cached value of the '{@link #getFuelType() <em>Fuel Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuelType()
	 * @generated
	 * @ordered
	 */
	protected GazType fuelType = FUEL_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPerson() <em>Person</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerson()
	 * @generated
	 * @ordered
	 */
	protected Person person;

	/**
	 * The default value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected static final ColorsType COLOR_EDEFAULT = ColorsType.BLACK;

	/**
	 * The cached value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected ColorsType color = COLOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CarImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExoCarPackage.Literals.CAR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMatriculationNumber() {
		return matriculationNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public void setMatriculationNumber(String newMatriculationNumber) {
		checkIfValidMatricolationNumber(newMatriculationNumber);
		
		String oldMatriculationNumber = matriculationNumber;
		matriculationNumber = newMatriculationNumber;
		boolean oldMatriculationNumberESet = matriculationNumberESet;
		matriculationNumberESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExoCarPackage.CAR__MATRICULATION_NUMBER, oldMatriculationNumber, matriculationNumber, !oldMatriculationNumberESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMatriculationNumber() {
		String oldMatriculationNumber = matriculationNumber;
		boolean oldMatriculationNumberESet = matriculationNumberESet;
		matriculationNumber = MATRICULATION_NUMBER_EDEFAULT;
		matriculationNumberESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ExoCarPackage.CAR__MATRICULATION_NUMBER, oldMatriculationNumber, MATRICULATION_NUMBER_EDEFAULT, oldMatriculationNumberESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMatriculationNumber() {
		return matriculationNumberESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMileage() {
		return mileage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMileage(int newMileage) {
		int oldMileage = mileage;
		mileage = newMileage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExoCarPackage.CAR__MILEAGE, oldMileage, mileage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFuelCapacity() {
		return fuelCapacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFuelCapacity(int newFuelCapacity) {
		int oldFuelCapacity = fuelCapacity;
		fuelCapacity = newFuelCapacity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExoCarPackage.CAR__FUEL_CAPACITY, oldFuelCapacity, fuelCapacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBrend() {
		return brend;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBrend(String newBrend) {
		String oldBrend = brend;
		brend = newBrend;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExoCarPackage.CAR__BREND, oldBrend, brend));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getFuelConsumption() {
		return fuelConsumption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFuelConsumption(float newFuelConsumption) {
		float oldFuelConsumption = fuelConsumption;
		fuelConsumption = newFuelConsumption;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExoCarPackage.CAR__FUEL_CONSUMPTION, oldFuelConsumption, fuelConsumption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getCurrentFuelLevel() {
		return currentFuelLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentFuelLevel(float newCurrentFuelLevel) {
		float oldCurrentFuelLevel = currentFuelLevel;
		currentFuelLevel = newCurrentFuelLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExoCarPackage.CAR__CURRENT_FUEL_LEVEL, oldCurrentFuelLevel, currentFuelLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GazType getFuelType() {
		return fuelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFuelType(GazType newFuelType) {
		GazType oldFuelType = fuelType;
		fuelType = newFuelType == null ? FUEL_TYPE_EDEFAULT : newFuelType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExoCarPackage.CAR__FUEL_TYPE, oldFuelType, fuelType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person getPerson() {
		if (person != null && person.eIsProxy()) {
			InternalEObject oldPerson = (InternalEObject)person;
			person = (Person)eResolveProxy(oldPerson);
			if (person != oldPerson) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExoCarPackage.CAR__PERSON, oldPerson, person));
			}
		}
		return person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person basicGetPerson() {
		return person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPerson(Person newPerson, NotificationChain msgs) {
		Person oldPerson = person;
		person = newPerson;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExoCarPackage.CAR__PERSON, oldPerson, newPerson);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPerson(Person newPerson) {
		if (newPerson != person) {
			NotificationChain msgs = null;
			if (person != null)
				msgs = ((InternalEObject)person).eInverseRemove(this, ExoCarPackage.PERSON__CARS, Person.class, msgs);
			if (newPerson != null)
				msgs = ((InternalEObject)newPerson).eInverseAdd(this, ExoCarPackage.PERSON__CARS, Person.class, msgs);
			msgs = basicSetPerson(newPerson, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExoCarPackage.CAR__PERSON, newPerson, newPerson));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColorsType getColor() {
		return color;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColor(ColorsType newColor) {
		ColorsType oldColor = color;
		color = newColor == null ? COLOR_EDEFAULT : newColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExoCarPackage.CAR__COLOR, oldColor, color));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExoCarPackage.CAR__PERSON:
				if (person != null)
					msgs = ((InternalEObject)person).eInverseRemove(this, ExoCarPackage.PERSON__CARS, Person.class, msgs);
				return basicSetPerson((Person)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExoCarPackage.CAR__PERSON:
				return basicSetPerson(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	public void move(float distance) {
		if (distance < 0)
			throw new IllegalArgumentException("Negative distance not accepted: " + distance);

		if (distance > autonomy()) {
			throw new IllegalArgumentException("Out of range: " + distance);
		}
		currentFuelLevel -= (distance / fuelConsumption);
		mileage += distance;
		
		carDao.update(this);
	}

	public float autonomy() {
		return currentFuelLevel * fuelConsumption;
	}

	public void addFuel(float liters) {
		if (liters < 0 || liters > fuelCapacity) {
			throw new IllegalArgumentException("Liters not accepted (negative or bigger than car capacity): " + liters);
		} else if (liters + currentFuelLevel > fuelCapacity) {
			currentFuelLevel = fuelCapacity;
			return;
		}
		currentFuelLevel += liters;
		
		carDao.update(this);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExoCarPackage.CAR__MATRICULATION_NUMBER:
				return getMatriculationNumber();
			case ExoCarPackage.CAR__MILEAGE:
				return getMileage();
			case ExoCarPackage.CAR__FUEL_CAPACITY:
				return getFuelCapacity();
			case ExoCarPackage.CAR__BREND:
				return getBrend();
			case ExoCarPackage.CAR__FUEL_CONSUMPTION:
				return getFuelConsumption();
			case ExoCarPackage.CAR__CURRENT_FUEL_LEVEL:
				return getCurrentFuelLevel();
			case ExoCarPackage.CAR__FUEL_TYPE:
				return getFuelType();
			case ExoCarPackage.CAR__PERSON:
				if (resolve) return getPerson();
				return basicGetPerson();
			case ExoCarPackage.CAR__COLOR:
				return getColor();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ExoCarPackage.CAR__MATRICULATION_NUMBER:
				setMatriculationNumber((String)newValue);
				return;
			case ExoCarPackage.CAR__MILEAGE:
				setMileage((Integer)newValue);
				return;
			case ExoCarPackage.CAR__FUEL_CAPACITY:
				setFuelCapacity((Integer)newValue);
				return;
			case ExoCarPackage.CAR__BREND:
				setBrend((String)newValue);
				return;
			case ExoCarPackage.CAR__FUEL_CONSUMPTION:
				setFuelConsumption((Float)newValue);
				return;
			case ExoCarPackage.CAR__CURRENT_FUEL_LEVEL:
				setCurrentFuelLevel((Float)newValue);
				return;
			case ExoCarPackage.CAR__FUEL_TYPE:
				setFuelType((GazType)newValue);
				return;
			case ExoCarPackage.CAR__PERSON:
				setPerson((Person)newValue);
				return;
			case ExoCarPackage.CAR__COLOR:
				setColor((ColorsType)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ExoCarPackage.CAR__MATRICULATION_NUMBER:
				unsetMatriculationNumber();
				return;
			case ExoCarPackage.CAR__MILEAGE:
				setMileage(MILEAGE_EDEFAULT);
				return;
			case ExoCarPackage.CAR__FUEL_CAPACITY:
				setFuelCapacity(FUEL_CAPACITY_EDEFAULT);
				return;
			case ExoCarPackage.CAR__BREND:
				setBrend(BREND_EDEFAULT);
				return;
			case ExoCarPackage.CAR__FUEL_CONSUMPTION:
				setFuelConsumption(FUEL_CONSUMPTION_EDEFAULT);
				return;
			case ExoCarPackage.CAR__CURRENT_FUEL_LEVEL:
				setCurrentFuelLevel(CURRENT_FUEL_LEVEL_EDEFAULT);
				return;
			case ExoCarPackage.CAR__FUEL_TYPE:
				setFuelType(FUEL_TYPE_EDEFAULT);
				return;
			case ExoCarPackage.CAR__PERSON:
				setPerson((Person)null);
				return;
			case ExoCarPackage.CAR__COLOR:
				setColor(COLOR_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ExoCarPackage.CAR__MATRICULATION_NUMBER:
				return isSetMatriculationNumber();
			case ExoCarPackage.CAR__MILEAGE:
				return mileage != MILEAGE_EDEFAULT;
			case ExoCarPackage.CAR__FUEL_CAPACITY:
				return fuelCapacity != FUEL_CAPACITY_EDEFAULT;
			case ExoCarPackage.CAR__BREND:
				return BREND_EDEFAULT == null ? brend != null : !BREND_EDEFAULT.equals(brend);
			case ExoCarPackage.CAR__FUEL_CONSUMPTION:
				return fuelConsumption != FUEL_CONSUMPTION_EDEFAULT;
			case ExoCarPackage.CAR__CURRENT_FUEL_LEVEL:
				return currentFuelLevel != CURRENT_FUEL_LEVEL_EDEFAULT;
			case ExoCarPackage.CAR__FUEL_TYPE:
				return fuelType != FUEL_TYPE_EDEFAULT;
			case ExoCarPackage.CAR__PERSON:
				return person != null;
			case ExoCarPackage.CAR__COLOR:
				return color != COLOR_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (matriculationNumber: ");
		if (matriculationNumberESet) result.append(matriculationNumber); else result.append("<unset>");
		result.append(", mileage: ");
		result.append(mileage);
		result.append(", fuelCapacity: ");
		result.append(fuelCapacity);
		result.append(", brend: ");
		result.append(brend);
		result.append(", fuelConsumption: ");
		result.append(fuelConsumption);
		result.append(", currentFuelLevel: ");
		result.append(currentFuelLevel);
		result.append(", fuelType: ");
		result.append(fuelType);
		result.append(", color: ");
		result.append(color);
		result.append(')');
		return result.toString();
	}

	@SuppressWarnings("unlikely-arg-type")
	public void checkIfValidMatricolationNumber(String matricolationNumber) {
		List<Car> allMatriculationNumbers = carDao.getAllImmatriculationNumbers();
		if (!allMatriculationNumbers.isEmpty()) {
			if (allMatriculationNumbers.contains(matricolationNumber)) {
				throw new IllegalArgumentException("Matricolationnumber already used: " + matricolationNumber);
			}
		}
	}

} //CarImpl
