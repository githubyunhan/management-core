package cn.itcast.managementcore.controller;

import cn.itcast.managementcore.entityVO.AjaxResponse;
import cn.itcast.managementcore.generator.core.Dictionary;
import cn.itcast.managementcore.service.DictService;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 类描述：字典的controller
 */

@Slf4j
@RestController
@RequestMapping("/dict")
public class DictController {

    @Resource
    private DictService dictService;

    /**
     *功能描述：实现增加字典数据
     */
    @ApiOperation(value = "实现增加字典数据")
    @PostMapping("/save")
    public @ResponseBody
    AjaxResponse save(@RequestBody Dictionary dictionary){
        dictService.save(dictionary);
        return AjaxResponse.success(dictionary);
    }

}

