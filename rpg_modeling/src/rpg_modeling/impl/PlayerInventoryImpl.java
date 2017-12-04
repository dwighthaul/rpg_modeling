/**
 */
package rpg_modeling.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import rpg_modeling.ConsumableObject;
import rpg_modeling.EquipmentObject;
import rpg_modeling.PlayerInventory;
import rpg_modeling.QuestObject;
import rpg_modeling.Rpg_modelingPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Player Inventory</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rpg_modeling.impl.PlayerInventoryImpl#getConsumableobject <em>Consumableobject</em>}</li>
 *   <li>{@link rpg_modeling.impl.PlayerInventoryImpl#getQuestobject <em>Questobject</em>}</li>
 *   <li>{@link rpg_modeling.impl.PlayerInventoryImpl#getEquipmentobject <em>Equipmentobject</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlayerInventoryImpl extends InventoryImpl implements PlayerInventory {
  /**
   * The cached value of the '{@link #getConsumableobject() <em>Consumableobject</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConsumableobject()
   * @generated
   * @ordered
   */
  protected EList<ConsumableObject> consumableobject;

  /**
   * The cached value of the '{@link #getQuestobject() <em>Questobject</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQuestobject()
   * @generated
   * @ordered
   */
  protected EList<QuestObject> questobject;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PlayerInventoryImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return Rpg_modelingPackage.Literals.PLAYER_INVENTORY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ConsumableObject> getConsumableobject() {
    if (consumableobject == null) {
      consumableobject = new EObjectContainmentEList<ConsumableObject>(ConsumableObject.class, this, Rpg_modelingPackage.PLAYER_INVENTORY__CONSUMABLEOBJECT);
    }
    return consumableobject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<QuestObject> getQuestobject() {
    if (questobject == null) {
      questobject = new EObjectContainmentEList<QuestObject>(QuestObject.class, this, Rpg_modelingPackage.PLAYER_INVENTORY__QUESTOBJECT);
    }
    return questobject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EquipmentObject> getEquipmentobject() {
    if (equipmentobject == null) {
      equipmentobject = new EObjectContainmentEList<EquipmentObject>(EquipmentObject.class, this, Rpg_modelingPackage.PLAYER_INVENTORY__EQUIPMENTOBJECT);
    }
    return equipmentobject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case Rpg_modelingPackage.PLAYER_INVENTORY__CONSUMABLEOBJECT:
        return ((InternalEList<?>)getConsumableobject()).basicRemove(otherEnd, msgs);
      case Rpg_modelingPackage.PLAYER_INVENTORY__QUESTOBJECT:
        return ((InternalEList<?>)getQuestobject()).basicRemove(otherEnd, msgs);
      case Rpg_modelingPackage.PLAYER_INVENTORY__EQUIPMENTOBJECT:
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
      case Rpg_modelingPackage.PLAYER_INVENTORY__CONSUMABLEOBJECT:
        return getConsumableobject();
      case Rpg_modelingPackage.PLAYER_INVENTORY__QUESTOBJECT:
        return getQuestobject();
      case Rpg_modelingPackage.PLAYER_INVENTORY__EQUIPMENTOBJECT:
        return getEquipmentobject();
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
      case Rpg_modelingPackage.PLAYER_INVENTORY__CONSUMABLEOBJECT:
        getConsumableobject().clear();
        getConsumableobject().addAll((Collection<? extends ConsumableObject>)newValue);
        return;
      case Rpg_modelingPackage.PLAYER_INVENTORY__QUESTOBJECT:
        getQuestobject().clear();
        getQuestobject().addAll((Collection<? extends QuestObject>)newValue);
        return;
      case Rpg_modelingPackage.PLAYER_INVENTORY__EQUIPMENTOBJECT:
        getEquipmentobject().clear();
        getEquipmentobject().addAll((Collection<? extends EquipmentObject>)newValue);
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
      case Rpg_modelingPackage.PLAYER_INVENTORY__CONSUMABLEOBJECT:
        getConsumableobject().clear();
        return;
      case Rpg_modelingPackage.PLAYER_INVENTORY__QUESTOBJECT:
        getQuestobject().clear();
        return;
      case Rpg_modelingPackage.PLAYER_INVENTORY__EQUIPMENTOBJECT:
        getEquipmentobject().clear();
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
      case Rpg_modelingPackage.PLAYER_INVENTORY__CONSUMABLEOBJECT:
        return consumableobject != null && !consumableobject.isEmpty();
      case Rpg_modelingPackage.PLAYER_INVENTORY__QUESTOBJECT:
        return questobject != null && !questobject.isEmpty();
      case Rpg_modelingPackage.PLAYER_INVENTORY__EQUIPMENTOBJECT:
        return equipmentobject != null && !equipmentobject.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //PlayerInventoryImpl
