package Service;

import Dao.BookDao;

public class BookSeviceImpl implements BookService {
    public BookDao bookDao = new BookDao();

    @Override
    public void registBook() {
        bookDao.registBook();
    }

    @Override
    public void searchBook() {
        bookDao.searchBook();
    }

    @Override
    public void adminSearchBuyBook() {
        bookDao.adminSearchBuyBook();
    }

    @Override
    public void showBestSeller() {
        bookDao.showBestSeller();
    }

    @Override
    public void bookRating() {
        bookDao.bookRating();
    }

    @Override
    public void userRating() {
        bookDao.userRating();
    }

    @Override
    public void ratingList() {
        bookDao.ratingList();
    }
}
