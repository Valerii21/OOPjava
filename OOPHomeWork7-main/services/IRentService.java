package services;

import models.UserRequest;
//*Интерфейс аренды реализует методы запроса на аренду и на возврат фильма*/
public interface IRentService {
    void ProcessRequest(UserRequest request);   
    void returnMovie(UserRequest request); 
}
