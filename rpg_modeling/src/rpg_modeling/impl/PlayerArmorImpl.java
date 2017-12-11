/**
 */
package rpg_modeling.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
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
 *   <li>{@link rpg_modeling.impl.PlayerArmorImpl#getEquipmentobjects <em>Equipmentobjects</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlayerArmorImpl extends MinimalEObjectImpl.Container implements PlayerArmor {
  /**
   * The cached value of the '{@link #getEquipmentobjects() <em>Equipmentobjects</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEquipmentobjects()
   * @generated
   * @ordered
   */
  protected EList<EquipmentObject> equipmentobjects;

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
  public EList<EquipmentObject> getEquipmentobjects() {
    if (equipmentobjects == null) {
      equipmentobjects = new EObjectContainmentEList<EquipmentObject>(EquipmentObject.class, this, Rpg_modelingPackage.PLAYER_ARMOR__EQUIPMENTOBJECTS);
    }
    return equipmentobjects;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case Rpg_modelingPackage.PLAYER_ARMOR__EQUIPMENTOBJECTS:
        return ((InternalEList<?>)getEquipmentobjects()).basicRemove(otherEnd, msgs);
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
      case Rpg_modelingPackage.PLAYER_ARMOR__EQUIPMENTOBJECTS:
        return getEquipmentobjects();
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
      case Rpg_modelingPackage.PLAYER_ARMOR__EQUIPMENTOBJECTS:
        getEquipmentobjects().clear();
        getEquipmentobjects().addAll((Collection<? extends EquipmentObject>)newValue);
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
      case Rpg_modelingPackage.PLAYER_ARMOR__EQUIPMENTOBJECTS:
        getEquipmentobjects().clear();
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
      case Rpg_modelingPackage.PLAYER_ARMOR__EQUIPMENTOBJECTS:
        return equipmentobjects != null && !equipmentobjects.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //PlayerArmorImpl
