package com.hexaware.ftp88.util;
import java.util.Scanner;

import com.hexaware.ftp88.model.EmpMgr;
import java.text.SimpleDateFormat;
import java.text.ParseException;

/**
 * Class CliMain provides the command line interface to the leavemanagement
 * application.
 */
public class CliMain {
  public static void main(final String[] ar) {
    EmpMgr[] empmgr = EmpMgr.listAll();
    for (EmpMgr e : empmgr) {
      System.out.println(e.getEmpno() + " " +
             e.getName() + " " + e.getLoc() + " "
              + e.getMgrno());
    }
  }
}
