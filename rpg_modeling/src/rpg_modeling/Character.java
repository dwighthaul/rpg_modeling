/**
 */
package rpg_modeling;

import org.eclipse.emf.common.util.EList;

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
   * Returns the value of the '<em><b>Equipment</b></em>' containment reference list.
   * The list contents are of type {@link rpg_modeling.Equipment}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Equipment</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Equipment</em>' containment reference list.
   * @see rpg_modeling.Rpg_modelingPackage#getCharacter_Equipment()
   * @model containment="true"
   * @generated
   */
  EList<Equipment> getEquipment();

} // Character
