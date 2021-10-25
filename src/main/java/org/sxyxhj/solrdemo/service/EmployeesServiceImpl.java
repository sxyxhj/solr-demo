package org.sxyxhj.solrdemo.service;

import org.apache.solr.client.solrj.SolrClient;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrResponse;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocumentList;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.IOException;

/**
 * @program: solr-demo
 * @description:
 * @author: @sxyxhj
 * @create: 2021-10-25 22:29
 **/
@Service
public class EmployeesServiceImpl implements EmployeesService {

    @Resource
    private SolrClient solrClient;

    @Override
    public SolrDocumentList queryPageDate(int start, int rows) {

        SolrQuery query = new SolrQuery();
        query.set("q","empNo:*");
        query.setStart(start);
        query.setRows(rows);
        try {
            QueryResponse response = solrClient.query(query);

            return response.getResults();

        } catch (SolrServerException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        return null;
    }
}

    
