/**
 */
package rpg_modeling;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see rpg_modeling.Rpg_modelingPackage
 * @generated
 */
public interface Rpg_modelingFactory extends EFactory {
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  Rpg_modelingFactory eINSTANCE = rpg_modeling.impl.Rpg_modelingFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Non Player Character</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Non Player Character</em>'.
   * @generated
   */
  NonPlayerCharacter createNonPlayerCharacter();

  /**
   * Returns a new object of class '<em>Wizard</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Wizard</em>'.
   * @generated
   */
  Wizard createWizard();

  /**
   * Returns a new object of class '<em>Archer</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Archer</em>'.
   * @generated
   */
  Archer createArcher();

  /**
   * Returns a new object of class '<em>Equipment</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Equipment</em>'.
   * @generated
   */
  Equipment createEquipment();

  /**
   * Returns a new object of class '<em>Player Armor</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Player Armor</em>'.
   * @generated
   */
  PlayerArmor createPlayerArmor();

  /**
   * Returns a new object of class '<em>Assassin</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Assassin</em>'.
   * @generated
   */
  Assassin createAssassin();

  /**
   * Returns a new object of class '<em>Player</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Player</em>'.
   * @generated
   */
  Player createPlayer();

  /**
   * Returns a new object of class '<em>Warrior</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Warrior</em>'.
   * @generated
   */
  Warrior createWarrior();

  /**
   * Returns a new object of class '<em>Guild</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Guild</em>'.
   * @generated
   */
  Guild createGuild();

  /**
   * Returns a new object of class '<em>Faction</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Faction</em>'.
   * @generated
   */
  Faction createFaction();

  /**
   * Returns a new object of class '<em>Equipment Object</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Equipment Object</em>'.
   * @generated
   */
  EquipmentObject createEquipmentObject();

  /**
   * Returns a new object of class '<em>Player Inventory</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Player Inventory</em>'.
   * @generated
   */
  PlayerInventory createPlayerInventory();

  /**
   * Returns a new object of class '<em>Quest Object</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Quest Object</em>'.
   * @generated
   */
  QuestObject createQuestObject();

  /**
   * Returns a new object of class '<em>Consumable Object</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Consumable Object</em>'.
   * @generated
   */
  ConsumableObject createConsumableObject();

  /**
   * Returns a new object of class '<em>Guild Inventory</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Guild Inventory</em>'.
   * @generated
   */
  GuildInventory createGuildInventory();

  /**
   * Returns a new object of class '<em>Game Engine</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Game Engine</em>'.
   * @generated
   */
  GameEngine createGameEngine();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  Rpg_modelingPackage getRpg_modelingPackage();

} //Rpg_modelingFactory
