package com.java.crs.Service;

import com.java.crs.Model.Member;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class JwtService {

    private String key="OX1-2JD";

    public String generateToken(String username){
        return Jwts.builder().setSubject(username).setIssuedAt(new Date(System.currentTimeMillis()))
                .setIssuer("OXFORD").signWith(SignatureAlgorithm.HS256,key).
                setExpiration(new Date(System.currentTimeMillis()+10*60*1000)).compact();
    }


    public boolean validateToken(String token){
        if (getUsername(token)!=null&&checkExpirationTime(token))
            return true;

       return false;
    }



    private boolean checkExpirationTime(String token){
        Claims claims=getClaims(token);
        return claims.getExpiration().after(new Date(System.currentTimeMillis()));
    }


    public String getUsername(String token){
        Claims claims=getClaims(token);
        return claims.getSubject();
    }

    private Claims getClaims(String token){
        return Jwts.parser().setSigningKey(key).parseClaimsJws(token).getBody();
    }
}
