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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import rpg_modeling.Grades;
import rpg_modeling.Guild;
import rpg_modeling.Job;
import rpg_modeling.Player;
import rpg_modeling.Rpg_modelingPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Player</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rpg_modeling.impl.PlayerImpl#getGuild <em>Guild</em>}</li>
 *   <li>{@link rpg_modeling.impl.PlayerImpl#getRole <em>Role</em>}</li>
 *   <li>{@link rpg_modeling.impl.PlayerImpl#getName <em>Name</em>}</li>
 *   <li>{@link rpg_modeling.impl.PlayerImpl#getHp <em>Hp</em>}</li>
 *   <li>{@link rpg_modeling.impl.PlayerImpl#getMp <em>Mp</em>}</li>
 *   <li>{@link rpg_modeling.impl.PlayerImpl#getStrenght <em>Strenght</em>}</li>
 *   <li>{@link rpg_modeling.impl.PlayerImpl#getConstitution <em>Constitution</em>}</li>
 *   <li>{@link rpg_modeling.impl.PlayerImpl#getDexterity <em>Dexterity</em>}</li>
 *   <li>{@link rpg_modeling.impl.PlayerImpl#getIntelligence <em>Intelligence</em>}</li>
 *   <li>{@link rpg_modeling.impl.PlayerImpl#getWisdom <em>Wisdom</em>}</li>
 *   <li>{@link rpg_modeling.impl.PlayerImpl#getLuck <em>Luck</em>}</li>
 *   <li>{@link rpg_modeling.impl.PlayerImpl#getClass_ <em>Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlayerImpl extends CharacterImpl implements Player {
  /**
   * The cached value of the '{@link #getGuild() <em>Guild</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGuild()
   * @generated
   * @ordered
   */
  protected Guild guild;

  /**
   * The default value of the '{@link #getRole() <em>Role</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRole()
   * @generated
   * @ordered
   */
  protected static final Grades ROLE_EDEFAULT = Grades.NO_MEMBER;

  /**
   * The cached value of the '{@link #getRole() <em>Role</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRole()
   * @generated
   * @ordered
   */
  protected Grades role = ROLE_EDEFAULT;

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
   * The cached value of the '{@link #getClass_() <em>Class</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClass_()
   * @generated
   * @ordered
   */
  protected EList<Job> class_;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PlayerImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return Rpg_modelingPackage.Literals.PLAYER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Guild getGuild() {
    if (guild != null && guild.eIsProxy()) {
      InternalEObject oldGuild = (InternalEObject)guild;
      guild = (Guild)eResolveProxy(oldGuild);
      if (guild != oldGuild) {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, Rpg_modelingPackage.PLAYER__GUILD, oldGuild, guild));
      }
    }
    return guild;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Guild basicGetGuild() {
    return guild;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetGuild(Guild newGuild, NotificationChain msgs) {
    Guild oldGuild = guild;
    guild = newGuild;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Rpg_modelingPackage.PLAYER__GUILD, oldGuild, newGuild);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGuild(Guild newGuild) {
    if (newGuild != guild) {
      NotificationChain msgs = null;
      if (guild != null)
        msgs = ((InternalEObject)guild).eInverseRemove(this, Rpg_modelingPackage.GUILD__PLAYER, Guild.class, msgs);
      if (newGuild != null)
        msgs = ((InternalEObject)newGuild).eInverseAdd(this, Rpg_modelingPackage.GUILD__PLAYER, Guild.class, msgs);
      msgs = basicSetGuild(newGuild, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Rpg_modelingPackage.PLAYER__GUILD, newGuild, newGuild));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Grades getRole() {
    return role;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRole(Grades newRole) {
    Grades oldRole = role;
    role = newRole == null ? ROLE_EDEFAULT : newRole;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Rpg_modelingPackage.PLAYER__ROLE, oldRole, role));
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
      eNotify(new ENotificationImpl(this, Notification.SET, Rpg_modelingPackage.PLAYER__NAME, oldName, name));
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
      eNotify(new ENotificationImpl(this, Notification.SET, Rpg_modelingPackage.PLAYER__HP, oldHp, hp));
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
      eNotify(new ENotificationImpl(this, Notification.SET, Rpg_modelingPackage.PLAYER__MP, oldMp, mp));
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
      eNotify(new ENotificationImpl(this, Notification.SET, Rpg_modelingPackage.PLAYER__STRENGHT, oldStrenght, strenght));
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
      eNotify(new ENotificationImpl(this, Notification.SET, Rpg_modelingPackage.PLAYER__CONSTITUTION, oldConstitution, constitution));
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
      eNotify(new ENotificationImpl(this, Notification.SET, Rpg_modelingPackage.PLAYER__DEXTERITY, oldDexterity, dexterity));
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
      eNotify(new ENotificationImpl(this, Notification.SET, Rpg_modelingPackage.PLAYER__INTELLIGENCE, oldIntelligence, intelligence));
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
      eNotify(new ENotificationImpl(this, Notification.SET, Rpg_modelingPackage.PLAYER__WISDOM, oldWisdom, wisdom));
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
      eNotify(new ENotificationImpl(this, Notification.SET, Rpg_modelingPackage.PLAYER__LUCK, oldLuck, luck));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Job> getClass_() {
    if (class_ == null) {
      class_ = new EObjectContainmentEList<Job>(Job.class, this, Rpg_modelingPackage.PLAYER__CLASS);
    }
    return class_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case Rpg_modelingPackage.PLAYER__GUILD:
        if (guild != null)
          msgs = ((InternalEObject)guild).eInverseRemove(this, Rpg_modelingPackage.GUILD__PLAYER, Guild.class, msgs);
        return basicSetGuild((Guild)otherEnd, msgs);
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
      case Rpg_modelingPackage.PLAYER__GUILD:
        return basicSetGuild(null, msgs);
      case Rpg_modelingPackage.PLAYER__CLASS:
        return ((InternalEList<?>)getClass_()).basicRemove(otherEnd, msgs);
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
      case Rpg_modelingPackage.PLAYER__GUILD:
        if (resolve) return getGuild();
        return basicGetGuild();
      case Rpg_modelingPackage.PLAYER__ROLE:
        return getRole();
      case Rpg_modelingPackage.PLAYER__NAME:
        return getName();
      case Rpg_modelingPackage.PLAYER__HP:
        return getHp();
      case Rpg_modelingPackage.PLAYER__MP:
        return getMp();
      case Rpg_modelingPackage.PLAYER__STRENGHT:
        return getStrenght();
      case Rpg_modelingPackage.PLAYER__CONSTITUTION:
        return getConstitution();
      case Rpg_modelingPackage.PLAYER__DEXTERITY:
        return getDexterity();
      case Rpg_modelingPackage.PLAYER__INTELLIGENCE:
        return getIntelligence();
      case Rpg_modelingPackage.PLAYER__WISDOM:
        return getWisdom();
      case Rpg_modelingPackage.PLAYER__LUCK:
        return getLuck();
      case Rpg_modelingPackage.PLAYER__CLASS:
        return getClass_();
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
      case Rpg_modelingPackage.PLAYER__GUILD:
        setGuild((Guild)newValue);
        return;
      case Rpg_modelingPackage.PLAYER__ROLE:
        setRole((Grades)newValue);
        return;
      case Rpg_modelingPackage.PLAYER__NAME:
        setName((String)newValue);
        return;
      case Rpg_modelingPackage.PLAYER__HP:
        setHp((Integer)newValue);
        return;
      case Rpg_modelingPackage.PLAYER__MP:
        setMp((Integer)newValue);
        return;
      case Rpg_modelingPackage.PLAYER__STRENGHT:
        setStrenght((Integer)newValue);
        return;
      case Rpg_modelingPackage.PLAYER__CONSTITUTION:
        setConstitution((Integer)newValue);
        return;
      case Rpg_modelingPackage.PLAYER__DEXTERITY:
        setDexterity((Integer)newValue);
        return;
      case Rpg_modelingPackage.PLAYER__INTELLIGENCE:
        setIntelligence((Integer)newValue);
        return;
      case Rpg_modelingPackage.PLAYER__WISDOM:
        setWisdom((Integer)newValue);
        return;
      case Rpg_modelingPackage.PLAYER__LUCK:
        setLuck((Integer)newValue);
        return;
      case Rpg_modelingPackage.PLAYER__CLASS:
        getClass_().clear();
        getClass_().addAll((Collection<? extends Job>)newValue);
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
      case Rpg_modelingPackage.PLAYER__GUILD:
        setGuild((Guild)null);
        return;
      case Rpg_modelingPackage.PLAYER__ROLE:
        setRole(ROLE_EDEFAULT);
        return;
      case Rpg_modelingPackage.PLAYER__NAME:
        setName(NAME_EDEFAULT);
        return;
      case Rpg_modelingPackage.PLAYER__HP:
        setHp(HP_EDEFAULT);
        return;
      case Rpg_modelingPackage.PLAYER__MP:
        setMp(MP_EDEFAULT);
        return;
      case Rpg_modelingPackage.PLAYER__STRENGHT:
        setStrenght(STRENGHT_EDEFAULT);
        return;
      case Rpg_modelingPackage.PLAYER__CONSTITUTION:
        setConstitution(CONSTITUTION_EDEFAULT);
        return;
      case Rpg_modelingPackage.PLAYER__DEXTERITY:
        setDexterity(DEXTERITY_EDEFAULT);
        return;
      case Rpg_modelingPackage.PLAYER__INTELLIGENCE:
        setIntelligence(INTELLIGENCE_EDEFAULT);
        return;
      case Rpg_modelingPackage.PLAYER__WISDOM:
        setWisdom(WISDOM_EDEFAULT);
        return;
      case Rpg_modelingPackage.PLAYER__LUCK:
        setLuck(LUCK_EDEFAULT);
        return;
      case Rpg_modelingPackage.PLAYER__CLASS:
        getClass_().clear();
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
      case Rpg_modelingPackage.PLAYER__GUILD:
        return guild != null;
      case Rpg_modelingPackage.PLAYER__ROLE:
        return role != ROLE_EDEFAULT;
      case Rpg_modelingPackage.PLAYER__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case Rpg_modelingPackage.PLAYER__HP:
        return hp != HP_EDEFAULT;
      case Rpg_modelingPackage.PLAYER__MP:
        return mp != MP_EDEFAULT;
      case Rpg_modelingPackage.PLAYER__STRENGHT:
        return strenght != STRENGHT_EDEFAULT;
      case Rpg_modelingPackage.PLAYER__CONSTITUTION:
        return constitution != CONSTITUTION_EDEFAULT;
      case Rpg_modelingPackage.PLAYER__DEXTERITY:
        return dexterity != DEXTERITY_EDEFAULT;
      case Rpg_modelingPackage.PLAYER__INTELLIGENCE:
        return intelligence != INTELLIGENCE_EDEFAULT;
      case Rpg_modelingPackage.PLAYER__WISDOM:
        return wisdom != WISDOM_EDEFAULT;
      case Rpg_modelingPackage.PLAYER__LUCK:
        return luck != LUCK_EDEFAULT;
      case Rpg_modelingPackage.PLAYER__CLASS:
        return class_ != null && !class_.isEmpty();
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
    result.append(" (role: ");
    result.append(role);
    result.append(", name: ");
    result.append(name);
    result.append(", hp: ");
    result.append(hp);
    result.append(", mp: ");
    result.append(mp);
    result.append(", strenght: ");
    result.append(strenght);
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
    result.append(')');
    return result.toString();
  }

} //PlayerImpl
