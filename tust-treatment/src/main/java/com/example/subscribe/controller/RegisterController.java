package com.example.subscribe.controller;

import com.example.subscribe.pojo.Qo.RegisterQo;
import com.example.subscribe.pojo.Vo.RegisterVo;
import com.example.subscribe.service.RegisterService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/hospital")
@AllArgsConstructor
public class RegisterController {

    private RegisterService registerService;

    @GetMapping("/getRegister")
    public List<RegisterVo> getRegister(){
        return registerService.ListRegister();
    }

    @PostMapping("/addRegister")
    public boolean addRegister(RegisterQo registerQo){
        return registerService.addRegister(registerQo);
    }

}
