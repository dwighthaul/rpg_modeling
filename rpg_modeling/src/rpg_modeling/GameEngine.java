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
 *   <li>{@link rpg_modeling.GameEngine#getFactions <em>Factions</em>}</li>
 *   <li>{@link rpg_modeling.GameEngine#getCharacters <em>Characters</em>}</li>
 * </ul>
 *
 * @see rpg_modeling.Rpg_modelingPackage#getGameEngine()
 * @model
 * @generated
 */
public interface GameEngine extends EObject {
  /**
   * Returns the value of the '<em><b>Factions</b></em>' containment reference list.
   * The list contents are of type {@link rpg_modeling.Faction}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Factions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Factions</em>' containment reference list.
   * @see rpg_modeling.Rpg_modelingPackage#getGameEngine_Factions()
   * @model containment="true"
   * @generated
   */
  EList<Faction> getFactions();

  /**
   * Returns the value of the '<em><b>Characters</b></em>' containment reference list.
   * The list contents are of type {@link rpg_modeling.Character}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Characters</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Characters</em>' containment reference list.
   * @see rpg_modeling.Rpg_modelingPackage#getGameEngine_Characters()
   * @model containment="true"
   * @generated
   */
  EList<rpg_modeling.Character> getCharacters();

} // GameEngine
