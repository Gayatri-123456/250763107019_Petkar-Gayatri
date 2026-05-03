class BookNotAvailableException extends Exception {
    BookNotAvailableException(String msg) {
        super(msg);
    }
}

class Library {
    int books = 3;

    void issueBook(int count) throws BookNotAvailableException {
        if(count <= books) {
            books -= count;
            System.out.println("Book issued");
        } else {
            throw new BookNotAvailableException("Not available");
        }
    }

    public static void main(String[] args) {
        Library l = new Library();
        try {
            l.issueBook(2);
            l.issueBook(2);
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}