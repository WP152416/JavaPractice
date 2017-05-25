/**
 * 
 */
package org.dimigo.interfaces;

/**
 * <pre>
 * org.dimigo.interfaces
 *     |_ IDEManager
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 5. 25.
 * </pre>
 *
 * @author  : A
 * @version : 1.0
 */
public interface IDBManager {

	public static final  String ORACLE_DATABASE = "ORACLE";
	public static final  String SYBASE_DATABASE = "SYBASE";
	
	public void insert();
	public void search();
	public void update();
	public void delete();
	
	public static IDBManager getDBObject(String database){
		if("ORACLE".equals(database)){
			return new OracleDB();
		}
		else if("SYBASE".equals(database)){
			return new SybaseDB();
		}
		else{
			return null;
		}
	}
}
