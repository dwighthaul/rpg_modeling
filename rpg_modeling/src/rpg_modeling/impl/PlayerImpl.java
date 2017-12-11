/**
 */
package rpg_modeling.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
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
   * The cached value of the '{@link #getClass_() <em>Class</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClass_()
   * @generated
   * @ordered
   */
  protected Job class_;

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
        msgs = ((InternalEObject)guild).eInverseRemove(this, Rpg_modelingPackage.GUILD__PLAYERS, Guild.class, msgs);
      if (newGuild != null)
        msgs = ((InternalEObject)newGuild).eInverseAdd(this, Rpg_modelingPackage.GUILD__PLAYERS, Guild.class, msgs);
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
  public Job getClass_() {
    return class_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetClass(Job newClass, NotificationChain msgs) {
    Job oldClass = class_;
    class_ = newClass;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Rpg_modelingPackage.PLAYER__CLASS, oldClass, newClass);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setClass(Job newClass) {
    if (newClass != class_) {
      NotificationChain msgs = null;
      if (class_ != null)
        msgs = ((InternalEObject)class_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Rpg_modelingPackage.PLAYER__CLASS, null, msgs);
      if (newClass != null)
        msgs = ((InternalEObject)newClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Rpg_modelingPackage.PLAYER__CLASS, null, msgs);
      msgs = basicSetClass(newClass, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Rpg_modelingPackage.PLAYER__CLASS, newClass, newClass));
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
          msgs = ((InternalEObject)guild).eInverseRemove(this, Rpg_modelingPackage.GUILD__PLAYERS, Guild.class, msgs);
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
        return basicSetClass(null, msgs);
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
      case Rpg_modelingPackage.PLAYER__CLASS:
        setClass((Job)newValue);
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
      case Rpg_modelingPackage.PLAYER__CLASS:
        setClass((Job)null);
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
      case Rpg_modelingPackage.PLAYER__CLASS:
        return class_ != null;
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
    result.append(')');
    return result.toString();
  }

} //PlayerImpl
