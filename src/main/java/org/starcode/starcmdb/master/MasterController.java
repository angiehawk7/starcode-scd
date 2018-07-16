package org.starcode.starcmdb.master;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.starcode.starcmdb.master.domain.CI;
import org.starcode.starcmdb.master.domain.CIAttr;
import org.starcode.starcmdb.master.domain.CINameSpace;
import org.starcode.starcmdb.master.service.TableOperService;

/**
 * 作者:angie_hawk7
 * 日期:2018/6/29 20:14
 * 描述:CMDB模型管理API
 */
@RestController
@RequestMapping("/master")
public class MasterController {
    @Autowired
    private TableOperService tblOperService;
    /**
     * 创建配置库
     *
     * @return
     */
    @PostMapping("/cmdb")
    String createCmdb(CINameSpace nameSpace) {
        tblOperService.createDB();
        return "ok";
    }

    /**
     * 删除配置库
     *
     * @param cmdb 配置库名称
     * @return
     */
    @DeleteMapping("/cmdb/{cmdb}")
    String deleteCmdb(@PathVariable String cmdb) {
        return "ok";
    }

    /**
     * 定义CI
     *
     * @param cmdb 配置库名称
     * @param ci   ci
     * @return 结果
     */
    @PostMapping("/ci/{cmdb}/")
    String createCI(@PathVariable String cmdb,
                    CI ci) {
        return "ok";
    }

    /**
     * 查询CI详情
     *
     * @param cmdb
     * @param ci
     * @return
     */
    @GetMapping("/ci/{cmdb}/{ci}")
    String getCI(@PathVariable String cmdb,
                 @PathVariable String ci) {
        return "ok";
    }

    /**
     * 查询CI列表
     *
     * @param cmdb 配置库名称
     * @return
     */
    @GetMapping("/cis/{cmdb}")
    String listCI(@PathVariable String cmdb) {
        return "ok";
    }

    /**
     * 删除CI
     *
     * @param cmdb 配置库名称
     * @param ci   ci
     * @return
     */
    @DeleteMapping("/ci/{cmdb}/{ci}")
    String deleteCI(@PathVariable String cmdb,
                    @PathVariable String ci) {
        return "ok";
    }

    /**
     * 查询CI属性
     *
     * @param cmdb 配置库名称
     * @param ci   ci
     * @return
     */
    @GetMapping("/ciattr/{cmdb}/{ci}")
    String queryCIAttr(@PathVariable String cmdb,
                       @PathVariable String ci) {
        return "ok";
    }

    /**
     * 删除CI属性
     *
     * @param cmdb 配置库名称
     * @param ci   ci
     * @param attr 属性
     * @return
     */
    @DeleteMapping("/ciattr/{cmdb}/{ci}/{attr}")
    String deleteCIAttr(@PathVariable String cmdb,
                        @PathVariable String ci,
                        @PathVariable String attr) {
        return "ok";
    }

    /**
     * 修改CI属性
     *
     * @param cmdb   配置库名称
     * @param ci     ci
     * @param attr   属性
     * @param attrvo 属性内容
     * @return
     */
    @PostMapping("/ciattr/{cmdb}/{ci}/{attr}")
    String editeCIAttr(@PathVariable String cmdb,
                       @PathVariable String ci,
                       @PathVariable String attr,
                       CIAttr attrvo) {
        return "ok";
    }
}
