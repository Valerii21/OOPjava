package services;

import java.util.ArrayList;

import models.UserRequest;
//*Класс наследуемый от интерфейса с запросом на аренду и на возврат фильма */
public class RentService implements IRentService {

    public static ArrayList<UserRequest> requests;//Список запросов
//*Метод формирует Список запросов на аренду или возврат*/
    public RentService() {
        requests =  new ArrayList<>();
    }
//*Переопределили метод для пользователя не админа - запрос на аренду*/
    @Override
    public void ProcessRequest(UserRequest request) {
        requests.add(request);
    }
//*Переопределили метод для пользователя не админа - запрос на возврат фильма*/
    @Override
    public void returnMovie(UserRequest request) {
        var user = request.getUser();
        int films =user.getFilms() - 1;
        user.setFilms((byte)films);
    }
    
}
