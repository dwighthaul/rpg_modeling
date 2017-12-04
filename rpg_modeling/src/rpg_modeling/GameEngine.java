/**
 */
package rpg_modeling;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Game Engine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rpg_modeling.GameEngine#getFaction <em>Faction</em>}</li>
 *   <li>{@link rpg_modeling.GameEngine#getCharacter <em>Character</em>}</li>
 * </ul>
 *
 * @see rpg_modeling.Rpg_modelingPackage#getGameEngine()
 * @model
 * @generated
 */
public interface GameEngine extends EObject {
  /**
   * Returns the value of the '<em><b>Faction</b></em>' containment reference list.
   * The list contents are of type {@link rpg_modeling.Faction}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Faction</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Faction</em>' containment reference list.
   * @see rpg_modeling.Rpg_modelingPackage#getGameEngine_Faction()
   * @model containment="true"
   * @generated
   */
  EList<Faction> getFaction();

  /**
   * Returns the value of the '<em><b>Character</b></em>' containment reference list.
   * The list contents are of type {@link rpg_modeling.Character}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Character</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Character</em>' containment reference list.
   * @see rpg_modeling.Rpg_modelingPackage#getGameEngine_Character()
   * @model containment="true"
   * @generated
   */
  EList<rpg_modeling.Character> getCharacter();

} // GameEngine
