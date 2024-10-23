package com.example.demo;
import com.example.demo.models.AppRole;
import com.example.demo.models.Role;
import com.example.demo.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner
{

    @Autowired
    RoleRepository roleRepository;

    @Override
    public void run(String... args)throws Exception
    {
        if (roleRepository.count() == 0) {
            Role userRole = new Role(AppRole.ROLE_USER);
            Role adminRole = new Role(AppRole.ROLE_ADMIN);

            roleRepository.save(userRole);
            roleRepository.save(adminRole);

        }
    }
}
