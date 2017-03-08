package com.amarsoft.a.test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class Hynial {
	static String sql = null;  
    static DBHelper db1 = null;  
    static ResultSet ret = null; 
    HashMap hm = new HashMap<Integer, String>();
//    static String[] menuNamesNotIn = {"日常工作提示", "业务提示和预警", "个人客户管理", "机构客户管理", "黑名单管理", "未申请融资客户列表", "评级授信申请","评级授信调整申请","已批准授信申请列表", "放款申请", "催收管理", "多余款项处理", "还款管理", "五级分类调整申请","风险预警管理", "对账管理", "核销管理","担保合同管理", "担保合同变更管理", "抵质押物管理", "本息调整交易申请","反冲交易申请","自定义查询", "核算台账", "提款明细台账", "贷款客户情况报表", "业务员绩效表", "贷款客户台账", "业务逾期明细表", "本息到期提示表", "资金台帐", "业务进度查询"};
    
//    static String[] menuNamesNotIn = {"金融报送","接口相关","产品管理","系统管理","合同管理","核算参数定义","报表管理","统计查询","异常管理","担保管理","贷后管理","放款管理","授信评级","客户管理","日常工作提示", "业务提示和预警", "个人客户管理", "机构客户管理", "黑名单管理", "未申请融资客户列表", "评级授信申请","评级授信调整申请","已批准授信申请列表", "放款申请", "催收管理", "多余款项处理", "还款管理", "五级分类调整申请","风险预警管理", "对账管理", "核销管理","担保合同管理", "担保合同变更管理", "抵质押物管理", "本息调整交易申请","反冲交易申请","自定义查询", "核算台账", "提款明细台账", "贷款客户情况报表(汇总报表)","贷款客户情况报表(明细报表) 、新增合同情况", "业务员绩效表", "贷款客户台账", "业务逾期明细表", "本息到期提示表", "资金台帐(参考)", "业务进度查询","评级授信审批","评级授信调整审批","五级分类调整审批"};
//    static String[] menuNamesNotIn = {"我的工作台","金融报送","接口相关","产品管理","系统管理","合同管理","核算参数定义","报表管理","统计查询","异常管理","担保管理","贷后管理","放款管理","授信评级"
//    	,"日常工作提示", "业务提示和预警","风险预警管理",  "核销管理","计提减值准备","担保合同变更管理", "本息调整交易复核","反冲交易复核","自定义查询", "核算台账", "提款明细台账", "贷款客户情况报表(汇总报表)","贷款客户情况报表(明细报表) 、新增合同情况", "业务员绩效表", "贷款客户台账", "业务逾期明细表", "本息到期提示表", "资金台帐(参考)", "业务进度查询","评级授信审批","评级授信调整审批","五级分类调整审批"};
//    static String[] menuNamesNotIn = {"我的工作台","核算参数定义","报表管理","统计查询","异常管理","贷后管理","放款管理"
//    	,"日常工作提示", "业务提示和预警","核销管理","计提减值准备", "本息调整交易复核","反冲交易复核","自定义查询", "核算台账", "提款明细台账", "贷款客户情况报表(汇总报表)","贷款客户情况报表(明细报表) 、新增合同情况", "业务员绩效表", "贷款客户台账", "业务逾期明细表", "本息到期提示表", "资金台帐(参考)", "业务进度查询","账务代码定义","业务组件管理"};
//    static String[] menuNamesNotIn = {"我的工作台","报表管理","统计查询","异常管理","贷后管理","放款管理","合同管理","产品管理"
//    	,"日常工作提示", "业务提示和预警","自定义查询", "核算台账", "提款明细台账", "贷款客户情况报表(汇总报表)","贷款客户情况报表(明细报表) 、新增合同情况", "业务员绩效表", "贷款客户台账", "业务逾期明细表", "本息到期提示表", "资金台帐(参考)", "业务进度查询","风险预警管理", "对账管理","短信邮件消息","合同模板配置"
//    	,"产品查询","产品要素管理","业务模式管理","产品配置申请","产品配置复核","产品调整申请","产品调整复核","产品启用停用"};
//    static String[] menuNamesNotIn = {"我的工作台","报表管理","统计查询","异常管理","贷后管理","放款管理","合同管理","产品管理","系统管理"
//    	,"日常工作提示", "业务提示和预警","自定义查询", "核算台账", "提款明细台账", "贷款客户情况报表(汇总报表)","贷款客户情况报表(明细报表) 、新增合同情况", "业务员绩效表", "贷款客户台账", "业务逾期明细表", "本息到期提示表", "资金台帐(参考)", "业务进度查询","风险预警管理", "对账管理","短信邮件消息","合同模板配置"
//    	,"机构管理", "角色管理", "用户管理", "主菜单配置", "多机构菜单配置", "多机构角色配置"
//    	,"产品查询","产品要素管理","业务模式管理","产品配置申请","产品配置复核","产品调整申请","产品调整复核","产品启用停用"};
//    static String[] menuNamesNotIn = {"我的工作台","报表管理","统计查询","异常管理","贷后管理","放款管理","合同管理","产品管理","系统管理"
//    	,"日常工作提示", "业务提示和预警","自定义查询", "核算台账", "提款明细台账", "贷款客户情况报表(汇总报表)","贷款客户情况报表(明细报表) 、新增合同情况", "业务员绩效表", "贷款客户台账", "业务逾期明细表", "本息到期提示表", "资金台帐(参考)", "业务进度查询"
//    	,"评级授信审批","评级授信调整审批"};
//    static String[] menuNamesNotIn = {"我的工作台","报表管理","统计查询","异常管理","贷后管理","放款管理","合同管理","产品管理","系统管理"
//    	,"日常工作提示", "业务提示和预警","自定义查询", "核算台账", "提款明细台账", "贷款客户情况报表(汇总报表)","贷款客户情况报表(明细报表) 、新增合同情况", "业务员绩效表", "贷款客户台账", "业务逾期明细表", "本息到期提示表", "资金台帐(参考)", "业务进度查询"
//    	};
    static String[] menuContains = {"我的工作台","客户管理","授信评级","报表管理","统计查询","异常管理","贷后管理","放款管理","合同管理","产品管理","系统管理","担保管理","核算参数定义"
    	,"日常工作提示", "业务提示和预警", "个人客户管理", "机构客户管理", "黑名单管理", "未申请融资客户列表", "评级授信申请", "评级授信审批", "评级授信调整申请", "评级授信调整审批", "已批准授信申请列表", "放款申请", "催收管理", "多余款项处理", "还款管理", "五级分类调整申请", "五级分类调整审批", "风险预警管理", "对账管理", "核销管理", "计提减值准备", "短信邮件消息", "担保合同管理", "担保合同变更管理", "抵质押物管理", "本息调整交易申请", "本息调整交易复核", "反冲交易申请", "反冲交易复核", "自定义查询", "核算台账", "提款明细台账", "贷款客户情况报表(汇总报表)", "贷款客户情况报表(明细报表) 、新增合同情况", "业务员绩效表", "贷款客户台账", "业务逾期明细表", "本息到期提示表", "资金台帐(参考)", "业务进度查询", "批量代扣明细表", "账务代码定义", "业务组件管理", "合同模板配置", "机构管理", "角色管理", "用户管理", "主菜单配置", "多机构菜单配置", "多机构角色配置", "产品查询", "产品要素管理", "业务模式管理", "产品配置申请", "产品配置复核", "产品调整申请", "产品调整复核", "产品启用停用"};
 
    static String[] menuNamesIn = {};
    static String roleid = "ADMIN";
    
    static int mark = 0;
	/**
	 * @param args
	 */
    public static void main(String[] args) {
//    	notin();
//    	killMore();
    	List<String> ls = new ArrayList<String>();
    	ls.add("123");
    	ls.add("qwer");
    	ls.add("fer3r");
    	for(Iterator<String> it = ls.iterator(); it.hasNext();){
    		String v  = (String)it.next();
    		System.out.println(v);
    	}
    }  
    public static void notin(){
    	String[] menuNames = menuContains;
    	
    	for(int i=0; i < menuNames.length; i++){
	    	String menuName = menuNames[i];
	    	sql = "select MenuID,MenuName from ORG_MENU_INFO where MenuID not in "
	    +"(select rm.MenuID from ORG_ROLE_MENU_INFO rm where rm.RoleID = '"+roleid+"' AND ORGID='8888') "
	    +"AND ORGID='8888' and MENUNAME = '"+menuName+"' order by SORTNO";
	    	
	        db1 = new DBHelper(sql);
	  
	        try {  
	            ret = db1.pst.executeQuery();
	            int num = 0;
	            while (ret.next()) {  
	                String uid = ret.getString(1);  
	                String ufname = ret.getString(2);
	                System.out.println(uid + "\t" + ufname + "\t");  
	                num++;
	            }
	            if(num == 0){
	            }
	            ret.close();  
	            db1.close();
	        } catch (SQLException e) {  
	            e.printStackTrace();  
	        }
    	}
    }
    public static void killMore(){
    	String[] menuNames = menuContains;
    	
    	sql = "select MenuID,MenuName from ORG_MENU_INFO where MenuID in " +
    			"(select rm.MenuID from ORG_ROLE_MENU_INFO rm where rm.RoleID = '"+roleid+"' AND ORGID='8888') " +
    			"AND ORGID='8888' order by SORTNO";
    	db1 = new DBHelper(sql);
  	  
        try {  
            ret = db1.pst.executeQuery();//执行语句，得到结果集  
            int num = 0;
            while (ret.next()) {  
                String uid = ret.getString(1);  
                String ufname = ret.getString(2);
                int mk = 0;
                for(int i=0; i < menuNames.length; i++){
//                	if(ufname.startsWith(menuNames[i]) || ufname.endsWith(menuNames[i])){
                	if(menuNames[i].contains(ufname)){
                		mk = 1;
                		break;
                	}else{
                		continue;
                	}
                }
                if(mk == 0){
                	System.out.println(uid + "\t" + ufname + "\t");  
                }
                num++;
            }//显示数据  
            if(num == 0){
            	//System.out.println("None");
            }
            ret.close();  
            db1.close();//关闭连接  
        } catch (SQLException e) {  
            e.printStackTrace();  
        }
    	
    }
}
