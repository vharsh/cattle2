/*
 * This file is generated by jOOQ.
*/
package io.cattle.platform.core.model.tables;


import io.cattle.platform.core.model.CattleTable;
import io.cattle.platform.core.model.Keys;
import io.cattle.platform.core.model.tables.records.SecretRecord;
import io.cattle.platform.db.jooq.converter.DataConverter;
import io.cattle.platform.db.jooq.converter.DateConverter;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SecretTable extends TableImpl<SecretRecord> {

    private static final long serialVersionUID = 141392528;

    /**
     * The reference instance of <code>cattle.secret</code>
     */
    public static final SecretTable SECRET = new SecretTable();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SecretRecord> getRecordType() {
        return SecretRecord.class;
    }

    /**
     * The column <code>cattle.secret.id</code>.
     */
    public final TableField<SecretRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>cattle.secret.name</code>.
     */
    public final TableField<SecretRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>cattle.secret.account_id</code>.
     */
    public final TableField<SecretRecord, Long> ACCOUNT_ID = createField("account_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>cattle.secret.kind</code>.
     */
    public final TableField<SecretRecord, String> KIND = createField("kind", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>cattle.secret.uuid</code>.
     */
    public final TableField<SecretRecord, String> UUID = createField("uuid", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

    /**
     * The column <code>cattle.secret.description</code>.
     */
    public final TableField<SecretRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.VARCHAR.length(1024), this, "");

    /**
     * The column <code>cattle.secret.state</code>.
     */
    public final TableField<SecretRecord, String> STATE = createField("state", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

    /**
     * The column <code>cattle.secret.created</code>.
     */
    public final TableField<SecretRecord, Date> CREATED = createField("created", org.jooq.impl.SQLDataType.TIMESTAMP, this, "", new DateConverter());

    /**
     * The column <code>cattle.secret.removed</code>.
     */
    public final TableField<SecretRecord, Date> REMOVED = createField("removed", org.jooq.impl.SQLDataType.TIMESTAMP, this, "", new DateConverter());

    /**
     * The column <code>cattle.secret.remove_time</code>.
     */
    public final TableField<SecretRecord, Date> REMOVE_TIME = createField("remove_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "", new DateConverter());

    /**
     * The column <code>cattle.secret.data</code>.
     */
    public final TableField<SecretRecord, Map<String,Object>> DATA = createField("data", org.jooq.impl.SQLDataType.CLOB, this, "", new DataConverter());

    /**
     * The column <code>cattle.secret.value</code>.
     */
    public final TableField<SecretRecord, String> VALUE = createField("value", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>cattle.secret.environment_id</code>.
     */
    public final TableField<SecretRecord, Long> STACK_ID = createField("environment_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>cattle.secret.creator_id</code>.
     */
    public final TableField<SecretRecord, Long> CREATOR_ID = createField("creator_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * Create a <code>cattle.secret</code> table reference
     */
    public SecretTable() {
        this("secret", null);
    }

    /**
     * Create an aliased <code>cattle.secret</code> table reference
     */
    public SecretTable(String alias) {
        this(alias, SECRET);
    }

    private SecretTable(String alias, Table<SecretRecord> aliased) {
        this(alias, aliased, null);
    }

    private SecretTable(String alias, Table<SecretRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return CattleTable.CATTLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<SecretRecord, Long> getIdentity() {
        return Keys.IDENTITY_SECRET;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<SecretRecord> getPrimaryKey() {
        return Keys.KEY_SECRET_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<SecretRecord>> getKeys() {
        return Arrays.<UniqueKey<SecretRecord>>asList(Keys.KEY_SECRET_PRIMARY, Keys.KEY_SECRET_IDX_SECRET_UUID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<SecretRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<SecretRecord, ?>>asList(Keys.FK_SECRET__ACCOUNT_ID, Keys.FK_SECRET__ENVIRONMENT_ID, Keys.FK_SECRET__CREATOR_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SecretTable as(String alias) {
        return new SecretTable(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SecretTable rename(String name) {
        return new SecretTable(name, null);
    }
}
