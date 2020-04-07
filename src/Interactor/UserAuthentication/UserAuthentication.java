package Others;

import Entities.UserInfo;

public interface UserAuthentication {
    public UserInfo loginUser(String userID, String userPassword);
    public boolean registerUser(String userID, String userPassword);
}