package com.asego.RestController;

import com.asego.Service.BranchServiceI;
import com.asego.dto.BranchDto;
import com.asego.dto.SellingPlanDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BranchRestController {
    @Autowired
    private BranchServiceI branchServiceI;
    private static Logger logger = LoggerFactory.getLogger(SellingPlanRestcotroller.class);

    @PostMapping("/createBranch")
    public ResponseEntity<BranchDto> createBranch(@RequestBody BranchDto dto) {
        logger.debug("create() method execution started");
        BranchDto branch = branchServiceI.createBranch(dto);
        logger.debug("create() method executed ");
        return new ResponseEntity<BranchDto>(branch, HttpStatus.CREATED);
    }
}