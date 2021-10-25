package org.sxyxhj.solrdemo.controller;

import org.apache.solr.common.SolrDocumentList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.sxyxhj.solrdemo.service.EmployeesService;

/**
 * @program: solr-demo
 * @description:
 * @author: @sxyxhj
 * @create: 2021-10-25 22:34
 **/
@RestController
public class EmployeesController {

    @Autowired
    EmployeesService service;

    @GetMapping("/api/queryPageDate/{start}/{rows}")
    public SolrDocumentList queryPageDate(@PathVariable("start") int start, @PathVariable("rows") int rows){
        return service.queryPageDate(start,rows);
    }

}

    
