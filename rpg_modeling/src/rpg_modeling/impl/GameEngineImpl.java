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
 *   <li>{@link rpg_modeling.impl.GameEngineImpl#getFactions <em>Factions</em>}</li>
 *   <li>{@link rpg_modeling.impl.GameEngineImpl#getCharacters <em>Characters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GameEngineImpl extends MinimalEObjectImpl.Container implements GameEngine {
  /**
   * The cached value of the '{@link #getFactions() <em>Factions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFactions()
   * @generated
   * @ordered
   */
  protected EList<Faction> factions;

  /**
   * The cached value of the '{@link #getCharacters() <em>Characters</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCharacters()
   * @generated
   * @ordered
   */
  protected EList<rpg_modeling.Character> characters;

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
  public EList<Faction> getFactions() {
    if (factions == null) {
      factions = new EObjectContainmentEList<Faction>(Faction.class, this, Rpg_modelingPackage.GAME_ENGINE__FACTIONS);
    }
    return factions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<rpg_modeling.Character> getCharacters() {
    if (characters == null) {
      characters = new EObjectContainmentEList<rpg_modeling.Character>(rpg_modeling.Character.class, this, Rpg_modelingPackage.GAME_ENGINE__CHARACTERS);
    }
    return characters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case Rpg_modelingPackage.GAME_ENGINE__FACTIONS:
        return ((InternalEList<?>)getFactions()).basicRemove(otherEnd, msgs);
      case Rpg_modelingPackage.GAME_ENGINE__CHARACTERS:
        return ((InternalEList<?>)getCharacters()).basicRemove(otherEnd, msgs);
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
      case Rpg_modelingPackage.GAME_ENGINE__FACTIONS:
        return getFactions();
      case Rpg_modelingPackage.GAME_ENGINE__CHARACTERS:
        return getCharacters();
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
      case Rpg_modelingPackage.GAME_ENGINE__FACTIONS:
        getFactions().clear();
        getFactions().addAll((Collection<? extends Faction>)newValue);
        return;
      case Rpg_modelingPackage.GAME_ENGINE__CHARACTERS:
        getCharacters().clear();
        getCharacters().addAll((Collection<? extends rpg_modeling.Character>)newValue);
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
      case Rpg_modelingPackage.GAME_ENGINE__FACTIONS:
        getFactions().clear();
        return;
      case Rpg_modelingPackage.GAME_ENGINE__CHARACTERS:
        getCharacters().clear();
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
      case Rpg_modelingPackage.GAME_ENGINE__FACTIONS:
        return factions != null && !factions.isEmpty();
      case Rpg_modelingPackage.GAME_ENGINE__CHARACTERS:
        return characters != null && !characters.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //GameEngineImpl
