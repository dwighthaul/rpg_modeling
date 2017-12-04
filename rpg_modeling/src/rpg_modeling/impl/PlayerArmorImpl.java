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
 *   <li>{@link rpg_modeling.impl.PlayerArmorImpl#getArm <em>Arm</em>}</li>
 *   <li>{@link rpg_modeling.impl.PlayerArmorImpl#getChest <em>Chest</em>}</li>
 *   <li>{@link rpg_modeling.impl.PlayerArmorImpl#getLeg <em>Leg</em>}</li>
 *   <li>{@link rpg_modeling.impl.PlayerArmorImpl#getRight_hand <em>Right hand</em>}</li>
 *   <li>{@link rpg_modeling.impl.PlayerArmorImpl#getLeft_hand <em>Left hand</em>}</li>
 *   <li>{@link rpg_modeling.impl.PlayerArmorImpl#getHand <em>Hand</em>}</li>
 *   <li>{@link rpg_modeling.impl.PlayerArmorImpl#getFoot <em>Foot</em>}</li>
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
   * The default value of the '{@link #getArm() <em>Arm</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArm()
   * @generated
   * @ordered
   */
  protected static final int ARM_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getArm() <em>Arm</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArm()
   * @generated
   * @ordered
   */
  protected int arm = ARM_EDEFAULT;

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
   * The default value of the '{@link #getLeg() <em>Leg</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeg()
   * @generated
   * @ordered
   */
  protected static final int LEG_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getLeg() <em>Leg</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeg()
   * @generated
   * @ordered
   */
  protected int leg = LEG_EDEFAULT;

  /**
   * The default value of the '{@link #getRight_hand() <em>Right hand</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRight_hand()
   * @generated
   * @ordered
   */
  protected static final int RIGHT_HAND_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getRight_hand() <em>Right hand</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRight_hand()
   * @generated
   * @ordered
   */
  protected int right_hand = RIGHT_HAND_EDEFAULT;

  /**
   * The default value of the '{@link #getLeft_hand() <em>Left hand</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeft_hand()
   * @generated
   * @ordered
   */
  protected static final int LEFT_HAND_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getLeft_hand() <em>Left hand</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeft_hand()
   * @generated
   * @ordered
   */
  protected int left_hand = LEFT_HAND_EDEFAULT;

  /**
   * The default value of the '{@link #getHand() <em>Hand</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHand()
   * @generated
   * @ordered
   */
  protected static final int HAND_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getHand() <em>Hand</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHand()
   * @generated
   * @ordered
   */
  protected int hand = HAND_EDEFAULT;

  /**
   * The default value of the '{@link #getFoot() <em>Foot</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFoot()
   * @generated
   * @ordered
   */
  protected static final int FOOT_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getFoot() <em>Foot</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFoot()
   * @generated
   * @ordered
   */
  protected int foot = FOOT_EDEFAULT;

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
  public int getArm() {
    return arm;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setArm(int newArm) {
    int oldArm = arm;
    arm = newArm;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Rpg_modelingPackage.PLAYER_ARMOR__ARM, oldArm, arm));
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
  public int getLeg() {
    return leg;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLeg(int newLeg) {
    int oldLeg = leg;
    leg = newLeg;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Rpg_modelingPackage.PLAYER_ARMOR__LEG, oldLeg, leg));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getRight_hand() {
    return right_hand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRight_hand(int newRight_hand) {
    int oldRight_hand = right_hand;
    right_hand = newRight_hand;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Rpg_modelingPackage.PLAYER_ARMOR__RIGHT_HAND, oldRight_hand, right_hand));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getLeft_hand() {
    return left_hand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLeft_hand(int newLeft_hand) {
    int oldLeft_hand = left_hand;
    left_hand = newLeft_hand;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Rpg_modelingPackage.PLAYER_ARMOR__LEFT_HAND, oldLeft_hand, left_hand));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getHand() {
    return hand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHand(int newHand) {
    int oldHand = hand;
    hand = newHand;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Rpg_modelingPackage.PLAYER_ARMOR__HAND, oldHand, hand));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getFoot() {
    return foot;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFoot(int newFoot) {
    int oldFoot = foot;
    foot = newFoot;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Rpg_modelingPackage.PLAYER_ARMOR__FOOT, oldFoot, foot));
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
      case Rpg_modelingPackage.PLAYER_ARMOR__ARM:
        return getArm();
      case Rpg_modelingPackage.PLAYER_ARMOR__CHEST:
        return getChest();
      case Rpg_modelingPackage.PLAYER_ARMOR__LEG:
        return getLeg();
      case Rpg_modelingPackage.PLAYER_ARMOR__RIGHT_HAND:
        return getRight_hand();
      case Rpg_modelingPackage.PLAYER_ARMOR__LEFT_HAND:
        return getLeft_hand();
      case Rpg_modelingPackage.PLAYER_ARMOR__HAND:
        return getHand();
      case Rpg_modelingPackage.PLAYER_ARMOR__FOOT:
        return getFoot();
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
      case Rpg_modelingPackage.PLAYER_ARMOR__ARM:
        setArm((Integer)newValue);
        return;
      case Rpg_modelingPackage.PLAYER_ARMOR__CHEST:
        setChest((Integer)newValue);
        return;
      case Rpg_modelingPackage.PLAYER_ARMOR__LEG:
        setLeg((Integer)newValue);
        return;
      case Rpg_modelingPackage.PLAYER_ARMOR__RIGHT_HAND:
        setRight_hand((Integer)newValue);
        return;
      case Rpg_modelingPackage.PLAYER_ARMOR__LEFT_HAND:
        setLeft_hand((Integer)newValue);
        return;
      case Rpg_modelingPackage.PLAYER_ARMOR__HAND:
        setHand((Integer)newValue);
        return;
      case Rpg_modelingPackage.PLAYER_ARMOR__FOOT:
        setFoot((Integer)newValue);
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
      case Rpg_modelingPackage.PLAYER_ARMOR__ARM:
        setArm(ARM_EDEFAULT);
        return;
      case Rpg_modelingPackage.PLAYER_ARMOR__CHEST:
        setChest(CHEST_EDEFAULT);
        return;
      case Rpg_modelingPackage.PLAYER_ARMOR__LEG:
        setLeg(LEG_EDEFAULT);
        return;
      case Rpg_modelingPackage.PLAYER_ARMOR__RIGHT_HAND:
        setRight_hand(RIGHT_HAND_EDEFAULT);
        return;
      case Rpg_modelingPackage.PLAYER_ARMOR__LEFT_HAND:
        setLeft_hand(LEFT_HAND_EDEFAULT);
        return;
      case Rpg_modelingPackage.PLAYER_ARMOR__HAND:
        setHand(HAND_EDEFAULT);
        return;
      case Rpg_modelingPackage.PLAYER_ARMOR__FOOT:
        setFoot(FOOT_EDEFAULT);
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
      case Rpg_modelingPackage.PLAYER_ARMOR__ARM:
        return arm != ARM_EDEFAULT;
      case Rpg_modelingPackage.PLAYER_ARMOR__CHEST:
        return chest != CHEST_EDEFAULT;
      case Rpg_modelingPackage.PLAYER_ARMOR__LEG:
        return leg != LEG_EDEFAULT;
      case Rpg_modelingPackage.PLAYER_ARMOR__RIGHT_HAND:
        return right_hand != RIGHT_HAND_EDEFAULT;
      case Rpg_modelingPackage.PLAYER_ARMOR__LEFT_HAND:
        return left_hand != LEFT_HAND_EDEFAULT;
      case Rpg_modelingPackage.PLAYER_ARMOR__HAND:
        return hand != HAND_EDEFAULT;
      case Rpg_modelingPackage.PLAYER_ARMOR__FOOT:
        return foot != FOOT_EDEFAULT;
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
    result.append(", arm: ");
    result.append(arm);
    result.append(", chest: ");
    result.append(chest);
    result.append(", leg: ");
    result.append(leg);
    result.append(", right_hand: ");
    result.append(right_hand);
    result.append(", left_hand: ");
    result.append(left_hand);
    result.append(", hand: ");
    result.append(hand);
    result.append(", foot: ");
    result.append(foot);
    result.append(')');
    return result.toString();
  }

} //PlayerArmorImpl
