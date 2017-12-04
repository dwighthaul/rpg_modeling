/**
 */
package rpg_modeling;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Category Object</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see rpg_modeling.Rpg_modelingPackage#getCategoryObject()
 * @model
 * @generated
 */
public enum CategoryObject implements Enumerator {
  /**
   * The '<em><b>HEAD</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #HEAD_VALUE
   * @generated
   * @ordered
   */
  HEAD(0, "HEAD", "HEAD"),

  /**
   * The '<em><b>ARM</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ARM_VALUE
   * @generated
   * @ordered
   */
  ARM(1, "ARM", "ARM"),

  /**
   * The '<em><b>CHEST</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #CHEST_VALUE
   * @generated
   * @ordered
   */
  CHEST(2, "CHEST", "CHEST"),

  /**
   * The '<em><b>LEG</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #LEG_VALUE
   * @generated
   * @ordered
   */
  LEG(3, "LEG", "LEG"),

  /**
   * The '<em><b>RIGHT HAND</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #RIGHT_HAND_VALUE
   * @generated
   * @ordered
   */
  RIGHT_HAND(4, "RIGHT_HAND", "RIGHT_HAND"),

  /**
   * The '<em><b>LEFT HAND</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #LEFT_HAND_VALUE
   * @generated
   * @ordered
   */
  LEFT_HAND(5, "LEFT_HAND", "LEFT_HAND"),

  /**
   * The '<em><b>HAND</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #HAND_VALUE
   * @generated
   * @ordered
   */
  HAND(6, "HAND", "HAND"),

  /**
   * The '<em><b>FOOT</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #FOOT_VALUE
   * @generated
   * @ordered
   */
  FOOT(7, "FOOT", "FOOT"),

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
   * The '<em><b>HEAD</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>HEAD</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #HEAD
   * @model
   * @generated
   * @ordered
   */
  public static final int HEAD_VALUE = 0;

  /**
   * The '<em><b>ARM</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>ARM</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ARM
   * @model
   * @generated
   * @ordered
   */
  public static final int ARM_VALUE = 1;

  /**
   * The '<em><b>CHEST</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>CHEST</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #CHEST
   * @model
   * @generated
   * @ordered
   */
  public static final int CHEST_VALUE = 2;

  /**
   * The '<em><b>LEG</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>LEG</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #LEG
   * @model
   * @generated
   * @ordered
   */
  public static final int LEG_VALUE = 3;

  /**
   * The '<em><b>RIGHT HAND</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>RIGHT HAND</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #RIGHT_HAND
   * @model
   * @generated
   * @ordered
   */
  public static final int RIGHT_HAND_VALUE = 4;

  /**
   * The '<em><b>LEFT HAND</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>LEFT HAND</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #LEFT_HAND
   * @model
   * @generated
   * @ordered
   */
  public static final int LEFT_HAND_VALUE = 5;

  /**
   * The '<em><b>HAND</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>HAND</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #HAND
   * @model
   * @generated
   * @ordered
   */
  public static final int HAND_VALUE = 6;

  /**
   * The '<em><b>FOOT</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>FOOT</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #FOOT
   * @model
   * @generated
   * @ordered
   */
  public static final int FOOT_VALUE = 7;

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
   * An array of all the '<em><b>Category Object</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final CategoryObject[] VALUES_ARRAY =
    new CategoryObject[] {
      HEAD,
      ARM,
      CHEST,
      LEG,
      RIGHT_HAND,
      LEFT_HAND,
      HAND,
      FOOT,
      DEFAULT,
    };

  /**
   * A public read-only list of all the '<em><b>Category Object</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<CategoryObject> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Category Object</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static CategoryObject get(String literal) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      CategoryObject result = VALUES_ARRAY[i];
      if (result.toString().equals(literal)) {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Category Object</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static CategoryObject getByName(String name) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      CategoryObject result = VALUES_ARRAY[i];
      if (result.getName().equals(name)) {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Category Object</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static CategoryObject get(int value) {
    switch (value) {
      case HEAD_VALUE: return HEAD;
      case ARM_VALUE: return ARM;
      case CHEST_VALUE: return CHEST;
      case LEG_VALUE: return LEG;
      case RIGHT_HAND_VALUE: return RIGHT_HAND;
      case LEFT_HAND_VALUE: return LEFT_HAND;
      case HAND_VALUE: return HAND;
      case FOOT_VALUE: return FOOT;
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
  private CategoryObject(int value, String name, String literal) {
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
  
} //CategoryObject
