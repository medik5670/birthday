public class Main {
    public static void main(String[] args) {
        FormDate date = new FormDate();
        date.day = 13;
        date.month = 11;
        date.year = 2001;

        Post post = new Post();
        post.surname = "Петров";
        post.name = "Олег";
        post.patronymic = "Иванович";
        post.passport = "9988 345768";
        post.phone = " +7 999 609 34 56";
        post.birthday = date;
        post.subscription = true;
    }
}
