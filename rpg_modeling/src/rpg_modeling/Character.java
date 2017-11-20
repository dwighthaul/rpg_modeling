/**
 */
package rpg_modeling;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Character</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rpg_modeling.Character#getEquipment <em>Equipment</em>}</li>
 * </ul>
 *
 * @see rpg_modeling.Rpg_modelingPackage#getCharacter()
 * @model abstract="true"
 * @generated
 */
public interface Character extends EObject {
	/**
	 * Returns the value of the '<em><b>Equipment</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link rpg_modeling.Equipment#getPlayer <em>Player</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Equipment</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Equipment</em>' reference.
	 * @see #setEquipment(Equipment)
	 * @see rpg_modeling.Rpg_modelingPackage#getCharacter_Equipment()
	 * @see rpg_modeling.Equipment#getPlayer
	 * @model opposite="player" required="true"
	 * @generated
	 */
	Equipment getEquipment();

	/**
	 * Sets the value of the '{@link rpg_modeling.Character#getEquipment <em>Equipment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Equipment</em>' reference.
	 * @see #getEquipment()
	 * @generated
	 */
	void setEquipment(Equipment value);

} // Character
