/*
 * This file is generated by jOOQ.
*/
package com.tencent.devops.model.project.tables;


import com.tencent.devops.model.project.DevopsProject;
import com.tencent.devops.model.project.Keys;
import com.tencent.devops.model.project.tables.records.TUserRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TUser extends TableImpl<TUserRecord> {

    private static final long serialVersionUID = 651955778;

    /**
     * The reference instance of <code>devops_project.T_USER</code>
     */
    public static final TUser T_USER = new TUser();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TUserRecord> getRecordType() {
        return TUserRecord.class;
    }

    /**
     * The column <code>devops_project.T_USER.USER_ID</code>.
     */
    public final TableField<TUserRecord, String> USER_ID = createField("USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false), this, "");

    /**
     * The column <code>devops_project.T_USER.NAME</code>.
     */
    public final TableField<TUserRecord, String> NAME = createField("NAME", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false), this, "");

    /**
     * The column <code>devops_project.T_USER.BG_ID</code>.
     */
    public final TableField<TUserRecord, Integer> BG_ID = createField("BG_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>devops_project.T_USER.BG_NAME</code>.
     */
    public final TableField<TUserRecord, String> BG_NAME = createField("BG_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(256).nullable(false), this, "");

    /**
     * The column <code>devops_project.T_USER.DEPT_ID</code>.
     */
    public final TableField<TUserRecord, Integer> DEPT_ID = createField("DEPT_ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>devops_project.T_USER.DEPT_NAME</code>.
     */
    public final TableField<TUserRecord, String> DEPT_NAME = createField("DEPT_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(256), this, "");

    /**
     * The column <code>devops_project.T_USER.CENTER_ID</code>.
     */
    public final TableField<TUserRecord, Integer> CENTER_ID = createField("CENTER_ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>devops_project.T_USER.CENTER_NAME</code>.
     */
    public final TableField<TUserRecord, String> CENTER_NAME = createField("CENTER_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(256), this, "");

    /**
     * The column <code>devops_project.T_USER.GROYP_ID</code>.
     */
    public final TableField<TUserRecord, Integer> GROYP_ID = createField("GROYP_ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>devops_project.T_USER.GROUP_NAME</code>.
     */
    public final TableField<TUserRecord, String> GROUP_NAME = createField("GROUP_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(256), this, "");

    /**
     * The column <code>devops_project.T_USER.CREATE_TIME</code>.
     */
    public final TableField<TUserRecord, LocalDateTime> CREATE_TIME = createField("CREATE_TIME", org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0000-00-00 00:00:00", org.jooq.impl.SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>devops_project.T_USER.UPDATE_TIME</code>.
     */
    public final TableField<TUserRecord, LocalDateTime> UPDATE_TIME = createField("UPDATE_TIME", org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0000-00-00 00:00:00", org.jooq.impl.SQLDataType.LOCALDATETIME)), this, "");

    /**
     * Create a <code>devops_project.T_USER</code> table reference
     */
    public TUser() {
        this("T_USER", null);
    }

    /**
     * Create an aliased <code>devops_project.T_USER</code> table reference
     */
    public TUser(String alias) {
        this(alias, T_USER);
    }

    private TUser(String alias, Table<TUserRecord> aliased) {
        this(alias, aliased, null);
    }

    private TUser(String alias, Table<TUserRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return DevopsProject.DEVOPS_PROJECT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TUserRecord> getPrimaryKey() {
        return Keys.KEY_T_USER_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TUserRecord>> getKeys() {
        return Arrays.<UniqueKey<TUserRecord>>asList(Keys.KEY_T_USER_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TUser as(String alias) {
        return new TUser(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TUser rename(String name) {
        return new TUser(name, null);
    }
}