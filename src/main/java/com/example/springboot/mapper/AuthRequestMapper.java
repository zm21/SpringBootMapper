package com.example.springboot.mapper;

import com.example.springboot.dto.UserView;
import com.example.springboot.entities.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(
        componentModel = "spring"
)

public interface AuthRequestMapper {
    UserView AuthRequestTo(User user);
}
