/**
 */
package rpg_modeling;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Equipment Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rpg_modeling.EquipmentObject#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see rpg_modeling.Rpg_modelingPackage#getEquipmentObject()
 * @model
 * @generated
 */
public interface EquipmentObject extends GameObject {
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The default value is <code>"DEFAULT"</code>.
   * The literals are from the enumeration {@link rpg_modeling.CategoryObject}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see rpg_modeling.CategoryObject
   * @see #setType(CategoryObject)
   * @see rpg_modeling.Rpg_modelingPackage#getEquipmentObject_Type()
   * @model default="DEFAULT"
   * @generated
   */
  CategoryObject getType();

  /**
   * Sets the value of the '{@link rpg_modeling.EquipmentObject#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see rpg_modeling.CategoryObject
   * @see #getType()
   * @generated
   */
  void setType(CategoryObject value);

} // EquipmentObject
