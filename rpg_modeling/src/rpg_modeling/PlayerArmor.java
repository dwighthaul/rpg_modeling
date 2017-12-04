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
 *   <li>{@link rpg_modeling.PlayerArmor#getArm <em>Arm</em>}</li>
 *   <li>{@link rpg_modeling.PlayerArmor#getChest <em>Chest</em>}</li>
 *   <li>{@link rpg_modeling.PlayerArmor#getLeg <em>Leg</em>}</li>
 *   <li>{@link rpg_modeling.PlayerArmor#getRight_hand <em>Right hand</em>}</li>
 *   <li>{@link rpg_modeling.PlayerArmor#getLeft_hand <em>Left hand</em>}</li>
 *   <li>{@link rpg_modeling.PlayerArmor#getHand <em>Hand</em>}</li>
 *   <li>{@link rpg_modeling.PlayerArmor#getFoot <em>Foot</em>}</li>
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
   * Returns the value of the '<em><b>Arm</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Arm</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Arm</em>' attribute.
   * @see #setArm(int)
   * @see rpg_modeling.Rpg_modelingPackage#getPlayerArmor_Arm()
   * @model dataType="org.eclipse.emf.ecore.xml.type.Int"
   * @generated
   */
  int getArm();

  /**
   * Sets the value of the '{@link rpg_modeling.PlayerArmor#getArm <em>Arm</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Arm</em>' attribute.
   * @see #getArm()
   * @generated
   */
  void setArm(int value);

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

  /**
   * Returns the value of the '<em><b>Leg</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Leg</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Leg</em>' attribute.
   * @see #setLeg(int)
   * @see rpg_modeling.Rpg_modelingPackage#getPlayerArmor_Leg()
   * @model dataType="org.eclipse.emf.ecore.xml.type.Int"
   * @generated
   */
  int getLeg();

  /**
   * Sets the value of the '{@link rpg_modeling.PlayerArmor#getLeg <em>Leg</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Leg</em>' attribute.
   * @see #getLeg()
   * @generated
   */
  void setLeg(int value);

  /**
   * Returns the value of the '<em><b>Right hand</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right hand</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right hand</em>' attribute.
   * @see #setRight_hand(int)
   * @see rpg_modeling.Rpg_modelingPackage#getPlayerArmor_Right_hand()
   * @model dataType="org.eclipse.emf.ecore.xml.type.Int"
   * @generated
   */
  int getRight_hand();

  /**
   * Sets the value of the '{@link rpg_modeling.PlayerArmor#getRight_hand <em>Right hand</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right hand</em>' attribute.
   * @see #getRight_hand()
   * @generated
   */
  void setRight_hand(int value);

  /**
   * Returns the value of the '<em><b>Left hand</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left hand</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left hand</em>' attribute.
   * @see #setLeft_hand(int)
   * @see rpg_modeling.Rpg_modelingPackage#getPlayerArmor_Left_hand()
   * @model dataType="org.eclipse.emf.ecore.xml.type.Int"
   * @generated
   */
  int getLeft_hand();

  /**
   * Sets the value of the '{@link rpg_modeling.PlayerArmor#getLeft_hand <em>Left hand</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left hand</em>' attribute.
   * @see #getLeft_hand()
   * @generated
   */
  void setLeft_hand(int value);

  /**
   * Returns the value of the '<em><b>Hand</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Hand</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Hand</em>' attribute.
   * @see #setHand(int)
   * @see rpg_modeling.Rpg_modelingPackage#getPlayerArmor_Hand()
   * @model dataType="org.eclipse.emf.ecore.xml.type.Int"
   * @generated
   */
  int getHand();

  /**
   * Sets the value of the '{@link rpg_modeling.PlayerArmor#getHand <em>Hand</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Hand</em>' attribute.
   * @see #getHand()
   * @generated
   */
  void setHand(int value);

  /**
   * Returns the value of the '<em><b>Foot</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Foot</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Foot</em>' attribute.
   * @see #setFoot(int)
   * @see rpg_modeling.Rpg_modelingPackage#getPlayerArmor_Foot()
   * @model dataType="org.eclipse.emf.ecore.xml.type.Int"
   * @generated
   */
  int getFoot();

  /**
   * Sets the value of the '{@link rpg_modeling.PlayerArmor#getFoot <em>Foot</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Foot</em>' attribute.
   * @see #getFoot()
   * @generated
   */
  void setFoot(int value);

} // PlayerArmor
