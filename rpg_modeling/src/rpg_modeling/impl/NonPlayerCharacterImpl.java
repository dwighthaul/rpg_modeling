/**
 */
package rpg_modeling.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import rpg_modeling.NonPlayerCharacter;
import rpg_modeling.Rpg_modelingPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Non Player Character</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rpg_modeling.impl.NonPlayerCharacterImpl#getConstitution <em>Constitution</em>}</li>
 *   <li>{@link rpg_modeling.impl.NonPlayerCharacterImpl#getHp <em>Hp</em>}</li>
 *   <li>{@link rpg_modeling.impl.NonPlayerCharacterImpl#getLuck <em>Luck</em>}</li>
 *   <li>{@link rpg_modeling.impl.NonPlayerCharacterImpl#getName <em>Name</em>}</li>
 *   <li>{@link rpg_modeling.impl.NonPlayerCharacterImpl#getMp <em>Mp</em>}</li>
 *   <li>{@link rpg_modeling.impl.NonPlayerCharacterImpl#getWisdom <em>Wisdom</em>}</li>
 *   <li>{@link rpg_modeling.impl.NonPlayerCharacterImpl#getDexterity <em>Dexterity</em>}</li>
 *   <li>{@link rpg_modeling.impl.NonPlayerCharacterImpl#getStrenght <em>Strenght</em>}</li>
 *   <li>{@link rpg_modeling.impl.NonPlayerCharacterImpl#getIntelligence <em>Intelligence</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NonPlayerCharacterImpl extends CharacterImpl implements NonPlayerCharacter {
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
   * The default value of the '{@link #getStrenght() <em>Strenght</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStrenght()
   * @generated
   * @ordered
   */
  protected static final int STRENGHT_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getStrenght() <em>Strenght</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStrenght()
   * @generated
   * @ordered
   */
  protected int strenght = STRENGHT_EDEFAULT;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NonPlayerCharacterImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return Rpg_modelingPackage.Literals.NON_PLAYER_CHARACTER;
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
      eNotify(new ENotificationImpl(this, Notification.SET, Rpg_modelingPackage.NON_PLAYER_CHARACTER__CONSTITUTION, oldConstitution, constitution));
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
      eNotify(new ENotificationImpl(this, Notification.SET, Rpg_modelingPackage.NON_PLAYER_CHARACTER__HP, oldHp, hp));
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
      eNotify(new ENotificationImpl(this, Notification.SET, Rpg_modelingPackage.NON_PLAYER_CHARACTER__LUCK, oldLuck, luck));
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
      eNotify(new ENotificationImpl(this, Notification.SET, Rpg_modelingPackage.NON_PLAYER_CHARACTER__NAME, oldName, name));
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
      eNotify(new ENotificationImpl(this, Notification.SET, Rpg_modelingPackage.NON_PLAYER_CHARACTER__MP, oldMp, mp));
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
      eNotify(new ENotificationImpl(this, Notification.SET, Rpg_modelingPackage.NON_PLAYER_CHARACTER__WISDOM, oldWisdom, wisdom));
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
      eNotify(new ENotificationImpl(this, Notification.SET, Rpg_modelingPackage.NON_PLAYER_CHARACTER__DEXTERITY, oldDexterity, dexterity));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getStrenght() {
    return strenght;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStrenght(int newStrenght) {
    int oldStrenght = strenght;
    strenght = newStrenght;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Rpg_modelingPackage.NON_PLAYER_CHARACTER__STRENGHT, oldStrenght, strenght));
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
      eNotify(new ENotificationImpl(this, Notification.SET, Rpg_modelingPackage.NON_PLAYER_CHARACTER__INTELLIGENCE, oldIntelligence, intelligence));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case Rpg_modelingPackage.NON_PLAYER_CHARACTER__CONSTITUTION:
        return getConstitution();
      case Rpg_modelingPackage.NON_PLAYER_CHARACTER__HP:
        return getHp();
      case Rpg_modelingPackage.NON_PLAYER_CHARACTER__LUCK:
        return getLuck();
      case Rpg_modelingPackage.NON_PLAYER_CHARACTER__NAME:
        return getName();
      case Rpg_modelingPackage.NON_PLAYER_CHARACTER__MP:
        return getMp();
      case Rpg_modelingPackage.NON_PLAYER_CHARACTER__WISDOM:
        return getWisdom();
      case Rpg_modelingPackage.NON_PLAYER_CHARACTER__DEXTERITY:
        return getDexterity();
      case Rpg_modelingPackage.NON_PLAYER_CHARACTER__STRENGHT:
        return getStrenght();
      case Rpg_modelingPackage.NON_PLAYER_CHARACTER__INTELLIGENCE:
        return getIntelligence();
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
      case Rpg_modelingPackage.NON_PLAYER_CHARACTER__CONSTITUTION:
        setConstitution((Integer)newValue);
        return;
      case Rpg_modelingPackage.NON_PLAYER_CHARACTER__HP:
        setHp((Integer)newValue);
        return;
      case Rpg_modelingPackage.NON_PLAYER_CHARACTER__LUCK:
        setLuck((Integer)newValue);
        return;
      case Rpg_modelingPackage.NON_PLAYER_CHARACTER__NAME:
        setName((String)newValue);
        return;
      case Rpg_modelingPackage.NON_PLAYER_CHARACTER__MP:
        setMp((Integer)newValue);
        return;
      case Rpg_modelingPackage.NON_PLAYER_CHARACTER__WISDOM:
        setWisdom((Integer)newValue);
        return;
      case Rpg_modelingPackage.NON_PLAYER_CHARACTER__DEXTERITY:
        setDexterity((Integer)newValue);
        return;
      case Rpg_modelingPackage.NON_PLAYER_CHARACTER__STRENGHT:
        setStrenght((Integer)newValue);
        return;
      case Rpg_modelingPackage.NON_PLAYER_CHARACTER__INTELLIGENCE:
        setIntelligence((Integer)newValue);
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
      case Rpg_modelingPackage.NON_PLAYER_CHARACTER__CONSTITUTION:
        setConstitution(CONSTITUTION_EDEFAULT);
        return;
      case Rpg_modelingPackage.NON_PLAYER_CHARACTER__HP:
        setHp(HP_EDEFAULT);
        return;
      case Rpg_modelingPackage.NON_PLAYER_CHARACTER__LUCK:
        setLuck(LUCK_EDEFAULT);
        return;
      case Rpg_modelingPackage.NON_PLAYER_CHARACTER__NAME:
        setName(NAME_EDEFAULT);
        return;
      case Rpg_modelingPackage.NON_PLAYER_CHARACTER__MP:
        setMp(MP_EDEFAULT);
        return;
      case Rpg_modelingPackage.NON_PLAYER_CHARACTER__WISDOM:
        setWisdom(WISDOM_EDEFAULT);
        return;
      case Rpg_modelingPackage.NON_PLAYER_CHARACTER__DEXTERITY:
        setDexterity(DEXTERITY_EDEFAULT);
        return;
      case Rpg_modelingPackage.NON_PLAYER_CHARACTER__STRENGHT:
        setStrenght(STRENGHT_EDEFAULT);
        return;
      case Rpg_modelingPackage.NON_PLAYER_CHARACTER__INTELLIGENCE:
        setIntelligence(INTELLIGENCE_EDEFAULT);
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
      case Rpg_modelingPackage.NON_PLAYER_CHARACTER__CONSTITUTION:
        return constitution != CONSTITUTION_EDEFAULT;
      case Rpg_modelingPackage.NON_PLAYER_CHARACTER__HP:
        return hp != HP_EDEFAULT;
      case Rpg_modelingPackage.NON_PLAYER_CHARACTER__LUCK:
        return luck != LUCK_EDEFAULT;
      case Rpg_modelingPackage.NON_PLAYER_CHARACTER__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case Rpg_modelingPackage.NON_PLAYER_CHARACTER__MP:
        return mp != MP_EDEFAULT;
      case Rpg_modelingPackage.NON_PLAYER_CHARACTER__WISDOM:
        return wisdom != WISDOM_EDEFAULT;
      case Rpg_modelingPackage.NON_PLAYER_CHARACTER__DEXTERITY:
        return dexterity != DEXTERITY_EDEFAULT;
      case Rpg_modelingPackage.NON_PLAYER_CHARACTER__STRENGHT:
        return strenght != STRENGHT_EDEFAULT;
      case Rpg_modelingPackage.NON_PLAYER_CHARACTER__INTELLIGENCE:
        return intelligence != INTELLIGENCE_EDEFAULT;
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
    result.append(" (constitution: ");
    result.append(constitution);
    result.append(", hp: ");
    result.append(hp);
    result.append(", luck: ");
    result.append(luck);
    result.append(", name: ");
    result.append(name);
    result.append(", mp: ");
    result.append(mp);
    result.append(", wisdom: ");
    result.append(wisdom);
    result.append(", dexterity: ");
    result.append(dexterity);
    result.append(", strenght: ");
    result.append(strenght);
    result.append(", intelligence: ");
    result.append(intelligence);
    result.append(')');
    return result.toString();
  }

} //NonPlayerCharacterImpl
