package club.cfanlei.spring.security.oauth2.server.service.impl;

import club.cfanlei.spring.security.oauth2.server.domain.TbPermission;
import club.cfanlei.spring.security.oauth2.server.mapper.TbPermissionMapper;
import club.cfanlei.spring.security.oauth2.server.service.TbPermissionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TbPermissionServiceImpl implements TbPermissionService{

    @Resource
    private TbPermissionMapper tbPermissionMapper;


    @Override
    public List<TbPermission> selectByUserId(Long id) {
        return tbPermissionMapper.selectByUserId(id);
    }
}
