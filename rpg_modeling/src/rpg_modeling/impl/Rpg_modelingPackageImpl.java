/**
 */
package rpg_modeling.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import rpg_modeling.Archer;
import rpg_modeling.Assassin;
import rpg_modeling.CategoryObject;
import rpg_modeling.ConsumableObject;
import rpg_modeling.Equipment;
import rpg_modeling.EquipmentObject;
import rpg_modeling.Faction;
import rpg_modeling.GameEngine;
import rpg_modeling.GameObject;
import rpg_modeling.Grades;
import rpg_modeling.Guild;
import rpg_modeling.GuildInventory;
import rpg_modeling.Inventory;
import rpg_modeling.Job;
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
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Rpg_modelingPackageImpl extends EPackageImpl implements Rpg_modelingPackage {
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nonPlayerCharacterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass wizardEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass archerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass equipmentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass playerArmorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass assassinEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass playerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass warriorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass jobEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass guildEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass gameObjectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass factionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass equipmentObjectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass playerInventoryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass characterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass questObjectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass consumableObjectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass guildInventoryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass inventoryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass gameEngineEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum gradesEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum categoryObjectEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum typeObjectEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see rpg_modeling.Rpg_modelingPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private Rpg_modelingPackageImpl() {
    super(eNS_URI, Rpg_modelingFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link Rpg_modelingPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static Rpg_modelingPackage init() {
    if (isInited) return (Rpg_modelingPackage)EPackage.Registry.INSTANCE.getEPackage(Rpg_modelingPackage.eNS_URI);

    // Obtain or create and register package
    Rpg_modelingPackageImpl theRpg_modelingPackage = (Rpg_modelingPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Rpg_modelingPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Rpg_modelingPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    XMLTypePackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theRpg_modelingPackage.createPackageContents();

    // Initialize created meta-data
    theRpg_modelingPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theRpg_modelingPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(Rpg_modelingPackage.eNS_URI, theRpg_modelingPackage);
    return theRpg_modelingPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNonPlayerCharacter() {
    return nonPlayerCharacterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNonPlayerCharacter_Constitution() {
    return (EAttribute)nonPlayerCharacterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNonPlayerCharacter_Hp() {
    return (EAttribute)nonPlayerCharacterEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNonPlayerCharacter_Luck() {
    return (EAttribute)nonPlayerCharacterEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNonPlayerCharacter_Name() {
    return (EAttribute)nonPlayerCharacterEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNonPlayerCharacter_Mp() {
    return (EAttribute)nonPlayerCharacterEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNonPlayerCharacter_Wisdom() {
    return (EAttribute)nonPlayerCharacterEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNonPlayerCharacter_Dexterity() {
    return (EAttribute)nonPlayerCharacterEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNonPlayerCharacter_Strenght() {
    return (EAttribute)nonPlayerCharacterEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNonPlayerCharacter_Intelligence() {
    return (EAttribute)nonPlayerCharacterEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWizard() {
    return wizardEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWizard_Skill() {
    return (EAttribute)wizardEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getArcher() {
    return archerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getArcher_Skill() {
    return (EAttribute)archerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEquipment() {
    return equipmentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEquipment_Inventory() {
    return (EReference)equipmentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEquipment_Armor() {
    return (EReference)equipmentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPlayerArmor() {
    return playerArmorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPlayerArmor_Equipmentobject() {
    return (EReference)playerArmorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPlayerArmor_Head() {
    return (EAttribute)playerArmorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPlayerArmor_Chest() {
    return (EAttribute)playerArmorEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAssassin() {
    return assassinEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAssassin_Skill() {
    return (EAttribute)assassinEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPlayer() {
    return playerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPlayer_Guild() {
    return (EReference)playerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPlayer_Role() {
    return (EAttribute)playerEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPlayer_Name() {
    return (EAttribute)playerEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPlayer_Hp() {
    return (EAttribute)playerEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPlayer_Mp() {
    return (EAttribute)playerEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPlayer_Strenght() {
    return (EAttribute)playerEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPlayer_Constitution() {
    return (EAttribute)playerEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPlayer_Dexterity() {
    return (EAttribute)playerEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPlayer_Intelligence() {
    return (EAttribute)playerEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPlayer_Wisdom() {
    return (EAttribute)playerEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPlayer_Luck() {
    return (EAttribute)playerEClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPlayer_Class() {
    return (EReference)playerEClass.getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWarrior() {
    return warriorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWarrior_Skill() {
    return (EAttribute)warriorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getJob() {
    return jobEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGuild() {
    return guildEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGuild_Guildinventory() {
    return (EReference)guildEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGuild_Player() {
    return (EReference)guildEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGameObject() {
    return gameObjectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGameObject__id() {
    return (EAttribute)gameObjectEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGameObject_Name() {
    return (EAttribute)gameObjectEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGameObject_Price() {
    return (EAttribute)gameObjectEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFaction() {
    return factionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFaction_Guild() {
    return (EReference)factionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEquipmentObject() {
    return equipmentObjectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEquipmentObject_Type() {
    return (EAttribute)equipmentObjectEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPlayerInventory() {
    return playerInventoryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPlayerInventory_Consumableobject() {
    return (EReference)playerInventoryEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPlayerInventory_Questobject() {
    return (EReference)playerInventoryEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPlayerInventory_Equipmentobject() {
    return (EReference)playerInventoryEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCharacter() {
    return characterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCharacter_Equipment() {
    return (EReference)characterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getQuestObject() {
    return questObjectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getQuestObject__idQuest() {
    return (EAttribute)questObjectEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConsumableObject() {
    return consumableObjectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConsumableObject_TimeEffect() {
    return (EAttribute)consumableObjectEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConsumableObject_NewAttribute() {
    return (EAttribute)consumableObjectEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGuildInventory() {
    return guildInventoryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInventory() {
    return inventoryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGameEngine() {
    return gameEngineEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGameEngine_Faction() {
    return (EReference)gameEngineEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGameEngine_Character() {
    return (EReference)gameEngineEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getGrades() {
    return gradesEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getCategoryObject() {
    return categoryObjectEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getTypeObject() {
    return typeObjectEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Rpg_modelingFactory getRpg_modelingFactory() {
    return (Rpg_modelingFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents() {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    nonPlayerCharacterEClass = createEClass(NON_PLAYER_CHARACTER);
    createEAttribute(nonPlayerCharacterEClass, NON_PLAYER_CHARACTER__CONSTITUTION);
    createEAttribute(nonPlayerCharacterEClass, NON_PLAYER_CHARACTER__HP);
    createEAttribute(nonPlayerCharacterEClass, NON_PLAYER_CHARACTER__LUCK);
    createEAttribute(nonPlayerCharacterEClass, NON_PLAYER_CHARACTER__NAME);
    createEAttribute(nonPlayerCharacterEClass, NON_PLAYER_CHARACTER__MP);
    createEAttribute(nonPlayerCharacterEClass, NON_PLAYER_CHARACTER__WISDOM);
    createEAttribute(nonPlayerCharacterEClass, NON_PLAYER_CHARACTER__DEXTERITY);
    createEAttribute(nonPlayerCharacterEClass, NON_PLAYER_CHARACTER__STRENGHT);
    createEAttribute(nonPlayerCharacterEClass, NON_PLAYER_CHARACTER__INTELLIGENCE);

    wizardEClass = createEClass(WIZARD);
    createEAttribute(wizardEClass, WIZARD__SKILL);

    archerEClass = createEClass(ARCHER);
    createEAttribute(archerEClass, ARCHER__SKILL);

    equipmentEClass = createEClass(EQUIPMENT);
    createEReference(equipmentEClass, EQUIPMENT__INVENTORY);
    createEReference(equipmentEClass, EQUIPMENT__ARMOR);

    playerArmorEClass = createEClass(PLAYER_ARMOR);
    createEReference(playerArmorEClass, PLAYER_ARMOR__EQUIPMENTOBJECT);
    createEAttribute(playerArmorEClass, PLAYER_ARMOR__HEAD);
    createEAttribute(playerArmorEClass, PLAYER_ARMOR__CHEST);

    assassinEClass = createEClass(ASSASSIN);
    createEAttribute(assassinEClass, ASSASSIN__SKILL);

    playerEClass = createEClass(PLAYER);
    createEReference(playerEClass, PLAYER__GUILD);
    createEAttribute(playerEClass, PLAYER__ROLE);
    createEAttribute(playerEClass, PLAYER__NAME);
    createEAttribute(playerEClass, PLAYER__HP);
    createEAttribute(playerEClass, PLAYER__MP);
    createEAttribute(playerEClass, PLAYER__STRENGHT);
    createEAttribute(playerEClass, PLAYER__CONSTITUTION);
    createEAttribute(playerEClass, PLAYER__DEXTERITY);
    createEAttribute(playerEClass, PLAYER__INTELLIGENCE);
    createEAttribute(playerEClass, PLAYER__WISDOM);
    createEAttribute(playerEClass, PLAYER__LUCK);
    createEReference(playerEClass, PLAYER__CLASS);

    warriorEClass = createEClass(WARRIOR);
    createEAttribute(warriorEClass, WARRIOR__SKILL);

    jobEClass = createEClass(JOB);

    guildEClass = createEClass(GUILD);
    createEReference(guildEClass, GUILD__GUILDINVENTORY);
    createEReference(guildEClass, GUILD__PLAYER);

    gameObjectEClass = createEClass(GAME_OBJECT);
    createEAttribute(gameObjectEClass, GAME_OBJECT__ID);
    createEAttribute(gameObjectEClass, GAME_OBJECT__NAME);
    createEAttribute(gameObjectEClass, GAME_OBJECT__PRICE);

    factionEClass = createEClass(FACTION);
    createEReference(factionEClass, FACTION__GUILD);

    equipmentObjectEClass = createEClass(EQUIPMENT_OBJECT);
    createEAttribute(equipmentObjectEClass, EQUIPMENT_OBJECT__TYPE);

    playerInventoryEClass = createEClass(PLAYER_INVENTORY);
    createEReference(playerInventoryEClass, PLAYER_INVENTORY__CONSUMABLEOBJECT);
    createEReference(playerInventoryEClass, PLAYER_INVENTORY__QUESTOBJECT);
    createEReference(playerInventoryEClass, PLAYER_INVENTORY__EQUIPMENTOBJECT);

    characterEClass = createEClass(CHARACTER);
    createEReference(characterEClass, CHARACTER__EQUIPMENT);

    questObjectEClass = createEClass(QUEST_OBJECT);
    createEAttribute(questObjectEClass, QUEST_OBJECT__ID_QUEST);

    consumableObjectEClass = createEClass(CONSUMABLE_OBJECT);
    createEAttribute(consumableObjectEClass, CONSUMABLE_OBJECT__TIME_EFFECT);
    createEAttribute(consumableObjectEClass, CONSUMABLE_OBJECT__NEW_ATTRIBUTE);

    guildInventoryEClass = createEClass(GUILD_INVENTORY);

    inventoryEClass = createEClass(INVENTORY);

    gameEngineEClass = createEClass(GAME_ENGINE);
    createEReference(gameEngineEClass, GAME_ENGINE__FACTION);
    createEReference(gameEngineEClass, GAME_ENGINE__CHARACTER);

    // Create enums
    gradesEEnum = createEEnum(GRADES);
    categoryObjectEEnum = createEEnum(CATEGORY_OBJECT);
    typeObjectEEnum = createEEnum(TYPE_OBJECT);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents() {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    nonPlayerCharacterEClass.getESuperTypes().add(this.getCharacter());
    wizardEClass.getESuperTypes().add(this.getJob());
    archerEClass.getESuperTypes().add(this.getJob());
    assassinEClass.getESuperTypes().add(this.getJob());
    playerEClass.getESuperTypes().add(this.getCharacter());
    warriorEClass.getESuperTypes().add(this.getJob());
    equipmentObjectEClass.getESuperTypes().add(this.getGameObject());
    playerInventoryEClass.getESuperTypes().add(this.getInventory());
    questObjectEClass.getESuperTypes().add(this.getGameObject());
    consumableObjectEClass.getESuperTypes().add(this.getGameObject());
    guildInventoryEClass.getESuperTypes().add(this.getInventory());

    // Initialize classes, features, and operations; add parameters
    initEClass(nonPlayerCharacterEClass, NonPlayerCharacter.class, "NonPlayerCharacter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNonPlayerCharacter_Constitution(), ecorePackage.getEInt(), "constitution", null, 0, 1, NonPlayerCharacter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNonPlayerCharacter_Hp(), ecorePackage.getEInt(), "hp", null, 0, 1, NonPlayerCharacter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNonPlayerCharacter_Luck(), ecorePackage.getEInt(), "luck", null, 0, 1, NonPlayerCharacter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNonPlayerCharacter_Name(), ecorePackage.getEString(), "name", null, 0, 1, NonPlayerCharacter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNonPlayerCharacter_Mp(), ecorePackage.getEInt(), "mp", null, 0, 1, NonPlayerCharacter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNonPlayerCharacter_Wisdom(), ecorePackage.getEInt(), "wisdom", null, 0, 1, NonPlayerCharacter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNonPlayerCharacter_Dexterity(), ecorePackage.getEInt(), "dexterity", null, 0, 1, NonPlayerCharacter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNonPlayerCharacter_Strenght(), ecorePackage.getEInt(), "strenght", null, 0, 1, NonPlayerCharacter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNonPlayerCharacter_Intelligence(), ecorePackage.getEInt(), "intelligence", null, 0, 1, NonPlayerCharacter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(wizardEClass, Wizard.class, "Wizard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getWizard_Skill(), ecorePackage.getEEList(), "skill", null, 0, 1, Wizard.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(archerEClass, Archer.class, "Archer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getArcher_Skill(), ecorePackage.getEEList(), "skill", null, 0, 1, Archer.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(equipmentEClass, Equipment.class, "Equipment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEquipment_Inventory(), this.getPlayerInventory(), null, "inventory", null, 1, 1, Equipment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEquipment_Armor(), this.getPlayerArmor(), null, "armor", null, 1, 1, Equipment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(playerArmorEClass, PlayerArmor.class, "PlayerArmor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPlayerArmor_Equipmentobject(), this.getEquipmentObject(), null, "equipmentobject", null, 0, 8, PlayerArmor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPlayerArmor_Head(), theXMLTypePackage.getInt(), "head", null, 0, 1, PlayerArmor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPlayerArmor_Chest(), theXMLTypePackage.getInt(), "chest", null, 0, 1, PlayerArmor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(assassinEClass, Assassin.class, "Assassin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAssassin_Skill(), ecorePackage.getEEList(), "skill", null, 0, 1, Assassin.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(playerEClass, Player.class, "Player", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPlayer_Guild(), this.getGuild(), this.getGuild_Player(), "guild", null, 0, 1, Player.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPlayer_Role(), this.getGrades(), "role", "NO_MEMBER", 0, 1, Player.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPlayer_Name(), ecorePackage.getEString(), "name", null, 0, 1, Player.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPlayer_Hp(), ecorePackage.getEInt(), "hp", null, 0, 1, Player.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPlayer_Mp(), ecorePackage.getEInt(), "mp", null, 0, 1, Player.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPlayer_Strenght(), ecorePackage.getEInt(), "strenght", null, 0, 1, Player.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPlayer_Constitution(), ecorePackage.getEInt(), "constitution", null, 0, 1, Player.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPlayer_Dexterity(), ecorePackage.getEInt(), "dexterity", null, 0, 1, Player.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPlayer_Intelligence(), ecorePackage.getEInt(), "intelligence", null, 0, 1, Player.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPlayer_Wisdom(), ecorePackage.getEInt(), "wisdom", null, 0, 1, Player.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPlayer_Luck(), ecorePackage.getEInt(), "luck", null, 0, 1, Player.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPlayer_Class(), this.getJob(), null, "class", null, 0, -1, Player.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(warriorEClass, Warrior.class, "Warrior", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getWarrior_Skill(), ecorePackage.getEEList(), "skill", null, 0, 1, Warrior.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(jobEClass, Job.class, "Job", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(guildEClass, Guild.class, "Guild", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getGuild_Guildinventory(), this.getGuildInventory(), null, "guildinventory", null, 1, 1, Guild.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGuild_Player(), this.getPlayer(), this.getPlayer_Guild(), "player", null, 0, -1, Guild.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(gameObjectEClass, GameObject.class, "GameObject", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getGameObject__id(), theXMLTypePackage.getInt(), "_id", null, 0, 1, GameObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGameObject_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, GameObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGameObject_Price(), theXMLTypePackage.getInt(), "price", null, 0, 1, GameObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(factionEClass, Faction.class, "Faction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFaction_Guild(), this.getGuild(), null, "guild", null, 0, -1, Faction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(equipmentObjectEClass, EquipmentObject.class, "EquipmentObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEquipmentObject_Type(), this.getCategoryObject(), "type", "DEFAULT", 0, 1, EquipmentObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(playerInventoryEClass, PlayerInventory.class, "PlayerInventory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPlayerInventory_Consumableobject(), this.getConsumableObject(), null, "consumableobject", null, 0, -1, PlayerInventory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPlayerInventory_Questobject(), this.getQuestObject(), null, "questobject", null, 0, -1, PlayerInventory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPlayerInventory_Equipmentobject(), this.getEquipmentObject(), null, "equipmentobject", null, 0, -1, PlayerInventory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(characterEClass, rpg_modeling.Character.class, "Character", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCharacter_Equipment(), this.getEquipment(), null, "equipment", null, 0, -1, rpg_modeling.Character.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(questObjectEClass, QuestObject.class, "QuestObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getQuestObject__idQuest(), theXMLTypePackage.getInt(), "_idQuest", null, 0, 1, QuestObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(consumableObjectEClass, ConsumableObject.class, "ConsumableObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getConsumableObject_TimeEffect(), theXMLTypePackage.getInt(), "timeEffect", null, 0, 1, ConsumableObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getConsumableObject_NewAttribute(), this.getTypeObject(), "newAttribute", null, 0, 1, ConsumableObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(guildInventoryEClass, GuildInventory.class, "GuildInventory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(inventoryEClass, Inventory.class, "Inventory", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(gameEngineEClass, GameEngine.class, "GameEngine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getGameEngine_Faction(), this.getFaction(), null, "faction", null, 0, -1, GameEngine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGameEngine_Character(), this.getCharacter(), null, "character", null, 0, -1, GameEngine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(gradesEEnum, Grades.class, "Grades");
    addEEnumLiteral(gradesEEnum, Grades.MASTER);
    addEEnumLiteral(gradesEEnum, Grades.OFFICER);
    addEEnumLiteral(gradesEEnum, Grades.MEMBER);
    addEEnumLiteral(gradesEEnum, Grades.INTIATE);
    addEEnumLiteral(gradesEEnum, Grades.NO_MEMBER);

    initEEnum(categoryObjectEEnum, CategoryObject.class, "CategoryObject");
    addEEnumLiteral(categoryObjectEEnum, CategoryObject.HEAD);
    addEEnumLiteral(categoryObjectEEnum, CategoryObject.ARM);
    addEEnumLiteral(categoryObjectEEnum, CategoryObject.CHEST);
    addEEnumLiteral(categoryObjectEEnum, CategoryObject.LEG);
    addEEnumLiteral(categoryObjectEEnum, CategoryObject.RIGHT_HAND);
    addEEnumLiteral(categoryObjectEEnum, CategoryObject.LEFT_HAND);
    addEEnumLiteral(categoryObjectEEnum, CategoryObject.HAND);
    addEEnumLiteral(categoryObjectEEnum, CategoryObject.FOOT);
    addEEnumLiteral(categoryObjectEEnum, CategoryObject.DEFAULT);

    initEEnum(typeObjectEEnum, TypeObject.class, "TypeObject");
    addEEnumLiteral(typeObjectEEnum, TypeObject.HEAL);
    addEEnumLiteral(typeObjectEEnum, TypeObject.POISON);
    addEEnumLiteral(typeObjectEEnum, TypeObject.THUNDER);
    addEEnumLiteral(typeObjectEEnum, TypeObject.DEFAULT);

    // Create resource
    createResource(eNS_URI);
  }

} //Rpg_modelingPackageImpl
