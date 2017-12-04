/**
 */
package rpg_modeling.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import rpg_modeling.util.Rpg_modelingAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Rpg_modelingItemProviderAdapterFactory extends Rpg_modelingAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rpg_modelingItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link rpg_modeling.NonPlayerCharacter} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NonPlayerCharacterItemProvider nonPlayerCharacterItemProvider;

	/**
	 * This creates an adapter for a {@link rpg_modeling.NonPlayerCharacter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNonPlayerCharacterAdapter() {
		if (nonPlayerCharacterItemProvider == null) {
			nonPlayerCharacterItemProvider = new NonPlayerCharacterItemProvider(this);
		}

		return nonPlayerCharacterItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link rpg_modeling.Wizard} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WizardItemProvider wizardItemProvider;

	/**
	 * This creates an adapter for a {@link rpg_modeling.Wizard}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createWizardAdapter() {
		if (wizardItemProvider == null) {
			wizardItemProvider = new WizardItemProvider(this);
		}

		return wizardItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link rpg_modeling.Archer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArcherItemProvider archerItemProvider;

	/**
	 * This creates an adapter for a {@link rpg_modeling.Archer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createArcherAdapter() {
		if (archerItemProvider == null) {
			archerItemProvider = new ArcherItemProvider(this);
		}

		return archerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link rpg_modeling.Equipment} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EquipmentItemProvider equipmentItemProvider;

	/**
	 * This creates an adapter for a {@link rpg_modeling.Equipment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEquipmentAdapter() {
		if (equipmentItemProvider == null) {
			equipmentItemProvider = new EquipmentItemProvider(this);
		}

		return equipmentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link rpg_modeling.PlayerArmor} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlayerArmorItemProvider playerArmorItemProvider;

	/**
	 * This creates an adapter for a {@link rpg_modeling.PlayerArmor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPlayerArmorAdapter() {
		if (playerArmorItemProvider == null) {
			playerArmorItemProvider = new PlayerArmorItemProvider(this);
		}

		return playerArmorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link rpg_modeling.Assassin} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssassinItemProvider assassinItemProvider;

	/**
	 * This creates an adapter for a {@link rpg_modeling.Assassin}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAssassinAdapter() {
		if (assassinItemProvider == null) {
			assassinItemProvider = new AssassinItemProvider(this);
		}

		return assassinItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link rpg_modeling.Player} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlayerItemProvider playerItemProvider;

	/**
	 * This creates an adapter for a {@link rpg_modeling.Player}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPlayerAdapter() {
		if (playerItemProvider == null) {
			playerItemProvider = new PlayerItemProvider(this);
		}

		return playerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link rpg_modeling.Warrior} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WarriorItemProvider warriorItemProvider;

	/**
	 * This creates an adapter for a {@link rpg_modeling.Warrior}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createWarriorAdapter() {
		if (warriorItemProvider == null) {
			warriorItemProvider = new WarriorItemProvider(this);
		}

		return warriorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link rpg_modeling.Class} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassItemProvider classItemProvider;

	/**
	 * This creates an adapter for a {@link rpg_modeling.Class}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createClassAdapter() {
		if (classItemProvider == null) {
			classItemProvider = new ClassItemProvider(this);
		}

		return classItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link rpg_modeling.Guild} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GuildItemProvider guildItemProvider;

	/**
	 * This creates an adapter for a {@link rpg_modeling.Guild}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGuildAdapter() {
		if (guildItemProvider == null) {
			guildItemProvider = new GuildItemProvider(this);
		}

		return guildItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link rpg_modeling.GameObject} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GameObjectItemProvider gameObjectItemProvider;

	/**
	 * This creates an adapter for a {@link rpg_modeling.GameObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGameObjectAdapter() {
		if (gameObjectItemProvider == null) {
			gameObjectItemProvider = new GameObjectItemProvider(this);
		}

		return gameObjectItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link rpg_modeling.Faction} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FactionItemProvider factionItemProvider;

	/**
	 * This creates an adapter for a {@link rpg_modeling.Faction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFactionAdapter() {
		if (factionItemProvider == null) {
			factionItemProvider = new FactionItemProvider(this);
		}

		return factionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link rpg_modeling.EquipmentObject} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EquipmentObjectItemProvider equipmentObjectItemProvider;

	/**
	 * This creates an adapter for a {@link rpg_modeling.EquipmentObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEquipmentObjectAdapter() {
		if (equipmentObjectItemProvider == null) {
			equipmentObjectItemProvider = new EquipmentObjectItemProvider(this);
		}

		return equipmentObjectItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link rpg_modeling.PlayerInventory} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlayerInventoryItemProvider playerInventoryItemProvider;

	/**
	 * This creates an adapter for a {@link rpg_modeling.PlayerInventory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPlayerInventoryAdapter() {
		if (playerInventoryItemProvider == null) {
			playerInventoryItemProvider = new PlayerInventoryItemProvider(this);
		}

		return playerInventoryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link rpg_modeling.QuestObject} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuestObjectItemProvider questObjectItemProvider;

	/**
	 * This creates an adapter for a {@link rpg_modeling.QuestObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createQuestObjectAdapter() {
		if (questObjectItemProvider == null) {
			questObjectItemProvider = new QuestObjectItemProvider(this);
		}

		return questObjectItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link rpg_modeling.ConsumableObject} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConsumableObjectItemProvider consumableObjectItemProvider;

	/**
	 * This creates an adapter for a {@link rpg_modeling.ConsumableObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConsumableObjectAdapter() {
		if (consumableObjectItemProvider == null) {
			consumableObjectItemProvider = new ConsumableObjectItemProvider(this);
		}

		return consumableObjectItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link rpg_modeling.GuildInventory} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GuildInventoryItemProvider guildInventoryItemProvider;

	/**
	 * This creates an adapter for a {@link rpg_modeling.GuildInventory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGuildInventoryAdapter() {
		if (guildInventoryItemProvider == null) {
			guildInventoryItemProvider = new GuildInventoryItemProvider(this);
		}

		return guildInventoryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link rpg_modeling.Inventory} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InventoryItemProvider inventoryItemProvider;

	/**
	 * This creates an adapter for a {@link rpg_modeling.Inventory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInventoryAdapter() {
		if (inventoryItemProvider == null) {
			inventoryItemProvider = new InventoryItemProvider(this);
		}

		return inventoryItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (nonPlayerCharacterItemProvider != null) nonPlayerCharacterItemProvider.dispose();
		if (wizardItemProvider != null) wizardItemProvider.dispose();
		if (archerItemProvider != null) archerItemProvider.dispose();
		if (equipmentItemProvider != null) equipmentItemProvider.dispose();
		if (playerArmorItemProvider != null) playerArmorItemProvider.dispose();
		if (assassinItemProvider != null) assassinItemProvider.dispose();
		if (playerItemProvider != null) playerItemProvider.dispose();
		if (warriorItemProvider != null) warriorItemProvider.dispose();
		if (classItemProvider != null) classItemProvider.dispose();
		if (guildItemProvider != null) guildItemProvider.dispose();
		if (gameObjectItemProvider != null) gameObjectItemProvider.dispose();
		if (factionItemProvider != null) factionItemProvider.dispose();
		if (equipmentObjectItemProvider != null) equipmentObjectItemProvider.dispose();
		if (playerInventoryItemProvider != null) playerInventoryItemProvider.dispose();
		if (questObjectItemProvider != null) questObjectItemProvider.dispose();
		if (consumableObjectItemProvider != null) consumableObjectItemProvider.dispose();
		if (guildInventoryItemProvider != null) guildInventoryItemProvider.dispose();
		if (inventoryItemProvider != null) inventoryItemProvider.dispose();
	}

}
