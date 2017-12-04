/**
 */
package rpg_modeling;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Grades</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see rpg_modeling.Rpg_modelingPackage#getGrades()
 * @model
 * @generated
 */
public enum Grades implements Enumerator {
  /**
   * The '<em><b>MASTER</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MASTER_VALUE
   * @generated
   * @ordered
   */
  MASTER(0, "MASTER", "MASTER"),

  /**
   * The '<em><b>OFFICER</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #OFFICER_VALUE
   * @generated
   * @ordered
   */
  OFFICER(1, "OFFICER", "OFFICER"),

  /**
   * The '<em><b>MEMBER</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MEMBER_VALUE
   * @generated
   * @ordered
   */
  MEMBER(2, "MEMBER", "MEMBER"),

  /**
   * The '<em><b>INTIATE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #INTIATE_VALUE
   * @generated
   * @ordered
   */
  INTIATE(3, "INTIATE", "INTIATE"),

  /**
   * The '<em><b>NO MEMBER</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NO_MEMBER_VALUE
   * @generated
   * @ordered
   */
  NO_MEMBER(4, "NO_MEMBER", "NO_MEMBER");

  /**
   * The '<em><b>MASTER</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>MASTER</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #MASTER
   * @model
   * @generated
   * @ordered
   */
  public static final int MASTER_VALUE = 0;

  /**
   * The '<em><b>OFFICER</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>OFFICER</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #OFFICER
   * @model
   * @generated
   * @ordered
   */
  public static final int OFFICER_VALUE = 1;

  /**
   * The '<em><b>MEMBER</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>MEMBER</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #MEMBER
   * @model
   * @generated
   * @ordered
   */
  public static final int MEMBER_VALUE = 2;

  /**
   * The '<em><b>INTIATE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>INTIATE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #INTIATE
   * @model
   * @generated
   * @ordered
   */
  public static final int INTIATE_VALUE = 3;

  /**
   * The '<em><b>NO MEMBER</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>NO MEMBER</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #NO_MEMBER
   * @model
   * @generated
   * @ordered
   */
  public static final int NO_MEMBER_VALUE = 4;

  /**
   * An array of all the '<em><b>Grades</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final Grades[] VALUES_ARRAY =
    new Grades[] {
      MASTER,
      OFFICER,
      MEMBER,
      INTIATE,
      NO_MEMBER,
    };

  /**
   * A public read-only list of all the '<em><b>Grades</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<Grades> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Grades</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static Grades get(String literal) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      Grades result = VALUES_ARRAY[i];
      if (result.toString().equals(literal)) {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Grades</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static Grades getByName(String name) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      Grades result = VALUES_ARRAY[i];
      if (result.getName().equals(name)) {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Grades</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static Grades get(int value) {
    switch (value) {
      case MASTER_VALUE: return MASTER;
      case OFFICER_VALUE: return OFFICER;
      case MEMBER_VALUE: return MEMBER;
      case INTIATE_VALUE: return INTIATE;
      case NO_MEMBER_VALUE: return NO_MEMBER;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private Grades(int value, String name, String literal) {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue() {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName() {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLiteral() {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString() {
    return literal;
  }
  
} //Grades
