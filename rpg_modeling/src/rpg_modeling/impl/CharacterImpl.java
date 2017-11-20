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
	 * The cached value of the '{@link #getEquipment() <em>Equipment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEquipment()
	 * @generated
	 * @ordered
	 */
	protected Equipment equipment;

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
	public Equipment getEquipment() {
		if (equipment != null && equipment.eIsProxy()) {
			InternalEObject oldEquipment = (InternalEObject)equipment;
			equipment = (Equipment)eResolveProxy(oldEquipment);
			if (equipment != oldEquipment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Rpg_modelingPackage.CHARACTER__EQUIPMENT, oldEquipment, equipment));
			}
		}
		return equipment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Equipment basicGetEquipment() {
		return equipment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEquipment(Equipment newEquipment, NotificationChain msgs) {
		Equipment oldEquipment = equipment;
		equipment = newEquipment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Rpg_modelingPackage.CHARACTER__EQUIPMENT, oldEquipment, newEquipment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEquipment(Equipment newEquipment) {
		if (newEquipment != equipment) {
			NotificationChain msgs = null;
			if (equipment != null)
				msgs = ((InternalEObject)equipment).eInverseRemove(this, Rpg_modelingPackage.EQUIPMENT__PLAYER, Equipment.class, msgs);
			if (newEquipment != null)
				msgs = ((InternalEObject)newEquipment).eInverseAdd(this, Rpg_modelingPackage.EQUIPMENT__PLAYER, Equipment.class, msgs);
			msgs = basicSetEquipment(newEquipment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Rpg_modelingPackage.CHARACTER__EQUIPMENT, newEquipment, newEquipment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Rpg_modelingPackage.CHARACTER__EQUIPMENT:
				if (equipment != null)
					msgs = ((InternalEObject)equipment).eInverseRemove(this, Rpg_modelingPackage.EQUIPMENT__PLAYER, Equipment.class, msgs);
				return basicSetEquipment((Equipment)otherEnd, msgs);
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
			case Rpg_modelingPackage.CHARACTER__EQUIPMENT:
				return basicSetEquipment(null, msgs);
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
				if (resolve) return getEquipment();
				return basicGetEquipment();
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
			case Rpg_modelingPackage.CHARACTER__EQUIPMENT:
				setEquipment((Equipment)newValue);
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
				setEquipment((Equipment)null);
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
				return equipment != null;
		}
		return super.eIsSet(featureID);
	}

} //CharacterImpl
