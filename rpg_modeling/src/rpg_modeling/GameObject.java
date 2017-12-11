/**
 */
package rpg_modeling;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Game Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rpg_modeling.GameObject#get_id <em>id</em>}</li>
 *   <li>{@link rpg_modeling.GameObject#getName <em>Name</em>}</li>
 *   <li>{@link rpg_modeling.GameObject#getPrice <em>Price</em>}</li>
 * </ul>
 *
 * @see rpg_modeling.Rpg_modelingPackage#getGameObject()
 * @model abstract="true"
 * @generated
 */
public interface GameObject extends EObject {
  /**
   * Returns the value of the '<em><b>id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>id</em>' attribute.
   * @see #set_id(int)
   * @see rpg_modeling.Rpg_modelingPackage#getGameObject__id()
   * @model id="true"
   * @generated
   */
  int get_id();

  /**
   * Sets the value of the '{@link rpg_modeling.GameObject#get_id <em>id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>id</em>' attribute.
   * @see #get_id()
   * @generated
   */
  void set_id(int value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see rpg_modeling.Rpg_modelingPackage#getGameObject_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link rpg_modeling.GameObject#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Price</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Price</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Price</em>' attribute.
   * @see #setPrice(int)
   * @see rpg_modeling.Rpg_modelingPackage#getGameObject_Price()
   * @model
   * @generated
   */
  int getPrice();

  /**
   * Sets the value of the '{@link rpg_modeling.GameObject#getPrice <em>Price</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Price</em>' attribute.
   * @see #getPrice()
   * @generated
   */
  void setPrice(int value);

} // GameObject
