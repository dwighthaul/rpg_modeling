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

import rpg_modeling.Equipment;
import rpg_modeling.Rpg_modelingPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Character</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rpg_modeling.impl.CharacterImpl#getEquipment <em>Equipment</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CharacterImpl extends MinimalEObjectImpl.Container implements rpg_modeling.Character {
  /**
   * The cached value of the '{@link #getEquipment() <em>Equipment</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEquipment()
   * @generated
   * @ordered
   */
  protected EList<Equipment> equipment;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CharacterImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return Rpg_modelingPackage.Literals.CHARACTER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Equipment> getEquipment() {
    if (equipment == null) {
      equipment = new EObjectContainmentEList<Equipment>(Equipment.class, this, Rpg_modelingPackage.CHARACTER__EQUIPMENT);
    }
    return equipment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case Rpg_modelingPackage.CHARACTER__EQUIPMENT:
        return ((InternalEList<?>)getEquipment()).basicRemove(otherEnd, msgs);
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
      case Rpg_modelingPackage.CHARACTER__EQUIPMENT:
        return getEquipment();
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
      case Rpg_modelingPackage.CHARACTER__EQUIPMENT:
        getEquipment().clear();
        getEquipment().addAll((Collection<? extends Equipment>)newValue);
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
      case Rpg_modelingPackage.CHARACTER__EQUIPMENT:
        getEquipment().clear();
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
      case Rpg_modelingPackage.CHARACTER__EQUIPMENT:
        return equipment != null && !equipment.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //CharacterImpl
