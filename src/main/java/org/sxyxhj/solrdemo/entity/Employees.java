package org.sxyxhj.solrdemo.entity;

import org.apache.solr.client.solrj.beans.Field;
import org.springframework.data.solr.core.mapping.SolrDocument;

/**
 * @program: solr-demo
 * @description:
 * @author: @sxyxhj
 * @create: 2021-10-25 22:24
 **/
@SolrDocument(solrCoreName = "my_core")
public class Employees {
    @Field
    private int empNo;
    @Field
    private String birthDate;
    @Field
    private String firstName;
    @Field
    private String lastName;
    @Field
    private String gender;
    @Field
    private String hireDate;

    public int getEmpNo() {
        return empNo;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }
}

    
