package in.Rama.usermanagement.service;

import in.Rama.usermanagement.datastore.UserStore;
import in.Rama.usermanagement.dto.UserDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    public UserDto createUser(UserDto userDto) {
        userDto.setId(UserStore.idCounter);
        UserStore.idCounter = UserStore.idCounter + 1;
        UserStore.users.add(userDto);
        return userDto;
    }

    public List<UserDto> getUsers() {
        return UserStore.users;
    }

    public UserDto getUserById(int id) {
        List<UserDto> allUsers = getUsers();
        int maxId = UserStore.idCounter - 1;

        for(int i= 1; i<=maxId; i++) {
            if(allUsers.get(i-1).getId() == id){
                return allUsers.get(i-1);
            }
        }

        throw new RuntimeException("Not Found");
    }
}
