/**
 */
package exoCar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Car</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link exoCar.Car#getMatriculationNumber <em>Matriculation Number</em>}</li>
 *   <li>{@link exoCar.Car#getMileage <em>Mileage</em>}</li>
 *   <li>{@link exoCar.Car#getFuelCapacity <em>Fuel Capacity</em>}</li>
 *   <li>{@link exoCar.Car#getBrend <em>Brend</em>}</li>
 *   <li>{@link exoCar.Car#getFuelConsumption <em>Fuel Consumption</em>}</li>
 *   <li>{@link exoCar.Car#getCurrentFuelLevel <em>Current Fuel Level</em>}</li>
 *   <li>{@link exoCar.Car#getFuelType <em>Fuel Type</em>}</li>
 *   <li>{@link exoCar.Car#getPerson <em>Person</em>}</li>
 *   <li>{@link exoCar.Car#getColor <em>Color</em>}</li>
 * </ul>
 *
 * @see exoCar.ExoCarPackage#getCar()
 * @model
 * @generated
 */
public interface Car extends EObject {
	/**
	 * Returns the value of the '<em><b>Matriculation Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Matriculation Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Matriculation Number</em>' attribute.
	 * @see #isSetMatriculationNumber()
	 * @see #unsetMatriculationNumber()
	 * @see #setMatriculationNumber(String)
	 * @see exoCar.ExoCarPackage#getCar_MatriculationNumber()
	 * @model unsettable="true" required="true"
	 *        annotation="teneo.jpa value='@Id'"
	 * @generated
	 */
	String getMatriculationNumber();

	/**
	 * Sets the value of the '{@link exoCar.Car#getMatriculationNumber <em>Matriculation Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Matriculation Number</em>' attribute.
	 * @see #isSetMatriculationNumber()
	 * @see #unsetMatriculationNumber()
	 * @see #getMatriculationNumber()
	 * @generated
	 */
	void setMatriculationNumber(String value);

	/**
	 * Unsets the value of the '{@link exoCar.Car#getMatriculationNumber <em>Matriculation Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMatriculationNumber()
	 * @see #getMatriculationNumber()
	 * @see #setMatriculationNumber(String)
	 * @generated
	 */
	void unsetMatriculationNumber();

	/**
	 * Returns whether the value of the '{@link exoCar.Car#getMatriculationNumber <em>Matriculation Number</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Matriculation Number</em>' attribute is set.
	 * @see #unsetMatriculationNumber()
	 * @see #getMatriculationNumber()
	 * @see #setMatriculationNumber(String)
	 * @generated
	 */
	boolean isSetMatriculationNumber();

	/**
	 * Returns the value of the '<em><b>Mileage</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mileage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mileage</em>' attribute.
	 * @see #setMileage(int)
	 * @see exoCar.ExoCarPackage#getCar_Mileage()
	 * @model default="0" required="true"
	 * @generated
	 */
	int getMileage();

	/**
	 * Sets the value of the '{@link exoCar.Car#getMileage <em>Mileage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mileage</em>' attribute.
	 * @see #getMileage()
	 * @generated
	 */
	void setMileage(int value);

	/**
	 * Returns the value of the '<em><b>Fuel Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fuel Capacity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fuel Capacity</em>' attribute.
	 * @see #setFuelCapacity(int)
	 * @see exoCar.ExoCarPackage#getCar_FuelCapacity()
	 * @model required="true"
	 * @generated
	 */
	int getFuelCapacity();

	/**
	 * Sets the value of the '{@link exoCar.Car#getFuelCapacity <em>Fuel Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fuel Capacity</em>' attribute.
	 * @see #getFuelCapacity()
	 * @generated
	 */
	void setFuelCapacity(int value);

	/**
	 * Returns the value of the '<em><b>Brend</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Brend</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Brend</em>' attribute.
	 * @see #setBrend(String)
	 * @see exoCar.ExoCarPackage#getCar_Brend()
	 * @model required="true"
	 * @generated
	 */
	String getBrend();

	/**
	 * Sets the value of the '{@link exoCar.Car#getBrend <em>Brend</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Brend</em>' attribute.
	 * @see #getBrend()
	 * @generated
	 */
	void setBrend(String value);

	/**
	 * Returns the value of the '<em><b>Fuel Consumption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fuel Consumption</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fuel Consumption</em>' attribute.
	 * @see #setFuelConsumption(float)
	 * @see exoCar.ExoCarPackage#getCar_FuelConsumption()
	 * @model
	 * @generated
	 */
	float getFuelConsumption();

	/**
	 * Sets the value of the '{@link exoCar.Car#getFuelConsumption <em>Fuel Consumption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fuel Consumption</em>' attribute.
	 * @see #getFuelConsumption()
	 * @generated
	 */
	void setFuelConsumption(float value);

	/**
	 * Returns the value of the '<em><b>Current Fuel Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current Fuel Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Fuel Level</em>' attribute.
	 * @see #setCurrentFuelLevel(float)
	 * @see exoCar.ExoCarPackage#getCar_CurrentFuelLevel()
	 * @model required="true"
	 * @generated
	 */
	float getCurrentFuelLevel();

	/**
	 * Sets the value of the '{@link exoCar.Car#getCurrentFuelLevel <em>Current Fuel Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Fuel Level</em>' attribute.
	 * @see #getCurrentFuelLevel()
	 * @generated
	 */
	void setCurrentFuelLevel(float value);

	/**
	 * Returns the value of the '<em><b>Fuel Type</b></em>' attribute.
	 * The literals are from the enumeration {@link exoCar.GazType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fuel Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fuel Type</em>' attribute.
	 * @see exoCar.GazType
	 * @see #setFuelType(GazType)
	 * @see exoCar.ExoCarPackage#getCar_FuelType()
	 * @model required="true"
	 * @generated
	 */
	GazType getFuelType();

	/**
	 * Sets the value of the '{@link exoCar.Car#getFuelType <em>Fuel Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fuel Type</em>' attribute.
	 * @see exoCar.GazType
	 * @see #getFuelType()
	 * @generated
	 */
	void setFuelType(GazType value);

	/**
	 * Returns the value of the '<em><b>Person</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link exoCar.Person#getCars <em>Cars</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Person</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Person</em>' reference.
	 * @see #setPerson(Person)
	 * @see exoCar.ExoCarPackage#getCar_Person()
	 * @see exoCar.Person#getCars
	 * @model opposite="cars"
	 * @generated
	 */
	Person getPerson();

	/**
	 * Sets the value of the '{@link exoCar.Car#getPerson <em>Person</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Person</em>' reference.
	 * @see #getPerson()
	 * @generated
	 */
	void setPerson(Person value);

	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * The literals are from the enumeration {@link exoCar.ColorsType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see exoCar.ColorsType
	 * @see #setColor(ColorsType)
	 * @see exoCar.ExoCarPackage#getCar_Color()
	 * @model required="true"
	 * @generated
	 */
	ColorsType getColor();

	/**
	 * Sets the value of the '{@link exoCar.Car#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see exoCar.ColorsType
	 * @see #getColor()
	 * @generated
	 */
	void setColor(ColorsType value);

	public float autonomy();
	public void addFuel(float liters);
	public void move(float distance);
} // Car
