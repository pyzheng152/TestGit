package com.amarsoft.a.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Ceshi {

	public static final String url = "jdbc:mysql://571ed2b83d47b.gz.cdb.myqcloud.com:13440/scfent_gf?useUnicode=true&amp;characterEncoding=GBK&amp;rewriteBatchedStatements=true&amp;useOldAliasMetadataBehavior=true";  
    public static final String name = "com.mysql.jdbc.Driver";  
    public static final String user = "als742";  
    public static final String password = "als742";  
  
    public Connection conn = null;  
    public PreparedStatement pst = null;  
  
    public Ceshi(String sql) {  
        try {  
            Class.forName(name);//指定连接类型  
            conn = DriverManager.getConnection(url, user, password);//获取连接  
            pst = conn.prepareStatement(sql);//准备执行语句  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
    }  
  
    public void close() {  
        try {  
            this.conn.close();  
            this.pst.close();  
        } catch (SQLException e) {  
            e.printStackTrace();  
        }  
    }  

}
