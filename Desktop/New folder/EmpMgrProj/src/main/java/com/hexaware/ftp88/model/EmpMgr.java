package com.hexaware.ftp88.model;

import com.hexaware.ftp88.persistence.DbConnection;
import com.hexaware.ftp88.persistence.EmpMgrDAO;

import java.util.Objects;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Calendar;

public class EmpMgr {

  
  private int empno;
  private String name;
  private String loc;
  private int mgrno;

   public EmpMgr() { 

  }

  public EmpMgr( int argEmpno, 
                   String argName,
                   String argLoc,
                   int argMgrno
                  )
  {
    this.empno = argEmpno;
    this.name = argName;
    this.loc = argLoc; 
    this.mgrno = argMgrno;
  }

   public final int getEmpno() {
    return empno;
  }


  public final void setEmpno(final int argEmpno) {
    this.empno = argEmpno;
  }

 public final String getName() {
    return name;
  }

  public final void setName(final String argName) {
    this.name = argName;
  }

  public final String getLoc() {
    return loc;
  }

   public final void setLoc(final String argLoc) {
    this.loc = argLoc;
  }

   public final int getMgrno() {
    return mgrno;
  }


  public final void setMgr(final int argEmpno) {
    this.empno = argEmpno;
  }


 private static EmpMgrDAO dao() {
    DbConnection db = new DbConnection();
    return db.getConnect().onDemand(EmpMgrDAO.class);
  }

  public static EmpMgr[] listAll() {
    List<EmpMgr> es = dao().list();
    return es.toArray(new EmpMgr[es.size()]);
  }

  /**
   * list employee details by id.
   * @param empID id to get employee details.
   * @return Employee
   */
  public static EmpMgr listById(final int empID) {
    return dao().find(empID);
  }
}


