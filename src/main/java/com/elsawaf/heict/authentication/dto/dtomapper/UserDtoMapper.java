package com.elsawaf.heict.authentication.dtomapper;

import com.elsawaf.heict.authentication.domain.User;
import com.elsawaf.heict.authentication.dto.UserDto;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class UserDtoMapper {
public UserDto fromUser(User user){
    UserDto userDto = new UserDto();
    BeanUtils.copyProperties(user , userDto);
    return userDto;
}

public User toUser(UserDto userDto){
    User user = new User();
    BeanUtils.copyProperties(userDto , user);
    return user;
}


}
