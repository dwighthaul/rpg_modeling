/**
 */
package rpg_modeling.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

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
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see rpg_modeling.Rpg_modelingPackage
 * @generated
 */
public class Rpg_modelingAdapterFactory extends AdapterFactoryImpl {
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static Rpg_modelingPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Rpg_modelingAdapterFactory() {
    if (modelPackage == null) {
      modelPackage = Rpg_modelingPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object) {
    if (object == modelPackage) {
      return true;
    }
    if (object instanceof EObject) {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Rpg_modelingSwitch<Adapter> modelSwitch =
    new Rpg_modelingSwitch<Adapter>() {
      @Override
      public Adapter caseNonPlayerCharacter(NonPlayerCharacter object) {
        return createNonPlayerCharacterAdapter();
      }
      @Override
      public Adapter caseWizard(Wizard object) {
        return createWizardAdapter();
      }
      @Override
      public Adapter caseArcher(Archer object) {
        return createArcherAdapter();
      }
      @Override
      public Adapter caseEquipment(Equipment object) {
        return createEquipmentAdapter();
      }
      @Override
      public Adapter casePlayerArmor(PlayerArmor object) {
        return createPlayerArmorAdapter();
      }
      @Override
      public Adapter caseAssassin(Assassin object) {
        return createAssassinAdapter();
      }
      @Override
      public Adapter casePlayer(Player object) {
        return createPlayerAdapter();
      }
      @Override
      public Adapter caseWarrior(Warrior object) {
        return createWarriorAdapter();
      }
      @Override
      public Adapter caseJob(Job object) {
        return createJobAdapter();
      }
      @Override
      public Adapter caseGuild(Guild object) {
        return createGuildAdapter();
      }
      @Override
      public Adapter caseGameObject(GameObject object) {
        return createGameObjectAdapter();
      }
      @Override
      public Adapter caseFaction(Faction object) {
        return createFactionAdapter();
      }
      @Override
      public Adapter caseEquipmentObject(EquipmentObject object) {
        return createEquipmentObjectAdapter();
      }
      @Override
      public Adapter casePlayerInventory(PlayerInventory object) {
        return createPlayerInventoryAdapter();
      }
      @Override
      public Adapter caseCharacter(rpg_modeling.Character object) {
        return createCharacterAdapter();
      }
      @Override
      public Adapter caseQuestObject(QuestObject object) {
        return createQuestObjectAdapter();
      }
      @Override
      public Adapter caseConsumableObject(ConsumableObject object) {
        return createConsumableObjectAdapter();
      }
      @Override
      public Adapter caseGuildInventory(GuildInventory object) {
        return createGuildInventoryAdapter();
      }
      @Override
      public Adapter caseInventory(Inventory object) {
        return createInventoryAdapter();
      }
      @Override
      public Adapter caseGameEngine(GameEngine object) {
        return createGameEngineAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object) {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target) {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link rpg_modeling.NonPlayerCharacter <em>Non Player Character</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rpg_modeling.NonPlayerCharacter
   * @generated
   */
  public Adapter createNonPlayerCharacterAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link rpg_modeling.Wizard <em>Wizard</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rpg_modeling.Wizard
   * @generated
   */
  public Adapter createWizardAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link rpg_modeling.Archer <em>Archer</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rpg_modeling.Archer
   * @generated
   */
  public Adapter createArcherAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link rpg_modeling.Equipment <em>Equipment</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rpg_modeling.Equipment
   * @generated
   */
  public Adapter createEquipmentAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link rpg_modeling.PlayerArmor <em>Player Armor</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rpg_modeling.PlayerArmor
   * @generated
   */
  public Adapter createPlayerArmorAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link rpg_modeling.Assassin <em>Assassin</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rpg_modeling.Assassin
   * @generated
   */
  public Adapter createAssassinAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link rpg_modeling.Player <em>Player</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rpg_modeling.Player
   * @generated
   */
  public Adapter createPlayerAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link rpg_modeling.Warrior <em>Warrior</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rpg_modeling.Warrior
   * @generated
   */
  public Adapter createWarriorAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link rpg_modeling.Job <em>Job</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rpg_modeling.Job
   * @generated
   */
  public Adapter createJobAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link rpg_modeling.Guild <em>Guild</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rpg_modeling.Guild
   * @generated
   */
  public Adapter createGuildAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link rpg_modeling.GameObject <em>Game Object</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rpg_modeling.GameObject
   * @generated
   */
  public Adapter createGameObjectAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link rpg_modeling.Faction <em>Faction</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rpg_modeling.Faction
   * @generated
   */
  public Adapter createFactionAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link rpg_modeling.EquipmentObject <em>Equipment Object</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rpg_modeling.EquipmentObject
   * @generated
   */
  public Adapter createEquipmentObjectAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link rpg_modeling.PlayerInventory <em>Player Inventory</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rpg_modeling.PlayerInventory
   * @generated
   */
  public Adapter createPlayerInventoryAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link rpg_modeling.Character <em>Character</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rpg_modeling.Character
   * @generated
   */
  public Adapter createCharacterAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link rpg_modeling.QuestObject <em>Quest Object</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rpg_modeling.QuestObject
   * @generated
   */
  public Adapter createQuestObjectAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link rpg_modeling.ConsumableObject <em>Consumable Object</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rpg_modeling.ConsumableObject
   * @generated
   */
  public Adapter createConsumableObjectAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link rpg_modeling.GuildInventory <em>Guild Inventory</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rpg_modeling.GuildInventory
   * @generated
   */
  public Adapter createGuildInventoryAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link rpg_modeling.Inventory <em>Inventory</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rpg_modeling.Inventory
   * @generated
   */
  public Adapter createInventoryAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link rpg_modeling.GameEngine <em>Game Engine</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rpg_modeling.GameEngine
   * @generated
   */
  public Adapter createGameEngineAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter() {
    return null;
  }

} //Rpg_modelingAdapterFactory
