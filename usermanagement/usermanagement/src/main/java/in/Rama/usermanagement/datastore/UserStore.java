package in.Rama.usermanagement.datastore;

import in.Rama.usermanagement.dto.UserDto;

import java.util.ArrayList;
import java.util.List;

public class UserStore {
    public static List<UserDto> users = new ArrayList<>();
    public static int idCounter = 1;
}
