/**
 */
package rpg_modeling;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inventory</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rpg_modeling.Inventory#getQteMoney <em>Qte Money</em>}</li>
 *   <li>{@link rpg_modeling.Inventory#getGameobjects <em>Gameobjects</em>}</li>
 * </ul>
 *
 * @see rpg_modeling.Rpg_modelingPackage#getInventory()
 * @model abstract="true"
 * @generated
 */
public interface Inventory extends EObject {

  /**
   * Returns the value of the '<em><b>Qte Money</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Qte Money</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Qte Money</em>' attribute.
   * @see #setQteMoney(int)
   * @see rpg_modeling.Rpg_modelingPackage#getInventory_QteMoney()
   * @model
   * @generated
   */
  int getQteMoney();

  /**
   * Sets the value of the '{@link rpg_modeling.Inventory#getQteMoney <em>Qte Money</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Qte Money</em>' attribute.
   * @see #getQteMoney()
   * @generated
   */
  void setQteMoney(int value);

  /**
   * Returns the value of the '<em><b>Gameobjects</b></em>' containment reference list.
   * The list contents are of type {@link rpg_modeling.GameObject}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Gameobjects</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Gameobjects</em>' containment reference list.
   * @see rpg_modeling.Rpg_modelingPackage#getInventory_Gameobjects()
   * @model containment="true"
   * @generated
   */
  EList<GameObject> getGameobjects();
} // Inventory
