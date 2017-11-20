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
 *   <li>{@link rpg_modeling.Faction#getGuild <em>Guild</em>}</li>
 * </ul>
 *
 * @see rpg_modeling.Rpg_modelingPackage#getFaction()
 * @model
 * @generated
 */
public interface Faction extends EObject {
	/**
	 * Returns the value of the '<em><b>Guild</b></em>' containment reference list.
	 * The list contents are of type {@link rpg_modeling.Guild}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guild</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guild</em>' containment reference list.
	 * @see rpg_modeling.Rpg_modelingPackage#getFaction_Guild()
	 * @model containment="true"
	 * @generated
	 */
	EList<Guild> getGuild();

} // Faction
