package com.joshcheng.backend.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.Date;
import java.util.UUID;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name = "members")
public class Member {

    @Id
    @Column(name = "mid", unique = true, nullable = false, length = 50)
    private String mid;
    @NonNull
    @NotEmpty
    @Column(name = "email", unique = true, nullable = false, length = 50)
    private String email;
    @NonNull
    @NotEmpty
    @Column(name = "password", nullable = false, length = 50)
    private String password;
    @NonNull
    @NotEmpty
    @Column(name = "first_name", nullable = false, length = 50)
    private String firstName;
    @NonNull
    @NotEmpty
    @Column(name = "last_name", nullable = false, length = 50)
    private String lastName;
    @Column(name = "create_time")
    private Date createTime;
    @Column(name = "update_time")
    private Date updateTime;

}