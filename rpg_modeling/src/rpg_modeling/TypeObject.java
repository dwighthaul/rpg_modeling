/**
 */
package rpg_modeling;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Type Object</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see rpg_modeling.Rpg_modelingPackage#getTypeObject()
 * @model
 * @generated
 */
public enum TypeObject implements Enumerator {
  /**
   * The '<em><b>HEAL</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #HEAL_VALUE
   * @generated
   * @ordered
   */
  HEAL(0, "HEAL", "HEAL"),

  /**
   * The '<em><b>POISON</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #POISON_VALUE
   * @generated
   * @ordered
   */
  POISON(1, "POISON", "POISON"),

  /**
   * The '<em><b>THUNDER</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #THUNDER_VALUE
   * @generated
   * @ordered
   */
  THUNDER(3, "THUNDER", "THUNDER"),

  /**
   * The '<em><b>DEFAULT</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DEFAULT_VALUE
   * @generated
   * @ordered
   */
  DEFAULT(8, "DEFAULT", "DEFAULT");

  /**
   * The '<em><b>HEAL</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>HEAL</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #HEAL
   * @model
   * @generated
   * @ordered
   */
  public static final int HEAL_VALUE = 0;

  /**
   * The '<em><b>POISON</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>POISON</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #POISON
   * @model
   * @generated
   * @ordered
   */
  public static final int POISON_VALUE = 1;

  /**
   * The '<em><b>THUNDER</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>THUNDER</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #THUNDER
   * @model
   * @generated
   * @ordered
   */
  public static final int THUNDER_VALUE = 3;

  /**
   * The '<em><b>DEFAULT</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>DEFAULT</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DEFAULT
   * @model
   * @generated
   * @ordered
   */
  public static final int DEFAULT_VALUE = 8;

  /**
   * An array of all the '<em><b>Type Object</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final TypeObject[] VALUES_ARRAY =
    new TypeObject[] {
      HEAL,
      POISON,
      THUNDER,
      DEFAULT,
    };

  /**
   * A public read-only list of all the '<em><b>Type Object</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<TypeObject> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Type Object</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static TypeObject get(String literal) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      TypeObject result = VALUES_ARRAY[i];
      if (result.toString().equals(literal)) {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Type Object</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static TypeObject getByName(String name) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      TypeObject result = VALUES_ARRAY[i];
      if (result.getName().equals(name)) {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Type Object</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static TypeObject get(int value) {
    switch (value) {
      case HEAL_VALUE: return HEAL;
      case POISON_VALUE: return POISON;
      case THUNDER_VALUE: return THUNDER;
      case DEFAULT_VALUE: return DEFAULT;
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
  private TypeObject(int value, String name, String literal) {
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
  
} //TypeObject
