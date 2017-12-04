/**
 */
package rpg_modeling.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import rpg_modeling.EquipmentObject;
import rpg_modeling.PlayerArmor;
import rpg_modeling.Rpg_modelingPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Player Armor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rpg_modeling.impl.PlayerArmorImpl#getEquipmentobject <em>Equipmentobject</em>}</li>
 *   <li>{@link rpg_modeling.impl.PlayerArmorImpl#getHead <em>Head</em>}</li>
 *   <li>{@link rpg_modeling.impl.PlayerArmorImpl#getChest <em>Chest</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlayerArmorImpl extends MinimalEObjectImpl.Container implements PlayerArmor {
  /**
   * The cached value of the '{@link #getEquipmentobject() <em>Equipmentobject</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEquipmentobject()
   * @generated
   * @ordered
   */
  protected EList<EquipmentObject> equipmentobject;

  /**
   * The default value of the '{@link #getHead() <em>Head</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHead()
   * @generated
   * @ordered
   */
  protected static final int HEAD_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getHead() <em>Head</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHead()
   * @generated
   * @ordered
   */
  protected int head = HEAD_EDEFAULT;

  /**
   * The default value of the '{@link #getChest() <em>Chest</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChest()
   * @generated
   * @ordered
   */
  protected static final int CHEST_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getChest() <em>Chest</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChest()
   * @generated
   * @ordered
   */
  protected int chest = CHEST_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PlayerArmorImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return Rpg_modelingPackage.Literals.PLAYER_ARMOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EquipmentObject> getEquipmentobject() {
    if (equipmentobject == null) {
      equipmentobject = new EObjectContainmentEList<EquipmentObject>(EquipmentObject.class, this, Rpg_modelingPackage.PLAYER_ARMOR__EQUIPMENTOBJECT);
    }
    return equipmentobject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getHead() {
    return head;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHead(int newHead) {
    int oldHead = head;
    head = newHead;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Rpg_modelingPackage.PLAYER_ARMOR__HEAD, oldHead, head));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getChest() {
    return chest;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setChest(int newChest) {
    int oldChest = chest;
    chest = newChest;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Rpg_modelingPackage.PLAYER_ARMOR__CHEST, oldChest, chest));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case Rpg_modelingPackage.PLAYER_ARMOR__EQUIPMENTOBJECT:
        return ((InternalEList<?>)getEquipmentobject()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case Rpg_modelingPackage.PLAYER_ARMOR__EQUIPMENTOBJECT:
        return getEquipmentobject();
      case Rpg_modelingPackage.PLAYER_ARMOR__HEAD:
        return getHead();
      case Rpg_modelingPackage.PLAYER_ARMOR__CHEST:
        return getChest();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue) {
    switch (featureID) {
      case Rpg_modelingPackage.PLAYER_ARMOR__EQUIPMENTOBJECT:
        getEquipmentobject().clear();
        getEquipmentobject().addAll((Collection<? extends EquipmentObject>)newValue);
        return;
      case Rpg_modelingPackage.PLAYER_ARMOR__HEAD:
        setHead((Integer)newValue);
        return;
      case Rpg_modelingPackage.PLAYER_ARMOR__CHEST:
        setChest((Integer)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID) {
    switch (featureID) {
      case Rpg_modelingPackage.PLAYER_ARMOR__EQUIPMENTOBJECT:
        getEquipmentobject().clear();
        return;
      case Rpg_modelingPackage.PLAYER_ARMOR__HEAD:
        setHead(HEAD_EDEFAULT);
        return;
      case Rpg_modelingPackage.PLAYER_ARMOR__CHEST:
        setChest(CHEST_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID) {
    switch (featureID) {
      case Rpg_modelingPackage.PLAYER_ARMOR__EQUIPMENTOBJECT:
        return equipmentobject != null && !equipmentobject.isEmpty();
      case Rpg_modelingPackage.PLAYER_ARMOR__HEAD:
        return head != HEAD_EDEFAULT;
      case Rpg_modelingPackage.PLAYER_ARMOR__CHEST:
        return chest != CHEST_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString() {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (head: ");
    result.append(head);
    result.append(", chest: ");
    result.append(chest);
    result.append(')');
    return result.toString();
  }

} //PlayerArmorImpl
