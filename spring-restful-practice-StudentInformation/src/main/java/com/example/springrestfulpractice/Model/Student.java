package com.example.springrestfulpractice.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Student {
    private int keyId;
    private String id;
    private String name;
}