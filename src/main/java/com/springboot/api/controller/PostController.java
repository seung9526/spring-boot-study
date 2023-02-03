package com.springboot.api.controller;

import com.springboot.api.dto.MemberDto;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/post-api")
public class PostController {

    @RequestMapping(value = "/domain", method = RequestMethod.POST)
    public String postExample(){
        return "Hello Post APi";
    }

    @PostMapping(value = "/member")
    public String postMember(@RequestBody Map<String, Object> postDate){
        StringBuilder sb = new StringBuilder();

        postDate.entrySet().forEach(map ->{
            sb.append(map.getKey()+" : "+map.getValue()+"\n");
        });

        return sb.toString();
    }

    @PostMapping(value = "/member2")
    public String postmemberDto(@RequestBody MemberDto memberDto){
        return memberDto.toString();
    }



}
