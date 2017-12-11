/**
 */
package rpg_modeling;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quest Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rpg_modeling.QuestObject#get_idQuest <em>id Quest</em>}</li>
 * </ul>
 *
 * @see rpg_modeling.Rpg_modelingPackage#getQuestObject()
 * @model
 * @generated
 */
public interface QuestObject extends GameObject {
  /**
   * Returns the value of the '<em><b>id Quest</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>id Quest</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>id Quest</em>' attribute.
   * @see #set_idQuest(int)
   * @see rpg_modeling.Rpg_modelingPackage#getQuestObject__idQuest()
   * @model
   * @generated
   */
  int get_idQuest();

  /**
   * Sets the value of the '{@link rpg_modeling.QuestObject#get_idQuest <em>id Quest</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>id Quest</em>' attribute.
   * @see #get_idQuest()
   * @generated
   */
  void set_idQuest(int value);

} // QuestObject
