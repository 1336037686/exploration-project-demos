package com.lgx.module.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lgx.module.domain.Log;
import com.lgx.module.service.LogService;
import com.lgx.module.mapper.LogMapper;
import org.springframework.stereotype.Service;

/**
* @author 13360
* @description 针对表【t_log】的数据库操作Service实现
* @createDate 2023-08-17 16:14:47
*/
@Service
public class LogServiceImpl extends ServiceImpl<LogMapper, Log>
    implements LogService{

}




