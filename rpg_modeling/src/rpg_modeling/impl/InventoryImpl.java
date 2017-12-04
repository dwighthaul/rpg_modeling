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
import rpg_modeling.GameObject;
import rpg_modeling.Inventory;
import rpg_modeling.Rpg_modelingPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inventory</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rpg_modeling.impl.InventoryImpl#getQteMoney <em>Qte Money</em>}</li>
 *   <li>{@link rpg_modeling.impl.InventoryImpl#getGameobject <em>Gameobject</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class InventoryImpl extends MinimalEObjectImpl.Container implements Inventory {
  /**
   * The default value of the '{@link #getQteMoney() <em>Qte Money</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQteMoney()
   * @generated
   * @ordered
   */
  protected static final int QTE_MONEY_EDEFAULT = 0;
  /**
   * The cached value of the '{@link #getQteMoney() <em>Qte Money</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQteMoney()
   * @generated
   * @ordered
   */
  protected int qteMoney = QTE_MONEY_EDEFAULT;
  /**
   * The cached value of the '{@link #getGameobject() <em>Gameobject</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGameobject()
   * @generated
   * @ordered
   */
  protected EList<GameObject> gameobject;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InventoryImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return Rpg_modelingPackage.Literals.INVENTORY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getQteMoney() {
    return qteMoney;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setQteMoney(int newQteMoney) {
    int oldQteMoney = qteMoney;
    qteMoney = newQteMoney;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Rpg_modelingPackage.INVENTORY__QTE_MONEY, oldQteMoney, qteMoney));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<GameObject> getGameobject() {
    if (gameobject == null) {
      gameobject = new EObjectContainmentEList<GameObject>(GameObject.class, this, Rpg_modelingPackage.INVENTORY__GAMEOBJECT);
    }
    return gameobject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case Rpg_modelingPackage.INVENTORY__GAMEOBJECT:
        return ((InternalEList<?>)getGameobject()).basicRemove(otherEnd, msgs);
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
      case Rpg_modelingPackage.INVENTORY__QTE_MONEY:
        return getQteMoney();
      case Rpg_modelingPackage.INVENTORY__GAMEOBJECT:
        return getGameobject();
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
      case Rpg_modelingPackage.INVENTORY__QTE_MONEY:
        setQteMoney((Integer)newValue);
        return;
      case Rpg_modelingPackage.INVENTORY__GAMEOBJECT:
        getGameobject().clear();
        getGameobject().addAll((Collection<? extends GameObject>)newValue);
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
      case Rpg_modelingPackage.INVENTORY__QTE_MONEY:
        setQteMoney(QTE_MONEY_EDEFAULT);
        return;
      case Rpg_modelingPackage.INVENTORY__GAMEOBJECT:
        getGameobject().clear();
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
      case Rpg_modelingPackage.INVENTORY__QTE_MONEY:
        return qteMoney != QTE_MONEY_EDEFAULT;
      case Rpg_modelingPackage.INVENTORY__GAMEOBJECT:
        return gameobject != null && !gameobject.isEmpty();
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
    result.append(" (qteMoney: ");
    result.append(qteMoney);
    result.append(')');
    return result.toString();
  }

} //InventoryImpl
