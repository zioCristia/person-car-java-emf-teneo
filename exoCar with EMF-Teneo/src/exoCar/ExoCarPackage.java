/**
 */
package exoCar;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see exoCar.ExoCarFactory
 * @model kind="package"
 * @generated
 */
public interface ExoCarPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "exoCar";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "com.dps.fr.exoCar";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "exoCar";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExoCarPackage eINSTANCE = exoCar.impl.ExoCarPackageImpl.init();

	/**
	 * The meta object id for the '{@link exoCar.impl.CarImpl <em>Car</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see exoCar.impl.CarImpl
	 * @see exoCar.impl.ExoCarPackageImpl#getCar()
	 * @generated
	 */
	int CAR = 0;

	/**
	 * The feature id for the '<em><b>Matriculation Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR__MATRICULATION_NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Mileage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR__MILEAGE = 1;

	/**
	 * The feature id for the '<em><b>Fuel Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR__FUEL_CAPACITY = 2;

	/**
	 * The feature id for the '<em><b>Brend</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR__BREND = 3;

	/**
	 * The feature id for the '<em><b>Fuel Consumption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR__FUEL_CONSUMPTION = 4;

	/**
	 * The feature id for the '<em><b>Current Fuel Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR__CURRENT_FUEL_LEVEL = 5;

	/**
	 * The feature id for the '<em><b>Fuel Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR__FUEL_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Person</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR__PERSON = 7;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR__COLOR = 8;

	/**
	 * The number of structural features of the '<em>Car</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Car</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link exoCar.impl.PersonImpl <em>Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see exoCar.impl.PersonImpl
	 * @see exoCar.impl.ExoCarPackageImpl#getPerson()
	 * @generated
	 */
	int PERSON = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__NAME = 0;

	/**
	 * The feature id for the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__AGE = 1;

	/**
	 * The feature id for the '<em><b>Cars</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__CARS = 2;

	/**
	 * The number of structural features of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link exoCar.GazType <em>Gaz Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see exoCar.GazType
	 * @see exoCar.impl.ExoCarPackageImpl#getGazType()
	 * @generated
	 */
	int GAZ_TYPE = 2;

	/**
	 * The meta object id for the '{@link exoCar.ColorsType <em>Colors Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see exoCar.ColorsType
	 * @see exoCar.impl.ExoCarPackageImpl#getColorsType()
	 * @generated
	 */
	int COLORS_TYPE = 3;


	/**
	 * Returns the meta object for class '{@link exoCar.Car <em>Car</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Car</em>'.
	 * @see exoCar.Car
	 * @generated
	 */
	EClass getCar();

	/**
	 * Returns the meta object for the attribute '{@link exoCar.Car#getMatriculationNumber <em>Matriculation Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Matriculation Number</em>'.
	 * @see exoCar.Car#getMatriculationNumber()
	 * @see #getCar()
	 * @generated
	 */
	EAttribute getCar_MatriculationNumber();

	/**
	 * Returns the meta object for the attribute '{@link exoCar.Car#getMileage <em>Mileage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mileage</em>'.
	 * @see exoCar.Car#getMileage()
	 * @see #getCar()
	 * @generated
	 */
	EAttribute getCar_Mileage();

	/**
	 * Returns the meta object for the attribute '{@link exoCar.Car#getFuelCapacity <em>Fuel Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fuel Capacity</em>'.
	 * @see exoCar.Car#getFuelCapacity()
	 * @see #getCar()
	 * @generated
	 */
	EAttribute getCar_FuelCapacity();

	/**
	 * Returns the meta object for the attribute '{@link exoCar.Car#getBrend <em>Brend</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Brend</em>'.
	 * @see exoCar.Car#getBrend()
	 * @see #getCar()
	 * @generated
	 */
	EAttribute getCar_Brend();

	/**
	 * Returns the meta object for the attribute '{@link exoCar.Car#getFuelConsumption <em>Fuel Consumption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fuel Consumption</em>'.
	 * @see exoCar.Car#getFuelConsumption()
	 * @see #getCar()
	 * @generated
	 */
	EAttribute getCar_FuelConsumption();

	/**
	 * Returns the meta object for the attribute '{@link exoCar.Car#getCurrentFuelLevel <em>Current Fuel Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current Fuel Level</em>'.
	 * @see exoCar.Car#getCurrentFuelLevel()
	 * @see #getCar()
	 * @generated
	 */
	EAttribute getCar_CurrentFuelLevel();

	/**
	 * Returns the meta object for the attribute '{@link exoCar.Car#getFuelType <em>Fuel Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fuel Type</em>'.
	 * @see exoCar.Car#getFuelType()
	 * @see #getCar()
	 * @generated
	 */
	EAttribute getCar_FuelType();

	/**
	 * Returns the meta object for the reference '{@link exoCar.Car#getPerson <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Person</em>'.
	 * @see exoCar.Car#getPerson()
	 * @see #getCar()
	 * @generated
	 */
	EReference getCar_Person();

	/**
	 * Returns the meta object for the attribute '{@link exoCar.Car#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see exoCar.Car#getColor()
	 * @see #getCar()
	 * @generated
	 */
	EAttribute getCar_Color();

	/**
	 * Returns the meta object for class '{@link exoCar.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person</em>'.
	 * @see exoCar.Person
	 * @generated
	 */
	EClass getPerson();

	/**
	 * Returns the meta object for the attribute '{@link exoCar.Person#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see exoCar.Person#getName()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Name();

	/**
	 * Returns the meta object for the attribute '{@link exoCar.Person#getAge <em>Age</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Age</em>'.
	 * @see exoCar.Person#getAge()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Age();

	/**
	 * Returns the meta object for the reference list '{@link exoCar.Person#getCars <em>Cars</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Cars</em>'.
	 * @see exoCar.Person#getCars()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_Cars();

	/**
	 * Returns the meta object for enum '{@link exoCar.GazType <em>Gaz Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Gaz Type</em>'.
	 * @see exoCar.GazType
	 * @generated
	 */
	EEnum getGazType();

	/**
	 * Returns the meta object for enum '{@link exoCar.ColorsType <em>Colors Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Colors Type</em>'.
	 * @see exoCar.ColorsType
	 * @generated
	 */
	EEnum getColorsType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ExoCarFactory getExoCarFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link exoCar.impl.CarImpl <em>Car</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see exoCar.impl.CarImpl
		 * @see exoCar.impl.ExoCarPackageImpl#getCar()
		 * @generated
		 */
		EClass CAR = eINSTANCE.getCar();

		/**
		 * The meta object literal for the '<em><b>Matriculation Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAR__MATRICULATION_NUMBER = eINSTANCE.getCar_MatriculationNumber();

		/**
		 * The meta object literal for the '<em><b>Mileage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAR__MILEAGE = eINSTANCE.getCar_Mileage();

		/**
		 * The meta object literal for the '<em><b>Fuel Capacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAR__FUEL_CAPACITY = eINSTANCE.getCar_FuelCapacity();

		/**
		 * The meta object literal for the '<em><b>Brend</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAR__BREND = eINSTANCE.getCar_Brend();

		/**
		 * The meta object literal for the '<em><b>Fuel Consumption</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAR__FUEL_CONSUMPTION = eINSTANCE.getCar_FuelConsumption();

		/**
		 * The meta object literal for the '<em><b>Current Fuel Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAR__CURRENT_FUEL_LEVEL = eINSTANCE.getCar_CurrentFuelLevel();

		/**
		 * The meta object literal for the '<em><b>Fuel Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAR__FUEL_TYPE = eINSTANCE.getCar_FuelType();

		/**
		 * The meta object literal for the '<em><b>Person</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAR__PERSON = eINSTANCE.getCar_Person();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAR__COLOR = eINSTANCE.getCar_Color();

		/**
		 * The meta object literal for the '{@link exoCar.impl.PersonImpl <em>Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see exoCar.impl.PersonImpl
		 * @see exoCar.impl.ExoCarPackageImpl#getPerson()
		 * @generated
		 */
		EClass PERSON = eINSTANCE.getPerson();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__NAME = eINSTANCE.getPerson_Name();

		/**
		 * The meta object literal for the '<em><b>Age</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__AGE = eINSTANCE.getPerson_Age();

		/**
		 * The meta object literal for the '<em><b>Cars</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__CARS = eINSTANCE.getPerson_Cars();

		/**
		 * The meta object literal for the '{@link exoCar.GazType <em>Gaz Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see exoCar.GazType
		 * @see exoCar.impl.ExoCarPackageImpl#getGazType()
		 * @generated
		 */
		EEnum GAZ_TYPE = eINSTANCE.getGazType();

		/**
		 * The meta object literal for the '{@link exoCar.ColorsType <em>Colors Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see exoCar.ColorsType
		 * @see exoCar.impl.ExoCarPackageImpl#getColorsType()
		 * @generated
		 */
		EEnum COLORS_TYPE = eINSTANCE.getColorsType();

	}

} //ExoCarPackage
