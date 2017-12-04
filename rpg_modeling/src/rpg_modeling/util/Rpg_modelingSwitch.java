/**
 */
package rpg_modeling.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import rpg_modeling.Archer;
import rpg_modeling.Assassin;
import rpg_modeling.ConsumableObject;
import rpg_modeling.Equipment;
import rpg_modeling.EquipmentObject;
import rpg_modeling.Faction;
import rpg_modeling.GameEngine;
import rpg_modeling.GameObject;
import rpg_modeling.Guild;
import rpg_modeling.GuildInventory;
import rpg_modeling.Inventory;
import rpg_modeling.Job;
import rpg_modeling.NonPlayerCharacter;
import rpg_modeling.Player;
import rpg_modeling.PlayerArmor;
import rpg_modeling.PlayerInventory;
import rpg_modeling.QuestObject;
import rpg_modeling.Rpg_modelingPackage;
import rpg_modeling.Warrior;
import rpg_modeling.Wizard;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see rpg_modeling.Rpg_modelingPackage
 * @generated
 */
public class Rpg_modelingSwitch<T> extends Switch<T> {
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static Rpg_modelingPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Rpg_modelingSwitch() {
    if (modelPackage == null) {
      modelPackage = Rpg_modelingPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage) {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject) {
    switch (classifierID) {
      case Rpg_modelingPackage.NON_PLAYER_CHARACTER: {
        NonPlayerCharacter nonPlayerCharacter = (NonPlayerCharacter)theEObject;
        T result = caseNonPlayerCharacter(nonPlayerCharacter);
        if (result == null) result = caseCharacter(nonPlayerCharacter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Rpg_modelingPackage.WIZARD: {
        Wizard wizard = (Wizard)theEObject;
        T result = caseWizard(wizard);
        if (result == null) result = caseJob(wizard);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Rpg_modelingPackage.ARCHER: {
        Archer archer = (Archer)theEObject;
        T result = caseArcher(archer);
        if (result == null) result = caseJob(archer);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Rpg_modelingPackage.EQUIPMENT: {
        Equipment equipment = (Equipment)theEObject;
        T result = caseEquipment(equipment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Rpg_modelingPackage.PLAYER_ARMOR: {
        PlayerArmor playerArmor = (PlayerArmor)theEObject;
        T result = casePlayerArmor(playerArmor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Rpg_modelingPackage.ASSASSIN: {
        Assassin assassin = (Assassin)theEObject;
        T result = caseAssassin(assassin);
        if (result == null) result = caseJob(assassin);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Rpg_modelingPackage.PLAYER: {
        Player player = (Player)theEObject;
        T result = casePlayer(player);
        if (result == null) result = caseCharacter(player);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Rpg_modelingPackage.WARRIOR: {
        Warrior warrior = (Warrior)theEObject;
        T result = caseWarrior(warrior);
        if (result == null) result = caseJob(warrior);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Rpg_modelingPackage.JOB: {
        Job job = (Job)theEObject;
        T result = caseJob(job);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Rpg_modelingPackage.GUILD: {
        Guild guild = (Guild)theEObject;
        T result = caseGuild(guild);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Rpg_modelingPackage.GAME_OBJECT: {
        GameObject gameObject = (GameObject)theEObject;
        T result = caseGameObject(gameObject);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Rpg_modelingPackage.FACTION: {
        Faction faction = (Faction)theEObject;
        T result = caseFaction(faction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Rpg_modelingPackage.EQUIPMENT_OBJECT: {
        EquipmentObject equipmentObject = (EquipmentObject)theEObject;
        T result = caseEquipmentObject(equipmentObject);
        if (result == null) result = caseGameObject(equipmentObject);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Rpg_modelingPackage.PLAYER_INVENTORY: {
        PlayerInventory playerInventory = (PlayerInventory)theEObject;
        T result = casePlayerInventory(playerInventory);
        if (result == null) result = caseInventory(playerInventory);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Rpg_modelingPackage.CHARACTER: {
        rpg_modeling.Character character = (rpg_modeling.Character)theEObject;
        T result = caseCharacter(character);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Rpg_modelingPackage.QUEST_OBJECT: {
        QuestObject questObject = (QuestObject)theEObject;
        T result = caseQuestObject(questObject);
        if (result == null) result = caseGameObject(questObject);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Rpg_modelingPackage.CONSUMABLE_OBJECT: {
        ConsumableObject consumableObject = (ConsumableObject)theEObject;
        T result = caseConsumableObject(consumableObject);
        if (result == null) result = caseGameObject(consumableObject);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Rpg_modelingPackage.GUILD_INVENTORY: {
        GuildInventory guildInventory = (GuildInventory)theEObject;
        T result = caseGuildInventory(guildInventory);
        if (result == null) result = caseInventory(guildInventory);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Rpg_modelingPackage.INVENTORY: {
        Inventory inventory = (Inventory)theEObject;
        T result = caseInventory(inventory);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Rpg_modelingPackage.GAME_ENGINE: {
        GameEngine gameEngine = (GameEngine)theEObject;
        T result = caseGameEngine(gameEngine);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Non Player Character</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Non Player Character</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNonPlayerCharacter(NonPlayerCharacter object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Wizard</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Wizard</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWizard(Wizard object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Archer</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Archer</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArcher(Archer object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Equipment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Equipment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEquipment(Equipment object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Player Armor</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Player Armor</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePlayerArmor(PlayerArmor object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Assassin</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Assassin</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAssassin(Assassin object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Player</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Player</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePlayer(Player object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Warrior</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Warrior</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWarrior(Warrior object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Job</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Job</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseJob(Job object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Guild</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Guild</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGuild(Guild object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Game Object</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Game Object</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGameObject(GameObject object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Faction</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Faction</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFaction(Faction object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Equipment Object</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Equipment Object</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEquipmentObject(EquipmentObject object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Player Inventory</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Player Inventory</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePlayerInventory(PlayerInventory object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Character</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Character</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCharacter(rpg_modeling.Character object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Quest Object</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Quest Object</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQuestObject(QuestObject object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Consumable Object</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Consumable Object</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConsumableObject(ConsumableObject object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Guild Inventory</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Guild Inventory</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGuildInventory(GuildInventory object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Inventory</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Inventory</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInventory(Inventory object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Game Engine</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Game Engine</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGameEngine(GameEngine object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object) {
    return null;
  }

} //Rpg_modelingSwitch
