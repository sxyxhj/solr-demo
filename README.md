# Solr


spring boot 整合Solr的例子




分页的测试数据：
表结构：
https://github.com/datacharmer/test_db/blob/master/employees.sql
/``
CREATE TABLE employees (
    emp_no      INT             NOT NULL,
    birth_date  DATE            NOT NULL,
    first_name  VARCHAR(14)     NOT NULL,
    last_name   VARCHAR(16)     NOT NULL,
    gender      ENUM ('M','F')  NOT NULL,    
    hire_date   DATE            NOT NULL,
    PRIMARY KEY (emp_no)
);
``/



dummy data:
https://github.com/datacharmer/test_db/blob/master/load_employees.dump