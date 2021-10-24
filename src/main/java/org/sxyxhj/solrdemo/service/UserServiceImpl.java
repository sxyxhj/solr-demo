package org.sxyxhj.solrdemo.service;

import com.google.gson.Gson;
import org.apache.solr.client.solrj.SolrClient;
import org.apache.solr.client.solrj.SolrServerException;
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
            SolrDocument solrDocument = solrClient.getById(String.valueOf(id));
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
}

    
