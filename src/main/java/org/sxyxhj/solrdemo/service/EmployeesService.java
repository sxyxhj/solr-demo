package org.sxyxhj.solrdemo.service;

import org.apache.solr.common.SolrDocumentList;

public interface EmployeesService {
    SolrDocumentList queryPageDate(int start, int rows);
}
