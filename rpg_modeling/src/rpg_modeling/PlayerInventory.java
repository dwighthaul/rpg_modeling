/**
 */
package rpg_modeling;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Player Inventory</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rpg_modeling.PlayerInventory#getConsumableobject <em>Consumableobject</em>}</li>
 *   <li>{@link rpg_modeling.PlayerInventory#getQuestobject <em>Questobject</em>}</li>
 *   <li>{@link rpg_modeling.PlayerInventory#getEquipmentobject <em>Equipmentobject</em>}</li>
 * </ul>
 *
 * @see rpg_modeling.Rpg_modelingPackage#getPlayerInventory()
 * @model
 * @generated
 */
public interface PlayerInventory extends Inventory {
  /**
   * Returns the value of the '<em><b>Consumableobject</b></em>' containment reference list.
   * The list contents are of type {@link rpg_modeling.ConsumableObject}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Consumableobject</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Consumableobject</em>' containment reference list.
   * @see rpg_modeling.Rpg_modelingPackage#getPlayerInventory_Consumableobject()
   * @model containment="true"
   * @generated
   */
  EList<ConsumableObject> getConsumableobject();

  /**
   * Returns the value of the '<em><b>Questobject</b></em>' containment reference list.
   * The list contents are of type {@link rpg_modeling.QuestObject}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Questobject</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Questobject</em>' containment reference list.
   * @see rpg_modeling.Rpg_modelingPackage#getPlayerInventory_Questobject()
   * @model containment="true"
   * @generated
   */
  EList<QuestObject> getQuestobject();

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
   * @see rpg_modeling.Rpg_modelingPackage#getPlayerInventory_Equipmentobject()
   * @model containment="true"
   * @generated
   */
  EList<EquipmentObject> getEquipmentobject();

} // PlayerInventory
