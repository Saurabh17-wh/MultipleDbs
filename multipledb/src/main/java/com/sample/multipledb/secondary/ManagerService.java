package com.sample.multipledb.secondary;

import com.sample.multipledb.configuration.PrimaryDBConfig;
import com.sample.multipledb.configuration.SecondaryDBConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ManagerService
{
    @Autowired
    private ManagerRepo managerRepo;

    public List<Manager> getAllManagers()
    {
        List<Manager> list = (List<Manager>)this.managerRepo.findAll();
        return list;
    }
}
