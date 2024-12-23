package com.example.subscribe.mapper;

import com.example.subscribe.pojo.Qo.RegisterQo;
import com.example.subscribe.pojo.Vo.RegisterVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface RegisterMapper {

    List<RegisterVo> ListRegister();

    boolean addRegister(RegisterQo registerQo);
}
