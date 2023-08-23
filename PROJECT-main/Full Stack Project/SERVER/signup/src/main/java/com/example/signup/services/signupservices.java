package com.example.signup.services;

import com.example.signup.model.Signup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.signup.repositery.signuprepositery;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class signupservices {

    @Autowired
    private signuprepositery signuprepositery;

    public List<Signup> getAllSignup() {
        List<Signup> signups = new ArrayList<>();
        signuprepositery.findAll().forEach(signups::add);
        return signups;
    }

    //    public Signup getSignupInfo(String name) {
    //        return signups.stream().filter(s -> s.getName().equals(name)).findFirst().get();
    //    }

    public void addSignup(Signup signup) {
        signuprepositery.save(signup);
    }

    //    public void editSignup(String name, Signup updatedSignup) {
    //
    //        for (int i = 0; i < signups.size(); i++) {
    //            Signup s = signups.get(i);
    //            if (s.getName().equals(name)) {
    //                signups.set(i, updatedSignup);
    //            }
    //        }
    //    }
    //
    //    public Optional<Signup> deletesignup(String name) {
    //        Optional<Signup> signup = signuprepositery.findById(name);
    //        signuprepositery.deleteById(name);
    //        return signup;
    //    }
}

