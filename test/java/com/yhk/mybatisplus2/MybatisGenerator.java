package com.yhk.mybatisplus2;

import com.baomidou.mybatisplus.core.toolkit.StringPool;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.po.TableInfo;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName MybatisGenerator
 * @Author yhk
 * @Date 2020/10/11 16:42
 * @Description
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = MybatisPlus2Application.class)
public class MybatisGenerator {

    @Test
    public void generator() {

        // 代码生成器
        AutoGenerator mpg = new AutoGenerator();

        GlobalConfig globalConfig = new GlobalConfig();
        String projectPath = System.getProperty("user.dir");

        //全局配置，代码生成之后输出的位置
        globalConfig.setOutputDir(projectPath + "/src/main/java");
        globalConfig.setOpen(false);
        globalConfig.setAuthor("yhk");
        globalConfig.setFileOverride(false);

        //自定义生成文件的规则
        globalConfig.setServiceName("%sService");
        mpg.setGlobalConfig(globalConfig);

        // 包配置
        PackageConfig pc = new PackageConfig();
        pc.setParent("com.yhk.mybatisplus2");
        pc.setModuleName("module");
        pc.setEntity("entity");
        pc.setMapper("mapper");
        mpg.setPackageInfo(pc);

        //模板配置，可以自定义，对于不需要的生成的模块直接置为null
        TemplateConfig templateConfig = new TemplateConfig();
        templateConfig.setController(null);
        templateConfig.setXml(null);
        mpg.setTemplate(templateConfig);

        // 自定义配置,主要对xml文件的输出位置进行配置
        InjectionConfig cfg = new InjectionConfig() {
            @Override
            public void initMap() {
                // to do nothing
            }
        };
        // 表明当前的模板引擎是 velocity
        String templatePath = "/templates/mapper.xml.vm";

        // 自定义输出配置
        List<FileOutConfig> focList = new ArrayList<>();
        // 自定义配置会被优先输出
        focList.add(new FileOutConfig(templatePath) {
            @Override
            public String outputFile(TableInfo tableInfo) {
                // 自定义输出文件名 ， 如果你 Entity 设置了前后缀、此处注意 xml 的名称会跟着发生变化！！
                return projectPath + "/src/main/resources/mapper/" +
                        tableInfo.getEntityName() + "Mapper" + StringPool.DOT_XML;
            }
        });

        cfg.setFileOutConfigList(focList);
        mpg.setCfg(cfg);


        // 数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setUrl("jdbc:mysql://192.168.18.238:3306/mybatis-plus?useUnicode=true&useSSL=false&characterEncoding=utf8");
        // dsc.setSchemaName("public");
        dsc.setDriverName("com.mysql.jdbc.Driver");
        dsc.setUsername("root");
        dsc.setPassword("4251..");
        mpg.setDataSource(dsc);

        // 策略配置
        StrategyConfig strategy = new StrategyConfig();
        //表名是否为大写，默认为false
        strategy.setCapitalMode(false);
        //数据库表映射到实体的命名策略 驼峰命名
        strategy.setNaming(NamingStrategy.underline_to_camel);
        //数据库表字段映射到实体的命名策略, 未指定按照 naming 执行 驼峰命名
        strategy.setColumnNaming(NamingStrategy.underline_to_camel);
        //是否启动lombok
        strategy.setEntityLombokModel(true);
        //关闭实体类中的序列化id号
        strategy.setEntitySerialVersionUID(false);
        //生成实体类时给字段加上注解
        strategy.setEntityTableFieldAnnotationEnable(true);

        //要生成的表
        strategy.setInclude();

        mpg.setStrategy(strategy);
        mpg.execute();
    }
}
