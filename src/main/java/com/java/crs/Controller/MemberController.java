package com.java.crs.Controller;

import com.java.crs.Dto.LoginDto;
import com.java.crs.Dto.MemberInfoDto;
import com.java.crs.Model.Member;
import com.java.crs.Service.JwtService;
import com.java.crs.Service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

@RestController
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;
    private final JwtService jwtService;

    @PostMapping("/register")
    public ResponseEntity<Member> save(@RequestBody Member member){
        memberService.save(member);
        return ResponseEntity.ok(member);
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody LoginDto loginDto){
        return ResponseEntity.ok(jwtService.generateToken(loginDto.getUsername()));
    }

    @GetMapping("/join/{courseCode}")
    public ResponseEntity<String> home(@PathVariable String courseCode, Principal principal){
        memberService.joinCourse(courseCode,principal);
        return ResponseEntity.ok("Joined!");
    }

    @GetMapping("/info")
    public ResponseEntity<MemberInfoDto> getMemberInform(Principal principal){
        return ResponseEntity.ok(memberService.getInform(principal));
    }


}
