package com.asego.RestController;

import com.asego.Service.SellingPlanI;
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
public class SellingPlanRestcotroller {
    @Autowired
    private SellingPlanI sellingPlanI;
    private static Logger logger= LoggerFactory.getLogger(SellingPlanRestcotroller.class);
    @PostMapping("/createSp")

    public ResponseEntity <SellingPlanDto>createSellingplan(@RequestBody SellingPlanDto dto){
        logger.debug("create() method execution started");
     SellingPlanDto created=   this.sellingPlanI.createSellingPlan(dto);
        logger.info("create() method executed successfully");

        return  new ResponseEntity<>(created, HttpStatus.CREATED);
    }
}
