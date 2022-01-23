package cn.itcast.managementcore.service;

import cn.itcast.managementcore.generator.core.Dictionary;
import cn.itcast.managementcore.generator.core.DictionaryMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class DictService {
    @Resource
    private DictionaryMapper dictionaryMapper;

    public void save(Dictionary dictionary){
        dictionaryMapper.insert(dictionary);
    }
}
