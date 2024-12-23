package com.example.subscribe.service;

import java.util.List;
import com.example.subscribe.pojo.Qo.RegisterQo;
import com.example.subscribe.pojo.Vo.RegisterVo;

public interface RegisterService {

    List<RegisterVo> ListRegister();

    boolean addRegister(RegisterQo registerQo);
}
