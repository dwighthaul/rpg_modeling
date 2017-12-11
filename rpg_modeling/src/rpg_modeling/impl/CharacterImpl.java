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
 *   <li>{@link rpg_modeling.impl.CharacterImpl#getName <em>Name</em>}</li>
 *   <li>{@link rpg_modeling.impl.CharacterImpl#getHp <em>Hp</em>}</li>
 *   <li>{@link rpg_modeling.impl.CharacterImpl#getMp <em>Mp</em>}</li>
 *   <li>{@link rpg_modeling.impl.CharacterImpl#getStrength <em>Strength</em>}</li>
 *   <li>{@link rpg_modeling.impl.CharacterImpl#getConstitution <em>Constitution</em>}</li>
 *   <li>{@link rpg_modeling.impl.CharacterImpl#getDexterity <em>Dexterity</em>}</li>
 *   <li>{@link rpg_modeling.impl.CharacterImpl#getIntelligence <em>Intelligence</em>}</li>
 *   <li>{@link rpg_modeling.impl.CharacterImpl#getWisdom <em>Wisdom</em>}</li>
 *   <li>{@link rpg_modeling.impl.CharacterImpl#getLuck <em>Luck</em>}</li>
 *   <li>{@link rpg_modeling.impl.CharacterImpl#getEquipment <em>Equipment</em>}</li>
 *   <li>{@link rpg_modeling.impl.CharacterImpl#get_id <em>id</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CharacterImpl extends MinimalEObjectImpl.Container implements rpg_modeling.Character {
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;
  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;
  /**
   * The default value of the '{@link #getHp() <em>Hp</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHp()
   * @generated
   * @ordered
   */
  protected static final int HP_EDEFAULT = 0;
  /**
   * The cached value of the '{@link #getHp() <em>Hp</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHp()
   * @generated
   * @ordered
   */
  protected int hp = HP_EDEFAULT;
  /**
   * The default value of the '{@link #getMp() <em>Mp</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMp()
   * @generated
   * @ordered
   */
  protected static final int MP_EDEFAULT = 0;
  /**
   * The cached value of the '{@link #getMp() <em>Mp</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMp()
   * @generated
   * @ordered
   */
  protected int mp = MP_EDEFAULT;
  /**
   * The default value of the '{@link #getStrength() <em>Strength</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStrength()
   * @generated
   * @ordered
   */
  protected static final int STRENGTH_EDEFAULT = 0;
  /**
   * The cached value of the '{@link #getStrength() <em>Strength</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStrength()
   * @generated
   * @ordered
   */
  protected int strength = STRENGTH_EDEFAULT;
  /**
   * The default value of the '{@link #getConstitution() <em>Constitution</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstitution()
   * @generated
   * @ordered
   */
  protected static final int CONSTITUTION_EDEFAULT = 0;
  /**
   * The cached value of the '{@link #getConstitution() <em>Constitution</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstitution()
   * @generated
   * @ordered
   */
  protected int constitution = CONSTITUTION_EDEFAULT;
  /**
   * The default value of the '{@link #getDexterity() <em>Dexterity</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDexterity()
   * @generated
   * @ordered
   */
  protected static final int DEXTERITY_EDEFAULT = 0;
  /**
   * The cached value of the '{@link #getDexterity() <em>Dexterity</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDexterity()
   * @generated
   * @ordered
   */
  protected int dexterity = DEXTERITY_EDEFAULT;
  /**
   * The default value of the '{@link #getIntelligence() <em>Intelligence</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIntelligence()
   * @generated
   * @ordered
   */
  protected static final int INTELLIGENCE_EDEFAULT = 0;
  /**
   * The cached value of the '{@link #getIntelligence() <em>Intelligence</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIntelligence()
   * @generated
   * @ordered
   */
  protected int intelligence = INTELLIGENCE_EDEFAULT;
  /**
   * The default value of the '{@link #getWisdom() <em>Wisdom</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWisdom()
   * @generated
   * @ordered
   */
  protected static final int WISDOM_EDEFAULT = 0;
  /**
   * The cached value of the '{@link #getWisdom() <em>Wisdom</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWisdom()
   * @generated
   * @ordered
   */
  protected int wisdom = WISDOM_EDEFAULT;
  /**
   * The default value of the '{@link #getLuck() <em>Luck</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLuck()
   * @generated
   * @ordered
   */
  protected static final int LUCK_EDEFAULT = 0;
  /**
   * The cached value of the '{@link #getLuck() <em>Luck</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLuck()
   * @generated
   * @ordered
   */
  protected int luck = LUCK_EDEFAULT;
  /**
   * The cached value of the '{@link #getEquipment() <em>Equipment</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEquipment()
   * @generated
   * @ordered
   */
  protected Equipment equipment;

  /**
   * The default value of the '{@link #get_id() <em>id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #get_id()
   * @generated
   * @ordered
   */
  protected static final int _ID_EDEFAULT = 0;
  /**
   * The cached value of the '{@link #get_id() <em>id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #get_id()
   * @generated
   * @ordered
   */
  protected int _id = _ID_EDEFAULT;

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
  public String getName() {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName) {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Rpg_modelingPackage.CHARACTER__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getHp() {
    return hp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHp(int newHp) {
    int oldHp = hp;
    hp = newHp;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Rpg_modelingPackage.CHARACTER__HP, oldHp, hp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getMp() {
    return mp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMp(int newMp) {
    int oldMp = mp;
    mp = newMp;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Rpg_modelingPackage.CHARACTER__MP, oldMp, mp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getStrength() {
    return strength;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStrength(int newStrength) {
    int oldStrength = strength;
    strength = newStrength;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Rpg_modelingPackage.CHARACTER__STRENGTH, oldStrength, strength));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getConstitution() {
    return constitution;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConstitution(int newConstitution) {
    int oldConstitution = constitution;
    constitution = newConstitution;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Rpg_modelingPackage.CHARACTER__CONSTITUTION, oldConstitution, constitution));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getDexterity() {
    return dexterity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDexterity(int newDexterity) {
    int oldDexterity = dexterity;
    dexterity = newDexterity;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Rpg_modelingPackage.CHARACTER__DEXTERITY, oldDexterity, dexterity));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getIntelligence() {
    return intelligence;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIntelligence(int newIntelligence) {
    int oldIntelligence = intelligence;
    intelligence = newIntelligence;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Rpg_modelingPackage.CHARACTER__INTELLIGENCE, oldIntelligence, intelligence));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getWisdom() {
    return wisdom;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWisdom(int newWisdom) {
    int oldWisdom = wisdom;
    wisdom = newWisdom;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Rpg_modelingPackage.CHARACTER__WISDOM, oldWisdom, wisdom));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getLuck() {
    return luck;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLuck(int newLuck) {
    int oldLuck = luck;
    luck = newLuck;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Rpg_modelingPackage.CHARACTER__LUCK, oldLuck, luck));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Equipment getEquipment() {
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
        msgs = ((InternalEObject)equipment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Rpg_modelingPackage.CHARACTER__EQUIPMENT, null, msgs);
      if (newEquipment != null)
        msgs = ((InternalEObject)newEquipment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Rpg_modelingPackage.CHARACTER__EQUIPMENT, null, msgs);
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
  public int get_id() {
    return _id;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void set_id(int new_id) {
    int old_id = _id;
    _id = new_id;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Rpg_modelingPackage.CHARACTER__ID, old_id, _id));
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
      case Rpg_modelingPackage.CHARACTER__NAME:
        return getName();
      case Rpg_modelingPackage.CHARACTER__HP:
        return getHp();
      case Rpg_modelingPackage.CHARACTER__MP:
        return getMp();
      case Rpg_modelingPackage.CHARACTER__STRENGTH:
        return getStrength();
      case Rpg_modelingPackage.CHARACTER__CONSTITUTION:
        return getConstitution();
      case Rpg_modelingPackage.CHARACTER__DEXTERITY:
        return getDexterity();
      case Rpg_modelingPackage.CHARACTER__INTELLIGENCE:
        return getIntelligence();
      case Rpg_modelingPackage.CHARACTER__WISDOM:
        return getWisdom();
      case Rpg_modelingPackage.CHARACTER__LUCK:
        return getLuck();
      case Rpg_modelingPackage.CHARACTER__EQUIPMENT:
        return getEquipment();
      case Rpg_modelingPackage.CHARACTER__ID:
        return get_id();
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
      case Rpg_modelingPackage.CHARACTER__NAME:
        setName((String)newValue);
        return;
      case Rpg_modelingPackage.CHARACTER__HP:
        setHp((Integer)newValue);
        return;
      case Rpg_modelingPackage.CHARACTER__MP:
        setMp((Integer)newValue);
        return;
      case Rpg_modelingPackage.CHARACTER__STRENGTH:
        setStrength((Integer)newValue);
        return;
      case Rpg_modelingPackage.CHARACTER__CONSTITUTION:
        setConstitution((Integer)newValue);
        return;
      case Rpg_modelingPackage.CHARACTER__DEXTERITY:
        setDexterity((Integer)newValue);
        return;
      case Rpg_modelingPackage.CHARACTER__INTELLIGENCE:
        setIntelligence((Integer)newValue);
        return;
      case Rpg_modelingPackage.CHARACTER__WISDOM:
        setWisdom((Integer)newValue);
        return;
      case Rpg_modelingPackage.CHARACTER__LUCK:
        setLuck((Integer)newValue);
        return;
      case Rpg_modelingPackage.CHARACTER__EQUIPMENT:
        setEquipment((Equipment)newValue);
        return;
      case Rpg_modelingPackage.CHARACTER__ID:
        set_id((Integer)newValue);
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
      case Rpg_modelingPackage.CHARACTER__NAME:
        setName(NAME_EDEFAULT);
        return;
      case Rpg_modelingPackage.CHARACTER__HP:
        setHp(HP_EDEFAULT);
        return;
      case Rpg_modelingPackage.CHARACTER__MP:
        setMp(MP_EDEFAULT);
        return;
      case Rpg_modelingPackage.CHARACTER__STRENGTH:
        setStrength(STRENGTH_EDEFAULT);
        return;
      case Rpg_modelingPackage.CHARACTER__CONSTITUTION:
        setConstitution(CONSTITUTION_EDEFAULT);
        return;
      case Rpg_modelingPackage.CHARACTER__DEXTERITY:
        setDexterity(DEXTERITY_EDEFAULT);
        return;
      case Rpg_modelingPackage.CHARACTER__INTELLIGENCE:
        setIntelligence(INTELLIGENCE_EDEFAULT);
        return;
      case Rpg_modelingPackage.CHARACTER__WISDOM:
        setWisdom(WISDOM_EDEFAULT);
        return;
      case Rpg_modelingPackage.CHARACTER__LUCK:
        setLuck(LUCK_EDEFAULT);
        return;
      case Rpg_modelingPackage.CHARACTER__EQUIPMENT:
        setEquipment((Equipment)null);
        return;
      case Rpg_modelingPackage.CHARACTER__ID:
        set_id(_ID_EDEFAULT);
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
      case Rpg_modelingPackage.CHARACTER__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case Rpg_modelingPackage.CHARACTER__HP:
        return hp != HP_EDEFAULT;
      case Rpg_modelingPackage.CHARACTER__MP:
        return mp != MP_EDEFAULT;
      case Rpg_modelingPackage.CHARACTER__STRENGTH:
        return strength != STRENGTH_EDEFAULT;
      case Rpg_modelingPackage.CHARACTER__CONSTITUTION:
        return constitution != CONSTITUTION_EDEFAULT;
      case Rpg_modelingPackage.CHARACTER__DEXTERITY:
        return dexterity != DEXTERITY_EDEFAULT;
      case Rpg_modelingPackage.CHARACTER__INTELLIGENCE:
        return intelligence != INTELLIGENCE_EDEFAULT;
      case Rpg_modelingPackage.CHARACTER__WISDOM:
        return wisdom != WISDOM_EDEFAULT;
      case Rpg_modelingPackage.CHARACTER__LUCK:
        return luck != LUCK_EDEFAULT;
      case Rpg_modelingPackage.CHARACTER__EQUIPMENT:
        return equipment != null;
      case Rpg_modelingPackage.CHARACTER__ID:
        return _id != _ID_EDEFAULT;
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
    result.append(" (name: ");
    result.append(name);
    result.append(", hp: ");
    result.append(hp);
    result.append(", mp: ");
    result.append(mp);
    result.append(", strength: ");
    result.append(strength);
    result.append(", constitution: ");
    result.append(constitution);
    result.append(", dexterity: ");
    result.append(dexterity);
    result.append(", intelligence: ");
    result.append(intelligence);
    result.append(", wisdom: ");
    result.append(wisdom);
    result.append(", luck: ");
    result.append(luck);
    result.append(", _id: ");
    result.append(_id);
    result.append(')');
    return result.toString();
  }

} //CharacterImpl
