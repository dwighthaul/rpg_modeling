/**
 */
package rpg_modeling;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Player</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rpg_modeling.Player#getGuild <em>Guild</em>}</li>
 *   <li>{@link rpg_modeling.Player#getRole <em>Role</em>}</li>
 *   <li>{@link rpg_modeling.Player#getClass_ <em>Class</em>}</li>
 * </ul>
 *
 * @see rpg_modeling.Rpg_modelingPackage#getPlayer()
 * @model
 * @generated
 */
public interface Player extends rpg_modeling.Character {
  /**
   * Returns the value of the '<em><b>Guild</b></em>' reference.
   * It is bidirectional and its opposite is '{@link rpg_modeling.Guild#getPlayers <em>Players</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Guild</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Guild</em>' reference.
   * @see #setGuild(Guild)
   * @see rpg_modeling.Rpg_modelingPackage#getPlayer_Guild()
   * @see rpg_modeling.Guild#getPlayers
   * @model opposite="players"
   * @generated
   */
  Guild getGuild();

  /**
   * Sets the value of the '{@link rpg_modeling.Player#getGuild <em>Guild</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Guild</em>' reference.
   * @see #getGuild()
   * @generated
   */
  void setGuild(Guild value);

  /**
   * Returns the value of the '<em><b>Role</b></em>' attribute.
   * The default value is <code>"NO_MEMBER"</code>.
   * The literals are from the enumeration {@link rpg_modeling.Grades}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Role</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Role</em>' attribute.
   * @see rpg_modeling.Grades
   * @see #setRole(Grades)
   * @see rpg_modeling.Rpg_modelingPackage#getPlayer_Role()
   * @model default="NO_MEMBER"
   * @generated
   */
  Grades getRole();

  /**
   * Sets the value of the '{@link rpg_modeling.Player#getRole <em>Role</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Role</em>' attribute.
   * @see rpg_modeling.Grades
   * @see #getRole()
   * @generated
   */
  void setRole(Grades value);

  /**
   * Returns the value of the '<em><b>Class</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Class</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Class</em>' containment reference.
   * @see #setClass(Job)
   * @see rpg_modeling.Rpg_modelingPackage#getPlayer_Class()
   * @model containment="true" required="true"
   * @generated
   */
  Job getClass_();

  /**
   * Sets the value of the '{@link rpg_modeling.Player#getClass_ <em>Class</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Class</em>' containment reference.
   * @see #getClass_()
   * @generated
   */
  void setClass(Job value);

} // Player
