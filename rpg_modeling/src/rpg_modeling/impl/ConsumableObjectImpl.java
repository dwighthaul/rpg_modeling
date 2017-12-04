/**
 */
package rpg_modeling.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import rpg_modeling.ConsumableObject;
import rpg_modeling.Rpg_modelingPackage;
import rpg_modeling.TypeObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Consumable Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rpg_modeling.impl.ConsumableObjectImpl#getTimeEffect <em>Time Effect</em>}</li>
 *   <li>{@link rpg_modeling.impl.ConsumableObjectImpl#getNewAttribute <em>New Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConsumableObjectImpl extends GameObjectImpl implements ConsumableObject {
  /**
   * The default value of the '{@link #getTimeEffect() <em>Time Effect</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTimeEffect()
   * @generated
   * @ordered
   */
  protected static final int TIME_EFFECT_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getTimeEffect() <em>Time Effect</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTimeEffect()
   * @generated
   * @ordered
   */
  protected int timeEffect = TIME_EFFECT_EDEFAULT;

  /**
   * The default value of the '{@link #getNewAttribute() <em>New Attribute</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNewAttribute()
   * @generated
   * @ordered
   */
  protected static final TypeObject NEW_ATTRIBUTE_EDEFAULT = TypeObject.DEFAULT;

  /**
   * The cached value of the '{@link #getNewAttribute() <em>New Attribute</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNewAttribute()
   * @generated
   * @ordered
   */
  protected TypeObject newAttribute = NEW_ATTRIBUTE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConsumableObjectImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return Rpg_modelingPackage.Literals.CONSUMABLE_OBJECT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getTimeEffect() {
    return timeEffect;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTimeEffect(int newTimeEffect) {
    int oldTimeEffect = timeEffect;
    timeEffect = newTimeEffect;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Rpg_modelingPackage.CONSUMABLE_OBJECT__TIME_EFFECT, oldTimeEffect, timeEffect));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeObject getNewAttribute() {
    return newAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNewAttribute(TypeObject newNewAttribute) {
    TypeObject oldNewAttribute = newAttribute;
    newAttribute = newNewAttribute == null ? NEW_ATTRIBUTE_EDEFAULT : newNewAttribute;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Rpg_modelingPackage.CONSUMABLE_OBJECT__NEW_ATTRIBUTE, oldNewAttribute, newAttribute));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case Rpg_modelingPackage.CONSUMABLE_OBJECT__TIME_EFFECT:
        return getTimeEffect();
      case Rpg_modelingPackage.CONSUMABLE_OBJECT__NEW_ATTRIBUTE:
        return getNewAttribute();
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
      case Rpg_modelingPackage.CONSUMABLE_OBJECT__TIME_EFFECT:
        setTimeEffect((Integer)newValue);
        return;
      case Rpg_modelingPackage.CONSUMABLE_OBJECT__NEW_ATTRIBUTE:
        setNewAttribute((TypeObject)newValue);
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
      case Rpg_modelingPackage.CONSUMABLE_OBJECT__TIME_EFFECT:
        setTimeEffect(TIME_EFFECT_EDEFAULT);
        return;
      case Rpg_modelingPackage.CONSUMABLE_OBJECT__NEW_ATTRIBUTE:
        setNewAttribute(NEW_ATTRIBUTE_EDEFAULT);
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
      case Rpg_modelingPackage.CONSUMABLE_OBJECT__TIME_EFFECT:
        return timeEffect != TIME_EFFECT_EDEFAULT;
      case Rpg_modelingPackage.CONSUMABLE_OBJECT__NEW_ATTRIBUTE:
        return newAttribute != NEW_ATTRIBUTE_EDEFAULT;
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
    result.append(" (timeEffect: ");
    result.append(timeEffect);
    result.append(", newAttribute: ");
    result.append(newAttribute);
    result.append(')');
    return result.toString();
  }

} //ConsumableObjectImpl
