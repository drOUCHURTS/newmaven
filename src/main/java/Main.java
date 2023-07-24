public class Main {

    public static void main(String[] args){
        Post post = new Post();

        post.name = "Иван";
        post.surname = "Иванов";
        post.patronymic = "Иванович";
        post.passport = "7017 № 564675";
        post.phone = "+7 (953) 436 42 96";
        post.subscription = true;

        post.birthday = new FormDate();
        post.birthday.day = 13;
        post.birthday.month = 6;
        post.birthday.year = 1999;
    }
}
