/**
 */
package rpg_modeling;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Guild</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rpg_modeling.Guild#getGuildinventory <em>Guildinventory</em>}</li>
 *   <li>{@link rpg_modeling.Guild#getPlayer <em>Player</em>}</li>
 * </ul>
 *
 * @see rpg_modeling.Rpg_modelingPackage#getGuild()
 * @model
 * @generated
 */
public interface Guild extends EObject {
  /**
   * Returns the value of the '<em><b>Guildinventory</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Guildinventory</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Guildinventory</em>' containment reference.
   * @see #setGuildinventory(GuildInventory)
   * @see rpg_modeling.Rpg_modelingPackage#getGuild_Guildinventory()
   * @model containment="true" required="true"
   * @generated
   */
  GuildInventory getGuildinventory();

  /**
   * Sets the value of the '{@link rpg_modeling.Guild#getGuildinventory <em>Guildinventory</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Guildinventory</em>' containment reference.
   * @see #getGuildinventory()
   * @generated
   */
  void setGuildinventory(GuildInventory value);

  /**
   * Returns the value of the '<em><b>Player</b></em>' reference list.
   * The list contents are of type {@link rpg_modeling.Player}.
   * It is bidirectional and its opposite is '{@link rpg_modeling.Player#getGuild <em>Guild</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Player</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Player</em>' reference list.
   * @see rpg_modeling.Rpg_modelingPackage#getGuild_Player()
   * @see rpg_modeling.Player#getGuild
   * @model opposite="guild"
   * @generated
   */
  EList<Player> getPlayer();

} // Guild
