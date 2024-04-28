package com.asego.config;

import com.asego.Repo.EmployeeRepo;
import com.asego.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class UserDeailsSeriveImpl implements UserDetailsService {
    @Autowired
    private EmployeeRepo employeeRepo;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Employee userName = employeeRepo.getEmployeeByName(username);
        if(userName==null){
            throw new UsernameNotFoundException("colud not load user");

        }
        CustomeUserDetails customeUserDetails=new CustomeUserDetails(userName);
        return customeUserDetails;
    }
}
