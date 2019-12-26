package Service;

import Dao.BookDao;


public class BookSeviceImpl  implements  BookService{
    public BookDao bookDao=new BookDao();

    @Override
    public void registBook() {   bookDao.registBook();    }


	@Override
	public void searchBook() {
	  bookDao.searchBook();
		
	}

    @Override
    public void searchBuyBook() {
       bookDao.searchBuyBook();
    }


	@Override
	public void bookRating() {
		// TODO Auto-generated method stub
		
	}




}
