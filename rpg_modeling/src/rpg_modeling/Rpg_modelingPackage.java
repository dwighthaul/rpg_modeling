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
	 * The feature id for the '<em><b>Equipment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER__EQUIPMENT = 0;

	/**
	 * The number of structural features of the '<em>Character</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_FEATURE_COUNT = 1;

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
	 * The feature id for the '<em><b>Equipment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_PLAYER_CHARACTER__EQUIPMENT = CHARACTER__EQUIPMENT;

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
	 * The meta object id for the '{@link rpg_modeling.impl.ClassImpl <em>Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rpg_modeling.impl.ClassImpl
	 * @see rpg_modeling.impl.Rpg_modelingPackageImpl#getClass_()
	 * @generated
	 */
	int CLASS = 8;

	/**
	 * The feature id for the '<em><b>Player</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__PLAYER = 0;

	/**
	 * The number of structural features of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_OPERATION_COUNT = 0;

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
	 * The feature id for the '<em><b>Player</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD__PLAYER = CLASS__PLAYER;

	/**
	 * The number of structural features of the '<em>Wizard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD_FEATURE_COUNT = CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Wizard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD_OPERATION_COUNT = CLASS_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>Player</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHER__PLAYER = CLASS__PLAYER;

	/**
	 * The number of structural features of the '<em>Archer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHER_FEATURE_COUNT = CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Archer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHER_OPERATION_COUNT = CLASS_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>Player</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT__PLAYER = 0;

	/**
	 * The feature id for the '<em><b>Inventory</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT__INVENTORY = 1;

	/**
	 * The feature id for the '<em><b>Armor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT__ARMOR = 2;

	/**
	 * The number of structural features of the '<em>Equipment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT_FEATURE_COUNT = 3;

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
	 * The number of structural features of the '<em>Player Armor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_ARMOR_FEATURE_COUNT = 0;

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
	 * The feature id for the '<em><b>Player</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSASSIN__PLAYER = CLASS__PLAYER;

	/**
	 * The number of structural features of the '<em>Assassin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSASSIN_FEATURE_COUNT = CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Assassin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSASSIN_OPERATION_COUNT = CLASS_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>Equipment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__EQUIPMENT = CHARACTER__EQUIPMENT;

	/**
	 * The feature id for the '<em><b>Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__CLASS = CHARACTER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Guild</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__GUILD = CHARACTER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Grades</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__GRADES = CHARACTER_FEATURE_COUNT + 2;

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
	 * The feature id for the '<em><b>Player</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WARRIOR__PLAYER = CLASS__PLAYER;

	/**
	 * The number of structural features of the '<em>Warrior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WARRIOR_FEATURE_COUNT = CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Warrior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WARRIOR_OPERATION_COUNT = CLASS_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>Player</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUILD__PLAYER = 1;

	/**
	 * The number of structural features of the '<em>Guild</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUILD_FEATURE_COUNT = 2;

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
	 * The number of structural features of the '<em>Game Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_OBJECT_FEATURE_COUNT = 0;

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
	 * The feature id for the '<em><b>Guild</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTION__GUILD = 0;

	/**
	 * The number of structural features of the '<em>Faction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTION_FEATURE_COUNT = 1;

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
	 * The number of structural features of the '<em>Equipment Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT_OBJECT_FEATURE_COUNT = GAME_OBJECT_FEATURE_COUNT + 0;

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
	 * The number of structural features of the '<em>Inventory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_FEATURE_COUNT = 0;

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
	 * The number of structural features of the '<em>Quest Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEST_OBJECT_FEATURE_COUNT = GAME_OBJECT_FEATURE_COUNT + 0;

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
	 * The number of structural features of the '<em>Consumable Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUMABLE_OBJECT_FEATURE_COUNT = GAME_OBJECT_FEATURE_COUNT + 0;

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
	 * The meta object id for the '{@link rpg_modeling.Grades <em>Grades</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rpg_modeling.Grades
	 * @see rpg_modeling.impl.Rpg_modelingPackageImpl#getGrades()
	 * @generated
	 */
	int GRADES = 19;


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
	 * Returns the meta object for class '{@link rpg_modeling.Archer <em>Archer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Archer</em>'.
	 * @see rpg_modeling.Archer
	 * @generated
	 */
	EClass getArcher();

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
	 * Returns the meta object for the reference '{@link rpg_modeling.Equipment#getPlayer <em>Player</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Player</em>'.
	 * @see rpg_modeling.Equipment#getPlayer()
	 * @see #getEquipment()
	 * @generated
	 */
	EReference getEquipment_Player();

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
	 * Returns the meta object for class '{@link rpg_modeling.Assassin <em>Assassin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assassin</em>'.
	 * @see rpg_modeling.Assassin
	 * @generated
	 */
	EClass getAssassin();

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
	 * Returns the meta object for the reference '{@link rpg_modeling.Player#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Class</em>'.
	 * @see rpg_modeling.Player#getClass_()
	 * @see #getPlayer()
	 * @generated
	 */
	EReference getPlayer_Class();

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
	 * Returns the meta object for the attribute '{@link rpg_modeling.Player#getGrades <em>Grades</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grades</em>'.
	 * @see rpg_modeling.Player#getGrades()
	 * @see #getPlayer()
	 * @generated
	 */
	EAttribute getPlayer_Grades();

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
	 * Returns the meta object for class '{@link rpg_modeling.Class <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class</em>'.
	 * @see rpg_modeling.Class
	 * @generated
	 */
	EClass getClass_();

	/**
	 * Returns the meta object for the reference '{@link rpg_modeling.Class#getPlayer <em>Player</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Player</em>'.
	 * @see rpg_modeling.Class#getPlayer()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_Player();

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
	 * Returns the meta object for the reference list '{@link rpg_modeling.Guild#getPlayer <em>Player</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Player</em>'.
	 * @see rpg_modeling.Guild#getPlayer()
	 * @see #getGuild()
	 * @generated
	 */
	EReference getGuild_Player();

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
	 * Returns the meta object for class '{@link rpg_modeling.Faction <em>Faction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Faction</em>'.
	 * @see rpg_modeling.Faction
	 * @generated
	 */
	EClass getFaction();

	/**
	 * Returns the meta object for the containment reference list '{@link rpg_modeling.Faction#getGuild <em>Guild</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Guild</em>'.
	 * @see rpg_modeling.Faction#getGuild()
	 * @see #getFaction()
	 * @generated
	 */
	EReference getFaction_Guild();

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
	 * Returns the meta object for the reference '{@link rpg_modeling.Character#getEquipment <em>Equipment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Equipment</em>'.
	 * @see rpg_modeling.Character#getEquipment()
	 * @see #getCharacter()
	 * @generated
	 */
	EReference getCharacter_Equipment();

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
	 * Returns the meta object for class '{@link rpg_modeling.ConsumableObject <em>Consumable Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Consumable Object</em>'.
	 * @see rpg_modeling.ConsumableObject
	 * @generated
	 */
	EClass getConsumableObject();

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
	 * Returns the meta object for enum '{@link rpg_modeling.Grades <em>Grades</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Grades</em>'.
	 * @see rpg_modeling.Grades
	 * @generated
	 */
	EEnum getGrades();

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
		 * The meta object literal for the '{@link rpg_modeling.impl.ArcherImpl <em>Archer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rpg_modeling.impl.ArcherImpl
		 * @see rpg_modeling.impl.Rpg_modelingPackageImpl#getArcher()
		 * @generated
		 */
		EClass ARCHER = eINSTANCE.getArcher();

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
		 * The meta object literal for the '<em><b>Player</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EQUIPMENT__PLAYER = eINSTANCE.getEquipment_Player();

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
		 * The meta object literal for the '{@link rpg_modeling.impl.AssassinImpl <em>Assassin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rpg_modeling.impl.AssassinImpl
		 * @see rpg_modeling.impl.Rpg_modelingPackageImpl#getAssassin()
		 * @generated
		 */
		EClass ASSASSIN = eINSTANCE.getAssassin();

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
		 * The meta object literal for the '<em><b>Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAYER__CLASS = eINSTANCE.getPlayer_Class();

		/**
		 * The meta object literal for the '<em><b>Guild</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAYER__GUILD = eINSTANCE.getPlayer_Guild();

		/**
		 * The meta object literal for the '<em><b>Grades</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYER__GRADES = eINSTANCE.getPlayer_Grades();

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
		 * The meta object literal for the '{@link rpg_modeling.impl.ClassImpl <em>Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rpg_modeling.impl.ClassImpl
		 * @see rpg_modeling.impl.Rpg_modelingPackageImpl#getClass_()
		 * @generated
		 */
		EClass CLASS = eINSTANCE.getClass_();

		/**
		 * The meta object literal for the '<em><b>Player</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__PLAYER = eINSTANCE.getClass_Player();

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
		 * The meta object literal for the '<em><b>Player</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GUILD__PLAYER = eINSTANCE.getGuild_Player();

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
		 * The meta object literal for the '{@link rpg_modeling.impl.FactionImpl <em>Faction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rpg_modeling.impl.FactionImpl
		 * @see rpg_modeling.impl.Rpg_modelingPackageImpl#getFaction()
		 * @generated
		 */
		EClass FACTION = eINSTANCE.getFaction();

		/**
		 * The meta object literal for the '<em><b>Guild</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACTION__GUILD = eINSTANCE.getFaction_Guild();

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
		 * The meta object literal for the '<em><b>Equipment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHARACTER__EQUIPMENT = eINSTANCE.getCharacter_Equipment();

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
		 * The meta object literal for the '{@link rpg_modeling.impl.ConsumableObjectImpl <em>Consumable Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rpg_modeling.impl.ConsumableObjectImpl
		 * @see rpg_modeling.impl.Rpg_modelingPackageImpl#getConsumableObject()
		 * @generated
		 */
		EClass CONSUMABLE_OBJECT = eINSTANCE.getConsumableObject();

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
		 * The meta object literal for the '{@link rpg_modeling.Grades <em>Grades</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rpg_modeling.Grades
		 * @see rpg_modeling.impl.Rpg_modelingPackageImpl#getGrades()
		 * @generated
		 */
		EEnum GRADES = eINSTANCE.getGrades();

	}

} //Rpg_modelingPackage
