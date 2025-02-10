 class book {
    static int totalBooks;
    String title ;
    String author ;
    String isbn ;
    boolean isBorrowed = false;
    int borrowBooks ;
    static {
        totalBooks = 0;
        System.out.println("this is static constructor ");
    }
    book(String isbn , String title , String author){
        this.isbn = isbn;
        this.title = title;
        this.author = author;

    }
    book(String isbn ){
//        author = "unknown";
//        title = "unknown";
        this(isbn , "unknown", "unknown");
    }



     {
         System.out.println("this is instic constructor ");
         totalBooks++;
     }

     public  void borrowBook(){
        if(isBorrowed ){
            System.out.println("this book is alredy borrowed");
        }
        else{
            this.isBorrowed = true;
            System.out.println("enjoy this book");
        }

     }
     public void returnBook(){
        if(isBorrowed){
            this.isBorrowed = false;
            System.out.println("thanks for returning the book hope you enjoy it");
        }
        else{
            System.out.println("this book is already in library ");
        }

     }
     static int getTotalBooks(){
        return totalBooks;
     }

     public static void main(String[] args) {
         book myBook = new book("125B62");
         System.out.println(book.getTotalBooks());
         myBook.borrowBook();
         myBook.returnBook();

     }
}

