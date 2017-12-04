/**
 */
package rpg_modeling.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import rpg_modeling.Archer;
import rpg_modeling.Assassin;
import rpg_modeling.CategoryObject;
import rpg_modeling.ConsumableObject;
import rpg_modeling.Equipment;
import rpg_modeling.EquipmentObject;
import rpg_modeling.Faction;
import rpg_modeling.GameEngine;
import rpg_modeling.Grades;
import rpg_modeling.Guild;
import rpg_modeling.GuildInventory;
import rpg_modeling.NonPlayerCharacter;
import rpg_modeling.Player;
import rpg_modeling.PlayerArmor;
import rpg_modeling.PlayerInventory;
import rpg_modeling.QuestObject;
import rpg_modeling.Rpg_modelingFactory;
import rpg_modeling.Rpg_modelingPackage;
import rpg_modeling.TypeObject;
import rpg_modeling.Warrior;
import rpg_modeling.Wizard;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Rpg_modelingFactoryImpl extends EFactoryImpl implements Rpg_modelingFactory {
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Rpg_modelingFactory init() {
    try {
      Rpg_modelingFactory theRpg_modelingFactory = (Rpg_modelingFactory)EPackage.Registry.INSTANCE.getEFactory(Rpg_modelingPackage.eNS_URI);
      if (theRpg_modelingFactory != null) {
        return theRpg_modelingFactory;
      }
    }
    catch (Exception exception) {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new Rpg_modelingFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Rpg_modelingFactoryImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass) {
    switch (eClass.getClassifierID()) {
      case Rpg_modelingPackage.NON_PLAYER_CHARACTER: return createNonPlayerCharacter();
      case Rpg_modelingPackage.WIZARD: return createWizard();
      case Rpg_modelingPackage.ARCHER: return createArcher();
      case Rpg_modelingPackage.EQUIPMENT: return createEquipment();
      case Rpg_modelingPackage.PLAYER_ARMOR: return createPlayerArmor();
      case Rpg_modelingPackage.ASSASSIN: return createAssassin();
      case Rpg_modelingPackage.PLAYER: return createPlayer();
      case Rpg_modelingPackage.WARRIOR: return createWarrior();
      case Rpg_modelingPackage.GUILD: return createGuild();
      case Rpg_modelingPackage.FACTION: return createFaction();
      case Rpg_modelingPackage.EQUIPMENT_OBJECT: return createEquipmentObject();
      case Rpg_modelingPackage.PLAYER_INVENTORY: return createPlayerInventory();
      case Rpg_modelingPackage.QUEST_OBJECT: return createQuestObject();
      case Rpg_modelingPackage.CONSUMABLE_OBJECT: return createConsumableObject();
      case Rpg_modelingPackage.GUILD_INVENTORY: return createGuildInventory();
      case Rpg_modelingPackage.GAME_ENGINE: return createGameEngine();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue) {
    switch (eDataType.getClassifierID()) {
      case Rpg_modelingPackage.GRADES:
        return createGradesFromString(eDataType, initialValue);
      case Rpg_modelingPackage.CATEGORY_OBJECT:
        return createCategoryObjectFromString(eDataType, initialValue);
      case Rpg_modelingPackage.TYPE_OBJECT:
        return createTypeObjectFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue) {
    switch (eDataType.getClassifierID()) {
      case Rpg_modelingPackage.GRADES:
        return convertGradesToString(eDataType, instanceValue);
      case Rpg_modelingPackage.CATEGORY_OBJECT:
        return convertCategoryObjectToString(eDataType, instanceValue);
      case Rpg_modelingPackage.TYPE_OBJECT:
        return convertTypeObjectToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NonPlayerCharacter createNonPlayerCharacter() {
    NonPlayerCharacterImpl nonPlayerCharacter = new NonPlayerCharacterImpl();
    return nonPlayerCharacter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Wizard createWizard() {
    WizardImpl wizard = new WizardImpl();
    return wizard;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Archer createArcher() {
    ArcherImpl archer = new ArcherImpl();
    return archer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Equipment createEquipment() {
    EquipmentImpl equipment = new EquipmentImpl();
    return equipment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PlayerArmor createPlayerArmor() {
    PlayerArmorImpl playerArmor = new PlayerArmorImpl();
    return playerArmor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Assassin createAssassin() {
    AssassinImpl assassin = new AssassinImpl();
    return assassin;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Player createPlayer() {
    PlayerImpl player = new PlayerImpl();
    return player;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Warrior createWarrior() {
    WarriorImpl warrior = new WarriorImpl();
    return warrior;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Guild createGuild() {
    GuildImpl guild = new GuildImpl();
    return guild;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Faction createFaction() {
    FactionImpl faction = new FactionImpl();
    return faction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EquipmentObject createEquipmentObject() {
    EquipmentObjectImpl equipmentObject = new EquipmentObjectImpl();
    return equipmentObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PlayerInventory createPlayerInventory() {
    PlayerInventoryImpl playerInventory = new PlayerInventoryImpl();
    return playerInventory;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QuestObject createQuestObject() {
    QuestObjectImpl questObject = new QuestObjectImpl();
    return questObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConsumableObject createConsumableObject() {
    ConsumableObjectImpl consumableObject = new ConsumableObjectImpl();
    return consumableObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GuildInventory createGuildInventory() {
    GuildInventoryImpl guildInventory = new GuildInventoryImpl();
    return guildInventory;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GameEngine createGameEngine() {
    GameEngineImpl gameEngine = new GameEngineImpl();
    return gameEngine;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Grades createGradesFromString(EDataType eDataType, String initialValue) {
    Grades result = Grades.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertGradesToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CategoryObject createCategoryObjectFromString(EDataType eDataType, String initialValue) {
    CategoryObject result = CategoryObject.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertCategoryObjectToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeObject createTypeObjectFromString(EDataType eDataType, String initialValue) {
    TypeObject result = TypeObject.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertTypeObjectToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Rpg_modelingPackage getRpg_modelingPackage() {
    return (Rpg_modelingPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static Rpg_modelingPackage getPackage() {
    return Rpg_modelingPackage.eINSTANCE;
  }

} //Rpg_modelingFactoryImpl
