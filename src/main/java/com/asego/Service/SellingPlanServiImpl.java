package com.asego.Service;

import com.asego.Repo.SellinPlanRepo;
import com.asego.dto.SellingPlanDto;
import com.asego.entity.SellingPlan;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SellingPlanServiImpl implements SellingPlanI{
    @Autowired
    private ModelMapper mapper;
    @Autowired
    private SellinPlanRepo sellinPlanRepo;

    public SellingPlan dtoToEntity(SellingPlanDto sellingPlanDto){
        SellingPlan selling=mapper.map(sellingPlanDto,SellingPlan.class);
        return selling;
    }
    public SellingPlanDto entityToDto(SellingPlan sellingPlan){
        SellingPlanDto dto=mapper.map(sellingPlan, SellingPlanDto.class);
        return dto;
    }

    @Override
    public SellingPlanDto createSellingPlan(SellingPlanDto dto) {
      SellingPlan sp=  this.dtoToEntity(dto);
      SellingPlan saveSp=sellinPlanRepo.save(sp);
        return this.entityToDto(saveSp);
    }
}
