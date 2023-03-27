package com.pilalab.back.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;

@Getter
@Setter
@Entity(name = "tb_pilalab_user")
public class User {



//    private String userId;

//    @Id
//    @GeneratedValue(strategy= GenerationType.AUTO)
//    private String userCreateId;
//    @Column
//    private String userName;
//    @Column
//    private String userEmail;
//    @Column
//    private String userPhone;
//    @Column
//    private String userRegion;
//    @Column
//    private String userCreateTimestamp;
//    @Column
//    private String userResumeId;
//    @Column
//    private String userPassword;
//    @Column
//    private String userAccess;

    @Id
    @Column(name = "user_create_id", nullable = false, length = 50)
    private String userCreateId;

    @Column(name = "user_name", length = 50)
    private String userName;

    @Column(name = "user_email", length = 50)
    private String userEmail;

    @Column(name = "user_phone", length = 50)
    private String userPhone;

    @Column(name = "user_region", length = 50)
    private String userRegion;

    @Column(name = "user_create_timestamp")
    private Timestamp userCreateTimestamp;

    @Column(name = "user_resume_id", length = 50)
    private String userResumeId;

    @Column(name = "user_password", length = 50)
    private String userPassword;

    @Column(name = "user_access")
    private String userAccess;

    @Column(name = "hibernate_sequence")
    private String hibernateSequence;

}
