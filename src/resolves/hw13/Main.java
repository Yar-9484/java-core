package resolves.hw13;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Створення об'єктів класу Comment
        Comment comment1 = new Comment(1, 1, "id labore ex et quam laborum", "Eliseo@gardner.biz", "laudantium enim quasi est quidem magnam voluptate ipsam eostempora quo necessitatibus dolor quam autem quasi reiciendis et nam sapiente accusantium");
        Comment comment2 = new Comment(1, 2, "quo vero reiciendis velit similique earum", "Jayne_Kuhic@sydney.com", "est natus enim nihil est dolore omnis voluptatem numquam net omnis occaecati quod ullam at voluptatem error expedita pariatur nihil sint nostrum voluptatem reiciendis et");
        Comment comment3 = new Comment(1, 3, "odio adipisci rerum aut animi", "Nikita@garfield.biz", "quia molestiae reprehenderit quasi aspernatur  naut expedita occaecati aliquam eveniet laudantium omnis quibusdam delectus saepe quia accusamus maiores nam est   cum et ducimus et vero voluptates excepturi deleniti ratione");
        Comment comment4 = new Comment(1, 4, "alias odio sit", "Lew@alysha.tv", "non et atqueoccaecati deserunt quas accusantium unde odit nobis qui voluptatem quia voluptas consequuntur itaque dolor  net qui rerum deleniti ut occaecati");
        Comment comment5 = new Comment(1, 5, "vero eaque aliquid doloribus et culpa", "Hayden@althea.biz", "harum non quasi et ratione temporibus accusamus voluptas et vel qui aut vel rerum error doloribus fuga quos facilis vero tempora animi quo quis");

        // Додавання об'єктів до списку
        List<Comment> comments = new ArrayList<>();
        comments.add(comment1);
        comments.add(comment2);
        comments.add(comment3);
        comments.add(comment4);
        comments.add(comment5);

        // Ітерація по списку та виведення об'єктів в консоль
        for (Comment comment : comments) {
            System.out.println(comment);
        }
    }
}
