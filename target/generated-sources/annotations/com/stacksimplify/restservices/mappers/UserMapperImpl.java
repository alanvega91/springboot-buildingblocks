package com.stacksimplify.restservices.mappers;

import com.stacksimplify.restservices.dtos.UserMsDto;
import com.stacksimplify.restservices.entities.User;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-04-10T09:54:37-0600",
    comments = "version: 1.3.0.Final, compiler: Eclipse JDT (IDE) 3.33.0.v20230218-1114, environment: Java 17.0.6 (Eclipse Adoptium)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public UserMsDto userToUserMsDto(User user) {
        if ( user == null ) {
            return null;
        }

        UserMsDto userMsDto = new UserMsDto();

        userMsDto.setRolename( user.getRole() );
        userMsDto.setEmailaddress( user.getEmail() );
        userMsDto.setUserid( user.getUserid() );
        userMsDto.setUsername( user.getUsername() );

        return userMsDto;
    }

    @Override
    public List<UserMsDto> usersToUserDtos(List<User> users) {
        if ( users == null ) {
            return null;
        }

        List<UserMsDto> list = new ArrayList<UserMsDto>( users.size() );
        for ( User user : users ) {
            list.add( userToUserMsDto( user ) );
        }

        return list;
    }
}
