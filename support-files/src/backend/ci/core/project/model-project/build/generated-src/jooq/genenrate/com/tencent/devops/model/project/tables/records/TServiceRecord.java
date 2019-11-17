/*
 * This file is generated by jOOQ.
*/
package com.tencent.devops.model.project.tables.records;


import com.tencent.devops.model.project.tables.TService;

import java.time.LocalDateTime;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TServiceRecord extends UpdatableRecordImpl<TServiceRecord> {

    private static final long serialVersionUID = 1755006886;

    /**
     * Setter for <code>devops_project.t_service.id</code>. id
     */
    public TServiceRecord setId(Long value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>devops_project.t_service.id</code>. id
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>devops_project.t_service.name</code>. 名称
     */
    public TServiceRecord setName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>devops_project.t_service.name</code>. 名称
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>devops_project.t_service.service_type_id</code>.
     */
    public TServiceRecord setServiceTypeId(Long value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>devops_project.t_service.service_type_id</code>.
     */
    public Long getServiceTypeId() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>devops_project.t_service.link</code>.
     */
    public TServiceRecord setLink(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>devops_project.t_service.link</code>.
     */
    public String getLink() {
        return (String) get(3);
    }

    /**
     * Setter for <code>devops_project.t_service.link_new</code>.
     */
    public TServiceRecord setLinkNew(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>devops_project.t_service.link_new</code>.
     */
    public String getLinkNew() {
        return (String) get(4);
    }

    /**
     * Setter for <code>devops_project.t_service.inject_type</code>.
     */
    public TServiceRecord setInjectType(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>devops_project.t_service.inject_type</code>.
     */
    public String getInjectType() {
        return (String) get(5);
    }

    /**
     * Setter for <code>devops_project.t_service.iframe_url</code>.
     */
    public TServiceRecord setIframeUrl(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>devops_project.t_service.iframe_url</code>.
     */
    public String getIframeUrl() {
        return (String) get(6);
    }

    /**
     * Setter for <code>devops_project.t_service.css_url</code>.
     */
    public TServiceRecord setCssUrl(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>devops_project.t_service.css_url</code>.
     */
    public String getCssUrl() {
        return (String) get(7);
    }

    /**
     * Setter for <code>devops_project.t_service.js_url</code>.
     */
    public TServiceRecord setJsUrl(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>devops_project.t_service.js_url</code>.
     */
    public String getJsUrl() {
        return (String) get(8);
    }

    /**
     * Setter for <code>devops_project.t_service.show_project_list</code>.
     */
    public TServiceRecord setShowProjectList(Boolean value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>devops_project.t_service.show_project_list</code>.
     */
    public Boolean getShowProjectList() {
        return (Boolean) get(9);
    }

    /**
     * Setter for <code>devops_project.t_service.show_nav</code>.
     */
    public TServiceRecord setShowNav(Boolean value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>devops_project.t_service.show_nav</code>.
     */
    public Boolean getShowNav() {
        return (Boolean) get(10);
    }

    /**
     * Setter for <code>devops_project.t_service.project_id_type</code>.
     */
    public TServiceRecord setProjectIdType(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>devops_project.t_service.project_id_type</code>.
     */
    public String getProjectIdType() {
        return (String) get(11);
    }

    /**
     * Setter for <code>devops_project.t_service.status</code>.
     */
    public TServiceRecord setStatus(String value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>devops_project.t_service.status</code>.
     */
    public String getStatus() {
        return (String) get(12);
    }

    /**
     * Setter for <code>devops_project.t_service.weight</code>. 排序
     */
    public TServiceRecord setWeight(Integer value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>devops_project.t_service.weight</code>. 排序
     */
    public Integer getWeight() {
        return (Integer) get(13);
    }

    /**
     * Setter for <code>devops_project.t_service.created_user</code>.
     */
    public TServiceRecord setCreatedUser(String value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>devops_project.t_service.created_user</code>.
     */
    public String getCreatedUser() {
        return (String) get(14);
    }

    /**
     * Setter for <code>devops_project.t_service.created_time</code>.
     */
    public TServiceRecord setCreatedTime(LocalDateTime value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>devops_project.t_service.created_time</code>.
     */
    public LocalDateTime getCreatedTime() {
        return (LocalDateTime) get(15);
    }

    /**
     * Setter for <code>devops_project.t_service.updated_user</code>.
     */
    public TServiceRecord setUpdatedUser(String value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>devops_project.t_service.updated_user</code>.
     */
    public String getUpdatedUser() {
        return (String) get(16);
    }

    /**
     * Setter for <code>devops_project.t_service.updated_time</code>.
     */
    public TServiceRecord setUpdatedTime(LocalDateTime value) {
        set(17, value);
        return this;
    }

    /**
     * Getter for <code>devops_project.t_service.updated_time</code>.
     */
    public LocalDateTime getUpdatedTime() {
        return (LocalDateTime) get(17);
    }

    /**
     * Setter for <code>devops_project.t_service.deleted</code>.
     */
    public TServiceRecord setDeleted(Boolean value) {
        set(18, value);
        return this;
    }

    /**
     * Getter for <code>devops_project.t_service.deleted</code>.
     */
    public Boolean getDeleted() {
        return (Boolean) get(18);
    }

    /**
     * Setter for <code>devops_project.t_service.gray_css_url</code>.
     */
    public TServiceRecord setGrayCssUrl(String value) {
        set(19, value);
        return this;
    }

    /**
     * Getter for <code>devops_project.t_service.gray_css_url</code>.
     */
    public String getGrayCssUrl() {
        return (String) get(19);
    }

    /**
     * Setter for <code>devops_project.t_service.gray_js_url</code>.
     */
    public TServiceRecord setGrayJsUrl(String value) {
        set(20, value);
        return this;
    }

    /**
     * Getter for <code>devops_project.t_service.gray_js_url</code>.
     */
    public String getGrayJsUrl() {
        return (String) get(20);
    }

    /**
     * Setter for <code>devops_project.t_service.logo_url</code>. logo地址
     */
    public TServiceRecord setLogoUrl(String value) {
        set(21, value);
        return this;
    }

    /**
     * Getter for <code>devops_project.t_service.logo_url</code>. logo地址
     */
    public String getLogoUrl() {
        return (String) get(21);
    }

    /**
     * Setter for <code>devops_project.t_service.web_socket</code>. 支持webSocket的页面
     */
    public TServiceRecord setWebSocket(String value) {
        set(22, value);
        return this;
    }

    /**
     * Getter for <code>devops_project.t_service.web_socket</code>. 支持webSocket的页面
     */
    public String getWebSocket() {
        return (String) get(22);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TServiceRecord
     */
    public TServiceRecord() {
        super(TService.T_SERVICE);
    }

    /**
     * Create a detached, initialised TServiceRecord
     */
    public TServiceRecord(Long id, String name, Long serviceTypeId, String link, String linkNew, String injectType, String iframeUrl, String cssUrl, String jsUrl, Boolean showProjectList, Boolean showNav, String projectIdType, String status, Integer weight, String createdUser, LocalDateTime createdTime, String updatedUser, LocalDateTime updatedTime, Boolean deleted, String grayCssUrl, String grayJsUrl, String logoUrl, String webSocket) {
        super(TService.T_SERVICE);

        set(0, id);
        set(1, name);
        set(2, serviceTypeId);
        set(3, link);
        set(4, linkNew);
        set(5, injectType);
        set(6, iframeUrl);
        set(7, cssUrl);
        set(8, jsUrl);
        set(9, showProjectList);
        set(10, showNav);
        set(11, projectIdType);
        set(12, status);
        set(13, weight);
        set(14, createdUser);
        set(15, createdTime);
        set(16, updatedUser);
        set(17, updatedTime);
        set(18, deleted);
        set(19, grayCssUrl);
        set(20, grayJsUrl);
        set(21, logoUrl);
        set(22, webSocket);
    }
}