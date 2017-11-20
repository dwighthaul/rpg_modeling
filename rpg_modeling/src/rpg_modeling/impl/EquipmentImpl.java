/**
 */
package rpg_modeling.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import rpg_modeling.Equipment;
import rpg_modeling.PlayerArmor;
import rpg_modeling.PlayerInventory;
import rpg_modeling.Rpg_modelingPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Equipment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rpg_modeling.impl.EquipmentImpl#getPlayer <em>Player</em>}</li>
 *   <li>{@link rpg_modeling.impl.EquipmentImpl#getInventory <em>Inventory</em>}</li>
 *   <li>{@link rpg_modeling.impl.EquipmentImpl#getArmor <em>Armor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EquipmentImpl extends MinimalEObjectImpl.Container implements Equipment {
	/**
	 * The cached value of the '{@link #getPlayer() <em>Player</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlayer()
	 * @generated
	 * @ordered
	 */
	protected rpg_modeling.Character player;

	/**
	 * The cached value of the '{@link #getInventory() <em>Inventory</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInventory()
	 * @generated
	 * @ordered
	 */
	protected PlayerInventory inventory;

	/**
	 * The cached value of the '{@link #getArmor() <em>Armor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArmor()
	 * @generated
	 * @ordered
	 */
	protected PlayerArmor armor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EquipmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Rpg_modelingPackage.Literals.EQUIPMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public rpg_modeling.Character getPlayer() {
		if (player != null && player.eIsProxy()) {
			InternalEObject oldPlayer = (InternalEObject)player;
			player = (rpg_modeling.Character)eResolveProxy(oldPlayer);
			if (player != oldPlayer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Rpg_modelingPackage.EQUIPMENT__PLAYER, oldPlayer, player));
			}
		}
		return player;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public rpg_modeling.Character basicGetPlayer() {
		return player;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlayer(rpg_modeling.Character newPlayer, NotificationChain msgs) {
		rpg_modeling.Character oldPlayer = player;
		player = newPlayer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Rpg_modelingPackage.EQUIPMENT__PLAYER, oldPlayer, newPlayer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlayer(rpg_modeling.Character newPlayer) {
		if (newPlayer != player) {
			NotificationChain msgs = null;
			if (player != null)
				msgs = ((InternalEObject)player).eInverseRemove(this, Rpg_modelingPackage.CHARACTER__EQUIPMENT, rpg_modeling.Character.class, msgs);
			if (newPlayer != null)
				msgs = ((InternalEObject)newPlayer).eInverseAdd(this, Rpg_modelingPackage.CHARACTER__EQUIPMENT, rpg_modeling.Character.class, msgs);
			msgs = basicSetPlayer(newPlayer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Rpg_modelingPackage.EQUIPMENT__PLAYER, newPlayer, newPlayer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlayerInventory getInventory() {
		return inventory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInventory(PlayerInventory newInventory, NotificationChain msgs) {
		PlayerInventory oldInventory = inventory;
		inventory = newInventory;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Rpg_modelingPackage.EQUIPMENT__INVENTORY, oldInventory, newInventory);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInventory(PlayerInventory newInventory) {
		if (newInventory != inventory) {
			NotificationChain msgs = null;
			if (inventory != null)
				msgs = ((InternalEObject)inventory).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Rpg_modelingPackage.EQUIPMENT__INVENTORY, null, msgs);
			if (newInventory != null)
				msgs = ((InternalEObject)newInventory).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Rpg_modelingPackage.EQUIPMENT__INVENTORY, null, msgs);
			msgs = basicSetInventory(newInventory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Rpg_modelingPackage.EQUIPMENT__INVENTORY, newInventory, newInventory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlayerArmor getArmor() {
		return armor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArmor(PlayerArmor newArmor, NotificationChain msgs) {
		PlayerArmor oldArmor = armor;
		armor = newArmor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Rpg_modelingPackage.EQUIPMENT__ARMOR, oldArmor, newArmor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArmor(PlayerArmor newArmor) {
		if (newArmor != armor) {
			NotificationChain msgs = null;
			if (armor != null)
				msgs = ((InternalEObject)armor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Rpg_modelingPackage.EQUIPMENT__ARMOR, null, msgs);
			if (newArmor != null)
				msgs = ((InternalEObject)newArmor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Rpg_modelingPackage.EQUIPMENT__ARMOR, null, msgs);
			msgs = basicSetArmor(newArmor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Rpg_modelingPackage.EQUIPMENT__ARMOR, newArmor, newArmor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Rpg_modelingPackage.EQUIPMENT__PLAYER:
				if (player != null)
					msgs = ((InternalEObject)player).eInverseRemove(this, Rpg_modelingPackage.CHARACTER__EQUIPMENT, rpg_modeling.Character.class, msgs);
				return basicSetPlayer((rpg_modeling.Character)otherEnd, msgs);
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
			case Rpg_modelingPackage.EQUIPMENT__PLAYER:
				return basicSetPlayer(null, msgs);
			case Rpg_modelingPackage.EQUIPMENT__INVENTORY:
				return basicSetInventory(null, msgs);
			case Rpg_modelingPackage.EQUIPMENT__ARMOR:
				return basicSetArmor(null, msgs);
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
			case Rpg_modelingPackage.EQUIPMENT__PLAYER:
				if (resolve) return getPlayer();
				return basicGetPlayer();
			case Rpg_modelingPackage.EQUIPMENT__INVENTORY:
				return getInventory();
			case Rpg_modelingPackage.EQUIPMENT__ARMOR:
				return getArmor();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Rpg_modelingPackage.EQUIPMENT__PLAYER:
				setPlayer((rpg_modeling.Character)newValue);
				return;
			case Rpg_modelingPackage.EQUIPMENT__INVENTORY:
				setInventory((PlayerInventory)newValue);
				return;
			case Rpg_modelingPackage.EQUIPMENT__ARMOR:
				setArmor((PlayerArmor)newValue);
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
			case Rpg_modelingPackage.EQUIPMENT__PLAYER:
				setPlayer((rpg_modeling.Character)null);
				return;
			case Rpg_modelingPackage.EQUIPMENT__INVENTORY:
				setInventory((PlayerInventory)null);
				return;
			case Rpg_modelingPackage.EQUIPMENT__ARMOR:
				setArmor((PlayerArmor)null);
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
			case Rpg_modelingPackage.EQUIPMENT__PLAYER:
				return player != null;
			case Rpg_modelingPackage.EQUIPMENT__INVENTORY:
				return inventory != null;
			case Rpg_modelingPackage.EQUIPMENT__ARMOR:
				return armor != null;
		}
		return super.eIsSet(featureID);
	}

} //EquipmentImpl
