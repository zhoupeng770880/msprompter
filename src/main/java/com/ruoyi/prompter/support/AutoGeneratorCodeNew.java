package com.ruoyi.prompter.support;


import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.core.toolkit.StringPool;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.po.TableInfo;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.util.ArrayList;
import java.util.List;

public class AutoGeneratorCodeNew {

    /**
     * 此处为本项目src所在路径（代码生成器输出路径）
     */
    private static String OutputDir = "/src/main/java";

    /**
     * mapper.xml的生成位置
     */
    private static String OutputDirXml = "/src/main/resources";

    /**
     * 数据库表名(此处切不可为空，如果为空，则默认读取数据库的所有表名)
     */
    private static String tableName = "tenant_apply_record";

    /**
     * 装代码的文件夹名
     */
    private static String className = "";

    /**
     * 设置作者
     */
    private static String author = "peng.zhou";
 
    /**
     * 正常情况下，下面的代码无需修改！！！！！！！！！！
     */
    /**
     * 自定义包路径
     */
    private static String parent = "com.pateo.qingcloud.qep.ecologymgmt";

    /**
     * 数据库地址
     */
    private static String url = "jdbc:mysql://mdb.perf.ptcloud.t.home:3306/msecologymgmt?useUnicode=true&characterEncoding=UTF-8&useSSL=false";
    private static String userName = "msecologymgmt";
    private static String password = "XvjRnv5keA";

    public static void main(String[] args) { 
        // 代码生成器
        AutoGenerator mpg = new AutoGenerator();
        OutputDir = System.getProperty("user.dir") +  OutputDir;
        OutputDirXml = System.getProperty("user.dir")+ OutputDirXml;
        // 全局配置
        GlobalConfig gc = new GlobalConfig();
        gc.setOutputDir(OutputDir);
        gc.setOpen(false);
        gc.setBaseResultMap(true);
        gc.setBaseColumnList(true);
        gc.setAuthor(author);
        gc.setMapperName("%sMapper");
        gc.setXmlName("%sMapper");
        gc.setServiceName("%sService");
        gc.setServiceImplName("%sServiceImpl");
        gc.setControllerName("%sController");
        gc.setFileOverride(true);
        mpg.setGlobalConfig(gc);

        // 数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setDbType(DbType.MYSQL);
        dsc.setUrl(url);
        dsc.setDriverName("com.mysql.jdbc.Driver");
        dsc.setUsername(userName);
        dsc.setPassword(password);
        mpg.setDataSource(dsc);

        // 包配置
        PackageConfig pc = new PackageConfig();
        pc.setParent(parent);
        pc.setController("controller");
        pc.setService("service");
        pc.setServiceImpl("service"+".impl");
        pc.setEntity("bean");
        pc.setMapper("dao");
        mpg.setPackageInfo(pc);

        // 自定义配置
        InjectionConfig cfg = new InjectionConfig() {
            @Override
            public void initMap() {
            }
        };
        List<FileOutConfig> focList = new ArrayList<>();
        focList.add(new FileOutConfig("/templates/mapper.xml.ftl") {
            @Override
            public String outputFile(TableInfo tableInfo) {
                // 自定义输入文件名称
                return OutputDirXml + "/mapper/" + tableInfo.getEntityName() + StringPool.DOT_XML;
            }
        });
        cfg.setFileOutConfigList(focList);
        mpg.setCfg(cfg);
        mpg.setTemplate(new TemplateConfig().setXml(null));

        // 策略配置
        StrategyConfig strategy = new StrategyConfig();
        strategy.setNaming(NamingStrategy.underline_to_camel);
        strategy.setColumnNaming(NamingStrategy.underline_to_camel);
        strategy.setEntityLombokModel(true);
        strategy.setInclude(new String[]{"message_manage","message_scope","message_inbox","message_template"});
        mpg.setStrategy(strategy);
        mpg.setTemplateEngine(new FreemarkerTemplateEngine());
        mpg.execute();
    }
    
}
