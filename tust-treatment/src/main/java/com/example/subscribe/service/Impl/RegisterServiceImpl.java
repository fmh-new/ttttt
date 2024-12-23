package com.example.subscribe.service.Impl;

import com.example.subscribe.mapper.RegisterMapper;
import com.example.subscribe.pojo.Qo.RegisterQo;
import com.example.subscribe.pojo.Vo.RegisterVo;
import com.example.subscribe.service.RegisterService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class RegisterServiceImpl implements RegisterService {
    private RegisterMapper registerMapper;
    @Override
    public List<RegisterVo> ListRegister() {
        return registerMapper.ListRegister();
    }

    @Override
    public boolean addRegister(RegisterQo registerQo) {
        return registerMapper.addRegister(registerQo);
    }
}
