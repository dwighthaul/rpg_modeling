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

import rpg_modeling.Faction;
import rpg_modeling.GameEngine;
import rpg_modeling.Rpg_modelingPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Game Engine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rpg_modeling.impl.GameEngineImpl#getFaction <em>Faction</em>}</li>
 *   <li>{@link rpg_modeling.impl.GameEngineImpl#getCharacter <em>Character</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GameEngineImpl extends MinimalEObjectImpl.Container implements GameEngine {
  /**
   * The cached value of the '{@link #getFaction() <em>Faction</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFaction()
   * @generated
   * @ordered
   */
  protected EList<Faction> faction;

  /**
   * The cached value of the '{@link #getCharacter() <em>Character</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCharacter()
   * @generated
   * @ordered
   */
  protected EList<rpg_modeling.Character> character;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GameEngineImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return Rpg_modelingPackage.Literals.GAME_ENGINE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Faction> getFaction() {
    if (faction == null) {
      faction = new EObjectContainmentEList<Faction>(Faction.class, this, Rpg_modelingPackage.GAME_ENGINE__FACTION);
    }
    return faction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<rpg_modeling.Character> getCharacter() {
    if (character == null) {
      character = new EObjectContainmentEList<rpg_modeling.Character>(rpg_modeling.Character.class, this, Rpg_modelingPackage.GAME_ENGINE__CHARACTER);
    }
    return character;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case Rpg_modelingPackage.GAME_ENGINE__FACTION:
        return ((InternalEList<?>)getFaction()).basicRemove(otherEnd, msgs);
      case Rpg_modelingPackage.GAME_ENGINE__CHARACTER:
        return ((InternalEList<?>)getCharacter()).basicRemove(otherEnd, msgs);
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
      case Rpg_modelingPackage.GAME_ENGINE__FACTION:
        return getFaction();
      case Rpg_modelingPackage.GAME_ENGINE__CHARACTER:
        return getCharacter();
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
      case Rpg_modelingPackage.GAME_ENGINE__FACTION:
        getFaction().clear();
        getFaction().addAll((Collection<? extends Faction>)newValue);
        return;
      case Rpg_modelingPackage.GAME_ENGINE__CHARACTER:
        getCharacter().clear();
        getCharacter().addAll((Collection<? extends rpg_modeling.Character>)newValue);
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
      case Rpg_modelingPackage.GAME_ENGINE__FACTION:
        getFaction().clear();
        return;
      case Rpg_modelingPackage.GAME_ENGINE__CHARACTER:
        getCharacter().clear();
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
      case Rpg_modelingPackage.GAME_ENGINE__FACTION:
        return faction != null && !faction.isEmpty();
      case Rpg_modelingPackage.GAME_ENGINE__CHARACTER:
        return character != null && !character.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //GameEngineImpl
