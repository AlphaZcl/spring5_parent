package top.zhuchl.spring.entity;

/**
 * TODO
 *
 * @author zclys
 * @date 2020/9/17 17:06
 */
public class BookEntity {
    private String bookName;

    private String price;

    private String author;

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "BookEntity{" +
                "bookName='" + bookName + '\'' +
                ", price='" + price + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
