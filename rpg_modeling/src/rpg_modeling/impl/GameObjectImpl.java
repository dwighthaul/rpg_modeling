/**
 */
package rpg_modeling.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import rpg_modeling.GameObject;
import rpg_modeling.Rpg_modelingPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Game Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rpg_modeling.impl.GameObjectImpl#get_id <em>id</em>}</li>
 *   <li>{@link rpg_modeling.impl.GameObjectImpl#getName <em>Name</em>}</li>
 *   <li>{@link rpg_modeling.impl.GameObjectImpl#getPrice <em>Price</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class GameObjectImpl extends MinimalEObjectImpl.Container implements GameObject {
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
   * The default value of the '{@link #getPrice() <em>Price</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrice()
   * @generated
   * @ordered
   */
  protected static final int PRICE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getPrice() <em>Price</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrice()
   * @generated
   * @ordered
   */
  protected int price = PRICE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GameObjectImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return Rpg_modelingPackage.Literals.GAME_OBJECT;
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
      eNotify(new ENotificationImpl(this, Notification.SET, Rpg_modelingPackage.GAME_OBJECT__ID, old_id, _id));
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
      eNotify(new ENotificationImpl(this, Notification.SET, Rpg_modelingPackage.GAME_OBJECT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getPrice() {
    return price;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPrice(int newPrice) {
    int oldPrice = price;
    price = newPrice;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Rpg_modelingPackage.GAME_OBJECT__PRICE, oldPrice, price));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case Rpg_modelingPackage.GAME_OBJECT__ID:
        return get_id();
      case Rpg_modelingPackage.GAME_OBJECT__NAME:
        return getName();
      case Rpg_modelingPackage.GAME_OBJECT__PRICE:
        return getPrice();
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
      case Rpg_modelingPackage.GAME_OBJECT__ID:
        set_id((Integer)newValue);
        return;
      case Rpg_modelingPackage.GAME_OBJECT__NAME:
        setName((String)newValue);
        return;
      case Rpg_modelingPackage.GAME_OBJECT__PRICE:
        setPrice((Integer)newValue);
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
      case Rpg_modelingPackage.GAME_OBJECT__ID:
        set_id(_ID_EDEFAULT);
        return;
      case Rpg_modelingPackage.GAME_OBJECT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case Rpg_modelingPackage.GAME_OBJECT__PRICE:
        setPrice(PRICE_EDEFAULT);
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
      case Rpg_modelingPackage.GAME_OBJECT__ID:
        return _id != _ID_EDEFAULT;
      case Rpg_modelingPackage.GAME_OBJECT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case Rpg_modelingPackage.GAME_OBJECT__PRICE:
        return price != PRICE_EDEFAULT;
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
    result.append(" (_id: ");
    result.append(_id);
    result.append(", name: ");
    result.append(name);
    result.append(", price: ");
    result.append(price);
    result.append(')');
    return result.toString();
  }

} //GameObjectImpl
