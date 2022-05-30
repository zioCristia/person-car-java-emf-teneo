/**
 */
package exoCar.impl;

import exoCar.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import dao.CarDao;
import dao.PersonDao;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExoCarFactoryImpl extends EFactoryImpl implements ExoCarFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ExoCarFactory init() {
		try {
			ExoCarFactory theExoCarFactory = (ExoCarFactory)EPackage.Registry.INSTANCE.getEFactory(ExoCarPackage.eNS_URI);
			if (theExoCarFactory != null) {
				return theExoCarFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ExoCarFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExoCarFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ExoCarPackage.CAR: return createCar();
			case ExoCarPackage.PERSON: return createPerson();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ExoCarPackage.GAZ_TYPE:
				return createGazTypeFromString(eDataType, initialValue);
			case ExoCarPackage.COLORS_TYPE:
				return createColorsTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ExoCarPackage.GAZ_TYPE:
				return convertGazTypeToString(eDataType, instanceValue);
			case ExoCarPackage.COLORS_TYPE:
				return convertColorsTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Car createCar() {
		CarImpl car = new CarImpl();
		return car;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person createPerson() {
		PersonImpl person = new PersonImpl();
		return person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GazType createGazTypeFromString(EDataType eDataType, String initialValue) {
		GazType result = GazType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGazTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColorsType createColorsTypeFromString(EDataType eDataType, String initialValue) {
		ColorsType result = ColorsType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertColorsTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExoCarPackage getExoCarPackage() {
		return (ExoCarPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ExoCarPackage getPackage() {
		return ExoCarPackage.eINSTANCE;
	}

	@Override
	public Car createCar(String matriculationNumber, int fuelCapacity, String brend, float fuelConsumption, GazType fuelType, ColorsType color) {
		CarImpl car = new CarImpl();
		
		car.setMatriculationNumber(matriculationNumber);
		car.setFuelCapacity(fuelCapacity);
		car.setBrend(brend);
		car.setFuelConsumption(fuelConsumption);
		car.setFuelType(fuelType);
		car.setColor(color);
		
		car.setMileage(0);
		car.setCurrentFuelLevel(fuelCapacity);
		
		CarDao carDao = new CarDao();
		carDao.save(car);
		
		return car;
	}

	@Override
	public Person createPerson(String name, int age) {
		PersonImpl person = new PersonImpl();
		
		person.setName(name);
		person.setAge(age);
		
		PersonDao personDao = new PersonDao();
		personDao.save(person);

		return person;
		
	}

} //ExoCarFactoryImpl
