public class Main {
    public static void main(String[] args) {


        Post post = new Post();
        post.birthday = new FormDate();

        post.birthday.day = 23;
        post.birthday.month = 11;
        post.birthday.year = 2000;
        post.name = "Петр";
        post.passport = "1122 № 334455";
        post.patronymic = "Петрович";
        post.phone = "+7 (999)-111-22-33 ";
        post.surname = "Петров";
        post.subscription = true;

    }
}


