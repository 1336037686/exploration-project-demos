package com.lgx.module.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lgx.module.domain.Dept;
import com.lgx.module.service.DeptService;
import com.lgx.module.mapper.DeptMapper;
import org.springframework.stereotype.Service;

/**
* @author 13360
* @description 针对表【t_dept】的数据库操作Service实现
* @createDate 2023-08-17 16:14:47
*/
@Service
public class DeptServiceImpl extends ServiceImpl<DeptMapper, Dept>
    implements DeptService{

}




