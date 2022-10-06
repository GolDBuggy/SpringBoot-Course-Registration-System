package com.java.crs.Service;

import com.java.crs.Dto.MemberInfoDto;
import com.java.crs.Model.Course;
import com.java.crs.Model.Member;
import com.java.crs.Repo.MemberRepo;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.security.Principal;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepo repo;
    private final CourseService courseService;
    private final BCryptPasswordEncoder encoder;
    private final ModelMapper mapper;


    private static String DEFAULT_ROLE="ROLE_STUDENT";

    public void save(Member member){
        member.setPassword(encoder.encode(member.getPassword()));
        member.setRoles(DEFAULT_ROLE);
        repo.save(member);
    }

    public void joinCourse(String courseCode, Principal principal) {
        Member member=repo.findByUsername(principal.getName()).get();
        if(member.getCourses()==null)
           member.setCourses(new ArrayList<>());

        member.getCourses().add(courseService.findCourseByCode(courseCode));
        repo.save(member);
    }

    public MemberInfoDto getInform(Principal principal) {
        MemberInfoDto infoDto=mapper.map(repo.findByUsername(principal.getName()).get(),MemberInfoDto.class);
        return infoDto;
    }
}
