/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nhom12.services;

import com.nhom12.pojo.StudentClass;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface StudentClassService {
    List<StudentClass> getClasses();
    Long countClass();
    StudentClass getClassById(int classId);
}
