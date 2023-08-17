package com.ruoyi.prompter.business.common;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum DownloadTaskType {


    EXPORT_TASK_MODULE_LOG("logDownloadTaskProcessor","操作日志"),

    EXPORT_TASK_MODULE_BILL_INCOME("billIncomeDownloadTaskProcessor","账单统计-收入明细"),
    EXPORT_TASK_MODULE_BILL_EXPEND("billExpendDownloadTaskProcessor","账单统计-支出明细"),
    EXPORT_TASK_MODULE_BILL_ESTIMATE("billEstimateDownloadTaskProcessor","账单统计-预估收入明细"),
    EXPORT_TASK_MODULE_BILL_RETURN("billReturnDownloadTaskProcessor","账单统计-回款明细"),

    EXPORT_TASK_MODULE_MESSAGE("messageDownloadTaskProcessor","消息统计"),

    EXPORT_TASK_MODULE_DATA_ECOLOGY("dataEcologyDownloadTaskProcessor","数据统计-生态数据统计"),
    EXPORT_TASK_MODULE_DATA_PORTAL("dataPortalDownloadTaskProcessor","数据统计-门户数据统计"),
    EXPORT_TASK_MODULE_DATA_RETENTION("dataRetentionDownloadTaskProcessor","数据统计-留存率数据统计"),
    EXPORT_TASK_MODULE_DATA_ACTIVITY("dataActivityDownloadTaskProcessor","数据统计-活跃量数据统计"),

    EXPORT_TASK_MODULE_LICENSE("licenseDownloadTaskProcessor","license管理"),

    EXPORT_TASK_MODULE_ECOLOGY_INSTALLED("ecologyInstalledDownloadTaskProcessor","生态中心-已安装车型"),
    EXPORT_TASK_MODULE_ECOLOGY_VERSION("ecologyVersionDownloadTaskProcessor","生态中心-各个版本下载");

    private String serviceName;

    private String title;

}
