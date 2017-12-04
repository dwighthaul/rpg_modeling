/**
 */
package rpg_modeling;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Equipment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rpg_modeling.Equipment#getInventory <em>Inventory</em>}</li>
 *   <li>{@link rpg_modeling.Equipment#getArmor <em>Armor</em>}</li>
 * </ul>
 *
 * @see rpg_modeling.Rpg_modelingPackage#getEquipment()
 * @model
 * @generated
 */
public interface Equipment extends EObject {
  /**
   * Returns the value of the '<em><b>Inventory</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Inventory</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Inventory</em>' containment reference.
   * @see #setInventory(PlayerInventory)
   * @see rpg_modeling.Rpg_modelingPackage#getEquipment_Inventory()
   * @model containment="true" required="true"
   * @generated
   */
  PlayerInventory getInventory();

  /**
   * Sets the value of the '{@link rpg_modeling.Equipment#getInventory <em>Inventory</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Inventory</em>' containment reference.
   * @see #getInventory()
   * @generated
   */
  void setInventory(PlayerInventory value);

  /**
   * Returns the value of the '<em><b>Armor</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Armor</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Armor</em>' containment reference.
   * @see #setArmor(PlayerArmor)
   * @see rpg_modeling.Rpg_modelingPackage#getEquipment_Armor()
   * @model containment="true" required="true"
   * @generated
   */
  PlayerArmor getArmor();

  /**
   * Sets the value of the '{@link rpg_modeling.Equipment#getArmor <em>Armor</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Armor</em>' containment reference.
   * @see #getArmor()
   * @generated
   */
  void setArmor(PlayerArmor value);

} // Equipment
