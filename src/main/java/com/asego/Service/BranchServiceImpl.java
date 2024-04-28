package com.asego.Service;

import com.asego.Repo.BranchRepo;
import com.asego.RestController.SellingPlanRestcotroller;
import com.asego.dto.BranchDto;
import com.asego.entity.Branch;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BranchServiceImpl implements BranchServiceI{
    @Autowired
    private BranchRepo branchRepo;
    @Autowired
    private ModelMapper mapper;
    private static Logger logger= LoggerFactory.getLogger(SellingPlanRestcotroller.class);
public Branch dtoToBranchEntity(BranchDto dto){
    Branch branch = this.mapper.map(dto, Branch.class);
return branch;
}
public BranchDto entityToDto(Branch branch){
    BranchDto dto = this.mapper.map(branch, BranchDto.class);
    return dto;
}
    @Override
    public BranchDto createBranch(BranchDto branchDto) {
    logger.debug("create Branch method is started");
        Branch bran = this.dtoToBranchEntity(branchDto);
        Branch save = this.branchRepo.save(bran);
        return this.entityToDto(save);
    }
}
