package com.java.crs.Controller;

import com.java.crs.Model.Member;
import com.java.crs.Service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    @PostMapping("/save")
    public ResponseEntity<Member> save(@RequestBody Member member){
        memberService.save(member);
        return ResponseEntity.ok(member);
    }
}
