/**
 */
package rpg_modeling;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Faction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rpg_modeling.Faction#getGuilds <em>Guilds</em>}</li>
 *   <li>{@link rpg_modeling.Faction#get_id <em>id</em>}</li>
 *   <li>{@link rpg_modeling.Faction#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see rpg_modeling.Rpg_modelingPackage#getFaction()
 * @model
 * @generated
 */
public interface Faction extends EObject {
  /**
   * Returns the value of the '<em><b>Guilds</b></em>' containment reference list.
   * The list contents are of type {@link rpg_modeling.Guild}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Guilds</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Guilds</em>' containment reference list.
   * @see rpg_modeling.Rpg_modelingPackage#getFaction_Guilds()
   * @model containment="true"
   * @generated
   */
  EList<Guild> getGuilds();

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
   * @see rpg_modeling.Rpg_modelingPackage#getFaction__id()
   * @model id="true"
   * @generated
   */
  int get_id();

  /**
   * Sets the value of the '{@link rpg_modeling.Faction#get_id <em>id</em>}' attribute.
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
   * @see rpg_modeling.Rpg_modelingPackage#getFaction_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link rpg_modeling.Faction#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // Faction
