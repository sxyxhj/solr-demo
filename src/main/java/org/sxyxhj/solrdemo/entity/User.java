package org.sxyxhj.solrdemo.entity;

import org.apache.solr.client.solrj.beans.Field;
import org.springframework.data.annotation.Id;
import org.springframework.data.solr.core.mapping.SolrDocument;

/**
 * @program: solr-demo
 * @description: 用户实体类
 * @author: @sxyxhj
 * @create: 2021-10-24 11:38
 **/
@SolrDocument(solrCoreName = "new_core")
public class User {
    @Id
    @Field
    private int id;
    @Field
    private String userName;
    @Field
    private int userAge;
    @Field
    private String sex;
    @Field
    private String address;
    @Field
    private String description;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getUserAge() {
        return userAge;
    }

    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

    
