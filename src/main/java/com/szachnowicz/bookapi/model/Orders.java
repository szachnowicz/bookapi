package com.szachnowicz.bookapi.model;

public class Orders {
    private Long id;
    private Long bookId;

    @Override
    public String toString() {
        return "Orders{" +
                "id=" + id +
                ", bookId=" + bookId +
                ", userId=" + userId +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Orders(Long id, Long bookId, Long userId) {
        this.id = id;
        this.bookId = bookId;
        this.userId = userId;
    }

    private Long userId;


}
