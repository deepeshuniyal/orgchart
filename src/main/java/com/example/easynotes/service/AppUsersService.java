package com.example.easynotes.service;

import com.example.easynotes.dto.AppUsersDto;
import com.example.easynotes.entity.AppUsers;
import com.example.easynotes.repository.AppUsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.*;

@Service
public class AppUsersService {

    @Autowired
    AppUsersRepository appUsersRepository;

   public AppUsersDto findHierarchalData(Integer id) {
        List<AppUsers> users  = appUsersRepository.fetchData(id);
        AppUsersDto finalData = null;
       List<AppUsersDto> calculateData = new LinkedList<>();
        if(!CollectionUtils.isEmpty(users)) {
            System.out.println(users);
            for(AppUsers appUsers: users) {
                AppUsersDto appUsersDto = new AppUsersDto();
                appUsersDto.setId(Integer.toUnsignedLong(appUsers.getId()));
                appUsersDto.setName(appUsers.getFirstName()+ " "+appUsers.getLastName());
                appUsersDto.setTitle(appUsers.getDesignation());
                AppUsersDto appUsersDtoTemp = new AppUsersDto();
                appUsersDtoTemp.setId(appUsers.getParentId());
                if(calculateData.contains(appUsersDtoTemp)) {
                    AppUsersDto appUsersDto1 = calculateData.get(calculateData.indexOf(appUsersDtoTemp));
                    if(CollectionUtils.isEmpty(appUsersDto1.getChildren())) {
                    List<AppUsersDto> childDto = new LinkedList<>();
                    appUsersDto1.setChildren(childDto);
                    }
                    appUsersDto1.getChildren().add(appUsersDto);
                    calculateData.add(appUsersDto);
                }
                else {
                    if(finalData==null) {
                        finalData = appUsersDto;
                        calculateData.add(appUsersDto);
                    }
                }
            }
        }
        return finalData;
    }
}
