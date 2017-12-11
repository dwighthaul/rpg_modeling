/**
 */
package rpg_modeling;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see rpg_modeling.Rpg_modelingFactory
 * @model kind="package"
 * @generated
 */
public interface Rpg_modelingPackage extends EPackage {
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "rpg_modeling";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.example.org/rpg_modeling";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "rpg_modeling";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  Rpg_modelingPackage eINSTANCE = rpg_modeling.impl.Rpg_modelingPackageImpl.init();

  /**
   * The meta object id for the '{@link rpg_modeling.impl.CharacterImpl <em>Character</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rpg_modeling.impl.CharacterImpl
   * @see rpg_modeling.impl.Rpg_modelingPackageImpl#getCharacter()
   * @generated
   */
  int CHARACTER = 14;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHARACTER__NAME = 0;

  /**
   * The feature id for the '<em><b>Hp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHARACTER__HP = 1;

  /**
   * The feature id for the '<em><b>Mp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHARACTER__MP = 2;

  /**
   * The feature id for the '<em><b>Strength</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHARACTER__STRENGTH = 3;

  /**
   * The feature id for the '<em><b>Constitution</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHARACTER__CONSTITUTION = 4;

  /**
   * The feature id for the '<em><b>Dexterity</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHARACTER__DEXTERITY = 5;

  /**
   * The feature id for the '<em><b>Intelligence</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHARACTER__INTELLIGENCE = 6;

  /**
   * The feature id for the '<em><b>Wisdom</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHARACTER__WISDOM = 7;

  /**
   * The feature id for the '<em><b>Luck</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHARACTER__LUCK = 8;

  /**
   * The feature id for the '<em><b>Equipment</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHARACTER__EQUIPMENT = 9;

  /**
   * The feature id for the '<em><b>id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHARACTER__ID = 10;

  /**
   * The number of structural features of the '<em>Character</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHARACTER_FEATURE_COUNT = 11;

  /**
   * The number of operations of the '<em>Character</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHARACTER_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link rpg_modeling.impl.NonPlayerCharacterImpl <em>Non Player Character</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rpg_modeling.impl.NonPlayerCharacterImpl
   * @see rpg_modeling.impl.Rpg_modelingPackageImpl#getNonPlayerCharacter()
   * @generated
   */
  int NON_PLAYER_CHARACTER = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_PLAYER_CHARACTER__NAME = CHARACTER__NAME;

  /**
   * The feature id for the '<em><b>Hp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_PLAYER_CHARACTER__HP = CHARACTER__HP;

  /**
   * The feature id for the '<em><b>Mp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_PLAYER_CHARACTER__MP = CHARACTER__MP;

  /**
   * The feature id for the '<em><b>Strength</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_PLAYER_CHARACTER__STRENGTH = CHARACTER__STRENGTH;

  /**
   * The feature id for the '<em><b>Constitution</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_PLAYER_CHARACTER__CONSTITUTION = CHARACTER__CONSTITUTION;

  /**
   * The feature id for the '<em><b>Dexterity</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_PLAYER_CHARACTER__DEXTERITY = CHARACTER__DEXTERITY;

  /**
   * The feature id for the '<em><b>Intelligence</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_PLAYER_CHARACTER__INTELLIGENCE = CHARACTER__INTELLIGENCE;

  /**
   * The feature id for the '<em><b>Wisdom</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_PLAYER_CHARACTER__WISDOM = CHARACTER__WISDOM;

  /**
   * The feature id for the '<em><b>Luck</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_PLAYER_CHARACTER__LUCK = CHARACTER__LUCK;

  /**
   * The feature id for the '<em><b>Equipment</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_PLAYER_CHARACTER__EQUIPMENT = CHARACTER__EQUIPMENT;

  /**
   * The feature id for the '<em><b>id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_PLAYER_CHARACTER__ID = CHARACTER__ID;

  /**
   * The number of structural features of the '<em>Non Player Character</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_PLAYER_CHARACTER_FEATURE_COUNT = CHARACTER_FEATURE_COUNT + 0;

  /**
   * The number of operations of the '<em>Non Player Character</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_PLAYER_CHARACTER_OPERATION_COUNT = CHARACTER_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link rpg_modeling.impl.JobImpl <em>Job</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rpg_modeling.impl.JobImpl
   * @see rpg_modeling.impl.Rpg_modelingPackageImpl#getJob()
   * @generated
   */
  int JOB = 8;

  /**
   * The number of structural features of the '<em>Job</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOB_FEATURE_COUNT = 0;

  /**
   * The number of operations of the '<em>Job</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOB_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link rpg_modeling.impl.WizardImpl <em>Wizard</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rpg_modeling.impl.WizardImpl
   * @see rpg_modeling.impl.Rpg_modelingPackageImpl#getWizard()
   * @generated
   */
  int WIZARD = 1;

  /**
   * The feature id for the '<em><b>Skill</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WIZARD__SKILL = JOB_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Wizard</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WIZARD_FEATURE_COUNT = JOB_FEATURE_COUNT + 1;

  /**
   * The number of operations of the '<em>Wizard</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WIZARD_OPERATION_COUNT = JOB_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link rpg_modeling.impl.ArcherImpl <em>Archer</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rpg_modeling.impl.ArcherImpl
   * @see rpg_modeling.impl.Rpg_modelingPackageImpl#getArcher()
   * @generated
   */
  int ARCHER = 2;

  /**
   * The feature id for the '<em><b>Skill</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARCHER__SKILL = JOB_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Archer</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARCHER_FEATURE_COUNT = JOB_FEATURE_COUNT + 1;

  /**
   * The number of operations of the '<em>Archer</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARCHER_OPERATION_COUNT = JOB_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link rpg_modeling.impl.EquipmentImpl <em>Equipment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rpg_modeling.impl.EquipmentImpl
   * @see rpg_modeling.impl.Rpg_modelingPackageImpl#getEquipment()
   * @generated
   */
  int EQUIPMENT = 3;

  /**
   * The feature id for the '<em><b>Inventory</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUIPMENT__INVENTORY = 0;

  /**
   * The feature id for the '<em><b>Armor</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUIPMENT__ARMOR = 1;

  /**
   * The number of structural features of the '<em>Equipment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUIPMENT_FEATURE_COUNT = 2;

  /**
   * The number of operations of the '<em>Equipment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUIPMENT_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link rpg_modeling.impl.PlayerArmorImpl <em>Player Armor</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rpg_modeling.impl.PlayerArmorImpl
   * @see rpg_modeling.impl.Rpg_modelingPackageImpl#getPlayerArmor()
   * @generated
   */
  int PLAYER_ARMOR = 4;

  /**
   * The feature id for the '<em><b>Equipmentobjects</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLAYER_ARMOR__EQUIPMENTOBJECTS = 0;

  /**
   * The number of structural features of the '<em>Player Armor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLAYER_ARMOR_FEATURE_COUNT = 1;

  /**
   * The number of operations of the '<em>Player Armor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLAYER_ARMOR_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link rpg_modeling.impl.AssassinImpl <em>Assassin</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rpg_modeling.impl.AssassinImpl
   * @see rpg_modeling.impl.Rpg_modelingPackageImpl#getAssassin()
   * @generated
   */
  int ASSASSIN = 5;

  /**
   * The feature id for the '<em><b>Skill</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSASSIN__SKILL = JOB_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Assassin</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSASSIN_FEATURE_COUNT = JOB_FEATURE_COUNT + 1;

  /**
   * The number of operations of the '<em>Assassin</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSASSIN_OPERATION_COUNT = JOB_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link rpg_modeling.impl.PlayerImpl <em>Player</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rpg_modeling.impl.PlayerImpl
   * @see rpg_modeling.impl.Rpg_modelingPackageImpl#getPlayer()
   * @generated
   */
  int PLAYER = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLAYER__NAME = CHARACTER__NAME;

  /**
   * The feature id for the '<em><b>Hp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLAYER__HP = CHARACTER__HP;

  /**
   * The feature id for the '<em><b>Mp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLAYER__MP = CHARACTER__MP;

  /**
   * The feature id for the '<em><b>Strength</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLAYER__STRENGTH = CHARACTER__STRENGTH;

  /**
   * The feature id for the '<em><b>Constitution</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLAYER__CONSTITUTION = CHARACTER__CONSTITUTION;

  /**
   * The feature id for the '<em><b>Dexterity</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLAYER__DEXTERITY = CHARACTER__DEXTERITY;

  /**
   * The feature id for the '<em><b>Intelligence</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLAYER__INTELLIGENCE = CHARACTER__INTELLIGENCE;

  /**
   * The feature id for the '<em><b>Wisdom</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLAYER__WISDOM = CHARACTER__WISDOM;

  /**
   * The feature id for the '<em><b>Luck</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLAYER__LUCK = CHARACTER__LUCK;

  /**
   * The feature id for the '<em><b>Equipment</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLAYER__EQUIPMENT = CHARACTER__EQUIPMENT;

  /**
   * The feature id for the '<em><b>id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLAYER__ID = CHARACTER__ID;

  /**
   * The feature id for the '<em><b>Guild</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLAYER__GUILD = CHARACTER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Role</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLAYER__ROLE = CHARACTER_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Class</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLAYER__CLASS = CHARACTER_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Player</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLAYER_FEATURE_COUNT = CHARACTER_FEATURE_COUNT + 3;

  /**
   * The number of operations of the '<em>Player</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLAYER_OPERATION_COUNT = CHARACTER_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link rpg_modeling.impl.WarriorImpl <em>Warrior</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rpg_modeling.impl.WarriorImpl
   * @see rpg_modeling.impl.Rpg_modelingPackageImpl#getWarrior()
   * @generated
   */
  int WARRIOR = 7;

  /**
   * The feature id for the '<em><b>Skill</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WARRIOR__SKILL = JOB_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Warrior</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WARRIOR_FEATURE_COUNT = JOB_FEATURE_COUNT + 1;

  /**
   * The number of operations of the '<em>Warrior</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WARRIOR_OPERATION_COUNT = JOB_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link rpg_modeling.impl.GuildImpl <em>Guild</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rpg_modeling.impl.GuildImpl
   * @see rpg_modeling.impl.Rpg_modelingPackageImpl#getGuild()
   * @generated
   */
  int GUILD = 9;

  /**
   * The feature id for the '<em><b>Guildinventory</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUILD__GUILDINVENTORY = 0;

  /**
   * The feature id for the '<em><b>Players</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUILD__PLAYERS = 1;

  /**
   * The feature id for the '<em><b>id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUILD__ID = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUILD__NAME = 3;

  /**
   * The number of structural features of the '<em>Guild</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUILD_FEATURE_COUNT = 4;

  /**
   * The number of operations of the '<em>Guild</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUILD_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link rpg_modeling.impl.GameObjectImpl <em>Game Object</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rpg_modeling.impl.GameObjectImpl
   * @see rpg_modeling.impl.Rpg_modelingPackageImpl#getGameObject()
   * @generated
   */
  int GAME_OBJECT = 10;

  /**
   * The feature id for the '<em><b>id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GAME_OBJECT__ID = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GAME_OBJECT__NAME = 1;

  /**
   * The feature id for the '<em><b>Price</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GAME_OBJECT__PRICE = 2;

  /**
   * The number of structural features of the '<em>Game Object</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GAME_OBJECT_FEATURE_COUNT = 3;

  /**
   * The number of operations of the '<em>Game Object</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GAME_OBJECT_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link rpg_modeling.impl.FactionImpl <em>Faction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rpg_modeling.impl.FactionImpl
   * @see rpg_modeling.impl.Rpg_modelingPackageImpl#getFaction()
   * @generated
   */
  int FACTION = 11;

  /**
   * The feature id for the '<em><b>Guilds</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACTION__GUILDS = 0;

  /**
   * The feature id for the '<em><b>id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACTION__ID = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACTION__NAME = 2;

  /**
   * The number of structural features of the '<em>Faction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACTION_FEATURE_COUNT = 3;

  /**
   * The number of operations of the '<em>Faction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACTION_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link rpg_modeling.impl.EquipmentObjectImpl <em>Equipment Object</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rpg_modeling.impl.EquipmentObjectImpl
   * @see rpg_modeling.impl.Rpg_modelingPackageImpl#getEquipmentObject()
   * @generated
   */
  int EQUIPMENT_OBJECT = 12;

  /**
   * The feature id for the '<em><b>id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUIPMENT_OBJECT__ID = GAME_OBJECT__ID;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUIPMENT_OBJECT__NAME = GAME_OBJECT__NAME;

  /**
   * The feature id for the '<em><b>Price</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUIPMENT_OBJECT__PRICE = GAME_OBJECT__PRICE;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUIPMENT_OBJECT__TYPE = GAME_OBJECT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Equipment Object</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUIPMENT_OBJECT_FEATURE_COUNT = GAME_OBJECT_FEATURE_COUNT + 1;

  /**
   * The number of operations of the '<em>Equipment Object</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUIPMENT_OBJECT_OPERATION_COUNT = GAME_OBJECT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link rpg_modeling.impl.InventoryImpl <em>Inventory</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rpg_modeling.impl.InventoryImpl
   * @see rpg_modeling.impl.Rpg_modelingPackageImpl#getInventory()
   * @generated
   */
  int INVENTORY = 18;

  /**
   * The feature id for the '<em><b>Qte Money</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INVENTORY__QTE_MONEY = 0;

  /**
   * The feature id for the '<em><b>Gameobjects</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INVENTORY__GAMEOBJECTS = 1;

  /**
   * The number of structural features of the '<em>Inventory</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INVENTORY_FEATURE_COUNT = 2;

  /**
   * The number of operations of the '<em>Inventory</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INVENTORY_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link rpg_modeling.impl.PlayerInventoryImpl <em>Player Inventory</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rpg_modeling.impl.PlayerInventoryImpl
   * @see rpg_modeling.impl.Rpg_modelingPackageImpl#getPlayerInventory()
   * @generated
   */
  int PLAYER_INVENTORY = 13;

  /**
   * The feature id for the '<em><b>Qte Money</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLAYER_INVENTORY__QTE_MONEY = INVENTORY__QTE_MONEY;

  /**
   * The feature id for the '<em><b>Gameobjects</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLAYER_INVENTORY__GAMEOBJECTS = INVENTORY__GAMEOBJECTS;

  /**
   * The number of structural features of the '<em>Player Inventory</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLAYER_INVENTORY_FEATURE_COUNT = INVENTORY_FEATURE_COUNT + 0;

  /**
   * The number of operations of the '<em>Player Inventory</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLAYER_INVENTORY_OPERATION_COUNT = INVENTORY_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link rpg_modeling.impl.QuestObjectImpl <em>Quest Object</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rpg_modeling.impl.QuestObjectImpl
   * @see rpg_modeling.impl.Rpg_modelingPackageImpl#getQuestObject()
   * @generated
   */
  int QUEST_OBJECT = 15;

  /**
   * The feature id for the '<em><b>id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUEST_OBJECT__ID = GAME_OBJECT__ID;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUEST_OBJECT__NAME = GAME_OBJECT__NAME;

  /**
   * The feature id for the '<em><b>Price</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUEST_OBJECT__PRICE = GAME_OBJECT__PRICE;

  /**
   * The feature id for the '<em><b>id Quest</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUEST_OBJECT__ID_QUEST = GAME_OBJECT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Quest Object</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUEST_OBJECT_FEATURE_COUNT = GAME_OBJECT_FEATURE_COUNT + 1;

  /**
   * The number of operations of the '<em>Quest Object</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUEST_OBJECT_OPERATION_COUNT = GAME_OBJECT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link rpg_modeling.impl.ConsumableObjectImpl <em>Consumable Object</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rpg_modeling.impl.ConsumableObjectImpl
   * @see rpg_modeling.impl.Rpg_modelingPackageImpl#getConsumableObject()
   * @generated
   */
  int CONSUMABLE_OBJECT = 16;

  /**
   * The feature id for the '<em><b>id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSUMABLE_OBJECT__ID = GAME_OBJECT__ID;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSUMABLE_OBJECT__NAME = GAME_OBJECT__NAME;

  /**
   * The feature id for the '<em><b>Price</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSUMABLE_OBJECT__PRICE = GAME_OBJECT__PRICE;

  /**
   * The feature id for the '<em><b>Time Effect</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSUMABLE_OBJECT__TIME_EFFECT = GAME_OBJECT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>New Attribute</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSUMABLE_OBJECT__NEW_ATTRIBUTE = GAME_OBJECT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Consumable Object</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSUMABLE_OBJECT_FEATURE_COUNT = GAME_OBJECT_FEATURE_COUNT + 2;

  /**
   * The number of operations of the '<em>Consumable Object</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSUMABLE_OBJECT_OPERATION_COUNT = GAME_OBJECT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link rpg_modeling.impl.GuildInventoryImpl <em>Guild Inventory</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rpg_modeling.impl.GuildInventoryImpl
   * @see rpg_modeling.impl.Rpg_modelingPackageImpl#getGuildInventory()
   * @generated
   */
  int GUILD_INVENTORY = 17;

  /**
   * The feature id for the '<em><b>Qte Money</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUILD_INVENTORY__QTE_MONEY = INVENTORY__QTE_MONEY;

  /**
   * The feature id for the '<em><b>Gameobjects</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUILD_INVENTORY__GAMEOBJECTS = INVENTORY__GAMEOBJECTS;

  /**
   * The number of structural features of the '<em>Guild Inventory</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUILD_INVENTORY_FEATURE_COUNT = INVENTORY_FEATURE_COUNT + 0;

  /**
   * The number of operations of the '<em>Guild Inventory</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUILD_INVENTORY_OPERATION_COUNT = INVENTORY_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link rpg_modeling.impl.GameEngineImpl <em>Game Engine</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rpg_modeling.impl.GameEngineImpl
   * @see rpg_modeling.impl.Rpg_modelingPackageImpl#getGameEngine()
   * @generated
   */
  int GAME_ENGINE = 19;

  /**
   * The feature id for the '<em><b>Factions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GAME_ENGINE__FACTIONS = 0;

  /**
   * The feature id for the '<em><b>Characters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GAME_ENGINE__CHARACTERS = 1;

  /**
   * The number of structural features of the '<em>Game Engine</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GAME_ENGINE_FEATURE_COUNT = 2;

  /**
   * The number of operations of the '<em>Game Engine</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GAME_ENGINE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link rpg_modeling.Grades <em>Grades</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rpg_modeling.Grades
   * @see rpg_modeling.impl.Rpg_modelingPackageImpl#getGrades()
   * @generated
   */
  int GRADES = 20;

  /**
   * The meta object id for the '{@link rpg_modeling.CategoryObject <em>Category Object</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rpg_modeling.CategoryObject
   * @see rpg_modeling.impl.Rpg_modelingPackageImpl#getCategoryObject()
   * @generated
   */
  int CATEGORY_OBJECT = 21;

  /**
   * The meta object id for the '{@link rpg_modeling.TypeObject <em>Type Object</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rpg_modeling.TypeObject
   * @see rpg_modeling.impl.Rpg_modelingPackageImpl#getTypeObject()
   * @generated
   */
  int TYPE_OBJECT = 22;


  /**
   * Returns the meta object for class '{@link rpg_modeling.NonPlayerCharacter <em>Non Player Character</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Non Player Character</em>'.
   * @see rpg_modeling.NonPlayerCharacter
   * @generated
   */
  EClass getNonPlayerCharacter();

  /**
   * Returns the meta object for class '{@link rpg_modeling.Wizard <em>Wizard</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Wizard</em>'.
   * @see rpg_modeling.Wizard
   * @generated
   */
  EClass getWizard();

  /**
   * Returns the meta object for the attribute '{@link rpg_modeling.Wizard#getSkill <em>Skill</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Skill</em>'.
   * @see rpg_modeling.Wizard#getSkill()
   * @see #getWizard()
   * @generated
   */
  EAttribute getWizard_Skill();

  /**
   * Returns the meta object for class '{@link rpg_modeling.Archer <em>Archer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Archer</em>'.
   * @see rpg_modeling.Archer
   * @generated
   */
  EClass getArcher();

  /**
   * Returns the meta object for the attribute '{@link rpg_modeling.Archer#getSkill <em>Skill</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Skill</em>'.
   * @see rpg_modeling.Archer#getSkill()
   * @see #getArcher()
   * @generated
   */
  EAttribute getArcher_Skill();

  /**
   * Returns the meta object for class '{@link rpg_modeling.Equipment <em>Equipment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Equipment</em>'.
   * @see rpg_modeling.Equipment
   * @generated
   */
  EClass getEquipment();

  /**
   * Returns the meta object for the containment reference '{@link rpg_modeling.Equipment#getInventory <em>Inventory</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Inventory</em>'.
   * @see rpg_modeling.Equipment#getInventory()
   * @see #getEquipment()
   * @generated
   */
  EReference getEquipment_Inventory();

  /**
   * Returns the meta object for the containment reference '{@link rpg_modeling.Equipment#getArmor <em>Armor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Armor</em>'.
   * @see rpg_modeling.Equipment#getArmor()
   * @see #getEquipment()
   * @generated
   */
  EReference getEquipment_Armor();

  /**
   * Returns the meta object for class '{@link rpg_modeling.PlayerArmor <em>Player Armor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Player Armor</em>'.
   * @see rpg_modeling.PlayerArmor
   * @generated
   */
  EClass getPlayerArmor();

  /**
   * Returns the meta object for the containment reference list '{@link rpg_modeling.PlayerArmor#getEquipmentobjects <em>Equipmentobjects</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Equipmentobjects</em>'.
   * @see rpg_modeling.PlayerArmor#getEquipmentobjects()
   * @see #getPlayerArmor()
   * @generated
   */
  EReference getPlayerArmor_Equipmentobjects();

  /**
   * Returns the meta object for class '{@link rpg_modeling.Assassin <em>Assassin</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assassin</em>'.
   * @see rpg_modeling.Assassin
   * @generated
   */
  EClass getAssassin();

  /**
   * Returns the meta object for the attribute '{@link rpg_modeling.Assassin#getSkill <em>Skill</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Skill</em>'.
   * @see rpg_modeling.Assassin#getSkill()
   * @see #getAssassin()
   * @generated
   */
  EAttribute getAssassin_Skill();

  /**
   * Returns the meta object for class '{@link rpg_modeling.Player <em>Player</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Player</em>'.
   * @see rpg_modeling.Player
   * @generated
   */
  EClass getPlayer();

  /**
   * Returns the meta object for the reference '{@link rpg_modeling.Player#getGuild <em>Guild</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Guild</em>'.
   * @see rpg_modeling.Player#getGuild()
   * @see #getPlayer()
   * @generated
   */
  EReference getPlayer_Guild();

  /**
   * Returns the meta object for the attribute '{@link rpg_modeling.Player#getRole <em>Role</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Role</em>'.
   * @see rpg_modeling.Player#getRole()
   * @see #getPlayer()
   * @generated
   */
  EAttribute getPlayer_Role();

  /**
   * Returns the meta object for the containment reference '{@link rpg_modeling.Player#getClass_ <em>Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Class</em>'.
   * @see rpg_modeling.Player#getClass_()
   * @see #getPlayer()
   * @generated
   */
  EReference getPlayer_Class();

  /**
   * Returns the meta object for class '{@link rpg_modeling.Warrior <em>Warrior</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Warrior</em>'.
   * @see rpg_modeling.Warrior
   * @generated
   */
  EClass getWarrior();

  /**
   * Returns the meta object for the attribute '{@link rpg_modeling.Warrior#getSkill <em>Skill</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Skill</em>'.
   * @see rpg_modeling.Warrior#getSkill()
   * @see #getWarrior()
   * @generated
   */
  EAttribute getWarrior_Skill();

  /**
   * Returns the meta object for class '{@link rpg_modeling.Job <em>Job</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Job</em>'.
   * @see rpg_modeling.Job
   * @generated
   */
  EClass getJob();

  /**
   * Returns the meta object for class '{@link rpg_modeling.Guild <em>Guild</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Guild</em>'.
   * @see rpg_modeling.Guild
   * @generated
   */
  EClass getGuild();

  /**
   * Returns the meta object for the containment reference '{@link rpg_modeling.Guild#getGuildinventory <em>Guildinventory</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Guildinventory</em>'.
   * @see rpg_modeling.Guild#getGuildinventory()
   * @see #getGuild()
   * @generated
   */
  EReference getGuild_Guildinventory();

  /**
   * Returns the meta object for the reference list '{@link rpg_modeling.Guild#getPlayers <em>Players</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Players</em>'.
   * @see rpg_modeling.Guild#getPlayers()
   * @see #getGuild()
   * @generated
   */
  EReference getGuild_Players();

  /**
   * Returns the meta object for the attribute '{@link rpg_modeling.Guild#get_id <em>id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>id</em>'.
   * @see rpg_modeling.Guild#get_id()
   * @see #getGuild()
   * @generated
   */
  EAttribute getGuild__id();

  /**
   * Returns the meta object for the attribute '{@link rpg_modeling.Guild#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see rpg_modeling.Guild#getName()
   * @see #getGuild()
   * @generated
   */
  EAttribute getGuild_Name();

  /**
   * Returns the meta object for class '{@link rpg_modeling.GameObject <em>Game Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Game Object</em>'.
   * @see rpg_modeling.GameObject
   * @generated
   */
  EClass getGameObject();

  /**
   * Returns the meta object for the attribute '{@link rpg_modeling.GameObject#get_id <em>id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>id</em>'.
   * @see rpg_modeling.GameObject#get_id()
   * @see #getGameObject()
   * @generated
   */
  EAttribute getGameObject__id();

  /**
   * Returns the meta object for the attribute '{@link rpg_modeling.GameObject#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see rpg_modeling.GameObject#getName()
   * @see #getGameObject()
   * @generated
   */
  EAttribute getGameObject_Name();

  /**
   * Returns the meta object for the attribute '{@link rpg_modeling.GameObject#getPrice <em>Price</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Price</em>'.
   * @see rpg_modeling.GameObject#getPrice()
   * @see #getGameObject()
   * @generated
   */
  EAttribute getGameObject_Price();

  /**
   * Returns the meta object for class '{@link rpg_modeling.Faction <em>Faction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Faction</em>'.
   * @see rpg_modeling.Faction
   * @generated
   */
  EClass getFaction();

  /**
   * Returns the meta object for the containment reference list '{@link rpg_modeling.Faction#getGuilds <em>Guilds</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Guilds</em>'.
   * @see rpg_modeling.Faction#getGuilds()
   * @see #getFaction()
   * @generated
   */
  EReference getFaction_Guilds();

  /**
   * Returns the meta object for the attribute '{@link rpg_modeling.Faction#get_id <em>id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>id</em>'.
   * @see rpg_modeling.Faction#get_id()
   * @see #getFaction()
   * @generated
   */
  EAttribute getFaction__id();

  /**
   * Returns the meta object for the attribute '{@link rpg_modeling.Faction#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see rpg_modeling.Faction#getName()
   * @see #getFaction()
   * @generated
   */
  EAttribute getFaction_Name();

  /**
   * Returns the meta object for class '{@link rpg_modeling.EquipmentObject <em>Equipment Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Equipment Object</em>'.
   * @see rpg_modeling.EquipmentObject
   * @generated
   */
  EClass getEquipmentObject();

  /**
   * Returns the meta object for the attribute '{@link rpg_modeling.EquipmentObject#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see rpg_modeling.EquipmentObject#getType()
   * @see #getEquipmentObject()
   * @generated
   */
  EAttribute getEquipmentObject_Type();

  /**
   * Returns the meta object for class '{@link rpg_modeling.PlayerInventory <em>Player Inventory</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Player Inventory</em>'.
   * @see rpg_modeling.PlayerInventory
   * @generated
   */
  EClass getPlayerInventory();

  /**
   * Returns the meta object for class '{@link rpg_modeling.Character <em>Character</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Character</em>'.
   * @see rpg_modeling.Character
   * @generated
   */
  EClass getCharacter();

  /**
   * Returns the meta object for the attribute '{@link rpg_modeling.Character#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see rpg_modeling.Character#getName()
   * @see #getCharacter()
   * @generated
   */
  EAttribute getCharacter_Name();

  /**
   * Returns the meta object for the attribute '{@link rpg_modeling.Character#getHp <em>Hp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Hp</em>'.
   * @see rpg_modeling.Character#getHp()
   * @see #getCharacter()
   * @generated
   */
  EAttribute getCharacter_Hp();

  /**
   * Returns the meta object for the attribute '{@link rpg_modeling.Character#getMp <em>Mp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Mp</em>'.
   * @see rpg_modeling.Character#getMp()
   * @see #getCharacter()
   * @generated
   */
  EAttribute getCharacter_Mp();

  /**
   * Returns the meta object for the attribute '{@link rpg_modeling.Character#getStrength <em>Strength</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Strength</em>'.
   * @see rpg_modeling.Character#getStrength()
   * @see #getCharacter()
   * @generated
   */
  EAttribute getCharacter_Strength();

  /**
   * Returns the meta object for the attribute '{@link rpg_modeling.Character#getConstitution <em>Constitution</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Constitution</em>'.
   * @see rpg_modeling.Character#getConstitution()
   * @see #getCharacter()
   * @generated
   */
  EAttribute getCharacter_Constitution();

  /**
   * Returns the meta object for the attribute '{@link rpg_modeling.Character#getDexterity <em>Dexterity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dexterity</em>'.
   * @see rpg_modeling.Character#getDexterity()
   * @see #getCharacter()
   * @generated
   */
  EAttribute getCharacter_Dexterity();

  /**
   * Returns the meta object for the attribute '{@link rpg_modeling.Character#getIntelligence <em>Intelligence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Intelligence</em>'.
   * @see rpg_modeling.Character#getIntelligence()
   * @see #getCharacter()
   * @generated
   */
  EAttribute getCharacter_Intelligence();

  /**
   * Returns the meta object for the attribute '{@link rpg_modeling.Character#getWisdom <em>Wisdom</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Wisdom</em>'.
   * @see rpg_modeling.Character#getWisdom()
   * @see #getCharacter()
   * @generated
   */
  EAttribute getCharacter_Wisdom();

  /**
   * Returns the meta object for the attribute '{@link rpg_modeling.Character#getLuck <em>Luck</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Luck</em>'.
   * @see rpg_modeling.Character#getLuck()
   * @see #getCharacter()
   * @generated
   */
  EAttribute getCharacter_Luck();

  /**
   * Returns the meta object for the containment reference '{@link rpg_modeling.Character#getEquipment <em>Equipment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Equipment</em>'.
   * @see rpg_modeling.Character#getEquipment()
   * @see #getCharacter()
   * @generated
   */
  EReference getCharacter_Equipment();

  /**
   * Returns the meta object for the attribute '{@link rpg_modeling.Character#get_id <em>id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>id</em>'.
   * @see rpg_modeling.Character#get_id()
   * @see #getCharacter()
   * @generated
   */
  EAttribute getCharacter__id();

  /**
   * Returns the meta object for class '{@link rpg_modeling.QuestObject <em>Quest Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Quest Object</em>'.
   * @see rpg_modeling.QuestObject
   * @generated
   */
  EClass getQuestObject();

  /**
   * Returns the meta object for the attribute '{@link rpg_modeling.QuestObject#get_idQuest <em>id Quest</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>id Quest</em>'.
   * @see rpg_modeling.QuestObject#get_idQuest()
   * @see #getQuestObject()
   * @generated
   */
  EAttribute getQuestObject__idQuest();

  /**
   * Returns the meta object for class '{@link rpg_modeling.ConsumableObject <em>Consumable Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Consumable Object</em>'.
   * @see rpg_modeling.ConsumableObject
   * @generated
   */
  EClass getConsumableObject();

  /**
   * Returns the meta object for the attribute '{@link rpg_modeling.ConsumableObject#getTimeEffect <em>Time Effect</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Time Effect</em>'.
   * @see rpg_modeling.ConsumableObject#getTimeEffect()
   * @see #getConsumableObject()
   * @generated
   */
  EAttribute getConsumableObject_TimeEffect();

  /**
   * Returns the meta object for the attribute '{@link rpg_modeling.ConsumableObject#getNewAttribute <em>New Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>New Attribute</em>'.
   * @see rpg_modeling.ConsumableObject#getNewAttribute()
   * @see #getConsumableObject()
   * @generated
   */
  EAttribute getConsumableObject_NewAttribute();

  /**
   * Returns the meta object for class '{@link rpg_modeling.GuildInventory <em>Guild Inventory</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Guild Inventory</em>'.
   * @see rpg_modeling.GuildInventory
   * @generated
   */
  EClass getGuildInventory();

  /**
   * Returns the meta object for class '{@link rpg_modeling.Inventory <em>Inventory</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Inventory</em>'.
   * @see rpg_modeling.Inventory
   * @generated
   */
  EClass getInventory();

  /**
   * Returns the meta object for the attribute '{@link rpg_modeling.Inventory#getQteMoney <em>Qte Money</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Qte Money</em>'.
   * @see rpg_modeling.Inventory#getQteMoney()
   * @see #getInventory()
   * @generated
   */
  EAttribute getInventory_QteMoney();

  /**
   * Returns the meta object for the containment reference list '{@link rpg_modeling.Inventory#getGameobjects <em>Gameobjects</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Gameobjects</em>'.
   * @see rpg_modeling.Inventory#getGameobjects()
   * @see #getInventory()
   * @generated
   */
  EReference getInventory_Gameobjects();

  /**
   * Returns the meta object for class '{@link rpg_modeling.GameEngine <em>Game Engine</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Game Engine</em>'.
   * @see rpg_modeling.GameEngine
   * @generated
   */
  EClass getGameEngine();

  /**
   * Returns the meta object for the containment reference list '{@link rpg_modeling.GameEngine#getFactions <em>Factions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Factions</em>'.
   * @see rpg_modeling.GameEngine#getFactions()
   * @see #getGameEngine()
   * @generated
   */
  EReference getGameEngine_Factions();

  /**
   * Returns the meta object for the containment reference list '{@link rpg_modeling.GameEngine#getCharacters <em>Characters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Characters</em>'.
   * @see rpg_modeling.GameEngine#getCharacters()
   * @see #getGameEngine()
   * @generated
   */
  EReference getGameEngine_Characters();

  /**
   * Returns the meta object for enum '{@link rpg_modeling.Grades <em>Grades</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Grades</em>'.
   * @see rpg_modeling.Grades
   * @generated
   */
  EEnum getGrades();

  /**
   * Returns the meta object for enum '{@link rpg_modeling.CategoryObject <em>Category Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Category Object</em>'.
   * @see rpg_modeling.CategoryObject
   * @generated
   */
  EEnum getCategoryObject();

  /**
   * Returns the meta object for enum '{@link rpg_modeling.TypeObject <em>Type Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Type Object</em>'.
   * @see rpg_modeling.TypeObject
   * @generated
   */
  EEnum getTypeObject();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  Rpg_modelingFactory getRpg_modelingFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each operation of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals {
    /**
     * The meta object literal for the '{@link rpg_modeling.impl.NonPlayerCharacterImpl <em>Non Player Character</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rpg_modeling.impl.NonPlayerCharacterImpl
     * @see rpg_modeling.impl.Rpg_modelingPackageImpl#getNonPlayerCharacter()
     * @generated
     */
    EClass NON_PLAYER_CHARACTER = eINSTANCE.getNonPlayerCharacter();

    /**
     * The meta object literal for the '{@link rpg_modeling.impl.WizardImpl <em>Wizard</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rpg_modeling.impl.WizardImpl
     * @see rpg_modeling.impl.Rpg_modelingPackageImpl#getWizard()
     * @generated
     */
    EClass WIZARD = eINSTANCE.getWizard();

    /**
     * The meta object literal for the '<em><b>Skill</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WIZARD__SKILL = eINSTANCE.getWizard_Skill();

    /**
     * The meta object literal for the '{@link rpg_modeling.impl.ArcherImpl <em>Archer</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rpg_modeling.impl.ArcherImpl
     * @see rpg_modeling.impl.Rpg_modelingPackageImpl#getArcher()
     * @generated
     */
    EClass ARCHER = eINSTANCE.getArcher();

    /**
     * The meta object literal for the '<em><b>Skill</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARCHER__SKILL = eINSTANCE.getArcher_Skill();

    /**
     * The meta object literal for the '{@link rpg_modeling.impl.EquipmentImpl <em>Equipment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rpg_modeling.impl.EquipmentImpl
     * @see rpg_modeling.impl.Rpg_modelingPackageImpl#getEquipment()
     * @generated
     */
    EClass EQUIPMENT = eINSTANCE.getEquipment();

    /**
     * The meta object literal for the '<em><b>Inventory</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EQUIPMENT__INVENTORY = eINSTANCE.getEquipment_Inventory();

    /**
     * The meta object literal for the '<em><b>Armor</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EQUIPMENT__ARMOR = eINSTANCE.getEquipment_Armor();

    /**
     * The meta object literal for the '{@link rpg_modeling.impl.PlayerArmorImpl <em>Player Armor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rpg_modeling.impl.PlayerArmorImpl
     * @see rpg_modeling.impl.Rpg_modelingPackageImpl#getPlayerArmor()
     * @generated
     */
    EClass PLAYER_ARMOR = eINSTANCE.getPlayerArmor();

    /**
     * The meta object literal for the '<em><b>Equipmentobjects</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PLAYER_ARMOR__EQUIPMENTOBJECTS = eINSTANCE.getPlayerArmor_Equipmentobjects();

    /**
     * The meta object literal for the '{@link rpg_modeling.impl.AssassinImpl <em>Assassin</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rpg_modeling.impl.AssassinImpl
     * @see rpg_modeling.impl.Rpg_modelingPackageImpl#getAssassin()
     * @generated
     */
    EClass ASSASSIN = eINSTANCE.getAssassin();

    /**
     * The meta object literal for the '<em><b>Skill</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASSASSIN__SKILL = eINSTANCE.getAssassin_Skill();

    /**
     * The meta object literal for the '{@link rpg_modeling.impl.PlayerImpl <em>Player</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rpg_modeling.impl.PlayerImpl
     * @see rpg_modeling.impl.Rpg_modelingPackageImpl#getPlayer()
     * @generated
     */
    EClass PLAYER = eINSTANCE.getPlayer();

    /**
     * The meta object literal for the '<em><b>Guild</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PLAYER__GUILD = eINSTANCE.getPlayer_Guild();

    /**
     * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PLAYER__ROLE = eINSTANCE.getPlayer_Role();

    /**
     * The meta object literal for the '<em><b>Class</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PLAYER__CLASS = eINSTANCE.getPlayer_Class();

    /**
     * The meta object literal for the '{@link rpg_modeling.impl.WarriorImpl <em>Warrior</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rpg_modeling.impl.WarriorImpl
     * @see rpg_modeling.impl.Rpg_modelingPackageImpl#getWarrior()
     * @generated
     */
    EClass WARRIOR = eINSTANCE.getWarrior();

    /**
     * The meta object literal for the '<em><b>Skill</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WARRIOR__SKILL = eINSTANCE.getWarrior_Skill();

    /**
     * The meta object literal for the '{@link rpg_modeling.impl.JobImpl <em>Job</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rpg_modeling.impl.JobImpl
     * @see rpg_modeling.impl.Rpg_modelingPackageImpl#getJob()
     * @generated
     */
    EClass JOB = eINSTANCE.getJob();

    /**
     * The meta object literal for the '{@link rpg_modeling.impl.GuildImpl <em>Guild</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rpg_modeling.impl.GuildImpl
     * @see rpg_modeling.impl.Rpg_modelingPackageImpl#getGuild()
     * @generated
     */
    EClass GUILD = eINSTANCE.getGuild();

    /**
     * The meta object literal for the '<em><b>Guildinventory</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GUILD__GUILDINVENTORY = eINSTANCE.getGuild_Guildinventory();

    /**
     * The meta object literal for the '<em><b>Players</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GUILD__PLAYERS = eINSTANCE.getGuild_Players();

    /**
     * The meta object literal for the '<em><b>id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GUILD__ID = eINSTANCE.getGuild__id();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GUILD__NAME = eINSTANCE.getGuild_Name();

    /**
     * The meta object literal for the '{@link rpg_modeling.impl.GameObjectImpl <em>Game Object</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rpg_modeling.impl.GameObjectImpl
     * @see rpg_modeling.impl.Rpg_modelingPackageImpl#getGameObject()
     * @generated
     */
    EClass GAME_OBJECT = eINSTANCE.getGameObject();

    /**
     * The meta object literal for the '<em><b>id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GAME_OBJECT__ID = eINSTANCE.getGameObject__id();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GAME_OBJECT__NAME = eINSTANCE.getGameObject_Name();

    /**
     * The meta object literal for the '<em><b>Price</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GAME_OBJECT__PRICE = eINSTANCE.getGameObject_Price();

    /**
     * The meta object literal for the '{@link rpg_modeling.impl.FactionImpl <em>Faction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rpg_modeling.impl.FactionImpl
     * @see rpg_modeling.impl.Rpg_modelingPackageImpl#getFaction()
     * @generated
     */
    EClass FACTION = eINSTANCE.getFaction();

    /**
     * The meta object literal for the '<em><b>Guilds</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FACTION__GUILDS = eINSTANCE.getFaction_Guilds();

    /**
     * The meta object literal for the '<em><b>id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FACTION__ID = eINSTANCE.getFaction__id();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FACTION__NAME = eINSTANCE.getFaction_Name();

    /**
     * The meta object literal for the '{@link rpg_modeling.impl.EquipmentObjectImpl <em>Equipment Object</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rpg_modeling.impl.EquipmentObjectImpl
     * @see rpg_modeling.impl.Rpg_modelingPackageImpl#getEquipmentObject()
     * @generated
     */
    EClass EQUIPMENT_OBJECT = eINSTANCE.getEquipmentObject();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EQUIPMENT_OBJECT__TYPE = eINSTANCE.getEquipmentObject_Type();

    /**
     * The meta object literal for the '{@link rpg_modeling.impl.PlayerInventoryImpl <em>Player Inventory</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rpg_modeling.impl.PlayerInventoryImpl
     * @see rpg_modeling.impl.Rpg_modelingPackageImpl#getPlayerInventory()
     * @generated
     */
    EClass PLAYER_INVENTORY = eINSTANCE.getPlayerInventory();

    /**
     * The meta object literal for the '{@link rpg_modeling.impl.CharacterImpl <em>Character</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rpg_modeling.impl.CharacterImpl
     * @see rpg_modeling.impl.Rpg_modelingPackageImpl#getCharacter()
     * @generated
     */
    EClass CHARACTER = eINSTANCE.getCharacter();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CHARACTER__NAME = eINSTANCE.getCharacter_Name();

    /**
     * The meta object literal for the '<em><b>Hp</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CHARACTER__HP = eINSTANCE.getCharacter_Hp();

    /**
     * The meta object literal for the '<em><b>Mp</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CHARACTER__MP = eINSTANCE.getCharacter_Mp();

    /**
     * The meta object literal for the '<em><b>Strength</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CHARACTER__STRENGTH = eINSTANCE.getCharacter_Strength();

    /**
     * The meta object literal for the '<em><b>Constitution</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CHARACTER__CONSTITUTION = eINSTANCE.getCharacter_Constitution();

    /**
     * The meta object literal for the '<em><b>Dexterity</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CHARACTER__DEXTERITY = eINSTANCE.getCharacter_Dexterity();

    /**
     * The meta object literal for the '<em><b>Intelligence</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CHARACTER__INTELLIGENCE = eINSTANCE.getCharacter_Intelligence();

    /**
     * The meta object literal for the '<em><b>Wisdom</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CHARACTER__WISDOM = eINSTANCE.getCharacter_Wisdom();

    /**
     * The meta object literal for the '<em><b>Luck</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CHARACTER__LUCK = eINSTANCE.getCharacter_Luck();

    /**
     * The meta object literal for the '<em><b>Equipment</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CHARACTER__EQUIPMENT = eINSTANCE.getCharacter_Equipment();

    /**
     * The meta object literal for the '<em><b>id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CHARACTER__ID = eINSTANCE.getCharacter__id();

    /**
     * The meta object literal for the '{@link rpg_modeling.impl.QuestObjectImpl <em>Quest Object</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rpg_modeling.impl.QuestObjectImpl
     * @see rpg_modeling.impl.Rpg_modelingPackageImpl#getQuestObject()
     * @generated
     */
    EClass QUEST_OBJECT = eINSTANCE.getQuestObject();

    /**
     * The meta object literal for the '<em><b>id Quest</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUEST_OBJECT__ID_QUEST = eINSTANCE.getQuestObject__idQuest();

    /**
     * The meta object literal for the '{@link rpg_modeling.impl.ConsumableObjectImpl <em>Consumable Object</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rpg_modeling.impl.ConsumableObjectImpl
     * @see rpg_modeling.impl.Rpg_modelingPackageImpl#getConsumableObject()
     * @generated
     */
    EClass CONSUMABLE_OBJECT = eINSTANCE.getConsumableObject();

    /**
     * The meta object literal for the '<em><b>Time Effect</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONSUMABLE_OBJECT__TIME_EFFECT = eINSTANCE.getConsumableObject_TimeEffect();

    /**
     * The meta object literal for the '<em><b>New Attribute</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONSUMABLE_OBJECT__NEW_ATTRIBUTE = eINSTANCE.getConsumableObject_NewAttribute();

    /**
     * The meta object literal for the '{@link rpg_modeling.impl.GuildInventoryImpl <em>Guild Inventory</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rpg_modeling.impl.GuildInventoryImpl
     * @see rpg_modeling.impl.Rpg_modelingPackageImpl#getGuildInventory()
     * @generated
     */
    EClass GUILD_INVENTORY = eINSTANCE.getGuildInventory();

    /**
     * The meta object literal for the '{@link rpg_modeling.impl.InventoryImpl <em>Inventory</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rpg_modeling.impl.InventoryImpl
     * @see rpg_modeling.impl.Rpg_modelingPackageImpl#getInventory()
     * @generated
     */
    EClass INVENTORY = eINSTANCE.getInventory();

    /**
     * The meta object literal for the '<em><b>Qte Money</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INVENTORY__QTE_MONEY = eINSTANCE.getInventory_QteMoney();

    /**
     * The meta object literal for the '<em><b>Gameobjects</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INVENTORY__GAMEOBJECTS = eINSTANCE.getInventory_Gameobjects();

    /**
     * The meta object literal for the '{@link rpg_modeling.impl.GameEngineImpl <em>Game Engine</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rpg_modeling.impl.GameEngineImpl
     * @see rpg_modeling.impl.Rpg_modelingPackageImpl#getGameEngine()
     * @generated
     */
    EClass GAME_ENGINE = eINSTANCE.getGameEngine();

    /**
     * The meta object literal for the '<em><b>Factions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GAME_ENGINE__FACTIONS = eINSTANCE.getGameEngine_Factions();

    /**
     * The meta object literal for the '<em><b>Characters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GAME_ENGINE__CHARACTERS = eINSTANCE.getGameEngine_Characters();

    /**
     * The meta object literal for the '{@link rpg_modeling.Grades <em>Grades</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rpg_modeling.Grades
     * @see rpg_modeling.impl.Rpg_modelingPackageImpl#getGrades()
     * @generated
     */
    EEnum GRADES = eINSTANCE.getGrades();

    /**
     * The meta object literal for the '{@link rpg_modeling.CategoryObject <em>Category Object</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rpg_modeling.CategoryObject
     * @see rpg_modeling.impl.Rpg_modelingPackageImpl#getCategoryObject()
     * @generated
     */
    EEnum CATEGORY_OBJECT = eINSTANCE.getCategoryObject();

    /**
     * The meta object literal for the '{@link rpg_modeling.TypeObject <em>Type Object</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rpg_modeling.TypeObject
     * @see rpg_modeling.impl.Rpg_modelingPackageImpl#getTypeObject()
     * @generated
     */
    EEnum TYPE_OBJECT = eINSTANCE.getTypeObject();

  }

} //Rpg_modelingPackage
