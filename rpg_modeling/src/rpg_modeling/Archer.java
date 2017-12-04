/**
 */
package rpg_modeling;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Archer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rpg_modeling.Archer#getSkill <em>Skill</em>}</li>
 * </ul>
 *
 * @see rpg_modeling.Rpg_modelingPackage#getArcher()
 * @model
 * @generated
 */
public interface Archer extends Job {
  /**
   * Returns the value of the '<em><b>Skill</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Skill</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Skill</em>' attribute.
   * @see #setSkill(EList)
   * @see rpg_modeling.Rpg_modelingPackage#getArcher_Skill()
   * @model many="false" transient="true"
   * @generated
   */
  EList getSkill();

  /**
   * Sets the value of the '{@link rpg_modeling.Archer#getSkill <em>Skill</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Skill</em>' attribute.
   * @see #getSkill()
   * @generated
   */
  void setSkill(EList value);

} // Archer
