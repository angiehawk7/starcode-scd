package org.starcode.starcmdb;

import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

/**
 * 作者:angie_hawk7
 * 日期:2018/6/30 20:02
 * 描述:启动类
 */
@SpringBootApplication
public class CmdbApplication {
    private static final Logger LOG = LoggerFactory.getLogger(CmdbApplication.class);
    //TODO 启动参数获取应用运行根目录
    private static final String APP_ROOT="D:"+File.separator+"githubcode"+File.separator+"starcode-scd";
    public static void main(String[] args) throws Exception {
        LOG.info("Begin start scd.......");
        //自定义程序配置项文件。
        StringBuilder sb=new StringBuilder();
        sb.append(APP_ROOT).append(File.separator).
                append("deployment").append(File.separator).
                append("etc").append(File.separator).append("app.properties");
        Properties prop=new Properties();
        FileInputStream instream= FileUtils.openInputStream(new File(sb.toString()));
        prop.load(instream);
        instream.close();
        SpringApplication app=new SpringApplication(CmdbApplication.class);
        app.setDefaultProperties(prop);
        app.run(args);
        LOG.info("End start scd.......");
    }
}
