/**
 */
package rpg_modeling;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Player Armor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rpg_modeling.PlayerArmor#getEquipmentobjects <em>Equipmentobjects</em>}</li>
 * </ul>
 *
 * @see rpg_modeling.Rpg_modelingPackage#getPlayerArmor()
 * @model
 * @generated
 */
public interface PlayerArmor extends EObject {
  /**
   * Returns the value of the '<em><b>Equipmentobjects</b></em>' containment reference list.
   * The list contents are of type {@link rpg_modeling.EquipmentObject}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Equipmentobjects</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Equipmentobjects</em>' containment reference list.
   * @see rpg_modeling.Rpg_modelingPackage#getPlayerArmor_Equipmentobjects()
   * @model containment="true" upper="8"
   * @generated
   */
  EList<EquipmentObject> getEquipmentobjects();

} // PlayerArmor
