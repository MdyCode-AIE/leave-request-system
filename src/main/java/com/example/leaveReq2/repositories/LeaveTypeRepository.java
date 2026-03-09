package com.example.leaveReq2.repositories;

import com.example.leaveReq2.entities.*;
import com.example.leaveReq2.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface LeaveTypeRepository extends JpaRepository<LeaveType, Long> {}


