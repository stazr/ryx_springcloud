package com.ryx.service.impl;
import javax.annotation.Resource;

import com.ryx.mapper.ConfigMapper;
import com.ryx.pojo.Config;
import com.ryx.query.ConfigQuery;
import com.ryx.service.ConfigService;
import org.springframework.stereotype.Service;




/**
 * 
 *  业务接口实现
 * 
 */
@Service("configService")
public class ConfigServiceImpl implements ConfigService {

	@Resource
    private ConfigMapper<Config,ConfigQuery> configMapper;


    @Override
    public Config getConfigByPrimaryKey(String key) {
        return configMapper.selectByPrimaryKey(key);
    }
}