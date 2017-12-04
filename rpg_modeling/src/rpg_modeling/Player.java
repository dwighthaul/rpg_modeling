/**
 */
package rpg_modeling;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link rpg_modeling.Player#getName <em>Name</em>}</li>
 *   <li>{@link rpg_modeling.Player#getHp <em>Hp</em>}</li>
 *   <li>{@link rpg_modeling.Player#getMp <em>Mp</em>}</li>
 *   <li>{@link rpg_modeling.Player#getStrenght <em>Strenght</em>}</li>
 *   <li>{@link rpg_modeling.Player#getConstitution <em>Constitution</em>}</li>
 *   <li>{@link rpg_modeling.Player#getDexterity <em>Dexterity</em>}</li>
 *   <li>{@link rpg_modeling.Player#getIntelligence <em>Intelligence</em>}</li>
 *   <li>{@link rpg_modeling.Player#getWisdom <em>Wisdom</em>}</li>
 *   <li>{@link rpg_modeling.Player#getLuck <em>Luck</em>}</li>
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
   * It is bidirectional and its opposite is '{@link rpg_modeling.Guild#getPlayer <em>Player</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Guild</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Guild</em>' reference.
   * @see #setGuild(Guild)
   * @see rpg_modeling.Rpg_modelingPackage#getPlayer_Guild()
   * @see rpg_modeling.Guild#getPlayer
   * @model opposite="player"
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
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see rpg_modeling.Rpg_modelingPackage#getPlayer_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link rpg_modeling.Player#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Hp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Hp</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Hp</em>' attribute.
   * @see #setHp(int)
   * @see rpg_modeling.Rpg_modelingPackage#getPlayer_Hp()
   * @model
   * @generated
   */
  int getHp();

  /**
   * Sets the value of the '{@link rpg_modeling.Player#getHp <em>Hp</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Hp</em>' attribute.
   * @see #getHp()
   * @generated
   */
  void setHp(int value);

  /**
   * Returns the value of the '<em><b>Mp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mp</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mp</em>' attribute.
   * @see #setMp(int)
   * @see rpg_modeling.Rpg_modelingPackage#getPlayer_Mp()
   * @model
   * @generated
   */
  int getMp();

  /**
   * Sets the value of the '{@link rpg_modeling.Player#getMp <em>Mp</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mp</em>' attribute.
   * @see #getMp()
   * @generated
   */
  void setMp(int value);

  /**
   * Returns the value of the '<em><b>Strenght</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Strenght</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Strenght</em>' attribute.
   * @see #setStrenght(int)
   * @see rpg_modeling.Rpg_modelingPackage#getPlayer_Strenght()
   * @model
   * @generated
   */
  int getStrenght();

  /**
   * Sets the value of the '{@link rpg_modeling.Player#getStrenght <em>Strenght</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Strenght</em>' attribute.
   * @see #getStrenght()
   * @generated
   */
  void setStrenght(int value);

  /**
   * Returns the value of the '<em><b>Constitution</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Constitution</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constitution</em>' attribute.
   * @see #setConstitution(int)
   * @see rpg_modeling.Rpg_modelingPackage#getPlayer_Constitution()
   * @model
   * @generated
   */
  int getConstitution();

  /**
   * Sets the value of the '{@link rpg_modeling.Player#getConstitution <em>Constitution</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Constitution</em>' attribute.
   * @see #getConstitution()
   * @generated
   */
  void setConstitution(int value);

  /**
   * Returns the value of the '<em><b>Dexterity</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dexterity</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dexterity</em>' attribute.
   * @see #setDexterity(int)
   * @see rpg_modeling.Rpg_modelingPackage#getPlayer_Dexterity()
   * @model
   * @generated
   */
  int getDexterity();

  /**
   * Sets the value of the '{@link rpg_modeling.Player#getDexterity <em>Dexterity</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dexterity</em>' attribute.
   * @see #getDexterity()
   * @generated
   */
  void setDexterity(int value);

  /**
   * Returns the value of the '<em><b>Intelligence</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Intelligence</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Intelligence</em>' attribute.
   * @see #setIntelligence(int)
   * @see rpg_modeling.Rpg_modelingPackage#getPlayer_Intelligence()
   * @model
   * @generated
   */
  int getIntelligence();

  /**
   * Sets the value of the '{@link rpg_modeling.Player#getIntelligence <em>Intelligence</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Intelligence</em>' attribute.
   * @see #getIntelligence()
   * @generated
   */
  void setIntelligence(int value);

  /**
   * Returns the value of the '<em><b>Wisdom</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Wisdom</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Wisdom</em>' attribute.
   * @see #setWisdom(int)
   * @see rpg_modeling.Rpg_modelingPackage#getPlayer_Wisdom()
   * @model
   * @generated
   */
  int getWisdom();

  /**
   * Sets the value of the '{@link rpg_modeling.Player#getWisdom <em>Wisdom</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Wisdom</em>' attribute.
   * @see #getWisdom()
   * @generated
   */
  void setWisdom(int value);

  /**
   * Returns the value of the '<em><b>Luck</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Luck</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Luck</em>' attribute.
   * @see #setLuck(int)
   * @see rpg_modeling.Rpg_modelingPackage#getPlayer_Luck()
   * @model
   * @generated
   */
  int getLuck();

  /**
   * Sets the value of the '{@link rpg_modeling.Player#getLuck <em>Luck</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Luck</em>' attribute.
   * @see #getLuck()
   * @generated
   */
  void setLuck(int value);

  /**
   * Returns the value of the '<em><b>Class</b></em>' containment reference list.
   * The list contents are of type {@link rpg_modeling.Job}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Class</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Class</em>' containment reference list.
   * @see rpg_modeling.Rpg_modelingPackage#getPlayer_Class()
   * @model containment="true"
   * @generated
   */
  EList<Job> getClass_();

} // Player
