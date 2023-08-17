package com.ruoyi.prompter.business.common;

/**
 * @author davidchow
 *
 */
public class Constant {

    public static final String DEL_FlAG_0 = "0";

    public static final String DEL_FlAG_1 = "1";

    public static final String STATUS_0 = "0";

    public static final String STATUS_1 = "1";
    
    public static final String SHELVES_STATUS_0 = "0";

    public static final String SHELVES_STATUS_1 = "1";
    
    public static final String AUDIT_STATUS_0 = "0";

    public static final String AUDIT_STATUS_1 = "1";
    //停用
    public static final String AUDIT_STATUS_2 = "2";
    //审核驳回
    public static final String AUDIT_STATUS_3 = "3";
    
    public static final String AVAILABLE_STATUS_0 = "0";
    
    public static final String AVAILABLE_STATUS_1 = "1";
    
    public static final String LOADING_STATUS_0 = "0";
    
    public static final String LOADING_STATUS_1 = "1";
    
    public static final String ACCOUNT_TYPE_0 = "0";
    
    public static final String ACCOUNT_TYPE_1 = "1";

    /**
     * 应用试用类型 1-可以试用  2-不能试用
     */
    public static final String APPLICATION_TRIAL_TYPE_ABLE ="1";
    public static final String APPLICATION_TRIAL_TYPE_UNABLE ="2";

    /**
     * 应用是否付费 1-免费 2-付费
     */
    public static final String APPLICATION_PAY_TYPE_FREE ="1";
    public static final String APPLICATION_PAY_TYPE_CHARGE ="2";

    /**
     * 证书类型 1-购买/续费 2-试用 3-免费
     */
    public static final String APPLICATION_LICENSE_TYPE_CHARGE ="1";
    public static final String APPLICATION_LICENSE_TYPE_TRIAL ="2";
    public static final String APPLICATION_LICENSE_TYPE_FREE ="3";
    
    
    /**
     * 租户应用申请状态 0-申请中 1-申请通过  2-申请拒绝
     */
    public static final String TENANT_APP_APPLY_STATUS_0 ="0";
    public static final String TENANT_APP_APPLY_STATUS_1 ="1";
    public static final String TENANT_APP_APPLY_STATUS_2 ="2";
    
    
    /**
     * 租户应用综合 1-申请中 2-申请通过 3-申请拒绝  4-待审核 5-审核拒绝 6-待上车(审核通过+license申请通过)  7-已上车
     */
    public static final String TENANT_APP_ROLLUP_STATUS_1 ="1";
    public static final String TENANT_APP_ROLLUP_STATUS_2 ="2";
    public static final String TENANT_APP_ROLLUP_STATUS_3 ="3";
    public static final String TENANT_APP_ROLLUP_STATUS_4 ="4";
    public static final String TENANT_APP_ROLLUP_STATUS_5 ="5";
    public static final String TENANT_APP_ROLLUP_STATUS_6 ="6";
    public static final String TENANT_APP_ROLLUP_STATUS_7 ="7";
    
    /**
     * 租户APP审核状态
     */
    public static final String TENANT_APP_AUDIT_STATUS_0 ="0";
    public static final String TENANT_APP_AUDIT_STATUS_1 ="1";
    public static final String TENANT_APP_AUDIT_STATUS_2 ="2";
    
    /**
     * 租户license审核状态
     */
    public static final String TENANT_LICENSE_AUDIT_STATUS_0 ="0";
    public static final String TENANT_LICENSE_AUDIT_STATUS_1 ="1";
    public static final String TENANT_LICENSE_AUDIT_STATUS_2 ="2";
    
    
    /**
     * 来源 1-内部  2-租户
     */
    public static final String SOURCE_1 = "1";
	public static final String SOURCE_2 = "2";
	
	
	/**
	 * 排序 1-按时间 2-按热度
	 */
	public static final String SORT_1 = "1";
	public static final String SORT_2 = "2";
	
	/**
	 * 应用上传状态 0-待上传  1-已上传
	 */
	public static final String UPLOAD_STATUS_0 = "0";
	public static final String UPLOAD_STATUS_1 = "1";
	
	public static final String UPGRADE_STATUS_0 = "0";
	public static final String UPGRADE_STATUS_1 = "1";

    /**
     * 导出模块类型
     */
    public static final String EXPORT_TASK_MODULE_LOG="EXPORT_TASK_MODULE_LOG";
    public static final String EXPORT_TASK_MODULE_LOG_NAME="操作日志";

    public static final String EXPORT_TASK_MODULE_BILL_INCOME="EXPORT_TASK_MODULE_BILL_INCOME";
    public static final String EXPORT_TASK_MODULE_BILL_INCOME_NAME="账单统计-收入明细";
    public static final String EXPORT_TASK_MODULE_BILL_EXPEND="EXPORT_TASK_MODULE_BILL_EXPEND";
    public static final String EXPORT_TASK_MODULE_BILL_EXPEND_NAME="账单统计-支出明细";
    public static final String EXPORT_TASK_MODULE_BILL_ESTIMATE="EXPORT_TASK_MODULE_BILL_ESTIMATE";
    public static final String EXPORT_TASK_MODULE_BILL_ESTIMATE_NAME="账单统计-预估收入明细";
    public static final String EXPORT_TASK_MODULE_BILL_RETURN="EXPORT_TASK_MODULE_BILL_RETURN";
    public static final String EXPORT_TASK_MODULE_BILL_RETURN_NAME="账单统计-回款明细";

    public static final String EXPORT_TASK_MODULE_MESSAGE="EXPORT_TASK_MODULE_MESSAGE";
    public static final String EXPORT_TASK_MODULE_MESSAGE_NAME="消息统计";

    public static final String EXPORT_TASK_MODULE_DATA_ECOLOGY="EXPORT_TASK_MODULE_DATA_ECOLOGY";
    public static final String EXPORT_TASK_MODULE_DATA_ECOLOGY_NAME="数据统计-生态数据统计";
    public static final String EXPORT_TASK_MODULE_DATA_PORTAL="EXPORT_TASK_MODULE_DATA_PORTAL";
    public static final String EXPORT_TASK_MODULE_DATA_PORTAL_NAME="数据统计-门户数据统计";
    public static final String EXPORT_TASK_MODULE_DATA_RETENTION="EXPORT_TASK_MODULE_DATA_RETENTION";
    public static final String EXPORT_TASK_MODULE_DATA__RETENTION_NAME="数据统计-留存率数据统计";
    public static final String EXPORT_TASK_MODULE_DATA_ACTIVITY="EXPORT_TASK_MODULE_DATA_ACTIVITY";
    public static final String EXPORT_TASK_MODULE_DATA__ACTIVITY_NAME="数据统计-活跃量数据统计";

    public static final String EXPORT_TASK_MODULE_LICENSE="EXPORT_TASK_MODULE_LICENSE";
    public static final String EXPORT_TASK_MODULE_LICENSE_NAME="license管理";

    public static final String EXPORT_TASK_MODULE_ECOLOGY_INSTALLED="EXPORT_TASK_MODULE_ECOLOGY_INSTALLED";
    public static final String EXPORT_TASK_MODULE_ECOLOGY_INSTALLED_NAME="生态中心-已安装车型";
    public static final String EXPORT_TASK_MODULE_ECOLOGY_VERSION="EXPORT_TASK_MODULE_ECOLOGY_VERSION";
    public static final String EXPORT_TASK_MODULE_ECOLOGY_VERSION_NAME="生态中心-各个版本下载";
    
    
    public static final String USE_STATUS_0 = "0";
    
    public static final String USE_STATUS_1 = "1";
    
    // 0-待推送 1-已推送 2-推送失败 3-取消发布
    public static final String SEND_STATUS_0 = "0";
    public static final String SEND_STATUS_1 = "1";
    public static final String SEND_STATUS_2 = "2";
    public static final String SEND_STATUS_3 = "3";
    
    //1-未读消息  2-收件箱消息  3-草稿箱消息 4-回收站消息
    public static final String MESSAGE_TYPE_1 = "1";
    public static final String MESSAGE_TYPE_2 = "2";
    public static final String MESSAGE_TYPE_3 = "3";
    public static final String MESSAGE_TYPE_4 = "4";
    
    // 0-未读 1-已读
    public static final String READ_STATUS_0 = "0";
    public static final String READ_STATUS_1 = "1";
    
    //回收站状态 0-正常  1-存入回收站
    public static final String RECYCLE_STATUS_0 = "0";
    public static final String RECYCLE_STATUS_1 = "1";
    
    //消息状态 0-草稿 1-定时发送 2-发送
    public static final String MESSAGE_STATUS_0 = "0";
    public static final String MESSAGE_STATUS_1 = "1";
    public static final String MESSAGE_STATUS_2 = "2";
}
