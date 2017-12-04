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
 *   <li>{@link rpg_modeling.PlayerArmor#getEquipmentobject <em>Equipmentobject</em>}</li>
 *   <li>{@link rpg_modeling.PlayerArmor#getHead <em>Head</em>}</li>
 *   <li>{@link rpg_modeling.PlayerArmor#getChest <em>Chest</em>}</li>
 * </ul>
 *
 * @see rpg_modeling.Rpg_modelingPackage#getPlayerArmor()
 * @model
 * @generated
 */
public interface PlayerArmor extends EObject {
  /**
   * Returns the value of the '<em><b>Equipmentobject</b></em>' containment reference list.
   * The list contents are of type {@link rpg_modeling.EquipmentObject}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Equipmentobject</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Equipmentobject</em>' containment reference list.
   * @see rpg_modeling.Rpg_modelingPackage#getPlayerArmor_Equipmentobject()
   * @model containment="true" upper="8"
   * @generated
   */
  EList<EquipmentObject> getEquipmentobject();

  /**
   * Returns the value of the '<em><b>Head</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Head</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Head</em>' attribute.
   * @see #setHead(int)
   * @see rpg_modeling.Rpg_modelingPackage#getPlayerArmor_Head()
   * @model dataType="org.eclipse.emf.ecore.xml.type.Int"
   * @generated
   */
  int getHead();

  /**
   * Sets the value of the '{@link rpg_modeling.PlayerArmor#getHead <em>Head</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Head</em>' attribute.
   * @see #getHead()
   * @generated
   */
  void setHead(int value);

  /**
   * Returns the value of the '<em><b>Chest</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Chest</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Chest</em>' attribute.
   * @see #setChest(int)
   * @see rpg_modeling.Rpg_modelingPackage#getPlayerArmor_Chest()
   * @model dataType="org.eclipse.emf.ecore.xml.type.Int"
   * @generated
   */
  int getChest();

  /**
   * Sets the value of the '{@link rpg_modeling.PlayerArmor#getChest <em>Chest</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Chest</em>' attribute.
   * @see #getChest()
   * @generated
   */
  void setChest(int value);

} // PlayerArmor
