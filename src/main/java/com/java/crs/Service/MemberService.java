package com.java.crs.Service;

import com.java.crs.Model.Member;
import com.java.crs.Repo.MemberRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepo repo;


    private static String DEFAULT_ROLE="ROLE_STUDENT";

    public void save(Member member){
        member.setRoles(DEFAULT_ROLE);
        repo.save(member);
    }

}
