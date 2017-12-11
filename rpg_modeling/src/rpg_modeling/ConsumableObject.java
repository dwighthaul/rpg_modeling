/**
 */
package rpg_modeling;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Consumable Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rpg_modeling.ConsumableObject#getTimeEffect <em>Time Effect</em>}</li>
 *   <li>{@link rpg_modeling.ConsumableObject#getNewAttribute <em>New Attribute</em>}</li>
 * </ul>
 *
 * @see rpg_modeling.Rpg_modelingPackage#getConsumableObject()
 * @model
 * @generated
 */
public interface ConsumableObject extends GameObject {
  /**
   * Returns the value of the '<em><b>Time Effect</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Time Effect</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Time Effect</em>' attribute.
   * @see #setTimeEffect(int)
   * @see rpg_modeling.Rpg_modelingPackage#getConsumableObject_TimeEffect()
   * @model
   * @generated
   */
  int getTimeEffect();

  /**
   * Sets the value of the '{@link rpg_modeling.ConsumableObject#getTimeEffect <em>Time Effect</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Time Effect</em>' attribute.
   * @see #getTimeEffect()
   * @generated
   */
  void setTimeEffect(int value);

  /**
   * Returns the value of the '<em><b>New Attribute</b></em>' attribute.
   * The default value is <code>"DEFAULT"</code>.
   * The literals are from the enumeration {@link rpg_modeling.TypeObject}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>New Attribute</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>New Attribute</em>' attribute.
   * @see rpg_modeling.TypeObject
   * @see #setNewAttribute(TypeObject)
   * @see rpg_modeling.Rpg_modelingPackage#getConsumableObject_NewAttribute()
   * @model default="DEFAULT"
   * @generated
   */
  TypeObject getNewAttribute();

  /**
   * Sets the value of the '{@link rpg_modeling.ConsumableObject#getNewAttribute <em>New Attribute</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>New Attribute</em>' attribute.
   * @see rpg_modeling.TypeObject
   * @see #getNewAttribute()
   * @generated
   */
  void setNewAttribute(TypeObject value);

} // ConsumableObject
