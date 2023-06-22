package com.testjpa.jpademo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/class")
@RequiredArgsConstructor
public class ClassRoomController {

    /**
     * 학급 목록 조회
     * @return
     */
    @GetMapping("")
    public Object findAll(){
        return null;
    }

}
