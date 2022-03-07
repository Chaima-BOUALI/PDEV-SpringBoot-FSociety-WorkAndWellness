package tn.esprit.spring.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

import tn.esprit.spring.repositories.UserRepository;


@Component("userSecurity")

public class UserSecurity {
	@Autowired
	UserRepository userRepo;
	
	/*public boolean hasUserId(Authentication authentication, Integer userId) {
		
		int userID=userRepo.findByUsername(authentication.getName().getUserId(userId));
	System.out.println(userId+"  "+userID);
            if(userID==userId)
            	return true;
            
            return false;
       
    }*/
}
