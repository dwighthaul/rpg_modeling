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

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import rpg_modeling.Guild;
import rpg_modeling.GuildInventory;
import rpg_modeling.Player;
import rpg_modeling.Rpg_modelingPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Guild</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rpg_modeling.impl.GuildImpl#getGuildinventory <em>Guildinventory</em>}</li>
 *   <li>{@link rpg_modeling.impl.GuildImpl#getPlayer <em>Player</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GuildImpl extends MinimalEObjectImpl.Container implements Guild {
  /**
   * The cached value of the '{@link #getGuildinventory() <em>Guildinventory</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGuildinventory()
   * @generated
   * @ordered
   */
  protected GuildInventory guildinventory;

  /**
   * The cached value of the '{@link #getPlayer() <em>Player</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPlayer()
   * @generated
   * @ordered
   */
  protected EList<Player> player;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GuildImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return Rpg_modelingPackage.Literals.GUILD;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GuildInventory getGuildinventory() {
    return guildinventory;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetGuildinventory(GuildInventory newGuildinventory, NotificationChain msgs) {
    GuildInventory oldGuildinventory = guildinventory;
    guildinventory = newGuildinventory;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Rpg_modelingPackage.GUILD__GUILDINVENTORY, oldGuildinventory, newGuildinventory);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGuildinventory(GuildInventory newGuildinventory) {
    if (newGuildinventory != guildinventory) {
      NotificationChain msgs = null;
      if (guildinventory != null)
        msgs = ((InternalEObject)guildinventory).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Rpg_modelingPackage.GUILD__GUILDINVENTORY, null, msgs);
      if (newGuildinventory != null)
        msgs = ((InternalEObject)newGuildinventory).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Rpg_modelingPackage.GUILD__GUILDINVENTORY, null, msgs);
      msgs = basicSetGuildinventory(newGuildinventory, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Rpg_modelingPackage.GUILD__GUILDINVENTORY, newGuildinventory, newGuildinventory));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Player> getPlayer() {
    if (player == null) {
      player = new EObjectWithInverseResolvingEList<Player>(Player.class, this, Rpg_modelingPackage.GUILD__PLAYER, Rpg_modelingPackage.PLAYER__GUILD);
    }
    return player;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case Rpg_modelingPackage.GUILD__PLAYER:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getPlayer()).basicAdd(otherEnd, msgs);
    }
    return super.eInverseAdd(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case Rpg_modelingPackage.GUILD__GUILDINVENTORY:
        return basicSetGuildinventory(null, msgs);
      case Rpg_modelingPackage.GUILD__PLAYER:
        return ((InternalEList<?>)getPlayer()).basicRemove(otherEnd, msgs);
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
      case Rpg_modelingPackage.GUILD__GUILDINVENTORY:
        return getGuildinventory();
      case Rpg_modelingPackage.GUILD__PLAYER:
        return getPlayer();
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
      case Rpg_modelingPackage.GUILD__GUILDINVENTORY:
        setGuildinventory((GuildInventory)newValue);
        return;
      case Rpg_modelingPackage.GUILD__PLAYER:
        getPlayer().clear();
        getPlayer().addAll((Collection<? extends Player>)newValue);
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
      case Rpg_modelingPackage.GUILD__GUILDINVENTORY:
        setGuildinventory((GuildInventory)null);
        return;
      case Rpg_modelingPackage.GUILD__PLAYER:
        getPlayer().clear();
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
      case Rpg_modelingPackage.GUILD__GUILDINVENTORY:
        return guildinventory != null;
      case Rpg_modelingPackage.GUILD__PLAYER:
        return player != null && !player.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //GuildImpl
