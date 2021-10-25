package org.sxyxhj.solrdemo.service;

import com.google.gson.Gson;
import org.apache.solr.client.solrj.SolrClient;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.response.UpdateResponse;
import org.apache.solr.common.SolrDocument;
import org.springframework.stereotype.Service;
import org.sxyxhj.solrdemo.entity.User;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.Map;

/**
 * @program: solr-demo
 * @description:
 * @author: @sxyxhj
 * @create: 2021-10-24 12:13
 **/
@Service
public class UserServiceImpl implements UserService{


    @Resource
    private SolrClient solrClient;


    @Override
    public User getUserById(int id) {
        User user = null;
        try {
            SolrDocument  solrDocument = solrClient.getById(String.valueOf(id));

            if(null == solrDocument){
                return null;
            }
            Gson gson = new Gson();
            String solrString = gson.toJson(solrDocument);
            user = gson.fromJson(solrString,User.class);

            Map<String,Object> map = solrDocument.getFieldValueMap();
            user = gson.fromJson(map.toString(),User.class);

            return user;

        } catch (SolrServerException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        return null;
    }

    @Override
    public boolean addUser(User user) {

        try {
            //可以先加数据库之后，然后添加记录到solr
            solrClient.addBean(user);
            UpdateResponse response = solrClient.commit();

            if(response.getStatus() != 0){
                return false;
            }
            return true;
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SolrServerException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean deleteUserById(int id) {

        try {
            solrClient.deleteById(String.valueOf(id));
            UpdateResponse response = solrClient.commit();
            if(response.getStatus() != 0){
                return false;
            }
            return true;
        } catch (SolrServerException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        return false;
    }

    @Override
    public boolean updateUser(User user) {
        try {
            solrClient.addBean(user);
            UpdateResponse response = solrClient.commit();

            if(response.getStatus() != 0){
                return false;
            }
            return true;

        } catch (IOException e) {
            e.printStackTrace();
        } catch (SolrServerException e) {
            e.printStackTrace();
        }

        return false;
    }
}

    
