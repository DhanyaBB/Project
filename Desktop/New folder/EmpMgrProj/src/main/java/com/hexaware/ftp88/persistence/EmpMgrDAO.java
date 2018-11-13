package com.hexaware.ftp88.persistence;

import com.hexaware.ftp88.model.EmpMgr;

import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;
import org.skife.jdbi.v2.sqlobject.customizers.Mapper;

import java.util.List;
import java.util.Date;

/**
 * The DAO class for employee.
 */
public interface EmpMgrDAO  {
  /**
   * return all the details of all the employees.
   * @return the employee array
   */
  @SqlQuery("SELECT * FROM EMPMGR")
  @Mapper(EmpMgrMapper.class)
  List<EmpMgr> list();

  /**
   * return all the details of the selected employee.
   * @param empID the id of the employee
   * @return the employee object
   */
  @SqlQuery("SELECT * FROM EMP WHERE EMPNO = :empno")
  @Mapper(EmpMgrMapper.class)
  EmpMgr find(@Bind("empno") int empno);

  
  /**
  * close with no args is used to close the connection.
  */
  void close();
}
