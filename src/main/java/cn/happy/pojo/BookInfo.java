package cn.happy.pojo;

public class BookInfo {
    private Integer id;
    private String name;
    private String author;
    private String bookdesc;
    private Double price;

    public BookInfo() {
    }

    public BookInfo(Integer id, String name, String author, String bookdesc, Double price) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.bookdesc = bookdesc;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBookdesc() {
        return bookdesc;
    }

    public void setBookdesc(String bookdesc) {
        this.bookdesc = bookdesc;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}


