package com.ruoyi.prompter.business.common;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum ErrorStatus {
    SYSTEM_ERROR("1002","服务器错误"),
    AUDIT_ERROR("1003","应用审核失败"),
    SHELVES_ERROR("1004","应用上架失败"),
    TENANT_INFO_DETAIL_ERROR("1005","租户详情查询失败"),
    PWD_CONFIRM_INCONSISTENT_ERROR("1006","两次密码输入不一致"),
    ACCOUNT_ALREADY_EXIST_ERROR("1007","账户已存在"),
    TENANT_ACCOUNT_AUDIT_ERROR("1008","租户信息审核失败"),
    INTRODUCE_UPDATE_ERROR("1009","应用介绍更新失败"),
    TENANT_APPLICATION_SEARCH_ERROR("1010","租户装车车型查询失败"),
    TENANT_CODE_INVALID_ERROR("1011","获取不到租户编码"),
    TENANT_LOADING_ERROR("1012","租户应用装车失败"),
    TENANT_MODEL_STOP_ERROR("1013","租户车型停用失败"),
    TENANT_INFO_SAVE_ERROR("1014","租户资料保存失败"),
    TENANT_APPLICATION_ADD_ERROR("1015","租户应用新增失败"),
    TENANT_CODE_PERMISSION_DENIED("1016","租户无权访问"),
    UPDATE_DENIED("1017","应用未下架禁止修改"),
    EDITION_INFO_SELECT_ERROR("1018","查询不到应用版本信息"),
    VALID_BINDID_UNIQUE("1019","应用安装包已存在，请更新升级应用"),
    TENANT_APPLICATION_ADD_REPEAT_ERROR("1020","该租户已经存在应用，请勿重复添加"),
    USER_SETTING_EDIT_ERROR("1021","用户设置保存失败"),
    USER_LICENSE_APPLY_ERROR("1022","用户License申请失败"),
    USER_LICENSE_TRIAL_APPLY_ERROR("1023","应用试用License申请失败"),
    USER_LICENSE_TRIAL_ONCE_ERROR("1024","该类型应用已经存在了"),
    USER_LICENSE_TRIAL_NO_ERROR("1025","该应用不能试用"),
    COMPANY_LICENSE_APPLY_ERROR("1026","租户License申请失败"),
    COMPANY_LICENSE_APPLY_MORE_ERROR("10262","License申请中，请前往License管理查看详情"),
    COMPANY_LICENSE_APPLY_ONE_ERROR("10261","该应用License普通申请已经存在"),
    USER_LICENSE_APPLY_NO_MODEL_ERROR("1027","没有应用安装车型"),
    SID_DATA_ERROR("1028","无效的sid"),
    EDITION_UPGRADE_ERROR("1029","该应用版本已存在"),
    LOADING_REPEAT_ERROR("1030","请勿重复装车"),
    ACCOUNT_ID_INVALID_ERROR("1031","获取不到用户账户ID"),

    COMPANY_LICENSE_APPLY_EDIT_ERROR("1004100","租户License申请编辑失败"),
    UPGRADE_STRATEGY_EDIT_ERROR("1004101","升级任务新增/编辑失败"),
    
    PARAM_IS_NULL("2001","参数不能为空"),
    REPEAT_ERROR("2002","重复数据")
    ;

    @Getter
    private String code;

    @Getter
    private String message;
}
