/**
 * This class is generated by jOOQ
 */
package io.cattle.platform.core.model.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.3.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SubnetTable extends org.jooq.impl.TableImpl<io.cattle.platform.core.model.tables.records.SubnetRecord> {

	private static final long serialVersionUID = 557550159;

	/**
	 * The singleton instance of <code>cattle.subnet</code>
	 */
	public static final io.cattle.platform.core.model.tables.SubnetTable SUBNET = new io.cattle.platform.core.model.tables.SubnetTable();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<io.cattle.platform.core.model.tables.records.SubnetRecord> getRecordType() {
		return io.cattle.platform.core.model.tables.records.SubnetRecord.class;
	}

	/**
	 * The column <code>cattle.subnet.id</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.SubnetRecord, java.lang.Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>cattle.subnet.name</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.SubnetRecord, java.lang.String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

	/**
	 * The column <code>cattle.subnet.account_id</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.SubnetRecord, java.lang.Long> ACCOUNT_ID = createField("account_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * The column <code>cattle.subnet.kind</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.SubnetRecord, java.lang.String> KIND = createField("kind", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

	/**
	 * The column <code>cattle.subnet.uuid</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.SubnetRecord, java.lang.String> UUID = createField("uuid", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

	/**
	 * The column <code>cattle.subnet.description</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.SubnetRecord, java.lang.String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.VARCHAR.length(1024), this, "");

	/**
	 * The column <code>cattle.subnet.state</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.SubnetRecord, java.lang.String> STATE = createField("state", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

	/**
	 * The column <code>cattle.subnet.created</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.SubnetRecord, java.util.Date> CREATED = createField("created", org.jooq.impl.SQLDataType.TIMESTAMP.asConvertedDataType(new io.cattle.platform.db.jooq.converter.DateConverter()), this, "");

	/**
	 * The column <code>cattle.subnet.removed</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.SubnetRecord, java.util.Date> REMOVED = createField("removed", org.jooq.impl.SQLDataType.TIMESTAMP.asConvertedDataType(new io.cattle.platform.db.jooq.converter.DateConverter()), this, "");

	/**
	 * The column <code>cattle.subnet.remove_time</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.SubnetRecord, java.util.Date> REMOVE_TIME = createField("remove_time", org.jooq.impl.SQLDataType.TIMESTAMP.asConvertedDataType(new io.cattle.platform.db.jooq.converter.DateConverter()), this, "");

	/**
	 * The column <code>cattle.subnet.data</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.SubnetRecord, java.util.Map<String,Object>> DATA = createField("data", org.jooq.impl.SQLDataType.CLOB.length(16777215).asConvertedDataType(new io.cattle.platform.db.jooq.converter.DataConverter()), this, "");

	/**
	 * The column <code>cattle.subnet.network_address</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.SubnetRecord, java.lang.String> NETWORK_ADDRESS = createField("network_address", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

	/**
	 * The column <code>cattle.subnet.cidr_size</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.SubnetRecord, java.lang.Integer> CIDR_SIZE = createField("cidr_size", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>cattle.subnet.start_address</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.SubnetRecord, java.lang.String> START_ADDRESS = createField("start_address", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

	/**
	 * The column <code>cattle.subnet.end_address</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.SubnetRecord, java.lang.String> END_ADDRESS = createField("end_address", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

	/**
	 * The column <code>cattle.subnet.gateway</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.SubnetRecord, java.lang.String> GATEWAY = createField("gateway", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

	/**
	 * The column <code>cattle.subnet.network_id</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.SubnetRecord, java.lang.Long> NETWORK_ID = createField("network_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * The column <code>cattle.subnet.is_public</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.SubnetRecord, java.lang.Boolean> IS_PUBLIC = createField("is_public", org.jooq.impl.SQLDataType.BIT.nullable(false).defaulted(true), this, "");

	/**
	 * Create a <code>cattle.subnet</code> table reference
	 */
	public SubnetTable() {
		this("subnet", null);
	}

	/**
	 * Create an aliased <code>cattle.subnet</code> table reference
	 */
	public SubnetTable(java.lang.String alias) {
		this(alias, io.cattle.platform.core.model.tables.SubnetTable.SUBNET);
	}

	private SubnetTable(java.lang.String alias, org.jooq.Table<io.cattle.platform.core.model.tables.records.SubnetRecord> aliased) {
		this(alias, aliased, null);
	}

	private SubnetTable(java.lang.String alias, org.jooq.Table<io.cattle.platform.core.model.tables.records.SubnetRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, io.cattle.platform.core.model.CattleTable.CATTLE, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<io.cattle.platform.core.model.tables.records.SubnetRecord, java.lang.Long> getIdentity() {
		return io.cattle.platform.core.model.Keys.IDENTITY_SUBNET;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<io.cattle.platform.core.model.tables.records.SubnetRecord> getPrimaryKey() {
		return io.cattle.platform.core.model.Keys.KEY_SUBNET_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<io.cattle.platform.core.model.tables.records.SubnetRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<io.cattle.platform.core.model.tables.records.SubnetRecord>>asList(io.cattle.platform.core.model.Keys.KEY_SUBNET_PRIMARY, io.cattle.platform.core.model.Keys.KEY_SUBNET_IDX_SUBNET_UUID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<io.cattle.platform.core.model.tables.records.SubnetRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<io.cattle.platform.core.model.tables.records.SubnetRecord, ?>>asList(io.cattle.platform.core.model.Keys.FK_SUBNET__ACCOUNT_ID, io.cattle.platform.core.model.Keys.FK_SUBNET__NETWORK_ID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public io.cattle.platform.core.model.tables.SubnetTable as(java.lang.String alias) {
		return new io.cattle.platform.core.model.tables.SubnetTable(alias, this);
	}

	/**
	 * Rename this table
	 */
	public io.cattle.platform.core.model.tables.SubnetTable rename(java.lang.String name) {
		return new io.cattle.platform.core.model.tables.SubnetTable(name, null);
	}
}
